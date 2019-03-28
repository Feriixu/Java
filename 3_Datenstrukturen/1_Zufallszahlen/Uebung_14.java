import java.util.*;
public class Uebung_14
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    Random r = new Random();
    int anz, top, bot, srch;
    int anzSrch = 0;
    System.out.print("Anzahl Zufallszahlen? : ");
    anz = in.nextInt();
    System.out.print("Untergrenze? = ");
    bot = in.nextInt();
    System.out.print("Obergrenze? = ");
    top = in.nextInt();
    System.out.print("Welche Zahl wollen sie suchen? = ");
    srch = in.nextInt();
    
    //Zufalls Zahlen generieren
    int zahlen[] = new int[anz];
    int stellen[] = new int[anz];
    for (int i = 0; i < zahlen.length; i++) 
    {
      zahlen[i] = r.nextInt(top + 1 - bot) + bot;
      System.out.print(zahlen[i] + " ");
    } 
    //Zahlen finden
    for (int i = 0; i < zahlen.length; i++) 
    {
      if (zahlen[i] == srch) 
      {
        stellen[anzSrch] = i;
        anzSrch ++;
      }
    }
    //Gefundene Stellen ausgeben
    if (anzSrch > 0) {
      System.out.println("\n\nIhre Zahl wurde " + anzSrch + "x an den Stellen ");
      for (int i = 0; i < anzSrch; i++) 
      {
        System.out.print(stellen[i] + " ");
      }
      System.out.println(" gefunden.");
    } 
    else
    {
      System.out.println("\nIhre Zahl wurde nicht gefunden");
    }
    
  }
}
