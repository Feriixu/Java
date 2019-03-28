public class Schueler
{
  String name; 
  Note[] noten = new Note[4];
  public String getInfo(int note)
  {
    return "Fach: " + noten[note].fach + ", Wert: " + noten[note].wert; 
  }
}
