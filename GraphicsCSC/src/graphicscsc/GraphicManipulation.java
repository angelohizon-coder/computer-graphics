package graphicscsc;

import java.awt.geom.*;
import java.awt.*;

public class GraphicManipulation extends Frame {
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        // The thickness of the stroke where indicates that the number is a float
        BasicStroke bs = new BasicStroke(9.0f);
        g2d.setStroke(bs);
        
        // Always apply this in Graphic Manipulation or Transformation
        // 0,0 is assumed to be at the bottom left
        AffineTransform yUp = new AffineTransform();
        yUp.setToScale(1,-1);
        AffineTransform translate = new AffineTransform();
        translate.setToTranslation(40,600);
        yUp.preConcatenate(translate);

        // Apply the transformation to the Graphics2D object to draw everything in "real" coordinates.
        g2d.transform(yUp);

        // The lines should have a thickness of 3.0 instead of 1.0.
        g2d.setStroke(new BasicStroke(3.0f));
        
        Rectangle2D.Double r1 = new Rectangle2D.Double(200, 200, 200, 150);
        g2d.setColor(Color.BLACK);
        g2d.draw(r1);
        g2d.setColor(Color.YELLOW);
        g2d.fill(r1);
        
//        // Scaling
//        AffineTransform scaling = new AffineTransform();
//        scaling.setToScale(2, 0.5);
//        g2d.setColor(Color.CYAN);
//        g2d.setStroke(new BasicStroke(3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 8.0f, new float []{50.0f, 10.0f}, 4.0f));
//        g2d.draw(scaling.createTransformedShape(r1));
        
        // Rotation
//        g2d.setColor(Color.GREEN);
//        AffineTransform rotation = new AffineTransform();
//        // Math.PI represents the value of 180
//        rotation.setToRotation(-Math.PI/6);
//        g2d.draw(rotation.createTransformedShape(r1));
        
//        // Shearing
        g2d.setColor(Color.PINK);
        AffineTransform shearing = new AffineTransform();
        shearing.setToShear(0.5, 0.5);
        g2d.draw(shearing.createTransformedShape(r1));
        
//        // Translation
//        AffineTransform translation = new AffineTransform();
//        translation.setToTranslation(200,100);
//        g2d.setColor(Color.BLACK);
//        g2d.draw(translation.createTransformedShape(r1));
//        g2d.setColor(Color.ORANGE);
//        g2d.fill(translation.createTransformedShape(r1));
    }
    
    // Assumed to be the GUI
    public static void main(String[] argv) {
        GraphicManipulation i = new GraphicManipulation();
        i.setTitle("Area and General Path in Java");
        i.setBackground(Color.WHITE);
        i.setSize(800,800);
        i.setForeground(Color.BLACK);
        i.setVisible(true); 
    }
}
