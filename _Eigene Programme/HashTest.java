public class HashTest
{
  public static void main(String[] args)
  {
    int test = 5642;
    int salt = 9999;
    String temp = String.valueOf(test + salt);
    System.out.println(temp);
    System.out.println(temp.hashCode());

  }
}
