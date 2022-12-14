package graphicscsc;

import java.awt.geom.*;
import java.awt.*;

/**
 *
 * @author Angelo
 */
public class LongExamTwoArea extends Frame {
    public void paint(Graphics g) {
        // Angelo Louis L. Hizon
        // 2019-132083
        
        Graphics2D g2d = (Graphics2D) g;
        
        Rectangle2D.Double rectangle = new Rectangle2D.Double(100,200,200,150);
        Ellipse2D.Double ellipse = new Ellipse2D.Double(150,50,200,200);
        Rectangle2D.Double square = new Rectangle2D.Double(250,100,100,100);
        g2d.draw(rectangle);
        g2d.draw(ellipse);
        g2d.draw(square);
        
        Area a = new Area(rectangle);
        Area b = new Area(ellipse);
        Area c = new Area(square);
        
        // Intersection
//        a.intersect(b);
//        g2d.setColor(Color.GREEN);
//        g2d.fill(a);
        
        // Union
//        b.add(c);
//        g2d.setColor(Color.RED);
//        g2d.fill(b);
//        
        // Symmetric Difference
//        a.exclusiveOr(c);
//        g2d.setColor(Color.YELLOW);
//        g2d.fill(a);
//        
        // Relative Difference
        b.subtract(c);
        g2d.setColor(Color.BLUE);
        g2d.fill(b);
    } 
    
    public static void main(String[] args) {
        LongExamTwoArea illustration = new LongExamTwoArea();
        illustration.setTitle("Long Exam 2 Area - HIZON");
        illustration.setSize(800,800);
        illustration.setVisible(true);
    }
}
