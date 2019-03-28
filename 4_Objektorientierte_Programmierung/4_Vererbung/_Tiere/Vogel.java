public class Vogel extends Tier
{
  
  public int anzFlossen;
  private boolean raubvogel;
  
  public Vogel() 
  {
    this.gattung = "";
    this.anzFedern = 0;
  }
    
  public Vogel(int anzFedern)
  {
    this.anzFedern = anzFedern;
    this.gattung = "";
  }
   
  public Vogel(int anzFedern, String gattung )
  {
    this.anzFedern = anzFedern;
    this.gattung = gattung;
  }
  
  public void zeigeDaten() 
  {
    System.out.println("Ich bin ein Tier der Gattung: "+this.gattung+" mit "+this.anzFedern+" Federn.");
  }
  
  public void fliegen() 
  {
    if (anzFedern > 30) 
    {
      System.out.println("Ich kann Fliegen.");
      else
      System.out.println("Ich kann nicht Fliegen. :(");
    } 
    
  }  
