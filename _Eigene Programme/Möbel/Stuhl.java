public class Stuhl extends Sitzm�bel
{
  //Attribute
  public boolean r�ckenlehne;
  //Konstruktoren
  public Stuhl()
  {
    this("", "", true);
  }
  public Stuhl(String bezeichner, String material, boolean r�ckenlehne)
  {
    super(bezeichner, material, 1);
    this.r�ckenlehne = r�ckenlehne;
  }
  //Methoden
  public void zeigeDaten()
  {
    super.zeigeDaten();
    String text = "";
    text += "Dies ist auch ein Stuhl\n- R�ckenlehne: ";
    if(this.r�ckenlehne)
      text += "true";
    else
      text += "false";
    System.out.println(text);    
  }
}
