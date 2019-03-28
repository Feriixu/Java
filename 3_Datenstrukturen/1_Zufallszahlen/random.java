import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Random extends JPanel
{
  public void paintComponent(Graphics g, int height, int width)
  {
    int i = 0;
    super.paintComponent(g);
    this.setBackground(Color.WHITE);
    int inc = 1;
    int pxl = 5;
    double prob = 0.1;
    for (int x = 0; x <= height; x += inc) 
    {
      for (int y = 0; y <= width; y += inc) 
      {
        if (Math.random() <= prob) {
          g.setColor(Color.BLACK);
        g.fillRect(x, y, pxl, pxl);
        } // end of if
        else 
        {
          //g.setColor(Color.WHITE);
        } 
        
      } // end of for
    } // end of for 
  }
  public void draw()
  {
    
  }

}
