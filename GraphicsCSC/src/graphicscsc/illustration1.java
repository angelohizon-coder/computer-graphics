package graphicscsc;

import java.awt.geom.*;
import java.awt.*;

public class illustration1 extends Frame {
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        // The thickness of the stroke where indicates that the number is a float
        BasicStroke bs = new BasicStroke(9.0f);
        g2d.setStroke(bs);
        // Changing the font style and not necessary
        g2d.setFont(new Font("Arial", Font.BOLD, 25));
        g2d.drawString("First Graphcis Program of 4CSC in Java",100,80);
        
        Line2D.Double l1 = new Line2D.Double(100,100,200,250);
        g2d.setColor(Color.DARK_GRAY);
        g2d.draw(l1);
        
        Line2D.Double l2 = new Line2D.Double(200,250,100,400);
        g2d.setColor(Color.MAGENTA);
        g2d.draw(l2);
        
        // 310 and 250 creates the curve
        QuadCurve2D.Double qc = new QuadCurve2D.Double (250, 100, 310, 250 ,450, 100);
        g2d.setColor(Color.DARK_GRAY);
        g2d.draw(qc);
        
        CubicCurve2D.Double cc = new CubicCurve2D.Double(250, 500, 350, 300, 450, 310, 600, 500);
        g2d.setColor(Color.MAGENTA);
        g2d.draw(cc);
        
        // Same width and length to make it a circle (3rd and 4th parameter)
        Ellipse2D.Double e1 = new Ellipse2D.Double(500, 100, 100, 100);
        g2d.setColor(Color.GREEN);
        g2d.draw(e1);
        g2d.setColor(Color.GRAY);
        g2d.fill(e1);
        
        Rectangle2D.Double r1 = new Rectangle2D.Double(700, 300, 200, 150);
        g2d.setColor(Color.ORANGE);
        g2d.draw(r1);
        g2d.setColor(Color.BLUE);
        g2d.fill(r1);
        
        // Pie
        Rectangle2D.Double r2 = new Rectangle2D.Double(100, 510, 200, 200);
        Arc2D.Double arc_pie = new Arc2D.Double(r2, 20, 50, Arc2D.PIE);
        g2d.setColor(Color.ORANGE);
        g2d.fill(arc_pie);
        
        // Open 
        // first parameter is the ractangle, second is initial angle, third is terminal angle, fourth type of arc
        Rectangle2D.Double r3 = new Rectangle2D.Double(100, 610, 200, 200);
        Arc2D.Double arc_open = new Arc2D.Double(r3, 0, 80, Arc2D.OPEN);
        g2d.setColor(Color.ORANGE);
        g2d.fill(arc_open);
        
        // Chord
        Rectangle2D.Double r4 = new Rectangle2D.Double(100, 710, 200, 200);
        Arc2D.Double arc_chord = new Arc2D.Double(r4, 50, 110, Arc2D.CHORD);
        g2d.setColor(Color.ORANGE);
        g2d.fill(arc_chord);
    }
    
    // Assumed to be the GUI
    public static void main(String[] argv) {
        illustration1 i = new illustration1();
        i.setTitle("Graphics Illustration in Java");
        i.setBackground(Color.YELLOW);
        i.setSize(800,800);
        i.setForeground(Color.BLACK);
        i.setVisible(true); 
    }
}
