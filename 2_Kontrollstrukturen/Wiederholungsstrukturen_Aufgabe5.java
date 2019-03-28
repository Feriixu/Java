import java.util.*;
public class Wiederholungsstrukturen_Aufgabe5
{
  public static void main(String argv[])
  {
    Scanner in = new Scanner(System.in);
    double no1, no2;
    
    do {
      System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nGeben sie zwei Zahlen an deren Summe 21 ist: \n");
      no1 = in.nextDouble();
      no2 = in.nextDouble();
    } while ((no1 + no2) != 21); // end of do-while
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println(no1 + " + " + no2 + " = " + (no1 + no2));
  }
}
