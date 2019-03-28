public class StartGeheimnis
{
  public static void main(String[] args)  
  {
    Geheimnis g = new Geheimnis(1337, "Unglaublich geheimes Geheimnis");
    g.setGeheimnis(1337, "Dieser Satz überschreibt das Geheimnis");
    System.out.println(g.getGeheimnis(1337));
  }
}