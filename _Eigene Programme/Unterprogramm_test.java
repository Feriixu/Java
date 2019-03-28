import java.util.*;
public class Unterprogramm_test
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Geben sie 2 Zahlen zum addieren ein:");
    System.out.print("A = ");
    int a = in.nextInt();
    System.out.print("B = ");
    int b = in.nextInt();
    Unterprogramm_test haupt = new Unterprogramm_test();
    System.out.println(haupt.add(a, b));
  }
  
  public int add(int a, int b)
  {
    int c = a + b;
    return c;
  }
}
