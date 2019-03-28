public class Stuhl extends Sitzmöbel
{
  //Attribute
  public boolean rückenlehne;
  //Konstruktoren
  public Stuhl()
  {
    this("", "", true);
  }
  public Stuhl(String bezeichner, String material, boolean rückenlehne)
  {
    super(bezeichner, material, 1);
    this.rückenlehne = rückenlehne;
  }
  //Methoden
  public void zeigeDaten()
  {
    super.zeigeDaten();
    String text = "";
    text += "Dies ist auch ein Stuhl\n- Rückenlehne: ";
    if(this.rückenlehne)
      text += "true";
    else
      text += "false";
    System.out.println(text);    
  }
}
