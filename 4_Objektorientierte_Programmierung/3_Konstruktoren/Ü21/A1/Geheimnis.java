public class Geheimnis
{
  // Anfang Attribute
  private String geheimnis;
  private int pin;
  // Ende Attribute
  public Geheimnis()
  {
    pin = 0;
    this.geheimnis = "";     
  }
  
  public Geheimnis(int pin, String geheimnis) 
  {
    this.pin = pin;
    this.geheimnis = geheimnis;
  }
  // Anfang Methoden
  public void setGeheimnis(int pin, String geheimnis) 
  {
    if (pin == this.pin) 
    {
      this.geheimnis = geheimnis;
    } // end of if
  }
  public String getGeheimnis(int pin) 
  {
    if (pin == this.pin)
    {
      return geheimnis;
    }
    else 
    {
      return "";
    } // end of if-else
  }
}
