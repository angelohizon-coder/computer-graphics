package graphicscsc;

import java.awt.geom.*;
import java.awt.*;

/**
 *
 * @author Angelo
 */
public class LongExamTwoTransformation extends Frame {
    public void paint(Graphics g) {
        // Angelo Louis L. Hizon
        // 2019-132083
        
        Graphics2D g2d = (Graphics2D) g;
        
        AffineTransform yUp = new AffineTransform();
        yUp.setToScale(1,-1);
        AffineTransform translate = new AffineTransform();
        translate.setToTranslation(0,800);
        yUp.preConcatenate(translate);

        // Apply the transformation to the Graphics2D object to draw everything in "real" coordinates.
        g2d.transform(yUp);
        
        GeneralPath gp = new GeneralPath();
        //Start at the lower left corner of the car
        gp.moveTo(60,120);
        gp.lineTo(80,120); //front underbody
        gp.quadTo(90,140,100,120); //front wheel
        gp.lineTo(160,120); //middle underbody
        gp.quadTo(170,140,180,120); //rear wheel
        gp.lineTo(200,120); //rear underbody
        gp.curveTo(195,100,200,80,160,80); //rear
        gp.lineTo(110,80); //roof
        gp.lineTo(90,100); //windscreen
        gp.lineTo(60,100); //bonnet
        gp.lineTo(60,120); //front
        g2d.draw(gp); //Draw the car
        
        AffineTransform scaling1 = new AffineTransform();
        scaling1.setToScale(0.33, 0.33);
        g2d.setColor(Color.BLUE);
        g2d.setStroke(new BasicStroke(3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 8.0f, new float []{50.0f, 10.0f}, 4.0f));
        g2d.draw(scaling1.createTransformedShape(gp));
        
        AffineTransform scaling2 = new AffineTransform();
        scaling2.setToScale(2, 1);
        g2d.setColor(Color.YELLOW);
        g2d.setStroke(new BasicStroke(3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 8.0f, new float []{50.0f, 10.0f}, 4.0f));
        g2d.draw(scaling2.createTransformedShape(gp));
        
        AffineTransform shearing1 = new AffineTransform();
        shearing1.setToShear(1, 2);
        g2d.setColor(Color.PINK);
        g2d.setStroke(new BasicStroke(3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 8.0f, new float []{50.0f, 10.0f}, 4.0f));
        g2d.draw(shearing1.createTransformedShape(gp));
        
        AffineTransform translation1 = new AffineTransform();
        translation1.setToTranslation(100,50);
        g2d.setColor(Color.CYAN);
        g2d.setStroke(new BasicStroke(3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 8.0f, new float []{50.0f, 10.0f}, 4.0f));
        g2d.draw(translation1.createTransformedShape(gp));
        
        AffineTransform rotation1 = new AffineTransform();
        rotation1.setToRotation(-Math.PI/4);
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 8.0f, new float []{50.0f, 10.0f}, 4.0f));
        g2d.draw(rotation1.createTransformedShape(gp));
    } 
    
    public static void main(String[] args) {
        LongExamTwoTransformation illustration = new LongExamTwoTransformation();
        illustration.setTitle("Long Exam 2 Area - HIZON");
        illustration.setSize(800,800);
        illustration.setVisible(true);
    }
}
