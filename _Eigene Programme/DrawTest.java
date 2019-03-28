import javax.swing.*;
public class DrawTest
{
  public static void main(String args[])
  {
    JFrame f = new JFrame("Draw Test");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    Random r = new Random();
    r.paintComponent(null, 1000, 1000);
    f.add(r);
    f.setSize(1800, 1000);
    f.setVisible(true);
  }
}
