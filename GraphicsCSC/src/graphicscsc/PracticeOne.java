/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicscsc;

import java.awt.geom.*;
import java.awt.*;

/**
 *
 * @author Angelo
 */
public class PracticeOne extends Frame {
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        // String
        g2d.setFont(new Font("Arial", Font.BOLD, 24));
        g2d.drawString("Hello World", 100, 100);
        
        // Basic Stroke
        BasicStroke bs = new BasicStroke(5.0f);
        g2d.setStroke(bs);
        
        // Line
        Line2D.Double l1 = new Line2D.Double(110,220,400,800);
        g2d.setColor(Color.YELLOW);
        g2d.draw(l1);
        
        // Quadratic Curve
        QuadCurve2D.Double qc1 = new QuadCurve2D.Double(110,220,300,400,110,510);
        g2d.setColor(Color.BLACK);
        g2d.draw(qc1);
        
        // Parametric Curve or Cubic Curve
        CubicCurve2D.Double cc1 = new CubicCurve2D.Double(110,220,300,400,500,600,850,640);
        g2d.setColor(Color.GREEN);
        g2d.draw(cc1);
        
        // Rectangle
        Rectangle2D.Double r1 = new Rectangle2D.Double(300,200,500,180);
        g2d.setColor(Color.ORANGE);
        g2d.fill(r1);
        
        // Arc
        Arc2D.Double a1 = new Arc2D.Double(r1, 40, 90, Arc2D.CHORD);
        g2d.setColor(Color.GREEN);
        g2d.fill(a1);
        
        // Ellipse
        Ellipse2D.Double e1 = new Ellipse2D.Double(400,100,300,200);
        g2d.setColor(Color.red);
        g2d.draw(e1);
    }
    
    public static void main(String[] args) {
        PracticeOne illustration = new PracticeOne();
        illustration.setTitle("Practice One");
        illustration.setBackground(Color.LIGHT_GRAY);
        illustration.setSize(850, 850);
        illustration.setForeground(Color.WHITE);
        illustration.setVisible(true);
    }
}
