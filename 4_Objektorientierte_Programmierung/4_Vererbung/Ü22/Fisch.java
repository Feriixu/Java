public class Fisch extends Tier
{
  //Attribute
  public int anzFlossen;
  private boolean kannLuftAtmen;
  //Konstruktoren
  public Fisch()
  {
    this.gattung = "";
    this.anzFlossen = 0;
    this.kannLuftAtmen = false;
  }
  public Fisch(int anzFlossen, boolean kannLuftAtmen)
  {
    this.anzFlossen = anzFlossen;
    this.gattung = "";
    this.kannLuftAtmen = false;
  }
  public Fisch(int anzFlossen, String gattung)
  {
    this.anzFlossen = anzFlossen;
    this.gattung = gattung;
    this.kannLuftAtmen = false;
  }
  public Fisch(int anzFlossen, boolean kannLuftAtmen, String gattung, )
  {
    this.anzFlossen = anzFlossen;
    this.kannLuftAtmen = kannLuftAtmen;
    this.gattung = gattung;
  }
  //Methoden
  //set-get
  public void setKannLuftAtmen(boolean kannLuftAtmen)
  {
    this.kannLuftAtmen = kannLuftAtmen;
  }
  public boolean getKannLuftAtmen()
  {
    return this.kannLuftAtmen;
  }
  //Andere Methoden
  public void zeigeDaten()
  {
    System.out.println("Ich bin ein Fisch der Gattung " + gattung + " und habe " + anzFlossen + " Flossen.");
  }
  public void schwimmen()
  {
    if(anzFlossen > 0)
    System.out.println("Ich kann schwimmen!");
    else 
    System.out.println("Ich kann nicht schwimmen!");
  }
}
