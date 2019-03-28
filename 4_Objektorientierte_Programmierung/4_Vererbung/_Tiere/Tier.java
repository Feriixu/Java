public class Tier
{  
  public String gattung;
  
  public Tier() 
  {
    this.gattung = "";
  }
  
  public Tier(String) 
  {
    this.gattung = gattung;
  }
  
  public void zeigeDaten() 
  {
    System.out.println("Ich bin ein Tier der Gattung: "+this.gattung);
  }  
} 
