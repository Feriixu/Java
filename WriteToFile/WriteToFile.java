import java.io.*;
import java.lang.*;
import java.util.*;

public class WriteToFile
{
  private Formatter x;

  public void openFile()
  {
    try
    {
      x = new Formatter("output.txt");
      System.out.println("File created");
    }
    catch (Exception e)
    {
      System.out.println("You have an arrr");
    }
  }
  public void addRecords()
  {
    x.format("%s %s %s\n", "20", "Bucky", "Roberts");
  }
  public void closeFile()
  {
    x.close();  
  }
  public static void main(String[] args)
  {
    
  }
}
