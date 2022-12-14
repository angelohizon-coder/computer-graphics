package graphicscsc;

import java.awt.geom.*;
import java.awt.*;

/**
 *
 * @author Angelo
 */
public class PracticeSix extends Frame{
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        Rectangle2D.Double r1 = new Rectangle2D.Double(100,100,300,500);
        Ellipse2D.Double e1 = new Ellipse2D.Double(150,150,400,300);
        
        Area a = new Area(r1);
        Area b = new Area(e1);
        
        a.exclusiveOr(b);
        
        g2d.setColor(Color.GREEN);
        g2d.fill(a);
        
    }
    
    public static void main(String[] args) {
        PracticeSix illustration = new PracticeSix();
        illustration.setSize(800,800);
        illustration.setTitle("Practice Six");
        illustration.setVisible(true);
    }
}
