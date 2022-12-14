package graphicscsc;

import java.awt.geom.*;
import java.awt.*;

public class illustration2 extends Frame {
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        // The thickness of the stroke where indicates that the number is a float
        BasicStroke bs = new BasicStroke(9.0f);
        g2d.setStroke(bs);
        
        Rectangle2D.Double r1 = new Rectangle2D.Double(500, 300, 200, 150);
        g2d.setColor(Color.BLACK);
        // g2d.draw(r1);
        // g2d.setColor(Color.YELLOW);
        // g2d.fill(r1);
        
        Ellipse2D.Double e1 = new Ellipse2D.Double(500, 380, 150, 100);
        g2d.setColor(Color.BLACK);
        // g2d.draw(e1);
        // g2d.setColor(Color.CYAN);
        // g2d.fill(e1);
        
        // DISCUSSION ABOUT AREA
        // Requires two intersecting objects
        Area a = new Area(r1);
        Area b = new Area(e1);
        
        // Union
        //a.add(b);
        //g2d.fill(a);

        //b.add(a);
        //g2d.fill(b);
        
        // Intersection
        //a.intersect(b);
        //g2d.fill(a);
        
        //b.intersect(a);
        //g2d.fill(b);
        
        // Exclusive Or
        // Opposite of Intersection
        // Without intersection
        // Symmteric Difference
        //a.exclusiveOr(b);
        //g2d.fill(a);
        
        // Relative Difference
        //Removes ellipse and showcase the remaining part of the rectangle
        //a.subtract(b);
        //g2d.fill(a);

        //Removes the rectangle and showcase the remaining part of the ellipse
        //b.subtract(a);
        //g2d.fill(b);
        
        // GENERAL PATH
        // Combination of multiple object
        GeneralPath gp = new GeneralPath();
        // Initial Point
        gp.moveTo(50, 50);
        // Terminal Point // Terminal point becomes start point to quadTo
        gp.lineTo(50, 200);
        // Starts with control point and terminal point // Terminal point becomes start point to curveTo
        gp.quadTo(150, 500, 250, 200);
        // Same logic follows; basically start point gets the the terminal point from the previous "object"
        gp.curveTo(350, 100, 150, 150, 100, 100);
        gp.lineTo(50,50);
        
        g2d.draw(gp);
    }
    
    // Assumed to be the GUI
    public static void main(String[] argv) {
        illustration2 i = new illustration2();
        i.setTitle("Area and General Path in Java");
        i.setBackground(Color.WHITE);
        i.setSize(800,800);
        i.setForeground(Color.BLACK);
        i.setVisible(true); 
    }
}
