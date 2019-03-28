public class Person
{
  // Attribute
  public String name;
  // Konstruktoren
  public Person()
  {
    this.name = "";
  }
  public Person(String name)
  {
    this.name = name;
  }
  // Methoden
  public void zeigeDaten()
  {
    System.out.println("Die Person heisst " + this.name  + ".");
  }
}