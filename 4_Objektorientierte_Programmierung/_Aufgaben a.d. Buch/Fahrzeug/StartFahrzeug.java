public class StartFahrzeug
{
  public static void main(String args[])
  {
    Fahrzeug kfz = new Fahrzeug(); 
    kfz.kennzeichen = "HH BK 1234"; 
    kfz.anzSitzplätze = 5; 
    kfz.datenAusgeben(); 
  }
}
