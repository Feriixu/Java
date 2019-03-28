import java.util.*;
public class MatheFunktionenAufgabe1
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Geben sie den inneren Radius an:");
    int ri = in.nextInt();
    System.out.println("Geben sie den ‰uﬂeren Radius an:");
    int ra = in.nextInt();
    int a = ((Math.pow(ra, 2) - Math.pow(ri, 2)) * Math.PI);
    System.out.println("Die fl‰che ist: " + a);
  }
}