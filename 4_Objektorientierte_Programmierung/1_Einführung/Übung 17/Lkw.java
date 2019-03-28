public class Lkw
{
  String kennzeichen;
  String fabrikat;
  double nutzlast;
  String getInfo()
  {
    return "Der " + fabrikat + " Lkw mit dem Kennzeichen :" + kennzeichen + ": hat eine Nutzlast von " + nutzlast + " Tonnen.";
  }
}
