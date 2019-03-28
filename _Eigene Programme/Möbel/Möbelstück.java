public class Möbelstück
{
  //Attribute
  public String bezeichner;
  public String material;  
  //Konstruktoren
  public Möbelstück()
  {
    this("", "");
  }
  public Möbelstück(String bezeichner, String material)
  {
    this.bezeichner = bezeichner;
    this.material = material;
  }
  //Methoden
  public void zeigeDaten()
  {
    System.out.println("\nDies ist ein Möbelstück\n- Bezeichner: " + this.bezeichner + "\n- Material: " + this.material);
  }
}
