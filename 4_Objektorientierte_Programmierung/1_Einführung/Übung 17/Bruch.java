public class Bruch
{
  int nenner;
  int zaehler;
  
  public void setZaehler(int temp)
  {
    this.zaehler = temp;
  }
  public void setNenner(int temp)
  {
    if (temp != 0) {
      this.nenner = temp;
    }
    else
    {
      System.out.println("Der Nenner darf nicht Null sein");
    }
  }
  public String getInfo()
  {
    return "Der Zaehler betraegt " + zaehler + " und der Nenner betraegt " + nenner;
  }
  public String getBruch()
  {
    return "Der Bruch mit Zähler " + zaehler + " und Nenner " + nenner + " liefert " + zaehler + "/" + nenner;
  }
  public String getWert()
  {
    return "Der Bruch mit Zähler " + zaehler + " und Nenner " + nenner + " liefert den double-Wert " + ((double)zaehler / nenner);
  }
}
