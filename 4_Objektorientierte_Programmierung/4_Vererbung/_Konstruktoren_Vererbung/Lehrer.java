public class Lehrer extends Person
{
  //Attribute
  protected String fach;
  //Konstruktoren
  public Lehrer()
  {
    super("", "");
    this.fach = "";
  }
  public Lehrer(String vorname, String nachname, String fach)  
  {
    super(vorname, nachname);
    this.fach = fach;
  }
  //Methoden
  public String getInfo()
  {
    String text = super.getInfo();
    text += "\nIch bin auch ein Lehrer";
    text += "\nFach: " + this.fach;
    return text;
  }
}

