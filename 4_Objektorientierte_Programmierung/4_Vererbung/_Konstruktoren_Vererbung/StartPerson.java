public class StartPerson
{
  public static void main(String args[])
  {
    Person p = new Person("Paul", "Müller");
    System.out.println(p.getInfo());
    Lehrer l = new Lehrer("Joachim", "Spitz", "Informatik");
    System.out.println(l.getInfo());
}
}
