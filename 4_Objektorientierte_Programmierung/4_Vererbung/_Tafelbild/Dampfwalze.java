public class Dampfwalze extends Kraftfahrzeug
{
  public int anzWalzen;
  // Kontruktor
  public Dampfwalze(int anzWalzen, boolean wasserkuehlung, int motorleistung)
  {
    this.anzWalzen = anzWalzen;
    this.wasserkuehlung = wasserkuehlung;
  }
  public boolean wasserkuehlung;
}