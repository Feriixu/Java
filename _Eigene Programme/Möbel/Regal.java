public class Regal extends M�belst�ck
{
  //Attribute
  private int anzF�cher;
  public boolean r�ckwand;
  //Konstruktoren
  public Regal()
  {
    this("", "", 1, false);
  }
  public Regal(String bezeichner, String material, int anzF�cher, boolean r�ckwand)
  {
    super(bezeichner, material);
    if(anzF�cher > 0)
      this.anzF�cher = anzF�cher;
    else
      this.anzF�cher = 1;
    this.r�ckwand = r�ckwand;
  }
  //Methoden
  public void setAnzF�cher(int AnzF�cher)
  {
    if (anzF�cher > 0) 
    {
      this.anzF�cher = anzF�cher;
    }
    else {
      this.anzF�cher = 0;
    } 
  }
  public int getAnzF�cher()
  {
    return this.anzF�cher;
  }
  public void zeigeDaten()
  {
    super.zeigeDaten();
    String text = "";
    text += "Dies ist auch ein Regal\n- Anzahl F�cher: " + this.anzF�cher + "\n- R�ckwand: ";
    if(this.r�ckwand)
      text += "true";
    else
      text += "false";
    System.out.println(text);
  }
}
