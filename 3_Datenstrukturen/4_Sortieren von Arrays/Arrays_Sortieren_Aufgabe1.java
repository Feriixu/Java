import java.util.*;
import java.util.Random;
public class Arrays_Sortieren_Aufgabe1
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    Random r = new Random();
    int oben, unten, anzahl;
    boolean sortiert;
    System.out.print("Anzahl: ");
    anzahl = in.nextInt();
    System.out.print("Unten: ");
    unten = in.nextInt();
    System.out.print("Oben: ");
    oben = in.nextInt();
    int zufallsZahlen[] = new int[anzahl];
    for (int i = 0; i < anzahl; i++) 
    {
      zufallsZahlen[i] = unten + r.nextInt(oben + 1 - unten);
      System.out.print(zufallsZahlen[i] + " ");
    }
    do 
    {
      sortiert = true;
      for (int i = 1; i < anzahl; i++) 
      {
        if (zufallsZahlen[i-1] > zufallsZahlen[i]) 
        {
          int tmp = zufallsZahlen[i-1];
          zufallsZahlen[i-1] = zufallsZahlen[i];
          zufallsZahlen[i] = tmp;
          sortiert = false;
        }
      }
    } 
    while (!sortiert);
    System.out.println();
    for (int i = 0; i < anzahl; i++) 
    {
      System.out.print(zufallsZahlen[i] + " ");
    }
  }
}
