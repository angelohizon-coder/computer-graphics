package graphicscsc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.geom.*;
import java.awt.*;

/**
 *
 * @author Angelo
 */
public class SummativeActivityOneBoat extends Frame {
    
     public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        // The thickness of the stroke where indicates that the number is a float
        BasicStroke bs = new BasicStroke(3.0f);
        g2d.setStroke(bs);
        
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 15));
        g2d.drawString("Angelo Louis L. Hizon",50,75);
        g2d.drawString("2019-132083",50,100);
        
        // Line
        Line2D.Double AB = new Line2D.Double(100,350,150,450);
        g2d.setColor(Color.BLACK);
        g2d.draw(AB);
        
        Line2D.Double BC = new Line2D.Double(150,450,450,450);
        g2d.setColor(Color.BLUE);
        g2d.draw(BC);
        
        Line2D.Double CD = new Line2D.Double(450,450,500,350);
        g2d.setColor(Color.CYAN);
        g2d.draw(CD);
        
        Line2D.Double DE = new Line2D.Double(500,350,305,350);
        g2d.setColor(Color.DARK_GRAY);
        g2d.draw(DE);
        
        Line2D.Double EF = new Line2D.Double(500,350,295,350);
        g2d.setColor(Color.GRAY);
        g2d.draw(EF);
        
        Line2D.Double FA = new Line2D.Double(295,350,100,350);
        g2d.setColor(Color.GREEN);
        g2d.draw(FA);
        
        Line2D.Double FG = new Line2D.Double(295,350,295,150);
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.draw(FG);
        
        Line2D.Double GH = new Line2D.Double(295,150,305,150);
        g2d.setColor(Color.MAGENTA);
        g2d.draw(GH);
        
        Line2D.Double HJ = new Line2D.Double(305,150,305,200);
        g2d.setColor(Color.ORANGE);
        g2d.draw(HJ);
        
        Line2D.Double IJ = new Line2D.Double(405,200,305,200);
        g2d.setColor(Color.PINK);
        g2d.draw(IJ);
        
        // NOT INCLUDED IN THE GIVEN: MISSING
        Line2D.Double IH = new Line2D.Double(405,200,305,150);
        g2d.setColor(Color.RED);
        g2d.draw(IH);
        
        Line2D.Double JE = new Line2D.Double(305,200,305,350);
        g2d.setColor(Color.YELLOW);
        g2d.draw(JE);
    }
    
    public static void main(String[] argv) {
        SummativeActivityOneBoat illustration = new SummativeActivityOneBoat();
        illustration.setTitle("Boat");
        illustration.setBackground(Color.WHITE);
        illustration.setSize(600,600);
        illustration.setForeground(Color.BLACK);
        illustration.setVisible(true); 
    }
}
