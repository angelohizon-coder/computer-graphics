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
public class PracticeFour extends Frame{
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        // Always apply this in Graphic Manipulation or Transformation
        // 0,0 is assumed to be at the bottom left
        AffineTransform yUp = new AffineTransform();
        yUp.setToScale(1,-1);
        AffineTransform translate = new AffineTransform();
        translate.setToTranslation(40,800);
        yUp.preConcatenate(translate);

        // Apply the transformation to the Graphics2D object to draw everything in "real" coordinates.
        g2d.transform(yUp);
        
        GeneralPath gp = new GeneralPath();
        gp.moveTo(150,150);
        gp.lineTo(250,150);
        gp.lineTo(250,400);
        gp.lineTo(150,150);
        g2d.fill(gp);
        
        // Flip
        // When flipping an object first use scaling then concatenate it with translation.
        // In terms of matrix multiplication from the right, so that first translation1 and then the original transformation scaling1 is carried out.
        g2d.setColor(Color.GREEN);
        AffineTransform scaling1 = new AffineTransform();
        // Object goes to the bottom of the viewport
        scaling1.setToScale(1, -1);
        AffineTransform translation1 = new AffineTransform();
        // translation1.setToTranslation(1,-300); // use this if concatenate
        translation1.setToTranslation(1,300); // use this if preConcatenate
        // translation1.concatenate(scaling1);
        scaling1.preConcatenate(translation1);
        g2d.fill(scaling1.createTransformedShape(gp));
        
        g2d.setColor(Color.ORANGE);
        AffineTransform scaling2 = new AffineTransform();
        // Object goes to the bottom left of the viewport
        scaling2.setToScale(-1, -1);
        AffineTransform translation2 = new AffineTransform();
        translation2.setToTranslation(500,300);
        translation2.concatenate(scaling2);
        g2d.fill(translation2.createTransformedShape(gp));
        
        g2d.setColor(Color.RED);
        AffineTransform scaling3 = new AffineTransform();
        // Object goes to the left of the viewport
        scaling3.setToScale(-1, 1);
        AffineTransform translation3 = new AffineTransform();
        translation3.setToTranslation(500,0);
        translation3.concatenate(scaling3);
        g2d.fill(translation3.createTransformedShape(gp));
    }

    public static void main(String[] args) {
        PracticeFour illustration = new PracticeFour();
        illustration.setSize(1920,1080);
        illustration.setTitle("Practice Four");
        illustration.setBackground(Color.WHITE);
        illustration.setVisible(true);
    }
}
