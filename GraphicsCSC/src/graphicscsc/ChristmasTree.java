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
public class ChristmasTree extends Frame {
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 15));
        g2d.drawString("Angelo Louis L. Hizon",50,75);
        g2d.drawString("2019-132083",50,100);
        
        GeneralPath christmasTree = new GeneralPath();
        christmasTree.moveTo(400,300);
        christmasTree.lineTo(450,400);
        christmasTree.lineTo(430,400);
        christmasTree.lineTo(500,500);
        christmasTree.lineTo(480,500);
        christmasTree.lineTo(550,600);
        christmasTree.lineTo(530,600);
        christmasTree.lineTo(600,700);
        christmasTree.lineTo(200,700);
        christmasTree.lineTo(270,600);
        christmasTree.lineTo(250,600);
        christmasTree.lineTo(320,500);
        christmasTree.lineTo(300,500);
        christmasTree.lineTo(370,400);
        christmasTree.lineTo(350,400);
        christmasTree.lineTo(400,300);
        g2d.setColor(Color.GREEN);
        g2d.fill(christmasTree);
        
        Rectangle2D.Double base = new Rectangle2D.Double(360,700,80,100);
        g2d.setColor(Color.BLACK);
        g2d.fill(base);
        
        GeneralPath star = new GeneralPath();
        star.moveTo(400,300);
        star.lineTo(370,270);
        star.lineTo(400,240);
        star.lineTo(430,270);
        star.lineTo(400,300);
        g2d.setColor(Color.YELLOW);
        g2d.fill(star);
        
        g2d.setFont(new Font("Arial", Font.BOLD, 24));
        g2d.setColor(Color.RED);
        g2d.drawString("Merry Christmas and Happy New Year!!!", 175, 210);
        
        g2d.setColor(Color.ORANGE);
        // 1st level Balls
        Ellipse2D.Double ball1 = new Ellipse2D.Double(370,380,20,20);
        g2d.fill(ball1);
        
        // Center
        Ellipse2D.Double ball2 = new Ellipse2D.Double(390,380,20,20);
        g2d.fill(ball2);
        // Center
        
        Ellipse2D.Double ball3 = new Ellipse2D.Double(410,380,20,20);
        g2d.fill(ball3);
        
        // 2nd level Balls
        Ellipse2D.Double ball4 = new Ellipse2D.Double(330,480,20,20);
        g2d.fill(ball4);
        
        // Center
        Ellipse2D.Double ball6 = new Ellipse2D.Double(390,480,20,20);
        g2d.fill(ball6);
        // Center
        
        Ellipse2D.Double ball8 = new Ellipse2D.Double(450,480,20,20);
        g2d.fill(ball8);
        
        // 3rd level Balls
        Ellipse2D.Double ball9 = new Ellipse2D.Double(290,580,20,20);
        g2d.fill(ball9);
        
        // Center
        Ellipse2D.Double ball11 = new Ellipse2D.Double(390,580,20,20);
        g2d.fill(ball11);
        // Center
        
        Ellipse2D.Double ball13 = new Ellipse2D.Double(490,580,20,20);
        g2d.fill(ball13);
        
        // 4th level Balls
        Ellipse2D.Double ball14 = new Ellipse2D.Double(240,680,20,20);
        g2d.fill(ball14);
        
        // Center
        Ellipse2D.Double ball16 = new Ellipse2D.Double(390,680,20,20);
        g2d.fill(ball16);
        // Center
        
        Ellipse2D.Double ball18 = new Ellipse2D.Double(540,680,20,20);
        g2d.fill(ball18);
        
        // Between Center and Side
        g2d.setColor(Color.BLUE);
        
        Ellipse2D.Double ball5 = new Ellipse2D.Double(360,480,20,20);
        g2d.fill(ball5);
        
        Ellipse2D.Double ball7 = new Ellipse2D.Double(420,480,20,20);
        g2d.fill(ball7);
        
        Ellipse2D.Double ball10 = new Ellipse2D.Double(340,580,20,20);
        g2d.fill(ball10);
        
        Ellipse2D.Double ball12 = new Ellipse2D.Double(440,580,20,20);
        g2d.fill(ball12);
        
        Ellipse2D.Double ball15 = new Ellipse2D.Double(315,680,20,20);
        g2d.fill(ball15);
        
        Ellipse2D.Double ball17 = new Ellipse2D.Double(465,680,20,20);
        g2d.fill(ball17);
    }
    
    public static void main(String[] args) {
        ChristmasTree illustration = new ChristmasTree();
        illustration.setSize(850,850);
        illustration.setTitle("Christmas Tree");
        illustration.setBackground(Color.WHITE);
        illustration.setVisible(true);
    }
}
