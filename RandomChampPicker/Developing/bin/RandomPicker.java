import java.util.*;
import java.util.*;

public class RandomPicker 
{
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    boolean weiter = true;
    spaces();
    System.out.println("---Willkommen beim ChampPicker---");
    System.out.println("Gib bitte erstmalig die gew\u00fcnschte Liste an.");
    String dateiname = setDatei();
    
    spaces();
    
    do 
    {
      System.out.println("-----------------------------------------------");
      System.out.println("1: Champ Picken");
      System.out.println("2: Liste \u00e4ndern (Momentan ausgew\u00e4hlt: " + dateiname + ")");
      System.out.println("3: Hife zum erstellen von Listen");
      System.out.println("4: Beenden");
      System.out.println("-----------------------------------------------");
      System.out.print("Option: ");
      String wahl = in.next();
      spaces();
      switch (wahl) 
      {
        case "1" : 
          PickChamp(dateiname);
          break;
        case "2" : 
          dateiname = setDatei();
          break;          
        case "3" : 
          help();
          break;
        case "4" :
          weiter = false;
          break;
        default: 
          System.out.println("Falsche Eingabe");
      } // end of switch
    } while (weiter); // end of do-while
    
  }
  

    
  public static void PickChamp(String dateiname) 
  {
    Scanner in = new Scanner(System.in);
    ReadList read = new ReadList();
    Random r = new Random();
    //Array mit champs erzeugen
    String[] champs = read.readToArray(dateiname);
    //Zufalls Eintrag auswählen und anzeigen
    if (champs != null) {
      System.out.println("-----------------------------------------------");
      System.out.println("          Dein Champ ist: " + champs[r.nextInt(champs.length)]);
      System.out.println("-----------------------------------------------\n\n\n\n\n\n\n");      
    }     
  } 
  
  public static void help()
  {
    System.out.println("---Hilfe---"); 
    System.out.println("Listen Kriterien:");
    System.out.println("---------------------------------------------------------------------------------------------------------");
    System.out.println("- Listen muessen im listen Ordner liegen");
    System.out.println("- Listen sind immer vom Typ .txt");
    System.out.println("- Die Eintr\u00e4ge der Liste sind durch Zeilenumbr\u00fcche separiert");
    System.out.println("- Bei der Wahl des Dateinamens ist zu beachten, dass er im Picker als Listennummer angegeben werden muss");
    System.out.println("---------------------------------------------------------------------------------------------------------");
    System.out.println("\n\n\n\n\n\n\n");
  } 

  public static void spaces()
  {
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
  }
  public static String setDatei() {
    ReadList read = new ReadList();
    Scanner in = new Scanner(System.in);
    //Dateinamen abfragen und speichern   
    System.out.println("-----------------------------------------------");
    System.out.println("Welche Liste?");
    System.out.println("-----------------------------------------------");  
    System.out.print("Liste mit dem Namen: ");   
    String dateiname = in.next() + ".txt";
    spaces();
    if (read.readToArray(dateiname) == null) {
      dateiname = setDatei();
    }
    System.out.println("\n\n\n\n\n\n\n"); 
    return dateiname;    
  }

  // Ende Methoden
}
