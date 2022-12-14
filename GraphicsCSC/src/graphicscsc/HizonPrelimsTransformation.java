package graphicscsc;

import java.awt.geom.*;
import java.awt.*;

/**
 *
 * @author Angelo
 */
public class HizonPrelimsTransformation extends Frame{
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setFont(new Font("Arial", Font.BOLD, 15));
        g2d.drawString("Angelo Louis L. Hizon",50,75);
        g2d.drawString("2019-132083",50,100);
        
        AffineTransform yUp = new AffineTransform();
        yUp.setToScale(1,-1);
        AffineTransform translate = new AffineTransform();
        translate.setToTranslation(40,800);
        yUp.preConcatenate(translate);

        // Apply the transformation to the Graphics2D object to draw everything in "real" coordinates.
        g2d.transform(yUp);
        
        g2d.setFont(new Font("Arial", Font.BOLD, 15));
        g2d.drawString("Angelo Louis L. Hizon",50,75);
        g2d.drawString("2019-132083",50,100);
        
        
    }
    
    public static void main(String[] args) {
        HizonPrelimsTransformation illustration = new HizonPrelimsTransformation();
        illustration.setTitle("Prelims");
        illustration.setSize(800,800);
        illustration.setBackground(Color.WHITE);
        illustration.setVisible(true);
    }
}
