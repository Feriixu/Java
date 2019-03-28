
public class Konto
{
  private String pin = "0";
  private String salt = "9999";
  private String temp;
  private double saldo = 0;
  public void setPin(String pin)
  {
    if (this.pin == "0") {
      this.temp = String.valueOf( pin + this.salt );
      this.pin = String.valueOf(temp.hashCode());
    }
    else 
    {
      System.out.println("ERROR: Sie haben Ihre Pin schon festgelegt!");
    }
  }
  public void einzahlung(double geld)
  {
    this.saldo += geld;
  System.out.println("Geld wurde eingezahlt!");
  }
  public double getKontostand(String pin)
  {
    this.temp = String.valueOf( pin + this.salt );
    if (String.valueOf(temp.hashCode()) == this.pin) 
    {
      return saldo;
    }
    else
    {
      System.out.println("--Falsche Pin--");
      return 0.0;
    }
  }
  public void auszahlung(String pin, double betrag)
  {
    if (String.valueOf(String.valueOf( pin + this.salt ).hashCode()) == this.pin) 
    {
      this.saldo += betrag;
      System.out.println("Erfolgreich Ausgezahlt");
    } 
    else
    {
      System.out.println("--Falsche Pin--");
    }
  }
}
      
