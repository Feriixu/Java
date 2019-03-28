public class Regal extends Möbelstück
{
  //Attribute
  private int anzFächer;
  public boolean rückwand;
  //Konstruktoren
  public Regal()
  {
    this("", "", 1, false);
  }
  public Regal(String bezeichner, String material, int anzFächer, boolean rückwand)
  {
    super(bezeichner, material);
    if(anzFächer > 0)
      this.anzFächer = anzFächer;
    else
      this.anzFächer = 1;
    this.rückwand = rückwand;
  }
  //Methoden
  public void setAnzFächer(int AnzFächer)
  {
    if (anzFächer > 0) 
    {
      this.anzFächer = anzFächer;
    }
    else {
      this.anzFächer = 0;
    } 
  }
  public int getAnzFächer()
  {
    return this.anzFächer;
  }
  public void zeigeDaten()
  {
    super.zeigeDaten();
    String text = "";
    text += "Dies ist auch ein Regal\n- Anzahl Fächer: " + this.anzFächer + "\n- Rückwand: ";
    if(this.rückwand)
      text += "true";
    else
      text += "false";
    System.out.println(text);
  }
}
