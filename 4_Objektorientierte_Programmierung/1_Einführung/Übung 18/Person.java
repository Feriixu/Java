public class Person
{
  String vorname;
  String nachname;
  int gebJahr;
  
  public void setVorname(String temp)
  {
    this.vorname = temp;
  }  
  public void setNachame(String temp)
  {
    this.nachname = temp;       
  }
  public void setGebJahr(int temp)
  {
    this.gebJahr = temp; 
  }
  public String getName()
  {
    return this.vorname + " " + this.nachname;
  }
  public int getAlter(int jahr)
  {
    return (jahr - this.gebJahr);
  }
}
