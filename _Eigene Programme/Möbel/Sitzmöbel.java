public class Sitzm�bel extends M�belst�ck
{
  //Atribute
  private int anzPersonen;
  //Konstruktoren
  public Sitzm�bel()
  {
    this("", "", 1);
  }
  public Sitzm�bel(String bezeichner, String material, int anzPersonen)
  {
    super(bezeichner, material);
    if(anzPersonen > 0)
      this.anzPersonen = anzPersonen;
    else
      this.anzPersonen = 1;
  }
  //Methoden
  public void setAnzPersonen(int anzPersonen)
  {
    if(anzPersonen > 0)
      this.anzPersonen = anzPersonen;
    else
      this.anzPersonen = 1;     
  }
  public int getAntPersonen()
  {
    return this.anzPersonen;
  }
  public void zeigeDaten()
  {
    super.zeigeDaten();
    System.out.println("Dies ist auch ein Sitzm�bel\n- Anzahl Personen : " + this.anzPersonen);
    }
}
