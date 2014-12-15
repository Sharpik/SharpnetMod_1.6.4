import java.io.PrintStream;

public abstract class beu
  extends uf
{
  public static final bjo b = new bjo("textures/entity/steve.png");
  private bic a;
  private bic c;
  private bjo d;
  private bjo e;
  
  public beu(abw paramabw, String paramString)
  {
    super(paramabw, paramString);
    
    l();
  }
  
  protected void l()
  {
    System.out.println("Setting up custom skins");
    if ((this.bu == null) || (this.bu.isEmpty())) {
      return;
    }
    this.d = f(this.bu);
    this.e = g(this.bu);
    this.a = a(this.d, this.bu);
    this.c = b(this.e, this.bu);
  }
  
  public bic p()
  {
    return this.a;
  }
  
  public bic q()
  {
    return this.c;
  }
  
  public bjo r()
  {
    return this.d;
  }
  
  public bjo s()
  {
    return this.e;
  }
  
  public static bic a(bjo parambjo, String paramString)
  {
    return a(parambjo, d(paramString), b, new bfn());
  }
  
  public static bic b(bjo parambjo, String paramString)
  {
    return a(parambjo, e(paramString), null, null);
  }
  
  private static bic a(bjo parambjo1, String paramString, bjo parambjo2, bfi parambfi)
  {
    bim localbim = atv.w().J();
    
    Object localObject = localbim.b(parambjo1);
    if (localObject == null)
    {
      localObject = new bic(paramString, parambjo2, parambfi);
      localbim.a(parambjo1, (bio)localObject);
    }
    return (bic)localObject;
  }
  
  public static String d(String paramString)
  {
    return String.format("http://sharpnet.unas.cz/MinecraftSkins/%s.png", new Object[] { ma.a(paramString) });
  }
  
  public static String e(String paramString)
  {
    return String.format("http://sharpnet.unas.cz/MinecraftCloaks/%s.png", new Object[] { ma.a(paramString) });
  }
  
  public static bjo f(String paramString)
  {
    return new bjo("skins/" + ma.a(paramString));
  }
  
  public static bjo g(String paramString)
  {
    return new bjo("cloaks/" + ma.a(paramString));
  }
  
  public static bjo h(String paramString)
  {
    return new bjo("skull/" + ma.a(paramString));
  }
}
