public class Vogel extends Tier
{
  //Attribute
  public String art;
  public double spannweite;
  public boolean kannFliegen;
  public boolean zugVogel
  //Konstruktoren
  public Vogel()
  {
    this.art = "";
    this.spannweite = 0;
    this.kannFliegen = true;
    this.zugVogel = true;
  }
  public Vogel(String art)
  {
    this.art = art;
    this.spannweite = 0;
    this.kannFliegen = true;
    this.zugVogel = true;
  }
  public Vogel(String art, spannweite)
  {
    this.art = art;
    this.spannweite = 0;
    this.kannFliegen = true;
    this.zugVogel = true;
  }
}