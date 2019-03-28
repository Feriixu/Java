public class Verlagsprodukt 
{
  //Attribute 
  public String urheber;
  public String titel;
  private double preis ;
  
  //Konstruktoren
  public Verlagsprodukt()
  {
    urheber = "Kein Urheber"; 
    titel = "Kein Titel"; 
    preis = 0;
  }//Ende Standartkonstruktor 
  
  public Verlagsprodukt(String urheber , String titel , double preis )
  {
    this.urheber = urheber ; 
    this.titel = titel;
    if(preis>0)
       this.preis = preis ; 
    else
        this.preis= 0; 
  } //Ende Konstruktor mit Parameter 
  
  //Methoden 
  public void setPreis(double preis)
  {
    if(preis<0)
      this.preis = 0; 
    else
        this.preis = preis; 
  }//Ende Set-Preis 
  public double getPreis()
  {
     return this.preis;
  }//Ende Get-Preis
  public void datenausgabe()
  {
     System.out.println(this.titel + " von " + this.urheber + " kostet " + this.preis + " Euro.");
  }//Ende datenAusgabe
}//Ende der Klasse  