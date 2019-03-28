public class Konto
{
  // Anfang Attribute
  private double saldo;
  private int pin;
  // Ende Attribute
  public Konto()
  {
    
  }
  public Konto(int pin) 
  {
    this.pin = pin;
    this.saldo = 0;
  }
  // Anfang Methoden
  public void einzahlung(double geld) 
  {
    if (geld >= 0) 
    {
      this.saldo += geld;
    } // end of if
  }
  // Ende Methoden
} // end of Konto
