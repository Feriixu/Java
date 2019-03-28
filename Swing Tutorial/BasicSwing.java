import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class BasicSwing extends JFrame
{
  JPanel p = new JPanel();
  JButton b = new JButton("Hello");
  JTextField t = new JTextField("Hier schreiben",20);
  JTextArea ta = new JTextArea("Hier\nbitte\nschreiben", 5, 20);
  JLabel j = new JLabel("Dieser Text kann nicht geändert werden");
  String choices[] = {"1","2","3","4","5"};

  JComboBox c = new JComboBox(choices);

  public static void main(String args[])
  {
    new BasicSwing();
  }

  public BasicSwing()
  {
    super("Basic Swing App");
    setSize(400, 300);
    setResizable(true);

    p.add(b);
    p.add(t);
    p.add(ta);
    p.add(j);
    p.add(c);
    add(p);

    setVisible(true);
  }
}
