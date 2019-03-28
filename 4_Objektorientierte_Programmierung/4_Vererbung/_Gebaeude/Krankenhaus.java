public class Krankenhaus extends Gebaeude
{
  //Attribute
  protected int betten;
  protected int anzOpRaeume;
  //Konstruktoren
  public Krankenhaus()
  {
    this(false, 0, "", false, 0, 0);
  }
  public Krankenhaus(boolean keller, int anzFenster, String standort, boolean security, int betten, int anzOpRaeume)
  {
    super(keller, anzFenster, standort, security);
    this.betten = betten;
    this.anzOpRaeume = anzOpRaeume;
  }
  //Methoden
  public String getInfo()
  {
    return super.getInfo() + "\nDies ist auch ein Krankenhaus:\n-Betten: " + this.betten + "\n-Anzahl Op Raeume: " + this.anzOpRaeume;
  }
}
