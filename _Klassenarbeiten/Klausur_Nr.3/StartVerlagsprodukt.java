public class StartVerlagsprodukt
{
  public static void main(String[] argv)
  {
    // Objekterzeugung mit default-Konstruktor
    Verlagsprodukt v1 = new Verlagsprodukt();
    // Parameter festlegen
    v1.titel = "Die unendliche Geschichte";
    v1.urheber = "Nicht eingetragen"; 
    v1.setPreis(9.89); 
    
    // Objekterzeugung mit Parametern
    Verlagsprodukt v2 = new Verlagsprodukt("Ursula Potnakoki" , "Erebos" , 24.56);
    
    // Datenausgabe
    System.out.println(v1.titel + " von " + v1.urheber + " kostet " + v1.getPreis + " Euro.");
    v2.datenausgabe();
  }//Ende main
}//Ende der Klasse 
     
     