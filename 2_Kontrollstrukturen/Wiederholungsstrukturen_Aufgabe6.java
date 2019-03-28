import java.util.*;
public class Wiederholungsstrukturen_Aufgabe6
{
  public static void main(String argv[])
  {
    Scanner in = new Scanner(System.in);
    int zaehler, summe, eingabe, check;
    zaehler = 0;
    summe = 0;

    System.out.println("Geben sie nur eine Zahl zwischen 1 und 11 an: ");
    
    
    do //Schleife bis die Summe 21 �berschreitet
    {
      do //Eingabe der n�chsten Zahl und �berpr�fung auf G�ltigkeit
      {
        System.out.print("Geben sie jetzt eine Zahl an: ");
        eingabe = in.nextInt(); 
        if (eingabe > 11 || eingabe < 1)
        {
          System.out.println("Falsche Eingabe\n");
          check = 0;
        }
        else 
        {
          check = 1;
          zaehler += 1;
        } 
      } 
      while (check == 0); //Ende der �berpr�fung

      summe += eingabe; //addieren der Zahl
      System.out.println("\nDie aktuelle Summe ist: " + summe); //augabe der aktuellen summe
    } 
    while (summe < 21); //Ende des Spiels
    
    if (summe > 21) //gewonnen oder verloren
    {
      System.out.println("\n\n\n\nSie haben verloren!");
    } 
    else
    {
      System.out.println("\n\n\n\nSie haben gewonnen!");
    }
    System.out.println("Sie haben " + summe + " mit " + zaehler + " z�gen erreicht.");
    
  } //ende main
} //ende class











