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
public class SummativeActivityOneTShirt extends Frame {
    
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        // The thickness of the stroke where indicates that the number is a float
        BasicStroke bs = new BasicStroke(3.0f);
        g2d.setStroke(bs);
        
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 15));
        g2d.drawString("Angelo Louis L. Hizon",50,75);
        g2d.drawString("2019-132083",50,100);
        
        //Line
        Line2D.Double AB = new Line2D.Double(100,250,150,250);
        g2d.setColor(Color.BLUE);
        g2d.draw(AB);
        
        Line2D.Double BC = new Line2D.Double(150,250,150,200);
        g2d.setColor(Color.CYAN);
        g2d.draw(BC);
        
        Line2D.Double CD = new Line2D.Double(150,200,200,200);
        g2d.setColor(Color.DARK_GRAY);
        g2d.draw(CD);
        
        Line2D.Double DE = new Line2D.Double(200,200,200,500);
        g2d.setColor(Color.GRAY);
        g2d.draw(DE);
        
        Line2D.Double EF = new Line2D.Double(200,500,400,500);
        g2d.setColor(Color.GREEN);
        g2d.draw(EF);
        
        Line2D.Double FG = new Line2D.Double(400,500,400,200);
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.draw(FG);
        
        Line2D.Double GH = new Line2D.Double(400,200,450,200);
        g2d.setColor(Color.MAGENTA);
        g2d.draw(GH);
        
        Line2D.Double HI = new Line2D.Double(450,200,450,250);
        g2d.setColor(Color.ORANGE);
        g2d.draw(HI);
        
        Line2D.Double IJ = new Line2D.Double(450,250,500,250);
        g2d.setColor(Color.PINK);
        g2d.draw(IJ);
        
        Line2D.Double JK = new Line2D.Double(500,250,500,150);
        g2d.setColor(Color.RED);
        g2d.draw(JK);
        
        Line2D.Double KL = new Line2D.Double(500,150,450,100);
        g2d.setColor(Color.YELLOW);
        g2d.draw(KL);
        
        Line2D.Double LM = new Line2D.Double(450,100,150,100);
        g2d.setColor(Color.BLACK);
        g2d.draw(LM);
        
        Line2D.Double MN = new Line2D.Double(150,100,100,150);
        g2d.setColor(Color.BLUE);
        g2d.draw(MN);
        
        Line2D.Double NA = new Line2D.Double(100,150,100,250);
        g2d.setColor(Color.CYAN);
        g2d.draw(NA);
    }
    
    public static void main(String[] argv) {
        SummativeActivityOneTShirt illustration = new SummativeActivityOneTShirt();
        illustration.setTitle("T-Shirt");
        illustration.setBackground(Color.WHITE);
        illustration.setSize(600,600);
        illustration.setForeground(Color.BLACK);
        illustration.setVisible(true); 
    }
}
