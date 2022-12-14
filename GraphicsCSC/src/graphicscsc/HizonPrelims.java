package graphicscsc;

import java.awt.geom.*;
import java.awt.*;

/**
 *
 * @author Angelo
 */
public class HizonPrelims extends Frame{
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setFont(new Font("Arial", Font.BOLD, 15));
        g2d.drawString("Angelo Louis L. Hizon",50,75);
        g2d.drawString("2019-132083",50,100);
        
        Ellipse2D.Double e1 = new Ellipse2D.Double(100,100,100,100);
        g2d.setColor(Color.YELLOW);
        g2d.draw(e1);
        Ellipse2D.Double e2 = new Ellipse2D.Double(150,100,100,100);
        g2d.setColor(Color.GREEN);
        g2d.draw(e2);
        Ellipse2D.Double e3 = new Ellipse2D.Double(125,150,100,100);
        g2d.setColor(Color.MAGENTA);
        g2d.draw(e3);
        
        Area a1 = new Area(e1);
        Area a2 = new Area(e2);
        
        		
        a2.exclusiveOr(a1);

        g2d.setPaint(Color.red);

        g2d.fill(a2);
    }
    
    public static void main(String[] args) {
        HizonPrelims illustration = new HizonPrelims();
        illustration.setTitle("Prelims");
        illustration.setSize(800,800);
        illustration.setBackground(Color.WHITE);
        illustration.setVisible(true);
    }
}
