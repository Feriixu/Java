import java.util.*;
public class Arrays_2_Aufgabe_1_2_3_4
{
  public static void main(String argv[])
  {
    // Vorbesetzung und Initialisierung von Variablen
    Scanner in = new Scanner(System.in);
    int temp; 
    int fünf = 0;
    int sechs = 0;
    int versetzung = 3;
    int zufall;
    double summe = 0;
    String spacing, fach;
    String color = "";
    String[] notenFeld = 
    {
      "Sehr Gut",
      "Gut",
      "Befriedigend",
      "Ausreichend",
      "Mangelhaft",
      "Ungenügend"
    };
    String[] fachBezeichnungen = 
    {
      "Mathematik",
      "Englisch",
      "Deutsch",
      "Französisch",
      "Informatik",
      "DI Informatik",
      "Technische Informatik",
      "Fachpraxis",
      "Elektrotechnik",
      "Physik",
      "Gesellschaftslehre",
      "Wirtschaftslehre",
      "Religion/Philosophie"
    };
    int[] noten = new int[fachBezeichnungen.length];
    System.out.print("1 für Zufallsnoten, 0 um eigene Noten einzugeben: ");
    zufall = in.nextInt();
    // Noten Eingabe
    System.out.println("Sie werden jetzt dazu aufgefordert ihre Noten für Entsprechende Fächer einzugeben.\nBitte geben sie ihre Noten nur von 1-6 ein.");
    for (int i = 0; i < fachBezeichnungen.length; i++) 
    {
      System.out.print("\nGeben sie ihre letzte " + fachBezeichnungen[i] + " Note ein: ");
      do // Kontroll Loop
      {
        //Gegebenenfalls Zufallszahlen benutzen
        if (zufall == 1) {
          temp = (int) (Math.random() * 6) + 1;
        } 
        else 
        {
          temp = in.nextInt();
        }
        //Fehlermeldung Ausgeben
        if (temp < 1 || temp > 6) 
        {
          System.out.print("\nFalsche Eingabe. Versuchen die es erneut: ");
        }
        // Eingabe Speichern und zur Summe addieren
        noten[i] = temp;
        summe += temp; 
        // Fünfen und Sechsen zählen
        switch (temp) 
        {
          case 5 : 
            fünf += 1;
            versetzung -= 1;
            break;
          case 6 : 
            sechs += 1;
            versetzung -= 1;
        }  
      } 
      while (temp < 1 || temp > 6); // Kontroll Loop Ende
    }
    
    // Ausgabe
    // Zeugnisübersicht ausgeben
    System.out.println("\n\n\n[---Zeugnisübersicht---]\n");
    for (int i = 0; i < fachBezeichnungen.length; i++) 
    {
      spacing = "";
      fach = fachBezeichnungen[i];
      for (int j = 1; j <= 25 - fach.length(); j++) 
      {
        spacing = spacing + "-";
      }
      System.out.println(fachBezeichnungen[i] + spacing + notenFeld[noten[i]-1] + "");
    }
    // Versetzunginformationen ausgeben
    if (versetzung < 0)
      versetzung = 0;
    switch (versetzung) 
    {
      case 3 : System.out.println("\nSie haben keine Fünfen und Sechen.\nSie sind nicht versetzungsgefährdet!");
        break;
      case 2 : System.out.println("\nSie haben " + fünf + " Fünfen und keine Sechsen."); 
        break;
      case 1 : System.out.println("\nSie haben " + fünf + " Fünfen und " + sechs + " Sechsen.");
        break;
      case 0 : System.out.println("\nSie haben " + fünf + " Fünfen und " + sechs + " Sechsen.");        
    }
    //Durchschnitt ausgeben
    System.out.println("Ihr durchschnitt ist " + (double)Math.round((summe / noten.length) * 10d) / 10d);
  }
}

