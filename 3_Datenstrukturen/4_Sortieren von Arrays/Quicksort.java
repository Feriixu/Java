import java.util.*;
public class Quicksort
{
  public static void main(String argv[])
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Wie viele Werte? = ");
    int anzahl = in.nextInt();
    System.out.print("Maximum? = ");
    int max = in.nextInt();

    int array[] = new int[anzahl];
    for (int i = 0; i < array.length; i++) {
      array[i] = (int)(Math.random() * max);
    } // end of for
    
    for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
      } // end of for
    System.out.println("----------");
    // sorting
    System.out.print("Jezt sortieren?\nEnter um fortzufahren");
    String nul = in.next();
    int wert;
    int j;
    for (int i = 0; i < array.length; i++) {
      wert = array[i];
      j = i;
      while (j > 0 && array[j-1] > wert) { 
        array[j] = array[j-1];
        j = j - 1;
      } // end of while
      array[j] = wert;
    } // end of for
      for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
      } // end of for
  }
}
