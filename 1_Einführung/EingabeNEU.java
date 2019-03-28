import java.util.*;
public class EingabeNEU
{
    public static void main(String argv[])
    {
      String name, reactTime, crime, state, hairColor, eyeColor;
      Integer by, age, footSize;
     
      Scanner input = new Scanner(System.in);     //neuen Scanner deklarieren

      System.out.println("Name: ");
      name = input.nextLine();
      System.out.println("Geburtsjahr: ");
      by = Integer.parseInt(input.nextLine());
      age = 2017 - by;                            //einfache Berechnung des Alters
      System.out.println("Schuhgröße: ");
      footSize = Integer.parseInt(input.nextLine());//Variablen konvertierung mittels Integer.parseInt()
      System.out.println("Reaktionsgeschwindigkeit: ");
      reactTime = input.nextLine() + " Sekunden"; //"Sekunden" Zusatz hinzufügen
      System.out.println("Verbrechen: ");
      crime = input.nextLine();
      System.out.println("Staatszugehörigkeit: ");
      state = input.nextLine();
      System.out.println("Haarfarbe: ");
      hairColor = input.nextLine();
      System.out.println("Augenfarbe: ");
      eyeColor = input.nextLine();

      System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      System.out.println("WANTED");
      System.out.println("======");
      System.out.println("Name:                     " + name);
      System.out.println("Geburtsjahr:              " + by);
      System.out.println("Alter                     " + age);
      System.out.println("Schuhgröße:               " + footSize);
      System.out.println("Reaktionsgeschwindigkeit: " + reactTime);
      System.out.println("Verbrechen:               " + crime);
      System.out.println("Staatszugehörigkeit:      " + state);
      System.out.println("Haarfarbe:                " + hairColor);
      System.out.println("Augenfarbe:               " + eyeColor);
      System.out.println("==========================");
    }//public static void main(String argv[])
}//public class EingabeNEU  
