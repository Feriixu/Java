public class Main
{
  public static void main(String a[])
  {
    System.out.println("          |_| |_|");
    System.out.println(" __   __  _______  _______  _______  ___     ");
    System.out.println("|  |_|  ||       ||  _    ||       ||   |    ");
    System.out.println("|       ||   _   || |_|   ||    ___||   |    ");
    System.out.println("|       ||  | |  ||       ||   |___ |   |    ");
    System.out.println("|       ||  |_|  ||  _   | |    ___||   |___ ");
    System.out.println("| ||_|| ||       || |_|   ||   |___ |       |");
    System.out.println("|_|   |_||_______||_______||_______||_______|");
    
    M�belst�ck m = new M�belst�ck();
    m.zeigeDaten();
    Stuhl st = new Stuhl("Gartenstuhl", "Plastik", true);
    st.zeigeDaten();
    Schrank sch = new Schrank("IKEA Schrank", "Holz", 5, true);
    sch.zeigeDaten();
    Regal r = new Regal("IKEA Regal", "Laminiertes Holz", 25, false);
    r.zeigeDaten();
  }
}

