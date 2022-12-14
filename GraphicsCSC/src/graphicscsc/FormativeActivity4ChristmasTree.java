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
public class FormativeActivity4ChristmasTree extends Frame {

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 15));
        g2d.drawString("Angelo Louis L. Hizon",50,75);
        g2d.drawString("2019-132083",50,100);
        
        GeneralPath gp1 = new GeneralPath();
        // Top
        gp1.moveTo(300, 100);
        gp1.lineTo(300, 250); 
        
        gp1.moveTo(300, 250);
        gp1.lineTo(230, 250);
        gp1.lineTo(300, 100);
        
        gp1.moveTo(300, 250);
        gp1.lineTo(370, 250);
        gp1.lineTo(300, 100);
        
        // Reverse Triangle
        gp1.moveTo(250, 250);
        gp1.lineTo(350, 250);
        gp1.lineTo(300, 400);
        
         // Middle
        gp1.moveTo(300, 250);
        gp1.lineTo(300, 400);
        
        gp1.moveTo(300, 400);
        gp1.lineTo(190, 400);
        // Hangover 250-230
        gp1.lineTo(250, 250);
        
        gp1.moveTo(300, 400);
        gp1.lineTo(410, 400);
        gp1.lineTo(350, 250);
        
        //Bottom
        gp1.moveTo(300, 400);
        gp1.lineTo(300, 550);
        
        gp1.moveTo(300, 550);
        // Bottom Width
        gp1.lineTo(150, 550);
        gp1.lineTo(210, 400);
        
        gp1.moveTo(300, 550);
        // Bottom Width
        gp1.lineTo(450, 550);
        gp1.lineTo(390, 400);
        
        // Reverse Triangle
        gp1.moveTo(210, 400);
        gp1.lineTo(390, 400);
        gp1.lineTo(300, 550);
        
        g2d.setColor(Color.GREEN);
        g2d.fill(gp1);
        
        // Base
        Rectangle2D.Double e1 = new Rectangle2D.Double(285, 550, 30, 30);
        g2d.setColor(Color.GRAY);
        g2d.fill(e1);
        
        // Star
        GeneralPath gp2 = new GeneralPath();
        gp2.moveTo(300, 100);
        gp2.lineTo(280, 80);
        gp2.lineTo(300, 60);
        gp2.lineTo(320, 80);
        gp2.lineTo(300, 100);
        g2d.setColor(Color.ORANGE);
        g2d.fill(gp2);
    }
    
    public static void main(String[] args) {
        FormativeActivity4ChristmasTree i = new FormativeActivity4ChristmasTree();
        i.setTitle("Christmas Tree Version One");
        i.setBackground(Color.WHITE);
        i.setSize(600,600);
        i.setForeground(Color.BLACK);
        i.setVisible(true); 
    }
    
}
