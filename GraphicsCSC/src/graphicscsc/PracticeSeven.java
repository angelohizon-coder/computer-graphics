package graphicscsc;

import java.awt.geom.*;
import java.awt.*;

/**
 *
 * @author Angelo
 */
public class PracticeSeven extends Frame {
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        AffineTransform yUp = new AffineTransform();
        yUp.setToScale(1,-1);
        AffineTransform translate = new AffineTransform();
        translate.setToTranslation(0,800);
        yUp.preConcatenate(translate);

        // Apply the transformation to the Graphics2D object to draw everything in "real" coordinates.
        g2d.transform(yUp);
        
        Rectangle2D.Double r1 = new Rectangle2D.Double(0,0,300,200);
        
        AffineTransform scaling = new AffineTransform();
        AffineTransform rotate = new AffineTransform();
        scaling.setToScale(1, 0.5);
        rotate.setToRotation(-Math.PI/4);
        scaling.concatenate(rotate);
        g2d.setColor(Color.GREEN);
        g2d.fill(scaling.createTransformedShape(r1));
        
        Rectangle2D.Double r2 = new Rectangle2D.Double(400,400,300,200);
        
        AffineTransform translation = new AffineTransform();
        AffineTransform shearing = new AffineTransform();
        translation.setToTranslation(400,0);
        shearing.setToShear(0,-0.5);
        translation.preConcatenate(shearing);
        g2d.setColor(Color.RED);
        g2d.fill(translation.createTransformedShape(r2));
    }
    
    public static void main(String[] args) {
        PracticeSeven illustration = new PracticeSeven();
        illustration.setSize(800,800);
        illustration.setBackground(Color.WHITE);
        illustration.setTitle("Practice Seven");
        illustration.setVisible(true);
    }
}
