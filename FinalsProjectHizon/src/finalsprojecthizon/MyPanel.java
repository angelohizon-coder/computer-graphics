/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsprojecthizon;

/**
 *
 * @author Angelo
 */
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import javax.swing.*;

public class MyPanel extends JPanel{

    private int windowWidth;
    private int windowHeight;
    
    Image image;

    MyPanel(){

     image = new ImageIcon(this.getClass().getResource("/Background.png")).getImage();
     this.setPreferredSize(new Dimension(900,506));
    }
 
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        
        
        g2d.setStroke(new BasicStroke(2.0f));
        
        //Use of antialiasing to have nicer lines.
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        
        AffineTransform yUp = new AffineTransform();
        yUp.setToScale(1,-1);
        AffineTransform translate = new AffineTransform();
        translate.setToTranslation(0,windowHeight);
        yUp.preConcatenate(translate);

        //Apply the transformation to the Graphics2D object to draw everything
        //in "real" coordinates.
        g2d.transform(yUp);
        
        Color clothingColor = new Color(173, 52, 34);
        Color cuffColor = new Color(239, 227, 218);
        Color earColor = new Color(251, 243, 234);
        Color eyeOneColor = new Color(242, 169, 134);
        Color eyeDetailColor = new Color(210, 80, 51);
        Color featherColor = new Color(236, 195, 187);
        Color gloveColor = new Color(180, 123, 94);
        Color gloveShineColor = new Color(202, 162, 136);
        Color hairColor = new Color(242, 222, 205);
        Color hatColor = new Color(180, 66, 55);
        Color hatCoverColor = new Color(99, 67, 64);
        Color hatAccessoryOneColor = new Color(208, 166, 134);
        Color hatAccessoryTwoColor = new Color(158, 93, 75);
        Color hatDetailColor = new Color(237, 206, 178);
        Color scarfColor = new Color(234, 207, 178);
        Color skinColor = new Color(246, 235, 225);
        Color skirtColor = new Color(218, 209, 200);
        Color rightGloveColor = new Color(99, 67, 64);
        Color mouthColor = new Color(236, 186, 167);
        
        GeneralPath whiteSkirt = new GeneralPath();
        whiteSkirt.moveTo(353.05, 201.4);
        whiteSkirt.lineTo(350.6, 173.8);
        whiteSkirt.lineTo(369.24, 165.9);
        whiteSkirt.lineTo(382.4, 140.5);
        whiteSkirt.lineTo(403.2, 137.25);
        whiteSkirt.lineTo(425.44, 123.5);
        whiteSkirt.lineTo(442.1, 130.5);
        whiteSkirt.lineTo(473.1, 129.4);
        whiteSkirt.lineTo(487.8, 154.5);
        whiteSkirt.lineTo(510.6, 163.3);
        whiteSkirt.lineTo(508.8, 183.5);
        // Just to remove empty spot in skirt
        whiteSkirt.lineTo(508.8, 203.5);
        g2d.setColor(skirtColor);
        g2d.fill(whiteSkirt);
        g2d.setColor(Color.BLACK);
        g2d.draw(whiteSkirt);
        
        GeneralPath leftSleeve = new GeneralPath();
        leftSleeve.moveTo(324.84, 210.9);
        leftSleeve.curveTo(330.7, 206.6, 349.1, 208.2, 355.04, 215);
        leftSleeve.curveTo(348, 243.3, 332.2, 261.7, 324.84, 210.9);
        g2d.setColor(clothingColor);
        g2d.fill(leftSleeve);
        g2d.setColor(Color.BLACK);
        g2d.draw(leftSleeve);
        
        g2d.setStroke(new BasicStroke(4.0f));
        GeneralPath mainClothing = new GeneralPath();
        mainClothing.moveTo(352.1, 215);
        mainClothing.lineTo(387.4, 160.8);
        mainClothing.lineTo(396.3, 174.5);
        mainClothing.lineTo(404.1, 145.5);
        mainClothing.lineTo(439.9, 138);
        mainClothing.lineTo(476.7, 156.4);
        mainClothing.lineTo(468.3, 175.9);
        mainClothing.lineTo(485.8, 168.4);
        mainClothing.lineTo(500.1, 189);
        mainClothing.lineTo(497.9, 194.7);
        
        mainClothing.lineTo(508.5, 185.7);
        mainClothing.curveTo(502.1, 199.5, 497, 216.9, 513.4, 247.2);
        mainClothing.lineTo(349.4, 242.4);
        g2d.setColor(clothingColor);
        g2d.fill(mainClothing);
        g2d.setColor(Color.BLACK);
        g2d.draw(mainClothing);
        
        g2d.setStroke(new BasicStroke(3.0f));
        GeneralPath rightSleeve = new GeneralPath();
        rightSleeve.moveTo(497.9, 194.7);
        // next to the right sleeve can be change to a different object down the line
        rightSleeve.curveTo(505, 188.1, 514.8, 177.4, 526.84, 179.75);
        g2d.setColor(Color.BLACK);
        g2d.draw(rightSleeve);
        g2d.setStroke(new BasicStroke(2.0f));
        
        GeneralPath scarfOutline = new GeneralPath();
        scarfOutline.moveTo(379.04, 225.9);
        // 421.46 and 198.2 end of scarf in right near the ball
        scarfOutline.curveTo(387.2, 211.1, 401.8, 195.4, 421.46, 198.2);
        scarfOutline.curveTo(417.9, 189.4, 419.6, 177.1, 427.6, 171.3);
        scarfOutline.lineTo(442.9, 170.9);
        scarfOutline.curveTo(448.9, 174.45, 454.73, 180.4, 451.64, 190.44);
        scarfOutline.curveTo(456.1, 187.8, 455.75, 192.65, 443, 204.5);
        scarfOutline.lineTo(450.65, 199);
        scarfOutline.curveTo(457.25, 202.7, 463.1, 208.35, 468.5, 218.5);
        g2d.setColor(scarfColor);
        g2d.fill(scarfOutline);
        g2d.setColor(Color.BLACK);
        g2d.draw(scarfOutline);
        
        GeneralPath scarfDetail = new GeneralPath();
        scarfDetail.moveTo(421.46, 198.2);
        scarfDetail.lineTo(425.6, 201.8);
        scarfDetail.moveTo(430.1, 203.7);
        scarfDetail.curveTo(432.2, 204.9, 439.67, 205.5, 443, 204.5);
        scarfDetail.curveTo(444, 207.56, 443.54, 210.26, 441.27, 212.7);
        g2d.setColor(Color.BLACK);
        g2d.draw(scarfDetail);
        
        // Can be removed
        g2d.setStroke(new BasicStroke(1.25f));
        GeneralPath scarfMinorDetail = new GeneralPath();
        scarfMinorDetail.moveTo(439.4, 205.34);
        scarfMinorDetail.quadTo(438.7, 206.56, 435.1, 209.57);
        scarfMinorDetail.moveTo(434.7, 182.5);
        scarfMinorDetail.quadTo(436.3, 176.3, 439.34, 182.6);
        scarfMinorDetail.quadTo(447.1, 180.1, 445.2, 187.4);
        g2d.setColor(Color.BLACK);
        g2d.draw(scarfMinorDetail);
        g2d.setStroke(new BasicStroke(2.0f));
        
        GeneralPath scarfTail = new GeneralPath();
        scarfTail.moveTo(567.2, 268.4);
        scarfTail.lineTo(597.4, 239);
        scarfTail.curveTo(595.8, 223.9, 576.3, 204.2, 570, 210.3);
        scarfTail.lineTo(526.3, 255.2);
        g2d.setColor(scarfColor);
        g2d.fill(scarfTail);
        g2d.setColor(Color.BLACK);
        g2d.draw(scarfTail);
        
        GeneralPath rightCuff = new GeneralPath();
        rightCuff.moveTo(502.8, 207.1);
        rightCuff.curveTo(504.84, 171.8, 537.4, 173.4, 551.6, 192.8);
        rightCuff.curveTo(528.75, 176.55, 513, 191.3, 509.7, 212.85);
        rightCuff.lineTo(502.8, 207.1);
        g2d.setColor(cuffColor);
        g2d.fill(rightCuff);
        g2d.setColor(Color.BLACK);
        g2d.draw(rightCuff);
        
        g2d.setStroke(new BasicStroke(1.0f));
        GeneralPath rightGlove = new GeneralPath();
        rightGlove.moveTo(509.7, 212.85);
        rightGlove.curveTo(513, 191.3, 529.8, 175.6, 551.3, 192.7);
        rightGlove.curveTo(533.8, 190, 512.5, 214.3, 530.3, 241.2);
        rightGlove.curveTo(520.5, 239.7, 508.2, 223.2, 509.7, 212.85);
        g2d.setColor(rightGloveColor);
        g2d.fill(rightGlove);

        GeneralPath rightGloveShine = new GeneralPath();
        rightGloveShine.moveTo(530.3, 241.2);
        rightGloveShine.curveTo(512.5, 214.3, 533.8, 190, 551.3, 192.7);
        rightGloveShine.curveTo(582.5, 218, 559.2, 253.4, 530.3, 241.2);
        g2d.setColor(gloveColor);
        g2d.fill(rightGloveShine);
        g2d.setColor(Color.BLACK);
        g2d.draw(rightGloveShine);
        
        g2d.setStroke(new BasicStroke(2.0f));
        GeneralPath gapBetweenFinger = new GeneralPath();
        gapBetweenFinger.moveTo(539.6, 206.86);
        gapBetweenFinger.curveTo(537.75, 207.32, 536.43, 207.3, 534.84, 206.5);
        gapBetweenFinger.moveTo(535.32, 216.63);
        gapBetweenFinger.curveTo(533.63, 217.12, 531.88, 217.05, 530.56, 216.3);
        gapBetweenFinger.moveTo(533.6, 227.84);
        gapBetweenFinger.curveTo(532.17, 228.2, 531.02, 228.06, 529.8, 227.3);
        g2d.setColor(Color.BLACK);
        g2d.draw(gapBetweenFinger);
        
        GeneralPath face = new GeneralPath();
        face.moveTo(495.8, 252.2);
        face.curveTo(497.8, 196.3, 352.7, 203, 347.4, 264);
        face.curveTo(315.7, 420.5, 553, 393, 495.3, 249);
        g2d.setColor(skinColor);
        g2d.fill(face);
        
        GeneralPath feather = new GeneralPath();
        feather.moveTo(543.6, 285.6);
        feather.curveTo(547.3, 272, 553.6, 266.2, 565.5, 262);
        feather.lineTo(568, 271.8);
        feather.lineTo(590, 283.1);
        feather.lineTo(589.4, 294.3);
        feather.lineTo(613.4, 316);
        feather.lineTo(595, 332.6);
        feather.curveTo(613.7, 378.7, 616.5, 406.8, 589.6, 453.7);
        feather.curveTo(606.6, 406.4, 572.7, 384.5, 561.4, 339.1);
        feather.lineTo(561.4, 324.4);
        feather.curveTo(586.2, 337, 593.4, 375.2, 590, 383.7);
        feather.curveTo(593.4, 375.2, 586.2, 337, 561.4, 324.4);
        feather.lineTo(543.6, 285.6);
        g2d.setColor(featherColor);
        g2d.fill(feather);
        g2d.setColor(Color.BLACK);
        g2d.draw(feather);
        
        // placed draw face here so that the mouth will not overlap the face outline
        GeneralPath mouth = new GeneralPath();
        mouth.moveTo(408.8, 216.2);
        mouth.curveTo(380.7, 274.5, 479.9, 268.5, 444.6, 215.1);
        g2d.setColor(mouthColor);
        g2d.fill(mouth);
        g2d.setColor(Color.BLACK);
        g2d.draw(mouth);
        g2d.setColor(Color.BLACK);
        g2d.draw(face);
        
        GeneralPath hat = new GeneralPath();
        hat.moveTo(329, 332);
        hat.curveTo(308, 416, 401.6, 458.5, 450, 455.6);
        hat.curveTo(543, 447.5, 615.4, 327, 543.6, 271.7);
        hat.lineTo(528.2, 281);
        hat.curveTo(540.4, 315, 525.1, 354.8, 520.4, 354.3);
        hat.curveTo(465.7, 354.4, 399.2, 365, 372.7, 377.4);
        hat.curveTo(355.3, 364.4, 341.5, 350, 329, 332);
        g2d.setColor(hatColor);
        g2d.fill(hat);
        g2d.setColor(Color.BLACK);
        g2d.draw(hat);
        
        GeneralPath hatDetail = new GeneralPath();
        hatDetail.moveTo(448.7, 422.8);
        hatDetail.curveTo(427, 437.3, 436.7, 458.8, 450.7, 446.6);
        hatDetail.curveTo(464, 455.7, 473.4, 437, 448.7, 422.8);
        
        hatDetail.moveTo(454.7, 419);
        hatDetail.curveTo(476.7, 399.3, 486.8, 411.05, 478, 421.4);
        hatDetail.curveTo(485.75, 437.9, 469.5, 442, 454.7, 419);
        
        hatDetail.moveTo(446.2, 419.2);
        hatDetail.curveTo(437.1, 435, 414, 437.3, 423, 419.2);
        hatDetail.curveTo(411.9, 408.4, 424.9, 399, 446.2, 419.2);
        
        hatDetail.moveTo(451.5, 415.5);
        hatDetail.curveTo(399, 389.4, 495.7, 380.5, 451.5, 415.5);
        
        g2d.setColor(hatDetailColor);
        g2d.fill(hatDetail);
        g2d.setColor(Color.BLACK);
        g2d.draw(hatDetail);
  
        GeneralPath hatAccessoryOne = new GeneralPath();
        hatAccessoryOne.moveTo(535, 281.9);
        hatAccessoryOne.curveTo(528.8, 309.2, 539, 367.4, 561.5, 355);
        hatAccessoryOne.curveTo(551.3, 352.7, 536.6, 311.8, 545.2, 277.2);
        hatAccessoryOne.curveTo(540.9, 277.84, 538.03, 279.1, 535, 281.9);
        g2d.setColor(hatAccessoryOneColor);
        g2d.fill(hatAccessoryOne);
        g2d.setColor(Color.BLACK);
        g2d.draw(hatAccessoryOne);
        
        GeneralPath hatAccessoryTwo = new GeneralPath();
        hatAccessoryTwo.moveTo(561.5, 355);
        hatAccessoryTwo.curveTo(551.3, 352.7, 536.6, 311.8, 545.2, 277.2);
        hatAccessoryTwo.curveTo(597.2, 277.2, 569.4, 352.7, 561.5, 355);
        g2d.setColor(hatAccessoryTwoColor);
        g2d.fill(hatAccessoryTwo);
        g2d.setColor(Color.BLACK);
        g2d.draw(hatAccessoryTwo);
        
        g2d.setStroke(new BasicStroke(1.0f));
        GeneralPath hatAccessoryDetail = new GeneralPath();
        hatAccessoryDetail.moveTo(576.5, 317.3);
        hatAccessoryDetail.curveTo(547.6, 330.3, 563.4, 351.1, 572.6, 337.2);
        hatAccessoryDetail.curveTo(574, 330.1, 573.3, 323, 576.5, 317.3);
        
        hatAccessoryDetail.moveTo(576.1, 310.3);
        hatAccessoryDetail.curveTo(565.9, 329.3, 543.7, 325.4, 555.5, 310.3);
        hatAccessoryDetail.curveTo(546.4, 290.7, 566.7, 291.3, 576.1, 310.3);
        
        hatAccessoryDetail.moveTo(575.9, 298.05);
        hatAccessoryDetail.curveTo(570, 299.5, 554.4, 288.5, 562.6, 282.6);
        hatAccessoryDetail.curveTo(567.94, 283.04, 573.7, 294.85, 575.9, 298.05);
        g2d.setColor(hatDetailColor);
        g2d.fill(hatAccessoryDetail);
        g2d.setColor(Color.BLACK);
        g2d.draw(hatAccessoryDetail);
        
        g2d.setStroke(new BasicStroke(1.0f));
        GeneralPath hatCover = new GeneralPath();
        hatCover.moveTo(372.7, 377.4);
        hatCover.curveTo(415.3, 426, 526.2, 381.6, 520.4, 354.3);
        hatCover.curveTo(493.5, 350.8, 391.4, 362.5, 372.7, 377.4);
        g2d.setColor(hatCoverColor);
        g2d.fill(hatCover);
        g2d.setColor(Color.BLACK);
        g2d.draw(hatCover);
        g2d.setStroke(new BasicStroke(2.0f));
        
        GeneralPath teeth = new GeneralPath();
        teeth.moveTo(416.5, 255.3);
        teeth.curveTo(416.8, 248.2, 436.9, 248.05, 437, 255.04);
        teeth.curveTo(433.7, 258.4, 419.9, 258.7, 416.5, 255.3);
        g2d.setColor(Color.WHITE);
        g2d.fill(teeth);
        g2d.setColor(Color.BLACK);
        g2d.draw(teeth);
        
        GeneralPath earLeft = new GeneralPath();
        earLeft.moveTo(324.24, 292.7);
        earLeft.lineTo(278.14, 271.4);
        earLeft.lineTo(329.5, 263.2);
        g2d.setColor(earColor);
        g2d.fill(earLeft);
        g2d.setColor(Color.BLACK);
        g2d.draw(earLeft);
        
        GeneralPath earRight = new GeneralPath();
        earRight.moveTo(527.4, 280.3);
        earRight.lineTo(572.1, 256.5);
        earRight.curveTo(563.35, 245.8, 541.1, 238.85, 524.74, 239.4);
        earRight.lineTo(527.4, 280.3);
        g2d.setColor(earColor);
        g2d.fill(earRight);
        g2d.setColor(Color.BLACK);
        g2d.draw(earRight);
        
        GeneralPath eyeLeft = new GeneralPath();
        eyeLeft.moveTo(378, 300.2);
        eyeLeft.curveTo(365, 240.1, 403.6, 237.4, 399.5, 294.9);
        g2d.setColor(eyeOneColor);
        g2d.fill(eyeLeft);
        
        GeneralPath eyeDetail = new GeneralPath();
        eyeDetail.moveTo(375.9, 284.3);
        eyeDetail.curveTo(382.9, 284.6, 393.3, 284.05, 398.9, 281.5);
        eyeDetail.lineTo(398.9, 296);
        eyeDetail.lineTo(375.9, 302.9);
        g2d.setColor(eyeDetailColor);
        g2d.fill(eyeDetail);
        
        // overlay the outline of the left eye
        g2d.setColor(Color.BLACK);
        g2d.draw(eyeLeft);
        
        GeneralPath eyelashLeft = new GeneralPath();
        eyelashLeft.moveTo(371.6, 309);
        eyelashLeft.curveTo(380.3, 319.4, 404.9, 298.1, 407.1, 294.4);
        eyelashLeft.curveTo(403.1, 293.6, 376.9, 297.7, 374.4, 306.4);
        eyelashLeft.lineTo(371.6, 309);
        g2d.setColor(Color.BLACK);
        g2d.fill(eyelashLeft);
        
        GeneralPath eyeMinorDetail = new GeneralPath();
        eyeMinorDetail.moveTo(394.4, 316);
        eyeMinorDetail.lineTo(407.4, 306.3);
        g2d.setColor(Color.BLACK);
        g2d.draw(eyeMinorDetail);
        
        // Reflection of the left eye
        AffineTransform eyeReflection = new AffineTransform();
        eyeReflection.setToScale(-1, 1);
        AffineTransform eyeTranslation = new AffineTransform();
        eyeTranslation.setToTranslation(852.5, 1);
        eyeReflection.preConcatenate(eyeTranslation);
        g2d.setColor(eyeOneColor);
        g2d.fill(eyeReflection.createTransformedShape(eyeLeft));
        
        // Reflection of eye color orange
        AffineTransform eyeDetailReflection = new AffineTransform();
        eyeDetailReflection.setToScale(-1, 1);
        AffineTransform eyeDetailTranslation = new AffineTransform();
        eyeDetailTranslation.setToTranslation(852.5, 1);
        eyeDetailReflection.preConcatenate(eyeDetailTranslation);
        g2d.setColor(eyeDetailColor);
        g2d.fill(eyeDetailReflection.createTransformedShape(eyeDetail));
        
        // overlay the outline of the right eye
        g2d.setColor(Color.BLACK);
        g2d.draw(eyeReflection.createTransformedShape(eyeLeft));
        
        // Reflection of the left eyelash
        AffineTransform eyelashReflection = new AffineTransform();
        eyelashReflection.setToScale(-1, 1);
        AffineTransform eyelashTranslation = new AffineTransform();
        eyelashTranslation.setToTranslation(852.5, 1);
        eyelashReflection.preConcatenate(eyelashTranslation);
        g2d.setColor(Color.BLACK);
        g2d.fill(eyeReflection.createTransformedShape(eyelashLeft));
        
        // Reflection of line above the eyelash
        AffineTransform eyeMinorDetailReflection = new AffineTransform();
        eyeMinorDetailReflection.setToScale(-1, 1);
        AffineTransform eyeMinorDetailTranslation = new AffineTransform();
        eyeMinorDetailTranslation.setToTranslation(852.5, 1);
        eyeMinorDetailReflection.preConcatenate(eyeMinorDetailTranslation);
        g2d.setColor(Color.BLACK);
        g2d.draw(eyeMinorDetailReflection.createTransformedShape(eyeMinorDetail));
        
        GeneralPath hair1 = new GeneralPath();
        hair1.moveTo(372.7, 377.4);
        hair1.curveTo(304.9, 369.8, 326, 445.4, 359.7, 432.1);
        hair1.curveTo(331.3, 452.8, 286.2, 395.7, 308.4, 366.7);
        hair1.curveTo(317.2, 356.3, 338.9, 350.1, 364.8, 368.5);
        g2d.setColor(hairColor);
        g2d.fill(hair1);
        g2d.setColor(Color.BLACK);
        g2d.draw(hair1);

        GeneralPath hair2 = new GeneralPath();
        hair2.moveTo(495.8, 252.2);
        hair2.curveTo(495.37, 240, 491.57, 235.14, 489, 229.56);
        hair2.curveTo(494.6, 231.62, 499.63, 240.9, 501.5, 248.52);
        hair2.curveTo(499.9, 238.6, 497.5, 227.7, 475.1, 212);
        hair2.lineTo(482.5, 211.6);
        hair2.curveTo(478.7, 205, 477.6, 199.4, 480.2, 191.1);
        hair2.curveTo(493.6, 207.2, 531.4, 212.8, 525.7, 275);
        g2d.setColor(hairColor);
        g2d.fill(hair2);
        g2d.setColor(Color.BLACK);
        g2d.draw(hair2);
        
        GeneralPath hair3 = new GeneralPath();
        hair3.moveTo(327.5, 297.3);
        hair3.curveTo(313.7, 261.9, 323.2, 225.8, 361.1, 194.1);
        hair3.lineTo(363.3, 203.6);
        hair3.curveTo(368.2, 199.3, 389.3, 201.7, 390.2, 205.5);
        hair3.curveTo(375.9, 213.7, 350.9, 237.5, 348, 262.6);
        g2d.setColor(hairColor);
        g2d.fill(hair3);
        g2d.setColor(Color.BLACK);
        g2d.draw(hair3);
        
        GeneralPath hair4 = new GeneralPath();
        hair4.moveTo(364.8, 368.5);
        hair4.curveTo(303.4, 334.8, 326.4, 252.7, 369.4, 260.6);
        hair4.curveTo(351, 281.3, 364.6, 291, 363.8, 298.4);
        hair4.curveTo(361.3, 303.7, 361.5, 310.8, 358.4, 308);
        hair4.curveTo(361.5, 310.8, 361.3, 303.7, 363.8, 298.4);
        hair4.curveTo(363.6, 314, 389, 324.8, 397.5, 356.8);
        hair4.curveTo(389, 329, 394, 298.3, 440, 283.2);
        
        hair4.curveTo(427.9, 309.7, 449, 334.4, 460, 349.9);
        hair4.curveTo(470.1, 344, 479, 335.1, 482.6, 326.6);
        hair4.curveTo(485.8, 332.4, 484.3, 339, 479, 344.7);
        hair4.curveTo(484.3, 339, 485.8, 332.4, 482.6, 326.6);
        
        hair4.curveTo(492.7, 318.9, 503.4, 282.5, 491.6, 251.5);
        hair4.curveTo(507.5, 256.2, 521.1, 267, 528.2, 281);
        hair4.curveTo(540.4, 315, 525.1, 354.8, 520.4, 354.3);
        hair4.curveTo(465.7, 354.4, 399.2, 365, 372.7, 377.4);
        g2d.setColor(hairColor);
        g2d.fill(hair4);
        g2d.setColor(Color.BLACK);
        g2d.draw(hair4);
        
        GeneralPath glove = new GeneralPath();
        glove.moveTo(247.4, 226.15);
        glove.curveTo(237.2, 304.4, 332.4, 295.5, 340.63, 250.6);
        glove.curveTo(345.1, 239.64, 335.1, 226, 325.8, 220.76);
        glove.curveTo(326.23, 204.4, 301.2, 194.1, 290, 209.4);
        glove.moveTo(325.8, 220.76);
        glove.curveTo(319.7, 221.1, 293.4, 215.2, 290, 209.4);
        glove.curveTo(266.6, 205.75, 251.1, 213.1, 247.4, 226.15);
        g2d.setColor(gloveColor);
        g2d.fill(glove);
        g2d.setColor(Color.BLACK);
        g2d.draw(glove);
        
        GeneralPath gloveShine = new GeneralPath();
        gloveShine.moveTo(284.5, 259.1);
        gloveShine.curveTo(275.5, 260.4, 275.6, 275.2, 286.3, 275.2);
        gloveShine.curveTo(296.1, 274.6, 295.8, 259.6, 284.5, 259.1);
        g2d.setColor(gloveShineColor);
        g2d.fill(gloveShine);
        g2d.setColor(Color.BLACK);
        g2d.draw(gloveShine);
    }
}