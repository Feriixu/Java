public class StartKlasse
{
  public static void main(String args[])
  {
    System.out.println("#Klasse Person");
    Person person = new Person();
    person.alter = 17;
    person.vorname = "Felix";
    person.nachname = "Stoltenberg";
    System.out.println(person.getInfo());

    System.out.println("----------------------------------------------\n\u0023Klasse Pkw");

    Pkw pkw = new Pkw();
    pkw.kennzeichen = "NO OB 1337";
    pkw.anzSitzplätze = 5;
    System.out.println(pkw.getInfo());

    System.out.println("----------------------------------------------\n\u0023Klasse Lkw");

    Lkw lkw = new Lkw();
    lkw.fabrikat = "MAN";
    lkw.kennzeichen = "GG WP 420";
    lkw.nutzlast = 5.2;
    System.out.println(lkw.getInfo());

    System.out.println("----------------------------------------------\n\u0023Klasse Bruch");
    
    Bruch bruch = new Bruch();
    bruch.zaehler = 12321;
    bruch.nenner = 1234321;
    System.out.println(bruch.getBruch());
    System.out.println(bruch.getWert());

    System.out.println("----------------------------------------------\n\u0023Klasse Note");

    Note testNote = new Note();
    testNote.fach = "Test";
    testNote.wert = 1234;
    System.out.println(testNote.getInfo());

    System.out.println("----------------------------------------------\n\u0023Klasse Schueler");

    Schueler schueler = new Schueler();
    for (int i = 0; i < 4; i++) 
    {
      schueler.noten[i] = new Note();    
    }
    schueler.noten[0].fach = "Mathe";
    schueler.noten[0].wert = 4;
    schueler.noten[1].fach = "Deutsch";
    schueler.noten[1].wert = 6;
    schueler.noten[2].fach = "Englisch";
    schueler.noten[2].wert = 1;
    schueler.noten[3].fach = "Französisch";
    schueler.noten[3].wert = 5;
    
    for (int i = 0; i < 4; i++) {
      System.out.println(schueler.getInfo(i));
    }

    System.out.println("----------------------------------------------");
  }
}
