package ModSharpnet.Item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ShItemFoodPlacer1 extends Item
{
    /** Number of ticks to run while 'EnumAction'ing until result. */
    public final int itemUseDuration;

    /** The amount this food item heals the player. */
    private final int healAmount;
    private final float saturationModifier;

    /** Whether wolves like this food (true for raw and cooked porkchop). */
    private final boolean isWolfsFavoriteMeat;

    /**
     * If this field is true, the food can be consumed even if the player don't need to eat.
     */
    private boolean alwaysEdible;

    /**
     * represents the potion effect that will occurr upon eating this food. Set by setPotionEffect
     */
    private int potionId;

    /** set by setPotionEffect */
    private int potionDuration;

    /** set by setPotionEffect */
    private int potionAmplifier;

    /** probably of the set potion effect occurring */
    private float potionEffectProbability;
    
    private int setBlockID;
    private int setBlockMeta;
    private int drunkval;
    private int drunktype;

    public ShItemFoodPlacer1(int par1, int par2, float par3, boolean par4, int blockID, int blockMeta, int DrunkType, int DrunkVal)
    {
        super(par1);
        this.itemUseDuration = 32;
        this.healAmount = par2;
        this.isWolfsFavoriteMeat = par4;
        this.saturationModifier = par3;
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setBlockID = blockID;
        this.setBlockMeta = blockMeta;
        this.drunkval = DrunkVal;
        this.drunktype = DrunkType;
        this.setAlwaysEdible();
    }

    public ShItemFoodPlacer1(int par1, int par2, boolean par3, int blockID, int blockMeta, int DrunkType, int DrunkVal)
    {
        this(par1, par2, 0.6F, par3, blockID, blockMeta, DrunkType, DrunkVal);
    }

    @Override
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (par7 != 1)
        {
            return false;
        }
        else if (par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack) && par2EntityPlayer.canPlayerEdit(par4, par5 + 1, par6, par7, par1ItemStack))
        {
            if (par3World.getBlockId(par4, par5 + 1, par6) == 0)
            {
                par3World.setBlock(par4, par5 + 1, par6, this.setBlockID, this.setBlockMeta, 2);
                --par1ItemStack.stackSize;
                return true;
            }
            else
            {
                return false;
            }
        }
        else {return false;}
    }
    
    public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        --par1ItemStack.stackSize;
        par3EntityPlayer.getFoodStats().addStats(healAmount,saturationModifier);
        par2World.playSoundAtEntity(par3EntityPlayer, "random.burp", 0.5F, par2World.rand.nextFloat() * 0.1F + 0.9F);
        this.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
        return par1ItemStack;
    }

    protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par2World.isRemote && this.potionId > 0 && par2World.rand.nextFloat() < this.potionEffectProbability)
        {
            par3EntityPlayer.addPotionEffect(new PotionEffect(this.potionId, this.potionDuration * 20, this.potionAmplifier));
        }
        //Drink Types
        switch(drunktype)
        {
            case 0: // none
                break;
            case 1: //coffe & semtex etc..
                    par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.digSpeed.id, this.drunkval * 20, 1));
                    par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, this.drunkval * 20, 1));
                break;
            case 2: // alcohol
                if( ((par3EntityPlayer.getFoodStats().getFoodLevel()) >= 20) && (this.drunkval > 0) )
                {
                    par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, this.drunkval * 20, 6));
                }
                break;
        }
    }

    /**
     * How long it takes to use or consume an item
     */
    @Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 32;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    @Override
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.eat;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (par3EntityPlayer.canEat(this.alwaysEdible))
        {
            par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        }

        return par1ItemStack;
    }

    public int getHealAmount()
    {
        return this.healAmount;
    }

    /**
     * gets the saturationModifier of the ItemFood
     */
    public float getSaturationModifier()
    {
        return this.saturationModifier;
    }

    /**
     * Whether wolves like this food (true for raw and cooked porkchop).
     */
    public boolean isWolfsFavoriteMeat()
    {
        return this.isWolfsFavoriteMeat;
    }

    /**
     * sets a potion effect on the item. Args: int potionId, int duration (will be multiplied by 20), int amplifier,
     * float probability of effect happening
     */
    public ShItemFoodPlacer1 setPotionEffect(int par1, int par2, int par3, float par4)
    {
        this.potionId = par1;
        this.potionDuration = par2;
        this.potionAmplifier = par3;
        this.potionEffectProbability = par4;
        return this;
    }

    /**
     * Set the field 'alwaysEdible' to true, and make the food edible even if the player don't need to eat.
     */
    public ShItemFoodPlacer1 setAlwaysEdible()
    {
        this.alwaysEdible = true;
        return this;
    }
}
