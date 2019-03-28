public class Person
{
  //Attribute
  protected String vorname;
  protected String nachname;
  //Konstruktoren
  public Person()
  {
    this("", "");
  }
  public Person(String vorname, String nachname)
  {
    this.vorname = vorname;
    this.nachname = nachname;
  }
  //Methoden
  public String getInfo()
  {
    return "\nIch bin eine Person\nVorname: " + this.vorname + "\nNachname: " + this.nachname;
  }
}

