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
public class SelfPortrait extends Frame {

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 15));
        g2d.drawString("Angelo Louis L. Hizon",50,75);
        g2d.drawString("2019-132083",50,100);
        
        // Chin
        GeneralPath chin = new GeneralPath();
        chin.moveTo(340, 550);
        chin.lineTo(360, 570);
        chin.lineTo(380, 580);
        chin.lineTo(400, 590);
        chin.lineTo(420, 580);
        chin.lineTo(440, 570);
        chin.lineTo(460, 550);
        chin.lineTo(430, 545);
        chin.lineTo(400, 530); 
        chin.lineTo(370, 545);
        chin.lineTo(340, 550);
        
        g2d.setColor(Color.BLACK);
        g2d.fill(chin);
             
        // Hair
        GeneralPath hair = new GeneralPath();
        hair.moveTo(260, 320);
        hair.lineTo(280, 280);
        hair.lineTo(320, 260);
        hair.lineTo(360, 190);
        hair.lineTo(400, 180);
        hair.lineTo(440, 190);
        hair.lineTo(480, 260);
        hair.lineTo(520, 280);
        hair.lineTo(540, 320);
        hair.lineTo(540, 320);
        hair.lineTo(540, 240);
        hair.lineTo(500, 160);     
        hair.lineTo(400, 120);     
        hair.lineTo(300, 160);
        hair.lineTo(260, 240);
        hair.lineTo(260, 320);
        
        g2d.setColor(Color.BLACK);
        g2d.fill(hair);
        
        // Face
        GeneralPath face = new GeneralPath();
        face.moveTo(260, 320);
        face.lineTo(280, 280);
        face.lineTo(320, 260);
        face.lineTo(360, 190);
        face.lineTo(400, 180);
        face.lineTo(440, 190);
        face.lineTo(480, 260);
        face.lineTo(520, 280);
        face.lineTo(540, 320); 
        face.lineTo(540, 320);
        face.lineTo(540, 400);
        face.lineTo(520, 480);
        face.lineTo(460, 550);
        face.lineTo(430, 545);
        face.lineTo(400, 530); 
        face.lineTo(370, 545);
        face.lineTo(340, 550);
        face.lineTo(280, 480);
        face.lineTo(260, 400);
        
        float[] hsb = new float[3];
        hsb = Color.RGBtoHSB(255,235,205, null);
        float hue, saturation, bright;
        hue = hsb[0];
        saturation = hsb[1];
        bright = hsb[2];
        
        g2d.setColor(Color.getHSBColor(hue, saturation, bright));
        g2d.fill(face);
        
        // Eyebrow Width
        g2d.setStroke(new BasicStroke(5));
        
        // Eyebrow Left
        GeneralPath eyebrowLeft = new GeneralPath();
        eyebrowLeft.moveTo(370, 320);
        eyebrowLeft.lineTo(340, 310);
        eyebrowLeft.lineTo(320, 310);
        eyebrowLeft.lineTo(290, 320);

        g2d.setColor(Color.BLACK);
        g2d.draw(eyebrowLeft);
        
        // Eyebrow Right
        GeneralPath eyebrowRight = new GeneralPath();
        eyebrowRight.moveTo(430, 320);
        eyebrowRight.lineTo(460, 310);
        eyebrowRight.lineTo(480, 310);
        eyebrowRight.lineTo(510, 320);
        
        g2d.setColor(Color.BLACK);
        g2d.draw(eyebrowRight);
        
        // Itachi Eyeline Width
        g2d.setStroke(new BasicStroke(2));
        
        // Itachi Eyeline Left
        GeneralPath eyelineLeft = new GeneralPath();
        eyelineLeft.moveTo(370, 370);
        eyelineLeft.lineTo(350, 390);
        eyelineLeft.lineTo(330, 400);
        eyelineLeft.lineTo(310, 410);
        eyelineLeft.lineTo(300, 410);
        
        g2d.setColor(Color.BLACK);
        g2d.draw(eyelineLeft);
        
        // Itachi Eyeline Right
        GeneralPath eyelineRight = new GeneralPath();
        eyelineRight.moveTo(430, 370);
        eyelineRight.lineTo(450, 390);
        eyelineRight.lineTo(470, 400);
        eyelineRight.lineTo(490, 410);
        eyelineRight.lineTo(500, 410);
        
        g2d.setColor(Color.BLACK);
        g2d.draw(eyelineRight);
    }
    
    public static void main(String[] args) {
        SelfPortrait i = new SelfPortrait();
        i.setTitle("Christmas Tree Version One");
        i.setBackground(Color.WHITE);
        i.setSize(800,800);
        i.setForeground(Color.BLACK);
        i.setVisible(true); 
    }
    
}

//        Exterior
//        GeneralPath exterior = new GeneralPath();
//        exterior.moveTo(340, 550);
//        exterior.lineTo(280, 480);
//        exterior.lineTo(260, 400);
//        exterior.lineTo(260, 320);
//        exterior.lineTo(260, 240);
//        exterior.lineTo(300, 160);
//        
//        exterior.lineTo(400, 120);
//        
//        exterior.lineTo(500, 160);
//        exterior.lineTo(540, 240);
//        exterior.lineTo(540, 320);
//        exterior.lineTo(540, 400);
//        exterior.lineTo(520, 480);
//        exterior.lineTo(460, 550);
//        
//        g2d.setColor(Color.BLACK);
//        g2d.draw(exterior);
