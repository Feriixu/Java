public class StartTier
{
  public static void main(String[] args)
  {
    Tier t = new Tier("test Gattung");
    t.setGeheimeVariable(55);
    t.zeigeDaten();
    System.out.println("Die geheime Variable ist: " + t.getGeheimeVariable());
    
    Fisch f = new Fisch(25, "test Gattung");
    f.setKannLuftAtmen(true);
    f.zeigeDaten();
    if(f.getKannLuftAtmen())
      System.out.println("Ich kann Luft atmen!");
    else
      System.out.println("Ich kann keine Luft Atmen!");
  }  
}
