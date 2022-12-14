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
public class ActivityTwo extends Frame {
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        // The thickness of the stroke where indicates that the number is a float
        BasicStroke bs = new BasicStroke(3.0f);
        g2d.setStroke(bs);
        
        //Line
        g2d.setColor(Color.BLACK);
        g2d.drawString("Line",50,450);
        Line2D.Double A = new Line2D.Double(50,475,500,125);
        g2d.setColor(Color.BLACK);
        g2d.draw(A);
        
        Line2D.Double B = new Line2D.Double(500,125,300,300);
        g2d.setColor(Color.BLACK);
        g2d.draw(B);
        
        Line2D.Double C = new Line2D.Double(300,300,450,500);
        g2d.setColor(Color.BLACK);
        g2d.draw(C);
        
        Line2D.Double D = new Line2D.Double(450,500,200,375);
        g2d.setColor(Color.BLACK);
        g2d.draw(D);
        
        Line2D.Double E = new Line2D.Double(200,375,50,475);
        g2d.setColor(Color.BLACK);
        g2d.draw(E);
        
        //QuadCurve
        g2d.setColor(Color.BLACK);
        g2d.drawString("QuadCurve",175,405);
        QuadCurve2D.Double P1 = new QuadCurve2D.Double (175, 500, 200, 300, 400, 550);
        g2d.setColor(Color.GREEN);
        g2d.draw(P1);
        
//        QuadCurve2D.Double P2 = new QuadCurve2D.Double (400, 550, 200, 300, 175, 550);
//        g2d.setColor(Color.GREEN);
//        g2d.draw(P2);
        
        //CubicCurve
        g2d.setColor(Color.BLACK);
        g2d.drawString("CubicCurve",375,290);
        CubicCurve2D.Double cc = new CubicCurve2D.Double(375, 300, 450, 550, 550, 450, 575, 350);
        g2d.setColor(Color.BLUE);
        g2d.draw(cc);
        
        //Rectangle
        g2d.setColor(Color.BLACK);
        g2d.drawString("Rectangle",100,90);
        Rectangle2D.Double r1 = new Rectangle2D.Double(100, 100, 150, 200);
        g2d.setColor(Color.RED);
        g2d.draw(r1);
        
        //Ellipse
//        g2d.setColor(Color.BLACK);
//        g2d.drawString("Ellipse",20,20);
//        Ellipse2D.Double e1 = new Ellipse2D.Double(20, 30, 40, 60);
//        g2d.setColor(Color.YELLOW);
//        g2d.draw(e1);
//        g2d.setColor(Color.BLACK);
//        g2d.drawString("Ellipse",80,110);
//        Ellipse2D.Double e1 = new Ellipse2D.Double(80, 120, 40, 60);
//        g2d.setColor(Color.YELLOW);
//        g2d.draw(e1);

        //Ellipse
        g2d.setColor(Color.BLACK);
        g2d.drawString("Ellipse",80,50);
        Ellipse2D.Double e1 = new Ellipse2D.Double(80, 60, 40, 60);
        g2d.setColor(Color.YELLOW);
        g2d.draw(e1);     
        
        //Arc
        g2d.setColor(Color.BLACK);
        g2d.drawString("Arc Pie",350,40);
        
        Rectangle2D.Double r2 = new Rectangle2D.Double(300, 50, 100, 75);
        Arc2D.Double arc_pie = new Arc2D.Double(r2, 15, 75, Arc2D.PIE);
        g2d.setColor(Color.ORANGE);
        g2d.draw(arc_pie);
    }
    
     public static void main(String[] argv) {
        ActivityTwo illustration = new ActivityTwo();
        illustration.setTitle("Graphics Illustration in Java");
        illustration.setBackground(Color.WHITE);
        illustration.setSize(600,600);
        illustration.setForeground(Color.BLACK);
        illustration.setVisible(true); 
    }
}
