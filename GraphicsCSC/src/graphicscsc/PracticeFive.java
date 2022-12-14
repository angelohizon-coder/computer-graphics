
package graphicscsc;

import java.awt.geom.*;
import java.awt.*;

/**
 *
 * @author Angelo
 */
public class PracticeFive extends Frame{
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setFont(new Font("Arial", Font.BOLD, 24));
        g2d.drawString("Hello this is a boat", 225, 125);
        
        GeneralPath gp = new GeneralPath();
        // Body of the Boat and Pole
        gp.moveTo(100, 350);
        gp.lineTo(150, 450);
        gp.lineTo(450, 450);
        gp.lineTo(500, 350);
        gp.lineTo(305, 350);
        gp.lineTo(295, 350);
        gp.lineTo(295, 150);
        gp.lineTo(305, 150);
        gp.lineTo(305, 350);
        gp.lineTo(100, 350);
        // Flag
        gp.moveTo(305, 150);
        gp.lineTo(405, 200);
        gp.lineTo(305, 200);
        g2d.draw(gp);
        
        AffineTransform scaling1 = new AffineTransform();
        // Comes from the bottom
        scaling1.setToScale(1, -1);
        AffineTransform translation1 = new AffineTransform();
        translation1.setToTranslation(0, -900);
        scaling1.concatenate(translation1);
        AffineTransform shearing1 = new AffineTransform();
        shearing1.setToShear(0.14, 1);
        scaling1.concatenate(shearing1);
        g2d.draw(scaling1.createTransformedShape(gp));
        
        AffineTransform scaling2 = new AffineTransform();
        // Comes from the left
        scaling2.setToScale(-1, 1);
        AffineTransform translation2 = new AffineTransform();
        translation2.setToTranslation(-200, 0);
        scaling2.concatenate(translation2);
        g2d.draw(scaling2.createTransformedShape(gp));
    }
    
    public static void main(String[] args) {
        PracticeFive illustration = new PracticeFive();
        illustration.setTitle("Practice Five");
        illustration.setSize(800,800);
        illustration.setVisible(true);
    }
}
