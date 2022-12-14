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
public class FormativeActivity4Cross extends Frame {

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 15));
        g2d.drawString("Angelo Louis L. Hizon",50,75);
        g2d.drawString("2019-132083",50,100);
        
        GeneralPath gp1 = new GeneralPath();
        // Left Section
        gp1.moveTo(250, 280);
        gp1.lineTo(150, 280);
        gp1.curveTo(130, 280, 110, 300, 110, 320);
        gp1.lineTo(110, 340);
        gp1.curveTo(110, 360, 130, 380, 150, 380);
        gp1.lineTo(250, 380);
        // Bottom Section
        gp1.lineTo(250, 480);
        gp1.curveTo(250, 500, 270, 520, 290, 520);
        gp1.lineTo(310, 520);
        gp1.curveTo(330, 520, 350, 500, 350, 480);
        gp1.lineTo(350, 380);
        // Right Section
        gp1.lineTo(450, 380);
        gp1.curveTo(470, 380, 490, 360, 490, 340);
        gp1.lineTo(490, 320);
        gp1.curveTo(490, 300, 470, 280, 450, 280);
        gp1.lineTo(350, 280);
        // Top Section
        gp1.lineTo(350, 180);
        gp1.curveTo(350, 160, 330, 140, 310, 140);
        gp1.lineTo(290, 140);
        gp1.curveTo(270, 140, 250, 160, 250, 180);
        gp1.lineTo(250, 280);
        g2d.draw(gp1);
    }
    
    public static void main(String[] args) {
        FormativeActivity4Cross i = new FormativeActivity4Cross();
        i.setTitle("Cross");
        i.setBackground(Color.WHITE);
        i.setSize(600,600);
        i.setForeground(Color.BLACK);
        i.setVisible(true); 
    }
    
}




