public class Gebaeude
{
  protected boolean keller;
  protected int anzfenster;
  public String standort;
  protected boolean security;
  
  public Gebaeude() 
  {
    this.keller = false;
    this.anzfenster = 0;
    this.standort = "";
    this.security = false;
  }
  
  public Gebaeude(boolean keller, int anzfenster, String standort, boolean security)
  {
    this.keller = keller;
    this.anzfenster = anzfenster;
    this.standort = standort;
    this.security = security;  
  }
    
  public String getInfo()
  {
    String text = "";
    text += "\nDies ist ein Gebaeude:";
    if (keller) 
    {
      text += "\n-Es hat einen Keller";
    } 
    else
    {
      text += "\n-Es hat keinen Keller";
    }
    
    if (security) 
    {
      text += "\n-Es wird streng bewacht";
    } 
    else
    {
      text += "\n-Es wird nicht bewacht";  
    }
          
    text += "\n-Es hat "+anzfenster+" Fenster.\n-Der Standort ist: "+standort + ".";
    return text;
  }  
}    
