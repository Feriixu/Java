public class M�belst�ck
{
  //Attribute
  public String bezeichner;
  public String material;  
  //Konstruktoren
  public M�belst�ck()
  {
    this("", "");
  }
  public M�belst�ck(String bezeichner, String material)
  {
    this.bezeichner = bezeichner;
    this.material = material;
  }
  //Methoden
  public void zeigeDaten()
  {
    System.out.println("\nDies ist ein M�belst�ck\n- Bezeichner: " + this.bezeichner + "\n- Material: " + this.material);
  }
}
