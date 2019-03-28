public class Ten_print
{
  public static void main(String argv[])
  {
    double rand;
    for (int i = 0; i < 10000;i++) { 
      System.out.print((int)(Math.random()*10));
//      rand = Math.random();
//      if (rand < 0.5) {
//        System.out.print("0");
//      }
//      else
//      {
//        System.out.print("1");
//      }
    } // end of while
  }
}
