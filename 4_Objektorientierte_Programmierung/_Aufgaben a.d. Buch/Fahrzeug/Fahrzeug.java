public class Fahrzeug
{
  //Attribute
  String kennzeichen;
  int anzSitzplätze;
  //Methoden
  void datenAusgeben()
  {
    System.out.println("Kennzeichen: " + this.kennzeichen);
    System.out.println("Sitzplätze: " + this.anzSitzplätze);
  }
}