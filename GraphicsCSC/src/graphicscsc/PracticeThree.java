package graphicscsc;

import java.awt.geom.*;
import java.awt.*;

public class PracticeThree extends Frame {
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        BasicStroke bs = new BasicStroke(2.0f);
        g2d.setStroke(bs);
        
        // Geometric Objects
        g2d.setFont(new Font("Arial", Font.BOLD, 24));
        g2d.drawString("This is a practice exercise for prelims", 50, 50);
        
        Line2D.Double line = new Line2D.Double(100,100,200,200);
        g2d.setColor(Color.BLACK);
        g2d.draw(line);
        
        QuadCurve2D.Double quad = new QuadCurve2D.Double(100,100,200,200,300,100);
        g2d.setColor(Color.RED);
        g2d.draw(quad);
        
        CubicCurve2D.Double cubic = new CubicCurve2D.Double(100,100,200,200,100,300,000,100);
        g2d.setColor(Color.GRAY);
        g2d.draw(cubic);
        
        Rectangle2D.Double rectangle = new Rectangle2D.Double(300,300,100,200);
        g2d.setColor(Color.GREEN);
        g2d.fill(rectangle);
        
        Ellipse2D.Double ellipse = new Ellipse2D.Double(300,400,200,100);
        g2d.setColor(Color.YELLOW);
        g2d.fill(ellipse);
        
        Arc2D.Double arc = new Arc2D.Double(rectangle, 20, 40, Arc2D.PIE);
        g2d.setColor(Color.ORANGE);
        g2d.fill(arc);
        
        // Area
        g2d.drawString("Area", 300, 600);
        
        Rectangle2D.Double rectangleArea = new Rectangle2D.Double(300,700,100,200);
        g2d.setColor(Color.GREEN);
        
        Ellipse2D.Double ellipseArea = new Ellipse2D.Double(300,800,200,100);
        g2d.setColor(Color.YELLOW);
        
        Area a = new Area(rectangleArea);
        Area b = new Area(ellipseArea);
        
        // a.add(b);
        // a.intersect(b);
        // a.subtract(b);
        a.exclusiveOr(b);
        g2d.fill(a);
        
        // General Path
        GeneralPath gp = new GeneralPath();
        gp.moveTo(50, 600);
        gp.lineTo(100, 800);
        gp.lineTo(30, 900);
        gp.quadTo(30, 30, 40, 700);
        gp.curveTo(50, 90, 70, 60, 100, 750);
        g2d.draw(gp);
    }
    
    public static void main(String[] args) {
        PracticeThree illustration = new PracticeThree();
        illustration.setSize(800,1080);
        illustration.setTitle("Practice Three");
        illustration.setBackground(Color.WHITE);
        illustration.setVisible(true);
    }
}
