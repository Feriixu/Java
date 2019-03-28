import java.io.*;
import java.util.*;

public class ReadList
{
  // Methods
  public String[] readToArray(String datei)
  {
    String[] output = null; //output is assigned null to prevent return error
    try
    {
      //Read the whole File into one String
      String content = new Scanner(new File("..\\listen\\" + datei)).useDelimiter("\\Z").next();
      //Separate the String and store in array
      output = content.split("\n");
      System.out.println("Accessed File");
    }
    catch(Exception e)
    {
      System.out.println("Could not read File");
      System.out.println("\n\n\n\n\n\n\n");
    }
    return output;
  }
}
