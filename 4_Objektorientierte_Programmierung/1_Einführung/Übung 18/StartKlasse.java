public class StartKlasse
{
  public static void main(String[] args)
  {
    Person p = new Person();
    p.setVorname("Felix");
    p.setNachame("Stoltenberg");
    p.setGebJahr(2000);
    System.out.println(p.getName()); 
    System.out.println(p.getAlter(2018));   
  }
}