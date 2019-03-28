import java.util.*;
import java.util.Random;
public class Zufallsspiel
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    Random r = new Random();
    int min, max, zz, versuche, tipp;
    boolean treffer = false;
    System.out.println("DAS Zufallszahlenspiel!\n=======================");
    System.out.print("Anzahl der Versuche? = ");
    versuche = in.nextInt();
    System.out.print("Minimum der Zufallszahl? = ");
    min = in.nextInt();
    System.out.print("Maximum der Zufallszahl? = ");
    max = in.nextInt();
    zz = min + r.nextInt(max + 1 - min);
    for (int i = 1; i <= versuche && !treffer ; i++) 
    {
      System.out.print("=======================\nTippen sie: ");
      tipp = in.nextInt();
      switch (Math.abs(zz - tipp)) 
      {
        case 0 :
          System.out.println("=======================\nHerzlichen Glückwunsch!\nSie haben in " + (i) + " Versuchen gewonnen!");
          treffer = true;
          break;
        case 1 : 
          System.out.println("Sehr Heiß!");
          break;
        case 2 : 
          System.out.println("Heiß");
          break;
        case 3:
        case 4:
          System.out.println("Warm");
        break;
        default: 
          System.out.println("Kalt");
      } 
    } 
    if (treffer == false) 
    {
      System.out.println("=======================\nKeine Versuche mehr...\nVerloren :(\nVielleicht haben sie mehr Glück beim nächsten mal.");
    } 
    System.out.println("=======================\nDie Zahl war " + zz + ".");
  }
}
