public class Schueler extends Person
{
  // Attribute
  private int note;
  // Konstruktoren
  public Schueler()
  {
    this.name = "";
    this.note = 0;
  }
  public Schueler(String name, int note)
  {
    this.name = name;
    this.note = note;
  }
  // Methoden
  public void setNote(int note)
  {
    if(note > 0 && note < 7)
    {
      this.note = note;
    }
  }
  public int getNote()
  {
    return this.note;
  }
  public void zeigeDaten()
  {
    System.out.println("Die Person " + this.name + " hat die Note " + this.note + ".");
  }
}

