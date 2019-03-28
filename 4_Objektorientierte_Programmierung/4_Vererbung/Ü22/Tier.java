public class Tier
{
  //Attribute
  public String gattung;
  private int geheimeVariable;
  //Konstruktoren
  public Tier()
  {
    gattung = "";
    this.geheimeVariable = 0;
  }
  public Tier(String gattung)
  {
    this.gattung = gattung;
    this.geheimeVariable = 0;
  }
  public Tier(String gattung, int geheimeVariable)
  {
    this.gattung = gattung;
    this.geheimeVariable = geheimeVariable;
  }
  //Methoden
  //set-get
  public void setGeheimeVariable(int geheimeVariable)
  {
    if (geheimeVariable > 0 && geheimeVariable < 100) 
    this.geheimeVariable = geheimeVariable;
  }
  public int getGeheimeVariable()
  {
    return this.geheimeVariable;
  }
  //Andere Methoden
  public void zeigeDaten()
  {
    System.out.println("Ich bin ein Tier der Gattung " + this.gattung + ".");
  }
}
