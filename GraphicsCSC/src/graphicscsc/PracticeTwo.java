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
public class PracticeTwo extends Frame {
    public void paint(Graphics g) {
        Point point1 = new Point(3,-4);
        Point point2 = new Point(6,8);
        
        System.out.println("The first point is: ");
        System.out.println("(" + point1.getX() + "," + point1.getY() + ")\n");
        
        System.out.println("The first point is: ");
        System.out.println("(" + point2.getX() + "," + point2.getY() + ")\n");
        
        double rise = point2.getY() - point1.getY();
        double run = point2.getX() - point1.getX();
        
        double m=rise/run;
        
        System.out.println(m);
//        Graphics2D g2d = (Graphics2D) g;
//        
//        BasicStroke bs = new BasicStroke(2.0f);
//        g2d.setStroke(bs);
//        
//        // g2d.setFont(new Font("Arial", Font.BOLD, 24));
//        // g2d.drawString("Practice Two", 100, 100);
//        
//        // Lines or Close Polyline or Polygon or Convex Polygon
////        Line2D.Double l1 = new Line2D.Double(50,475,500,125);
////        Line2D.Double l2 = new Line2D.Double(500,125,300,300);
////        Line2D.Double l3 = new Line2D.Double(300,300,450,500);
////        Line2D.Double l4 = new Line2D.Double(300,300,450,500);
////        Line2D.Double l5 = new Line2D.Double(450,500,200,375);
////        Line2D.Double l6 = new Line2D.Double(200,375,50,475);
////        g2d.setColor(Color.BLACK);
////        g2d.draw(l1);
////        g2d.draw(l2);
////        g2d.draw(l3);
////        g2d.draw(l4);
////        g2d.draw(l5);
////        g2d.draw(l6);
//        
//        // QuadCurve
//        // QuadCurve2D.Double qc1 = new QuadCurve2D.Double(175,500,200,300,400,550);
//        // g2d.setColor(Color.GREEN);
//        // g2d.draw(qc1);
//        
//        // Cubic Curve
//        // CubicCurve2D.Double cc1 = new CubicCurve2D.Double(375,300,450,550,550,450,575,350);
//        // g2d.setColor(Color.BLUE);
//        // g2d.draw(cc1);
//        
//        // Rectangle 
//        // Rectangle2D.Double r1 = new Rectangle2D.Double(100,100,150,200);
//        // g2d.setColor(Color.RED);
//        // g2d.draw(r1);
//        
//        // Ellipse
//        // Ellipse2D.Double e1 = new Ellipse2D.Double(80,60,40,60);
//        // g2d.setColor(Color.YELLOW);
//        // g2d.draw(e1);
//        
//        // Arc
//        Rectangle2D.Double r2 = new Rectangle2D.Double(300,50,100,75);
//        Arc2D.Double a1 = new Arc2D.Double(r2,15,75,Arc2D.PIE);
//        g2d.setColor(Color.ORANGE);
//        g2d.draw(a1);
//        
//        // Area
////        Ellipse2D.Double e2 = new Ellipse2D.Double(80,60,100,90);
////        Rectangle2D.Double r3 = new Rectangle2D.Double(100,100,150,200);
////        
////        Area a = new Area(e2);
////        Area b = new Area(r3);
////        
////        a.exclusiveOr(b);
////        g2d.fill(a);
////        
////        GeneralPath gp = new GeneralPath();
////        gp.moveTo(200, 200);
////        gp.lineTo(400, 500);
////        gp.quadTo(300, 200, 500, 600);
////        gp.curveTo(500, 700, 800, 800, 10, 20);
////        g2d.setColor(Color.red);
////        g2d.draw(gp);
//
//        QuadCurve2D.Double qc2 = new QuadCurve2D.Double(200,200,230,250,260,200);
//        g2d.draw(qc2);
    }
    
    public static void main(String[] args) {
//        PracticeTwo illustration = new PracticeTwo();
//        illustration.setSize(850,850);
//        illustration.setTitle("Practice Two");
//        illustration.setBackground(Color.WHITE);
//        illustration.setVisible(true);

        Point point1 = new Point(200,200);
        Point point2 = new Point(260,200);
        
        System.out.println("The first point is: ");
        System.out.println("(" + point1.getX() + "," + point1.getY() + ")\n");
        
        System.out.println("The first point is: ");
        System.out.println("(" + point2.getX() + "," + point2.getY() + ")\n");
        
        double rise = point2.getY() - point1.getY();
        double run = point2.getX() - point1.getX();
        
        double m=rise/run;
        
        System.out.println(m);
    }
}
