public class UsbStick
{
  //Konstanten
  private static int anzObjekte = 0;

  //Attribute
  private int nr;
  public String name;
  private double speicher;
  private double freierSpeicher;
  private boolean sensibel;

  //Konstruktoren
  public Lager()
  {
    this("", 0, false);
  }
  public Lager(String name, int speicher, boolean sensibel)
  {
    this.name = name;
    this.speicher = speicher;
    this.freierSpeicher = speicher;
    this.privat = sensibel;
    anzObjekte++;
    this.nr = anzObjekte;
  }

  //Methoden
  //speicher manipulation
  public void load()
  {
    //daten seichern
  }
  public void delete()
  {
    //daten l�schen
  }
  
  //set get speicher
  public void setSpeicher(int speicher)
  {
    if(speicher > 0)
    {
      this.speicher = speicher;
    }
    else
    {
      this.speicher = 0;
    }
  }
  public int getSpeicher()
  {
    return speicher;
  }
  //get nr
  public int getNr()
  {
    return this.nr;
  }
  //DatenAusgaben
  public void DatenAusgeben()
  {
    System.out.print("Der USB Stick mit dem Namen " + this.name + " hat\nSpeicher: " this.speicher + "\nFreien Speicher: " + this.freierSpeicher + "\nEs handelt sich um ");
    if(sensibel)
    {
      System.out.print("sensible Daten.");
    }
    else
    {
      System.out.println("unsensible Daten.");
    }
  }
}