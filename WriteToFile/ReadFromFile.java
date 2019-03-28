import java.util.*;
import java.io.*;

public class ReadFromFile
{
  private Scanner x;
  public void openFile()
  {
    try 
    {
      x = new Scanner(new File("output.txt"));
    } 
    catch(Exception e) 
    {
      System.out.println("File could not be read");
    }
  }
  
  public void readFile()
  {
    while(x.hasNext()) 
    { 
      String a = x.next();
      String b = x.next();
      String c = x.next();
      System.out.printf("%s %s %s\n", a, b, c);
    }
  }

  public void closeFile()
  {
    x.close();
  }
}
