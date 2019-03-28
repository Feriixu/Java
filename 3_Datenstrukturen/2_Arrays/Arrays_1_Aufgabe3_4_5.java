import java.util.*;
public class Arrays_1_Aufgabe3_4_5
{
  public static void main(String a[])
  {
    // Deklarationen und Vorbesetzungen
    Scanner in = new Scanner(System.in);
    double niederschlag[] = new double[7];
    String wochentag[] = 
    {
    "Montag",
    "Dienstag",
    "Mittwoch",
    "Donnerstag",
    "Freitag",
    "Samstag",
    "Sonntag"
    };
    String striche[] = 
    {
    "|------|",
    "|----|",
    "|----|",
    "|--|",
    "|-----|",
    "|-----|",
    "|-----|",
    };
    
    int wunschtag;
    double gesNiederschlag = 0;
    
    //Eingabe
    for (int i = 0; i < niederschlag.length; i++) 
    {
      System.out.print("Geben die den Niederschlag des Tages " + wochentag[i] + " ein: ");
      niederschlag[i] = in.nextDouble();
    } // end of for
    
    //Ausgabe
    System.out.print("\nGeben die den gewünschten Tag an (0-6): ");  
    do
    {     
      wunschtag = in.nextInt();
      if (0 <= wunschtag && wunschtag < niederschlag.length) 
      {
        System.out.println("\nNiederschlag am Tag " + wunschtag + " war " + niederschlag[wunschtag] + "."); 
        System.out.println("\nWochenübersicht:\n");
        System.out.println("Tag          Niederschlag");
        System.out.println("-----------------------");
        for (int i = 0; i < niederschlag.length; i++) {
          System.out.println(wochentag[i] + striche[i] + niederschlag[i]);
        }
      } 
      else 
      {
        System.out.println("Falsche Eingabe!\nVersuchen sie es erneut:");  
      } 
    }
    while (wunschtag < 0 || wunschtag >= niederschlag.length);
    
    //Aufgabe 4
    for (int i = 0; i < niederschlag.length; i++) {
      gesNiederschlag += niederschlag[i];
    }
    System.out.println("\nGesamt Niederschlag      = " + gesNiederschlag);    
    System.out.println("\nDurschnitts niederschlag = " + gesNiederschlag / 7);
  }
}
