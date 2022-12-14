import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.applet.Applet;
import java.awt.Graphics;
// class extending
public class RepaintDemo extends Applet  {
int test=2;
public void paint(Graphics graphics)
{
super.paint(graphics);
setBackground(Color.cyan);   // set backgroung color of window
graphics.setColor(Color.black);   // set color of Text appearing on window
graphics.drawString("Value of Variable test = "+test, 80, 80);
try
{
Thread.sleep(1000);
}
catch(InterruptedException ex){}
// increasing value of variable by 1 and update its value of GUI
test++;
repaint();
}
}