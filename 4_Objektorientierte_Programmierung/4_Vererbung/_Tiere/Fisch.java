public class Fisch extends Tier 
{
  
  public int anzFlossen;
  
  public Fisch() 
  {
    this.gattung = "";
    this.anzFlossen = 0;
  }  
  public Fisch(int anzFlossen)
  {
    this.anzFlossen = anzFlossen;
    this.gattung = "";
  } 
  public Fisch(int anzFlossen, String gattung )
  {
    this.anzFlossen = anzFlossen;
    this.gattung = gattung;
  }
  public void zeigeDaten() 
  {
    System.out.println("Ich bin ein Tier der Gattung: "+this.gattung+" mit "+this.anzFlossen+" Flossen.");
  }
  public void schwimmen() 
  {
    if (anzFlossen > 0) 
    {
      System.out.println("Ich kann schwimmen.");
      else
      System.out.println("Ich kann nicht schwimmen. :(");
    } 
    
}  
