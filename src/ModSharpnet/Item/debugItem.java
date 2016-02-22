package ModSharpnet.Item;

import static ModSharpnet.ModSharpnet.modid;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.world.World;

public class debugItem extends Item
{
    int blockID = 0;
    int blockMeta = 0;
    String blockUName = "";
    String blockIcon = "";
    String blockDName = "";
    ItemStack Stack;
    
    public debugItem(int par1)
    {
        super(par1);
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.tabTools);
        this.setTextureName(modid+":none");
    }
    
    @Override
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {   
        if(!par3World.isRemote)
        {
            blockID = par3World.getBlockId(par4, par5, par6);
            blockMeta = par3World.getBlockMetadata(par4, par5, par6);
            Stack = new ItemStack(blockID,1,blockMeta);
            blockUName = Stack.getUnlocalizedName();
            blockDName = Stack.getDisplayName();
            blockIcon = Stack.getIconIndex().getIconName();

            par2EntityPlayer.sendChatToPlayer(ChatMessageComponent.createFromText("Debug Item:"));
            par2EntityPlayer.sendChatToPlayer(ChatMessageComponent.createFromText("Block ID: " + blockID));
            par2EntityPlayer.sendChatToPlayer(ChatMessageComponent.createFromText("Block Meta: " + blockMeta));
            par2EntityPlayer.sendChatToPlayer(ChatMessageComponent.createFromText("Block Unregistred Name: " + blockUName));
            par2EntityPlayer.sendChatToPlayer(ChatMessageComponent.createFromText("Block Display Name: " + blockDName));
            par2EntityPlayer.sendChatToPlayer(ChatMessageComponent.createFromText("Block Icon: " + blockIcon));
            par2EntityPlayer.sendChatToPlayer(ChatMessageComponent.createFromText(" "));
            //System.out.println("SharpnetMod Debug Item: ID:" + blockID + " Meta:" + blockMeta + " uName:" + blockUName + " Icon:" + blockIcon);

        }
        return true;
    }
}
