import java.util.*;

public class createFile
{
  public static void main(String[] args)
  {
    final Formatter form;
    
    try
    {
      form = new Formatter("testList.txt"); 
      System.out.println("File created"); 
    }
    catch(Exception e)
    {
      System.out.println("File failed to create");
    }
    
  }
}
