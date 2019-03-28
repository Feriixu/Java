import java.util.Scanner;

public class StartKlasse
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    Konto k = new Konto();
    boolean abbrechen = false;
    System.out.print("Bitte geben Sie ihre Wunschpin an: ");
    k.setPin(in.next());
    while(!abbrechen) 
    { 
      System.out.print("------------------------------------\nWas moechten Sie tun?\n1: Abbrechen\n2: Geld einzahlen\n3: Geld auszahlen\n4: Kontostand Abfragen\nBitte Zahl eingeben: ");
      switch (in.nextInt()) {
        case 1 :  
          abbrechen = true;
          System.out.println("Programm wird beended...");
          break;
        case 2 : 
          System.out.print("Geben sie das einzuzahlende Geld an: ");
          k.einzahlung(in.nextDouble());
          break;
        case 3 :
          System.out.println("Geben sie den Auszuzahlenden Betrag an: ");
          double betrag = in.nextDouble();
          System.out.println("Geben sie Ihre Pin an: ");
          k.auszahlung(in.next(), betrag);
          break;
        case 4 : 
          System.out.println("Bitte geben sie Ihre Pin ein: ");
          System.out.println(k.getKontostand(in.next()));       
          break;                    
        default: 
          
      } // end of switch
    } 
  }
}
