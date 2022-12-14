/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Import necessary packages
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.geom.*;
import java.util.Date;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;

/**
 *
 * @author Angelo Louis L. Hizon
 */
public class FinalsProjectHizon extends Frame {
    
    final private int windowWidth;
    final private int windowHeight;

    // Placed as a global variable so that it can be accessed within the paint method
    Image backgroundImage;
    Image explosion;

    /**
    * Constructor
    *
    * @param width   The width of the window.
    * @param height  The height of the window.
    */
    
    FinalsProjectHizon(int width, int height){
        backgroundImage = new ImageIcon(this.getClass().getResource("/Background Version 3.png")).getImage();
        explosion = new ImageIcon(this.getClass().getResource("/Explosion 2.png")).getImage();

        windowWidth = width;
        windowHeight = height;
    }

    // Reference: https://stackoverflow.com/questions/26305/how-can-i-play-sound-in-java/26318#26318
    // Only works with wav file audio
    public static synchronized void playBGM() {
        new Thread(new Runnable() {
            // The wrapper thread is unnecessary, unless it blocks on the
            // Clip finishing; see comments.
            public void run() {
                try {
                    Clip clip = AudioSystem.getClip();
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                            this.getClass().getResourceAsStream("BGM Version 5.wav"));
                    clip.open(inputStream);
                    clip.start();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
        }).start();
    }

    public static synchronized void playIntro() {
        new Thread(new Runnable() {
            // The wrapper thread is unnecessary, unless it blocks on the
            // Clip finishing; see comments.
            public void run() {
                try {
                    Clip clip = AudioSystem.getClip();
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                            this.getClass().getResourceAsStream("intro 2.wav"));
                    clip.open(inputStream);
                    clip.start();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
        }).start();
    }

    // First constructor for draw to lessen the lines of code
    public static void draw(Graphics2D g2d, Shape object, Color colorOutline, Float stroke, Boolean checker) {
        if(checker) {
            g2d.setStroke(new BasicStroke(stroke));
            g2d.setColor(colorOutline);
            g2d.draw(object);
        } else {
            g2d.setStroke(new BasicStroke(stroke));
            g2d.setColor(colorOutline);
            g2d.fill(object);
        }
    }

    // Second constructor for draw to lessen the lines of code
    public static void draw(Graphics2D g2d, Color colorFill, Shape object, Color colorOutline, Float stroke) {
        g2d.setStroke(new BasicStroke(stroke));
        g2d.setColor(colorFill);
        g2d.fill(object);
        g2d.setColor(colorOutline);
        g2d.draw(object);
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // Anti-aliasing
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        // Sets the origin on the bottom left
        AffineTransform yUp = new AffineTransform();
        yUp.setToScale(1,-1);
        AffineTransform translate = new AffineTransform();
        translate.setToTranslation(0,windowHeight);
        yUp.preConcatenate(translate);

        //Apply the transformation to the Graphics2D object to draw everything
        //in "real" coordinates.
        g2d.transform(yUp);

        // Colors
        // Most of the colors are RGB but handful uses RGBA (red, green, blue, alpha) as parameters
        Color blushColor = new Color(233, 190, 168, 95);
        Color blushDetailColor = new Color(233, 190, 168, 198);
        Color clothingColor = new Color(173, 52, 34);
        Color cloudOutline = new Color(205, 189, 217);
        Color cloverColor = new Color(237, 206, 178);
        Color cuffColor = new Color(239, 227, 218);
        Color dodocoColor = new Color(203, 186, 157);
        Color dodocoDetailColor = new Color(147, 121, 95);
        Color dodocoPetalColor = new Color(153, 42, 17);
        Color dodocoStemColor = new Color(203, 186, 157);
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
        Color scarfColor = new Color(234, 207, 178);
        Color skinColor = new Color(246, 235, 225);
        Color skirtColor = new Color(218, 209, 200);
        Color rightGloveColor = new Color(99, 67, 64);
        Color mouthColor = new Color(236, 186, 167);

        // Entrance
        // Fade-in effect
        Rectangle2D.Double background = new Rectangle2D.Double(0, 0, 900, 506);

        // Cloud 1
        GeneralPath cloud1 = new GeneralPath();
        cloud1.moveTo(0, 383.6);
        cloud1.curveTo(15.6, 389.7, 30.5, 383.8, 37.4, 371.2);
        cloud1.curveTo(51, 385.7, 95.1, 370.1, 97, 337.5);
        cloud1.curveTo(108.2, 335, 138.6, 283.2, 101.3, 261.6);
        cloud1.curveTo(97.8, 239.9, 66.3, 220.4, 40, 236);
        cloud1.curveTo(35.5, 220.5, 24.3, 210.4, 0, 200.6);

        // Cloud 2
        GeneralPath cloud2 = new GeneralPath();
        cloud2.moveTo(0, 51.9);
        cloud2.curveTo(23.6, 68, 44.3, 69, 66, 57.4);
        cloud2.curveTo(74.8, 63.2, 99.4, 58.3, 99.9, 49.1);
        cloud2.curveTo(133, 59.8, 141.7, 15.7, 118, 0);
        cloud2.lineTo(0,0);

        // Cloud 3
        GeneralPath cloud3 = new GeneralPath();
        cloud3.moveTo(828, 506);
        cloud3.curveTo(793.4, 481.2, 810.2, 444, 835, 436);
        cloud3.curveTo(828.6, 421.2, 853.1, 397.5, 878.7, 413.4);
        cloud3.curveTo(877.6, 406.2, 897.7, 397.3, 900, 403.1);
        cloud3.lineTo(900,506);

        // White Skirt
        GeneralPath whiteSkirt = new GeneralPath();
        whiteSkirt.moveTo(353.05, 210.4);
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
        whiteSkirt.lineTo(508.8, 203.5);

        GeneralPath whiteSkirtMinorDetail = new GeneralPath();
        whiteSkirtMinorDetail.moveTo(356.6, 185.8);
        whiteSkirtMinorDetail.curveTo(356.4, 184.6, 359, 173.1, 362, 174.9);
        whiteSkirtMinorDetail.moveTo(381.5, 151.9);
        whiteSkirtMinorDetail.curveTo(380.2, 149.4, 386.9, 143.6, 390.7, 145.7);
        whiteSkirtMinorDetail.moveTo(421, 132.8);
        whiteSkirtMinorDetail.curveTo(420.8, 131, 429.1, 127.3, 429.4, 132.3);
        whiteSkirtMinorDetail.moveTo(460.9, 138.8);
        whiteSkirtMinorDetail.curveTo(464.8, 133.8, 472.7, 141.4, 471, 143.6);
        whiteSkirtMinorDetail.moveTo(494.4, 166.7);
        whiteSkirtMinorDetail.curveTo(497.2, 163.9, 503.7, 173.6, 500.3, 176.5);

        GeneralPath foot = new GeneralPath();
        foot.moveTo(401, 141);
        foot.curveTo(397.1, 131.9, 417, 114.7, 422.4, 126.5);

        GeneralPath leftSleeve = new GeneralPath();
        leftSleeve.moveTo(324.84, 210.9);
        leftSleeve.curveTo(330.7, 206.6, 349.1, 208.2, 355.04, 215);
        leftSleeve.lineTo(365, 236);
        leftSleeve.curveTo(348, 243.3, 332.2, 261.7, 324.84, 210.9);

        GeneralPath leftSleeveOutline = new GeneralPath();
        leftSleeveOutline.moveTo(324.84, 210.9);
        leftSleeveOutline.curveTo(330.7, 206.6, 349.1, 208.2, 355.04, 215);
        leftSleeveOutline.moveTo(365, 236);
        leftSleeveOutline.curveTo(348, 243.3, 332.2, 261.7, 324.84, 210.9);

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
        mainClothing.lineTo(539, 210.8);
        mainClothing.lineTo(515, 257.2);
        mainClothing.lineTo(362.4, 239.2);

        GeneralPath mainClothingClover = new GeneralPath();
        // Bottom
        mainClothingClover.moveTo(432.2, 153.9);
        mainClothingClover.curveTo(419, 146.6, 426.4, 142.4, 433.3, 147.6);
        mainClothingClover.curveTo(439.9, 143.2, 444.1, 149, 432.2, 153.9);
        // Right
        mainClothingClover.moveTo(428.8, 155.2);
        mainClothingClover.curveTo(422.2, 147.1, 412.3, 148.2, 419.6, 157.1);
        mainClothingClover.curveTo(409.4, 165, 427.8, 165.5, 428.8, 155.2);
        // Top
        mainClothingClover.moveTo(432.6, 158.5);
        mainClothingClover.curveTo(423.9, 160.1, 417.7, 170.1, 430.4, 167.5);
        mainClothingClover.curveTo(440.7, 173.3, 437, 161.2, 432.6, 158.5);
        // Left
        mainClothingClover.moveTo(434.6, 155.5);
        mainClothingClover.curveTo(437.8, 151.7, 453.4, 147.8, 445.3, 157);
        mainClothingClover.curveTo(448.2, 168.6, 434.3, 160.5, 434.6, 155.5);

        GeneralPath innerClothing = new GeneralPath();
        innerClothing.moveTo(399.5, 215.5);
        innerClothing.curveTo(412, 180.7, 440.9, 180.5, 449.7, 212.8);

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

        GeneralPath scarfDetail = new GeneralPath();
        scarfDetail.moveTo(421.46, 198.2);
        scarfDetail.lineTo(425.6, 201.8);
        scarfDetail.moveTo(430.1, 203.7);
        scarfDetail.curveTo(432.2, 204.9, 439.67, 205.5, 443, 204.5);
        scarfDetail.curveTo(444, 207.56, 443.54, 210.26, 441.27, 212.7);

        GeneralPath scarfMinorDetail = new GeneralPath();
        scarfMinorDetail.moveTo(439.4, 205.34);
        scarfMinorDetail.quadTo(438.7, 206.56, 435.1, 209.57);
        scarfMinorDetail.moveTo(434.7, 182.5);
        scarfMinorDetail.quadTo(436.3, 176.3, 439.34, 182.6);
        scarfMinorDetail.quadTo(447.1, 180.1, 445.2, 187.4);

        GeneralPath scarfTail = new GeneralPath();
        scarfTail.moveTo(567.2, 268.4);
        scarfTail.lineTo(597.4, 239);
        scarfTail.curveTo(595.8, 223.9, 576.3, 204.2, 570, 210.3);
        scarfTail.lineTo(526.3, 255.2);

        GeneralPath rightCuff = new GeneralPath();
        rightCuff.moveTo(551.7, 192.8);
        rightCuff.curveTo(502.8, 151.8, 487.8, 219.9, 520.7, 239.5);
        rightCuff.curveTo(498.8, 226.4, 510.6, 166, 551.7, 192.8);

        GeneralPath rightWrist = new GeneralPath();
        rightWrist.moveTo(509.7, 212.85);
        rightWrist.curveTo(513, 191.3, 529.8, 175.6, 551.3, 192.7);
        rightWrist.curveTo(533.8, 190, 512.5, 214.3, 530.3, 241.2);
        rightWrist.curveTo(520.5, 239.7, 508.2, 223.2, 509.7, 212.85);

        GeneralPath rightGlove = new GeneralPath();
        rightGlove.moveTo(530.3, 241.2);
        rightGlove.curveTo(512.5, 214.3, 533.8, 190, 551.3, 192.7);
        rightGlove.curveTo(582.5, 218, 559.2, 253.4, 530.3, 241.2);

        GeneralPath gapBetweenFinger = new GeneralPath();
        gapBetweenFinger.moveTo(539.6, 206.86);
        gapBetweenFinger.curveTo(537.75, 207.32, 536.43, 207.3, 534.84, 206.5);
        gapBetweenFinger.moveTo(535.32, 216.63);
        gapBetweenFinger.curveTo(533.63, 217.12, 531.88, 217.05, 530.56, 216.3);
        gapBetweenFinger.moveTo(533.6, 227.84);
        gapBetweenFinger.curveTo(532.17, 228.2, 531.02, 228.06, 529.8, 227.3);

        GeneralPath face = new GeneralPath();
        face.moveTo(495.8, 252.2);
        face.curveTo(497.8, 196.3, 352.7, 203, 347.4, 264);
        face.curveTo(315.7, 420.5, 553, 393, 495.3, 249);

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

        GeneralPath mouth = new GeneralPath();
        mouth.moveTo(408.8, 216.2);
        mouth.curveTo(380.7, 274.5, 479.9, 268.5, 444.6, 215.1);

        GeneralPath hat = new GeneralPath();
        hat.moveTo(329, 332);
        hat.curveTo(308, 416, 401.6, 458.5, 450, 455.6);
        hat.curveTo(543, 447.5, 615.4, 327, 543.6, 271.7);
        hat.lineTo(528.2, 281);
        hat.curveTo(540.4, 315, 525.1, 354.8, 520.4, 354.3);
        hat.curveTo(465.7, 354.4, 399.2, 365, 372.7, 377.4);
        hat.curveTo(355.3, 364.4, 341.5, 350, 329, 332);

        GeneralPath hatDetail = new GeneralPath();
        // Top clover leaf
        hatDetail.moveTo(448.7, 422.8);
        hatDetail.curveTo(427, 437.3, 436.7, 458.8, 450.7, 446.6);
        hatDetail.curveTo(464, 455.7, 473.4, 437, 448.7, 422.8);
        // Right clover leaf
        hatDetail.moveTo(454.7, 419);
        hatDetail.curveTo(476.7, 399.3, 486.8, 411.05, 478, 421.4);
        hatDetail.curveTo(485.75, 437.9, 469.5, 442, 454.7, 419);
        // Left clover leaf
        hatDetail.moveTo(446.2, 419.2);
        hatDetail.curveTo(437.1, 435, 414, 437.3, 423, 419.2);
        hatDetail.curveTo(411.9, 408.4, 424.9, 399, 446.2, 419.2);
        // Bottom clover leaf
        hatDetail.moveTo(451.5, 415.5);
        hatDetail.curveTo(399, 389.4, 495.7, 380.5, 451.5, 415.5);

        GeneralPath hatAccessoryOne = new GeneralPath();
        hatAccessoryOne.moveTo(535, 281.9);
        hatAccessoryOne.curveTo(528.8, 309.2, 539, 367.4, 561.5, 355);
        hatAccessoryOne.curveTo(551.3, 352.7, 536.6, 311.8, 545.2, 277.2);
        hatAccessoryOne.curveTo(540.9, 277.84, 538.03, 279.1, 535, 281.9);

        GeneralPath hatAccessoryTwo = new GeneralPath();
        hatAccessoryTwo.moveTo(561.5, 355);
        hatAccessoryTwo.curveTo(551.3, 352.7, 536.6, 311.8, 545.2, 277.2);
        hatAccessoryTwo.curveTo(597.2, 277.2, 569.4, 352.7, 561.5, 355);

        GeneralPath hatAccessoryDetail = new GeneralPath();
        // Top clover leaf for hat accessory
        hatAccessoryDetail.moveTo(576.5, 317.3);
        hatAccessoryDetail.curveTo(547.6, 330.3, 563.4, 351.1, 572.6, 337.2);
        hatAccessoryDetail.curveTo(574, 330.1, 573.3, 323, 576.5, 317.3);
        // Middle clover leaf for hat accessory
        hatAccessoryDetail.moveTo(576.1, 310.3);
        hatAccessoryDetail.curveTo(565.9, 329.3, 543.7, 325.4, 555.5, 310.3);
        hatAccessoryDetail.curveTo(546.4, 290.7, 566.7, 291.3, 576.1, 310.3);
        // Bottom clover leaf for hat accessory
        hatAccessoryDetail.moveTo(575.9, 298.05);
        hatAccessoryDetail.curveTo(570, 299.5, 554.4, 288.5, 562.6, 282.6);
        hatAccessoryDetail.curveTo(567.94, 283.04, 573.7, 294.85, 575.9, 298.05);

        GeneralPath hatCover = new GeneralPath();
        hatCover.moveTo(372.7, 377.4);
        hatCover.curveTo(415.3, 426, 526.2, 381.6, 520.4, 354.3);
        hatCover.curveTo(493.5, 350.8, 391.4, 362.5, 372.7, 377.4);

        GeneralPath teeth = new GeneralPath();
        teeth.moveTo(416.5, 255.3);
        teeth.curveTo(416.8, 248.2, 436.9, 248.05, 437, 255.04);
        teeth.curveTo(433.7, 258.4, 419.9, 258.7, 416.5, 255.3);

        GeneralPath earLeft = new GeneralPath();
        earLeft.moveTo(324.24, 292.7);
        earLeft.lineTo(278.14, 271.4);
        earLeft.lineTo(329.5, 263.2);

        GeneralPath earRight = new GeneralPath();
        earRight.moveTo(527.4, 280.3);
        earRight.lineTo(572.1, 256.5);
        earRight.curveTo(563.35, 245.8, 541.1, 238.85, 524.74, 239.4);
        earRight.lineTo(527.4, 280.3);

        GeneralPath earblushRight = new GeneralPath();
        earblushRight.moveTo(559.1, 265.5);
        earblushRight.curveTo(580.1, 258.9, 578.9, 255.2, 557.1, 247.3);
        earblushRight.curveTo(548.5, 252.9, 548.5, 255.8, 559.1, 265.5);

        GeneralPath eyeLeft = new GeneralPath();
        eyeLeft.moveTo(378, 300.2);
        eyeLeft.curveTo(365, 240.1, 403.6, 237.4, 399.5, 294.9);

        GeneralPath eyeDetail = new GeneralPath();
        eyeDetail.moveTo(375.9, 284.3);
        eyeDetail.curveTo(382.9, 284.6, 393.3, 284.05, 398.9, 281.5);
        eyeDetail.lineTo(398.9, 296);
        eyeDetail.lineTo(375.9, 302.9);

        GeneralPath eyelashLeft = new GeneralPath();
        eyelashLeft.moveTo(371.6, 309);
        eyelashLeft.curveTo(380.3, 319.4, 404.9, 298.1, 407.1, 294.4);
        eyelashLeft.curveTo(403.1, 293.6, 376.9, 297.7, 374.4, 306.4);
        eyelashLeft.lineTo(371.6, 309);

        GeneralPath eyeMinorDetail = new GeneralPath();
        eyeMinorDetail.moveTo(394.4, 316);
        eyeMinorDetail.lineTo(407.4, 306.3);

        // Reflection of the left eye
        AffineTransform eyeReflection = new AffineTransform();
        eyeReflection.setToScale(-1, 1);
        AffineTransform eyeTranslation = new AffineTransform();
        eyeTranslation.setToTranslation(852.5, 1);
        eyeReflection.preConcatenate(eyeTranslation);
        Shape eyeRight = eyeReflection.createTransformedShape(eyeLeft);

        // Reflection of eye color orange
        AffineTransform eyeDetailReflection = new AffineTransform();
        eyeDetailReflection.setToScale(-1, 1);
        AffineTransform eyeDetailTranslation = new AffineTransform();
        eyeDetailTranslation.setToTranslation(852.5, 1);
        eyeDetailReflection.preConcatenate(eyeDetailTranslation);
        Shape eyeDetailRight = eyeDetailReflection.createTransformedShape(eyeDetail);

        // Reflection of the left eyelash
        AffineTransform eyelashReflection = new AffineTransform();
        eyelashReflection.setToScale(-1, 1);
        AffineTransform eyelashTranslation = new AffineTransform();
        eyelashTranslation.setToTranslation(852.5, 1);
        eyelashReflection.preConcatenate(eyelashTranslation);
        Shape eyelashRight = eyeReflection.createTransformedShape(eyelashLeft);

        // Reflection of line above the eyelash
        AffineTransform eyeMinorDetailReflection = new AffineTransform();
        eyeMinorDetailReflection.setToScale(-1, 1);
        AffineTransform eyeMinorDetailTranslation = new AffineTransform();
        eyeMinorDetailTranslation.setToTranslation(852.5, 1);
        eyeMinorDetailReflection.preConcatenate(eyeMinorDetailTranslation);
        Shape eyeMinorDetailReflectionRight = eyeMinorDetailReflection.createTransformedShape(eyeMinorDetail);

        GeneralPath hair = new GeneralPath();
        hair.moveTo(374.7, 377.4);
        hair.curveTo(399.2, 365, 465.7, 354.5, 520.4, 354.3);
        hair.curveTo(525.1, 354.8, 540.4, 315, 530.2, 281);
        hair.curveTo(526.1, 267, 512.5, 256.2, 499.3, 253.1);
        hair.curveTo(505.7, 299.4, 498.8, 324.8, 465, 349.9);
        hair.lineTo(423.6, 344.7);
        hair.lineTo(397.5, 354.8);
        hair.lineTo(376.4, 354.1);
        hair.lineTo(340, 250.5);
        hair.curveTo(335.6, 271.7, 328.1, 285.5, 326.5, 295.8);

        hair.lineTo(366.8, 368.5);

        GeneralPath hair1 = new GeneralPath();
        hair1.moveTo(374.7, 377.4);
        hair1.curveTo(304.9, 369.8, 326, 445.4, 359.7, 432.1);
        hair1.curveTo(331.3, 452.8, 286.2, 395.7, 308.4, 366.7);
        hair1.curveTo(317.2, 356.3, 338.9, 350.1, 366.8, 368.5);

        GeneralPath hair2 = new GeneralPath();
        hair2.moveTo(497.8, 254.2);
        hair2.curveTo(495.37, 240, 491.57, 235.14, 489, 229.56);
        hair2.curveTo(494.6, 231.62, 499.63, 240.9, 501.5, 248.52);
        hair2.curveTo(499.9, 238.6, 497.5, 227.7, 475.1, 212);
        hair2.lineTo(482.5, 211.6);
        hair2.curveTo(478.7, 205, 477.6, 199.4, 480.2, 191.1);
        hair2.curveTo(493.6, 207.2, 531.4, 212.8, 525.7, 281);

        GeneralPath hair3 = new GeneralPath();
        hair3.moveTo(327.5, 297.3);
        hair3.curveTo(313.7, 261.9, 323.2, 225.8, 361.1, 194.1);
        hair3.lineTo(363.3, 203.6);
        hair3.curveTo(368.2, 199.3, 389.3, 201.7, 390.2, 205.5);
        hair3.curveTo(375.9, 213.7, 350.9, 237.5, 348, 262.6);

        GeneralPath hair4 = new GeneralPath();
        hair4.moveTo(364.8, 370.5);
        hair4.curveTo(303.4, 334.8, 326.4, 252.7, 369.4, 260.6);
        hair4.curveTo(340.5, 295.3, 387, 318.8, 397.5, 358.8);

        GeneralPath hair5 = new GeneralPath();
        hair5.moveTo(397.5, 356.8);
        hair5.curveTo(389, 329, 394, 298.3, 440, 283.2);
        hair5.curveTo(433.9, 309.7, 454, 334.4, 465, 354.9);

        GeneralPath hair6 = new GeneralPath();
        hair6.moveTo(465, 349.9);
        hair6.curveTo(498.8, 324.8, 505.7, 299.4, 499.3, 253.1);
        hair6.curveTo(512.5, 256.2, 526.1, 267, 533.2, 281);
        hair6.curveTo(545.4, 315, 530.1, 354.8, 520.4, 354.3);

        GeneralPath hair7 = new GeneralPath();
        hair7.moveTo(364.8, 370.5);
        hair7.curveTo(391.5, 353.7, 460.7, 352.4, 520.4, 354.3);

        GeneralPath glove = new GeneralPath();
        glove.moveTo(247.4, 226.15);
        glove.curveTo(237.2, 304.4, 332.4, 295.5, 340.63, 250.6);
        glove.curveTo(345.1, 239.64, 335.1, 226, 325.8, 220.76);
        glove.curveTo(326.23, 204.4, 301.2, 194.1, 290, 209.4);
        glove.moveTo(325.8, 220.76);
        glove.curveTo(319.7, 221.1, 293.4, 215.2, 290, 209.4);
        glove.curveTo(266.6, 205.75, 251.1, 213.1, 247.4, 226.15);

        GeneralPath gloveShine = new GeneralPath();
        gloveShine.moveTo(284.5, 259.1);
        gloveShine.curveTo(275.5, 260.4, 275.6, 275.2, 286.3, 275.2);
        gloveShine.curveTo(296.1, 274.6, 295.8, 259.6, 284.5, 259.1);

        GeneralPath blush1 = new GeneralPath();
        blush1.moveTo(366, 250.9);
        blush1.curveTo(357.9, 239.2, 373, 229.9, 382.3, 235.1);
        blush1.curveTo(388.3, 242.1, 380.2, 257.3, 366, 252.9);

        GeneralPath blushDetail1 = new GeneralPath();
        blushDetail1.moveTo(367.5, 247.6);
        blushDetail1.lineTo(368.1, 238.26);
        blushDetail1.lineTo(377.6, 247.93);
        blushDetail1.lineTo(383.1, 240.37);

        // Reflection of left blush
        AffineTransform blushReflection1 = new AffineTransform();
        blushReflection1.setToScale(-1, 1);
        AffineTransform blushTranslation1 = new AffineTransform();
        blushTranslation1.setToTranslation(852.5, 1);
        blushReflection1.preConcatenate(eyeMinorDetailTranslation);
        Shape blush2 = blushReflection1.createTransformedShape(blush1);

        // Reflection of left blush detail
        AffineTransform blushDetailReflection1 = new AffineTransform();
        blushDetailReflection1.setToScale(-1, 1);
        AffineTransform blushDetailTranslation1 = new AffineTransform();
        blushDetailTranslation1.setToTranslation(852.5, 1);
        blushDetailReflection1.preConcatenate(eyeMinorDetailTranslation);
        Shape blushDetail2 = blushDetailReflection1.createTransformedShape(blushDetail1);

        // Star 1
        GeneralPath star1 = new GeneralPath();
        star1.moveTo(262.7, 365);
        star1.curveTo(253.9, 369.5, 228.2, 383.9, 224.7, 379);
        star1.curveTo(221.1, 377.7, 235.6, 356.2, 248.5, 346.3);
        star1.curveTo(243.7, 335.3, 241.5, 316.7, 244.4, 311);
        star1.curveTo(250.8, 312.7, 263.8, 324.3, 272.8,  332.1);
        star1.curveTo(285.1, 327.1, 309.9, 317.5, 311.2, 319.4);
        star1.curveTo(313.1, 323.1, 298.8, 340.5, 284.9, 353.9);
        star1.curveTo(290.2, 364.8, 298.3, 379.4, 294.9, 381.1);
        star1.curveTo(290.5, 382.7, 277.8, 374.7, 262.7, 365);

        // Star 2
        GeneralPath star2 = new GeneralPath();
        star2.moveTo(617.6, 216.3);
        star2.curveTo(612.3, 207.1, 592.06, 216, 592.4, 212.4);
        star2.curveTo(589.9, 203.1, 609.8, 200.7, 615.6, 190.84);
        star2.curveTo(619.5, 181.2, 616.5, 150.9, 620, 151.1);
        star2.curveTo(625.85, 149.1, 631.45, 179.4, 639.9, 186.66);
        star2.curveTo(648.4, 193.8, 664.4, 194.8, 662, 198);
        star2.curveTo(664.1, 201.5, 648.9, 203.3, 642.95, 208.9);
        star2.curveTo(639.4, 223.1, 642.5, 250.8, 637.3, 249.2);
        star2.curveTo(630.4, 253.9, 624.1, 219.2, 617.6, 216.3);

        // Star 3
        AffineTransform star3InitialRotation = new AffineTransform();
        star3InitialRotation.setToRotation(-Math.PI/6, 705, 415.2);
        AffineTransform star3Scaling = new AffineTransform();
        star3Scaling.setToScale(0.75, 0.75);
        AffineTransform star3Translation = new AffineTransform();
        star3Translation.setToTranslation(500,0);
        star3InitialRotation.preConcatenate(star3Scaling);
        star3InitialRotation.preConcatenate(star3Translation);
        Shape star3 = star3InitialRotation.createTransformedShape(star1);

        // Bunny
        GeneralPath bunnyOutline = new GeneralPath();
        bunnyOutline.moveTo(770, 0);
        bunnyOutline.curveTo(741.5, 11.9, 776, 50.8, 780.3, 42.6);
        bunnyOutline.curveTo(786.1, 81.3, 821.5, 86.7, 797.7, 41);
        bunnyOutline.lineTo(800, 46.5);
        bunnyOutline.curveTo(803.25, 48.5, 810.16, 48.4, 813.4, 46.57);
        bunnyOutline.curveTo(837.1, 73, 868.1, 58.2, 815.2, 31.96);
        bunnyOutline.lineTo(832.5, 41.4);
        bunnyOutline.curveTo(843.4, 43.15,  854.1, 42.5, 864.8, 34.4);
        bunnyOutline.curveTo(877.7, 45.34, 894.95, 23.4, 871.6, 17.6);
        bunnyOutline.curveTo(875.7, 12.96, 869.3, 1.6, 865.1, 0);
        bunnyOutline.quadTo(812.3, -11.2, 770, 0);

        // Bunny Left Eye
        GeneralPath bunnyEyeLeft = new GeneralPath();
        bunnyEyeLeft.moveTo(767.1, 22.6);
        bunnyEyeLeft.curveTo(761.15, 34.8, 782.8, 32, 772.4, 22);
        bunnyEyeLeft.curveTo(770.51, 20.33, 768.22, 20.74, 767.1, 22.6);

        // Bunny Right Eye
        GeneralPath bunnyEyeRight = new GeneralPath();
        bunnyEyeRight.moveTo(797.8, 27.9);
        bunnyEyeRight.curveTo(791.47, 28.17, 791.95, 17.2, 796.87, 17.17);
        bunnyEyeRight.curveTo(799, 10.83, 809.84, 11.83, 803.72, 17.93);
        bunnyEyeRight.curveTo(803.8, 17, 804.4, 28.5, 797.8, 27.9);

        // Bunny Mouth
        GeneralPath bunnyMouth = new GeneralPath();
        bunnyMouth.moveTo(774, 12.8);
        bunnyMouth.lineTo(777.5, 15);
        bunnyMouth.lineTo(779.5, 13.5);
        bunnyMouth.lineTo(782.1, 15.1);
        bunnyMouth.lineTo(784.1, 12.8);

        // Bunny Ear
        GeneralPath bunnyEarDetail = new GeneralPath();
        // Left Ear
        bunnyEarDetail.moveTo(790.8, 41.8);
        bunnyEarDetail.curveTo(787.2, 41.6, 789.9, 56.2, 794.6, 57.0);
        bunnyEarDetail.curveTo(802.6, 54.1, 794.6, 40.2, 790.8, 41.8);
        // Right Ear
        bunnyEarDetail.moveTo(821.2, 46.8);
        bunnyEarDetail.curveTo(827.9, 41.4, 809.5, 32.6, 811, 35.6);
        bunnyEarDetail.curveTo(805, 37.5, 820.6, 49, 821.2, 46.8);

        // Dodoco Outline
        GeneralPath dodocoOutline = new GeneralPath();
        dodocoOutline.moveTo(754.8, 97);
        dodocoOutline.curveTo(749.8, 107.3, 689.5, 107.4, 681, 91.9);
        dodocoOutline.curveTo(681.84, 85.93, 685.3, 85.94, 694, 92.1);
        dodocoOutline.curveTo(607.5, 30.3, 713.7, -26.7, 758.1, 15);
        dodocoOutline.curveTo(769.6, 19, 782.6, 35.3, 767.6, 60.8);
        dodocoOutline.curveTo(782.1, 16.7, 818.5, 55.6, 754.8, 97);

        // Dodoco Major Detail
        GeneralPath dodocoDetail = new GeneralPath();
        dodocoDetail.moveTo(662.4, 49.7);
        dodocoDetail.curveTo(703.5, 94.3, 736.2, 41.3, 730.5, 28.7);
        dodocoDetail.curveTo(742.7, 37.5, 764.9, 38.1, 772.6, 33.2);
        dodocoDetail.curveTo(746.5, -18.8, 660, -3.8, 662.4, 49.7);

        // Dodoco Belt
        GeneralPath dodocoBeltDetail = new GeneralPath();
        dodocoBeltDetail.moveTo(669.3, 69.7);
        dodocoBeltDetail.curveTo(697.5, 72.8, 737, 52.7, 765.5, 25.6);
        dodocoBeltDetail.lineTo(773, 33.5);
        dodocoBeltDetail.curveTo(744.3, 62.3, 701.1, 77.3, 677.7, 78.6);
        dodocoBeltDetail.lineTo(669.3, 69.7);

        // Dodoco Eye
        GeneralPath dodocoEye = new GeneralPath();
        // Right Eye
        dodocoEye.moveTo(745.5, 87.2);
        dodocoEye.curveTo(737.1, 86.8, 738.8, 74.6, 745.1, 74.9);
        dodocoEye.curveTo(751.2, 71.2, 754.7, 75.1, 751.4, 77.2);
        dodocoEye.curveTo(757.7, 79.7, 748.8, 88.7, 745.5, 87.2);
        // Left Eye
        dodocoEye.moveTo(713.3, 93.0);
        dodocoEye.curveTo(713.3, 96.3, 703.7, 96.7, 703.9, 93.2);
        dodocoEye.curveTo(699.7, 91.0, 705.0, 83.4, 707.4, 84.7);
        dodocoEye.curveTo(711.8, 82.6, 715.7, 91.9, 713.3, 93.0);

        // Dodoco Mouth
        GeneralPath dodocoMouth = new GeneralPath();
        dodocoMouth.moveTo(712.7, 76.7);
        dodocoMouth.curveTo(713.5, 77.7, 724.4, 74.4, 723.7, 73.2);
        dodocoMouth.lineTo(720.6, 80.0);
        dodocoMouth.lineTo(712.7, 76.7);

        // Dodoco Petal
        GeneralPath dodocoPetal = new GeneralPath();
        dodocoPetal.moveTo(746.8, 102.15);
        // Left Stem
        dodocoPetal.curveTo(749.15, 100.15, 752.12, 109.07, 750.8, 113.9);
        dodocoPetal.curveTo(705.9, 119.4, 712.6, 135.7, 745.3, 123.2);
        dodocoPetal.curveTo(749.4, 130.1, 766.24, 125.7, 768.4, 116.1);
        dodocoPetal.curveTo(812.3, 104.2, 795.25, 87.1, 757.2, 110.6);
        // Right Stem
        dodocoPetal.curveTo(755.5, 106.54, 753.4, 99.1, 754.1, 97.3);

        // Dodoco Stem Outline (Sten placed on the top of the head)
        GeneralPath dodocoStem = new GeneralPath();
        dodocoStem.moveTo(746.8, 102.15);
        dodocoStem.curveTo(749.15, 100.15, 752.12, 109.07, 750.8, 113.9);
        dodocoStem.curveTo(747.34, 120.56, 765.25, 114.66, 757.2, 110.6);
        dodocoStem.curveTo(755.5, 108.54, 753.4, 99.1, 754.1, 97.3);

        // Dodoco Minor Details
        GeneralPath dodocoMinorDetail = new GeneralPath();
        dodocoMinorDetail.moveTo(702, 83.9);
        dodocoMinorDetail.curveTo(701.6, 83.2, 707.2, 80.8, 708, 81.9);
        dodocoMinorDetail.moveTo(737.6, 72.6);
        dodocoMinorDetail.curveTo(736.8, 72.3, 742.8, 69.8, 744.2, 70.2);
        dodocoMinorDetail.moveTo(743.2, 90.3);
        dodocoMinorDetail.curveTo(739.8, 90.1, 738.9, 96.8, 741, 96.9);

        // Dodoco Blush
        GeneralPath dodocoBlush = new GeneralPath();
        dodocoBlush.moveTo(721.6, 86.7);
        dodocoBlush.curveTo(722.9, 89.8, 731.8, 87.6, 729.4, 83.4);
        dodocoBlush.curveTo(727.5, 79.5, 720.2, 84.1, 721.6, 86.7);

        // Geometric transformation for feather
        AffineTransform featherRotation = new AffineTransform();
        featherRotation.setToRotation(Math.PI/18, 543.6, 285.6);

        // Geometric transformation for hair 1 to 3
        AffineTransform hair1Rotation = new AffineTransform();
        hair1Rotation.setToRotation(Math.PI/9, 374.7, 377.4);

        AffineTransform hair2Rotation = new AffineTransform();
        hair2Rotation.setToRotation(-Math.PI/9,495.8, 252.2);

        AffineTransform hair3Rotation = new AffineTransform();
        hair3Rotation.setToRotation(-Math.PI/9, 327.5, 297.3);

        // Main Clothing Rotation
        AffineTransform mainClothingRotation = new AffineTransform();
        mainClothingRotation.setToRotation(-Math.PI/9, 426.8, 211.5);

        // Inner Clothing Rotation
        AffineTransform innerClothingRotation = new AffineTransform();
        innerClothingRotation.setToRotation(-Math.PI/9, 426.8, 211.5);

        // White Skirt Rotation
        AffineTransform whiteSkirtRotation = new AffineTransform();
        whiteSkirtRotation.setToRotation(-Math.PI/72, 426.8, 211.5);

        // Bangs Rotation
        AffineTransform hair4Rotation = new AffineTransform();
        hair4Rotation.setToRotation(-Math.PI/36, 364.8, 368.5);

        AffineTransform hair5Rotation = new AffineTransform();
        hair5Rotation.setToRotation(-Math.PI/36, 397.5, 356.8);

        AffineTransform hair6Rotation = new AffineTransform();
        hair6Rotation.setToRotation(-Math.PI/36, 460, 349.9);

        // Geometric transformation for left glove
        AffineTransform gloveScale = new AffineTransform();
        AffineTransform gloveTranslation = new AffineTransform();
        gloveScale.setToScale(1.1875, 1.1875);
        gloveTranslation.setToTranslation(-50, -50);
        gloveScale.preConcatenate(gloveTranslation);

        // Geometric transformation for left glove shine
        AffineTransform gloveShineScale = new AffineTransform();
        AffineTransform gloveShineTranslation = new AffineTransform();
        gloveShineScale.setToScale(1.1875, 1.1875);
        gloveShineTranslation.setToTranslation(-50, -50);
        gloveShineScale.preConcatenate(gloveTranslation);

        // Geometric transformation for left sleeve
        AffineTransform leftSleeveScale = new AffineTransform();
        AffineTransform leftSleeveTranslation = new AffineTransform();
        leftSleeveScale.setToScale(1.1875, 1.1875);
        leftSleeveTranslation.setToTranslation(-50, -50);
        leftSleeveScale.preConcatenate(leftSleeveTranslation);

        // Geometric transformation for left sleeve outline
        AffineTransform leftSleeveOutlineScale = new AffineTransform();
        AffineTransform leftSleeveOutlineTranslation = new AffineTransform();
        leftSleeveOutlineScale.setToScale(1.1875, 1.1875);
        leftSleeveOutlineTranslation.setToTranslation(-50, -50);
        leftSleeveOutlineScale.preConcatenate(leftSleeveOutlineTranslation);

        // Geometric transformation for cloud1
        AffineTransform cloud1Rotation = new AffineTransform();
        cloud1Rotation.setToRotation(-Math.PI/45, 0, 383.6);

        // Geometric transformation for cloud2
        AffineTransform cloud2Rotation = new AffineTransform();
        cloud2Rotation.setToRotation(-Math.PI/90, 0, 51.9);

        // Geometric transformation for cloud3
        AffineTransform cloud3Rotation = new AffineTransform();
        cloud3Rotation.setToRotation(Math.PI/60, 828, 506);

        // Geometric Transformation for scarf
        AffineTransform scarfRotation = new AffineTransform();
        scarfRotation.setToRotation(-Math.PI/45, 428.7, 221.0);

        // Geometric Transformation for scarf tail
        AffineTransform scarfTailRotation = new AffineTransform();
        scarfTailRotation.setToRotation(-Math.PI/45, 553, 267);

        // Accumulation technique placed here
        // Star Rotation
        AffineTransform singleRotationStar1 = new AffineTransform();
        singleRotationStar1.setToRotation(-(8*Math.PI)/360, 267.4, 350.3);

        AffineTransform singleRotationStar2 = new AffineTransform();
        singleRotationStar2.setToRotation((6*Math.PI)/360, 629, 201);

        AffineTransform singleRotationStar3 = new AffineTransform();
        singleRotationStar3.setToRotation(-(4*Math.PI)/360, 719, 436);

        // Accumulation technique for Star Rotation
        AffineTransform accumulatedRotationStar1 = new AffineTransform();
        AffineTransform accumulatedRotationStar2 = new AffineTransform();
        AffineTransform accumulatedRotationStar3 = new AffineTransform();

        // Degree of Opacity
        // Reason why it's 255 is because the range of opacity in Java requires ranging from 0 to 255
        int alpha = 255;

        // Initial Total Time
        long totalTime = 0;

        // Initial background music and intro of klee
        // Only play the intro of klee once
        playIntro();
        playBGM();

        try{
            while(true) {
                if(totalTime >= 12000) {
                    // Repeat to make it appear like a GIF
                    playBGM();

                    // Restart counter
                    totalTime = 0;
                }

                long startTime = System.currentTimeMillis();

                // INITIAL MATRIX
                AffineTransform initialTransformation = new AffineTransform();
                initialTransformation.setToScale(1, 1);

                // FINAL MATRICES
                // Glove Matrix
                double[] initialGloveMatrix = new double[6];
                double[] finalGloveMatrix = new double[6];
                initialTransformation.getMatrix(initialGloveMatrix);
                gloveScale.getMatrix(finalGloveMatrix);

                // Glove Shine Matrix
                double[] initialGloveShineMatrix = new double[6];
                double[] finalGloveShineMatrix = new double[6];
                initialTransformation.getMatrix(initialGloveShineMatrix);
                gloveShineScale.getMatrix(finalGloveShineMatrix);

                // Left Sleeve
                double[] initialLeftSleeveMatrix = new double[6];
                double[] finalLeftSleeveMatrix = new double[6];
                initialTransformation.getMatrix(initialLeftSleeveMatrix);
                leftSleeveScale.getMatrix(finalLeftSleeveMatrix);

                // Left Sleeve Outline
                double[] initialLeftSleeveOutlineMatrix = new double[6];
                double[] finalLeftSleeveOutlineMatrix = new double[6];
                initialTransformation.getMatrix(initialLeftSleeveOutlineMatrix);
                leftSleeveOutlineScale.getMatrix(finalLeftSleeveOutlineMatrix);

                // Feather Matrix
                double[] initialFeatherMatrix = new double[6];
                double[] finalFeatherMatrix = new double[6];
                initialTransformation.getMatrix(initialFeatherMatrix);
                featherRotation.getMatrix(finalFeatherMatrix);

                // Hair1 Matrix
                double[] initialHair1Matrix = new double[6];
                double[] finalHair1Matrix = new double[6];
                initialTransformation.getMatrix(initialHair1Matrix);
                hair1Rotation.getMatrix(finalHair1Matrix);

                // Hair2 Matrix
                double[] initialHair2Matrix = new double[6];
                double[] finalHair2Matrix = new double[6];
                initialTransformation.getMatrix(initialHair2Matrix);
                hair2Rotation.getMatrix(finalHair2Matrix);

                // Hair3 Matrix
                double[] initialHair3Matrix = new double[6];
                double[] finalHair3Matrix = new double[6];
                initialTransformation.getMatrix(initialHair3Matrix);
                hair3Rotation.getMatrix(finalHair3Matrix);

                // Hair4 Matrix
                double[] initialHair4Matrix = new double[6];
                double[] finalHair4Matrix = new double[6];
                initialTransformation.getMatrix(initialHair4Matrix);
                hair4Rotation.getMatrix(finalHair4Matrix);

                // Hair5 Matrix
                double[] initialHair5Matrix = new double[6];
                double[] finalHair5Matrix = new double[6];
                initialTransformation.getMatrix(initialHair5Matrix);
                hair5Rotation.getMatrix(finalHair5Matrix);

                // Hair6 Matrix
                double[] initialHair6Matrix = new double[6];
                double[] finalHair6Matrix = new double[6];
                initialTransformation.getMatrix(initialHair6Matrix);
                hair6Rotation.getMatrix(finalHair6Matrix);

                // Main Clothing Matrix
                double[] initialMainClothingMatrix = new double[6];
                double[] finalMainClothingMatrix = new double[6];
                initialTransformation.getMatrix(initialMainClothingMatrix);
                mainClothingRotation.getMatrix(finalMainClothingMatrix);

                // Main Clothing Clover Matrix
                double[] initialMainClothingCloverMatrix = new double[6];
                double[] finalMainClothingCloverMatrix = new double[6];
                initialTransformation.getMatrix(initialMainClothingCloverMatrix);
                mainClothingRotation.getMatrix(finalMainClothingCloverMatrix);

                // White Skirt Matrix
                double[] initialWhiteSkirtMatrix = new double[6];
                double[] finalWhiteSkirtMatrix = new double[6];
                initialTransformation.getMatrix(initialWhiteSkirtMatrix);
                whiteSkirtRotation.getMatrix(finalWhiteSkirtMatrix);

                // White Skirt Minor Detail Matrix
                double[] initialWhiteSkirtMinorDetailMatrix = new double[6];
                double[] finalWhiteSkirtMinorDetailMatrix = new double[6];
                initialTransformation.getMatrix(initialWhiteSkirtMinorDetailMatrix);
                whiteSkirtRotation.getMatrix(finalWhiteSkirtMinorDetailMatrix);

                // Inner Clothing Matrix
                double[] initialInnerClothingMatrix = new double[6];
                double[] finalInnerClothingMatrix = new double[6];
                initialTransformation.getMatrix(initialInnerClothingMatrix);
                innerClothingRotation.getMatrix(finalInnerClothingMatrix);

                // Cloud1 Matrix
                double[] initialCloud1Matrix = new double[6];
                double[] finalCloud1Matrix = new double[6];
                initialTransformation.getMatrix(initialCloud1Matrix);
                cloud1Rotation.getMatrix(finalCloud1Matrix);

                // Cloud2 Matrix
                double[] initialCloud2Matrix = new double[6];
                double[] finalCloud2Matrix = new double[6];
                initialTransformation.getMatrix(initialCloud2Matrix);
                cloud2Rotation.getMatrix(finalCloud2Matrix);

                // Cloud3 Matrix
                double[] initialCloud3Matrix = new double[6];
                double[] finalCloud3Matrix = new double[6];
                initialTransformation.getMatrix(initialCloud3Matrix);
                cloud3Rotation.getMatrix(finalCloud3Matrix);

                // Scarf
                double[] initialScarfMatrix = new double[12];
                double[] finalScarfMatrix = new double[12];
                initialTransformation.getMatrix(initialScarfMatrix);
                scarfRotation.getMatrix(finalScarfMatrix);

                // Scarf Tail
                double[] initialScarfTailMatrix = new double[12];
                double[] finalScarfTailMatrix = new double[12];
                initialTransformation.getMatrix(initialScarfTailMatrix);
                scarfTailRotation.getMatrix(finalScarfTailMatrix);

                // Appropriate steps used for the animation is 250
                int steps = 250;

                // This shapes are used for drawing the intermediate objects
                Shape gloveAnimation;
                Shape gloveShineAnimation;
                Shape leftSleeveAnimation;
                Shape leftSleeveOutlineAnimation;
                Shape featherAnimation;
                Shape hair1Animation;
                Shape hair2Animation;
                Shape hair3Animation;
                Shape hair4Animation;
                Shape hair5Animation;
                Shape hair6Animation;
                Shape mainClothingAnimation;
                Shape mainClothingCloverAnimation;
                Shape whiteSkirtAnimation;
                Shape whiteSkirtMinorDetailAnimation;
                Shape innerClothingAnimation;

                Shape scarfAnimation;
                Shape scarfDetailAnimation;
                Shape scarfMinorDetailAnimation;
                Shape scarfTailAnimation;

                Shape cloud1Animation;
                Shape cloud2Animation;
                Shape cloud3Animation;

                Shape star1Animation;
                Shape star2Animation;
                Shape star3Animation;

                // This transformation is used for the convex combinations of the initial and final transformation
                // AffineTransform for Interpolation
                AffineTransform gloveTransformation;
                AffineTransform gloveShineTransformation;
                AffineTransform leftSleeveTransformation;
                AffineTransform leftSleeveOutlineTransformation;
                AffineTransform featherTransformation;
                AffineTransform hair1Transformation;
                AffineTransform hair2Transformation;
                AffineTransform hair3Transformation;
                AffineTransform hair4Transformation;
                AffineTransform hair5Transformation;
                AffineTransform hair6Transformation;
                AffineTransform scarfTransformation;
                AffineTransform scarfTailTransformation;

                AffineTransform mainClothingTransformation;
                AffineTransform mainClothingCloverTransformation;
                AffineTransform whiteSkirtTransformation;
                AffineTransform whiteSkirtMinorDetailTransformation;
                AffineTransform innerClothingTransformation;

                AffineTransform cloud1Transformation;
                AffineTransform cloud2Transformation;
                AffineTransform cloud3Transformation;

                // AffineTransform for Accumulation
                AffineTransform star1Transformation = new AffineTransform();
                AffineTransform star2Transformation = new AffineTransform();
                AffineTransform star3Transformation = new AffineTransform();

                for (int i=0; i < steps ; i++) {
                    if (i == 125) {
                        double[] tempGloveMatrix = initialGloveMatrix;
                        initialGloveMatrix = finalGloveMatrix;
                        finalGloveMatrix = tempGloveMatrix;

                        double[] tempGloveShineMatrix = initialGloveShineMatrix;
                        initialGloveShineMatrix = finalGloveShineMatrix;
                        finalGloveShineMatrix = tempGloveShineMatrix;

                        double[] tempLeftSleeveMatrix = initialLeftSleeveMatrix;
                        initialLeftSleeveMatrix = finalLeftSleeveMatrix;
                        finalLeftSleeveMatrix = tempLeftSleeveMatrix;

                        double[] tempLeftSleeveOutlineMatrix = initialLeftSleeveOutlineMatrix;
                        initialLeftSleeveOutlineMatrix = finalLeftSleeveOutlineMatrix;
                        finalLeftSleeveOutlineMatrix = tempLeftSleeveOutlineMatrix;

                        double[] tempFeatherMatrix = initialFeatherMatrix;
                        initialFeatherMatrix = finalFeatherMatrix;
                        finalFeatherMatrix = tempFeatherMatrix;

                        double[] tempHair1Matrix = initialHair1Matrix;
                        initialHair1Matrix = finalHair1Matrix;
                        finalHair1Matrix = tempHair1Matrix;

                        double[] tempHair2Matrix = initialHair2Matrix;
                        initialHair2Matrix = finalHair2Matrix;
                        finalHair2Matrix = tempHair2Matrix;

                        double[] tempHair3Matrix = initialHair3Matrix;
                        initialHair3Matrix = finalHair3Matrix;
                        finalHair3Matrix = tempHair3Matrix;

                        double[] tempHair4Matrix = initialHair4Matrix;
                        initialHair4Matrix = finalHair4Matrix;
                        finalHair4Matrix = tempHair4Matrix;

                        double[] tempHair5Matrix = initialHair5Matrix;
                        initialHair5Matrix = finalHair5Matrix;
                        finalHair5Matrix = tempHair5Matrix;

                        double[] tempHair6Matrix = initialHair6Matrix;
                        initialHair6Matrix = finalHair6Matrix;
                        finalHair6Matrix = tempHair6Matrix;

                        double[] tempMainClothingMatrix = initialMainClothingMatrix;
                        initialMainClothingMatrix = finalMainClothingMatrix;
                        finalMainClothingMatrix = tempMainClothingMatrix;

                        double[] tempMainClothingCloverMatrix = initialMainClothingCloverMatrix;
                        initialMainClothingCloverMatrix = finalMainClothingCloverMatrix;
                        finalMainClothingCloverMatrix = tempMainClothingCloverMatrix;

                        double[] tempWhiteSkirtMatrix = initialWhiteSkirtMatrix;
                        initialWhiteSkirtMatrix = finalWhiteSkirtMatrix;
                        finalWhiteSkirtMatrix = tempWhiteSkirtMatrix;

                        double[] tempWhiteSkirtMinorDetailMatrix = initialWhiteSkirtMinorDetailMatrix;
                        initialWhiteSkirtMinorDetailMatrix = finalWhiteSkirtMinorDetailMatrix;
                        finalWhiteSkirtMinorDetailMatrix = tempWhiteSkirtMinorDetailMatrix;

                        double[] tempInnerClothingMatrix = initialInnerClothingMatrix;
                        initialInnerClothingMatrix = finalInnerClothingMatrix;
                        finalInnerClothingMatrix = tempInnerClothingMatrix;

                        double[] tempCloud1Matrix = initialCloud1Matrix;
                        initialCloud1Matrix = finalCloud1Matrix;
                        finalCloud1Matrix = tempCloud1Matrix;

                        double[] tempCloud2Matrix = initialCloud2Matrix;
                        initialCloud2Matrix = finalCloud2Matrix;
                        finalCloud2Matrix = tempCloud2Matrix;

                        double[] tempCloud3Matrix = initialCloud3Matrix;
                        initialCloud3Matrix = finalCloud3Matrix;
                        finalCloud3Matrix = tempCloud3Matrix;

                        double[] tempScarfMatrix = initialScarfMatrix;
                        initialScarfMatrix = finalScarfMatrix;
                        finalScarfMatrix = tempScarfMatrix;

                        double[] tempScarfTailMatrix = initialScarfTailMatrix;
                        initialScarfTailMatrix = finalScarfTailMatrix;
                        finalScarfTailMatrix = tempScarfTailMatrix;

                        //Computation of the i-th convex combination.
                        gloveTransformation = new AffineTransform(convexCombination(finalGloveMatrix,initialGloveMatrix,i/ (double) steps));
                        gloveShineTransformation = new AffineTransform(convexCombination(finalGloveShineMatrix,initialGloveShineMatrix,i/ (double) steps));
                        leftSleeveTransformation = new AffineTransform(convexCombination(finalLeftSleeveMatrix,initialLeftSleeveMatrix,i/ (double) steps));
                        leftSleeveOutlineTransformation = new AffineTransform(convexCombination(finalLeftSleeveOutlineMatrix, initialLeftSleeveOutlineMatrix,i/ (double) steps));
                        featherTransformation = new AffineTransform(convexCombination(finalFeatherMatrix,initialFeatherMatrix,i/ (double) steps));
                        hair1Transformation = new AffineTransform(convexCombination(finalHair1Matrix,initialHair1Matrix,i/ (double) steps));
                        hair2Transformation = new AffineTransform(convexCombination(finalHair2Matrix,initialHair2Matrix,i/ (double) steps));
                        hair3Transformation = new AffineTransform(convexCombination(finalHair3Matrix,initialHair3Matrix,i/ (double) steps));
                        hair4Transformation = new AffineTransform(convexCombination(finalHair4Matrix,initialHair4Matrix,i/ (double) steps));
                        hair5Transformation = new AffineTransform(convexCombination(finalHair5Matrix,initialHair5Matrix,i/ (double) steps));
                        hair6Transformation = new AffineTransform(convexCombination(finalHair6Matrix,initialHair6Matrix,i/ (double) steps));

                        scarfTransformation = new AffineTransform(convexCombination(finalScarfMatrix, initialScarfMatrix, i/(double) steps));
                        scarfTailTransformation = new AffineTransform(convexCombination(finalScarfTailMatrix, initialScarfTailMatrix, i/(double) steps));

                        cloud1Transformation = new AffineTransform(convexCombination(finalCloud1Matrix, initialCloud1Matrix, i/(double) steps));
                        cloud2Transformation = new AffineTransform(convexCombination(finalCloud2Matrix, initialCloud2Matrix, i/(double) steps));
                        cloud3Transformation = new AffineTransform(convexCombination(finalCloud3Matrix, initialCloud3Matrix, i/(double) steps));

                        mainClothingTransformation = new AffineTransform(convexCombination(finalMainClothingMatrix, initialMainClothingMatrix, i/ (double) steps));
                        mainClothingCloverTransformation = new AffineTransform(convexCombination(finalMainClothingCloverMatrix, initialMainClothingCloverMatrix, i/ (double) steps));
                        whiteSkirtTransformation = new AffineTransform(convexCombination(finalWhiteSkirtMatrix, initialWhiteSkirtMatrix, i/ (double) steps));
                        whiteSkirtMinorDetailTransformation = new AffineTransform(convexCombination(finalWhiteSkirtMinorDetailMatrix, initialWhiteSkirtMinorDetailMatrix, i/ (double) steps));
                        innerClothingTransformation = new AffineTransform(convexCombination(finalInnerClothingMatrix, initialInnerClothingMatrix, i/ (double) steps));
                    } else {
                        //Computation of the i-th convex combination.
                        gloveTransformation = new AffineTransform(convexCombination(initialGloveMatrix,finalGloveMatrix,i/ (double) steps));
                        gloveShineTransformation = new AffineTransform(convexCombination(initialGloveShineMatrix,finalGloveShineMatrix,i/ (double) steps));
                        leftSleeveTransformation = new AffineTransform(convexCombination(initialLeftSleeveMatrix,finalLeftSleeveMatrix,i/ (double) steps));
                        leftSleeveOutlineTransformation = new AffineTransform(convexCombination(initialLeftSleeveOutlineMatrix, finalLeftSleeveOutlineMatrix,i/ (double) steps));
                        featherTransformation = new AffineTransform(convexCombination(initialFeatherMatrix,finalFeatherMatrix,i/ (double) steps));
                        hair1Transformation = new AffineTransform(convexCombination(initialHair1Matrix, finalHair1Matrix,i/ (double) steps));
                        hair2Transformation = new AffineTransform(convexCombination(initialHair2Matrix,finalHair2Matrix,i/ (double) steps));
                        hair3Transformation = new AffineTransform(convexCombination(initialHair3Matrix,finalHair3Matrix,i/ (double) steps));
                        hair4Transformation = new AffineTransform(convexCombination(initialHair4Matrix, finalHair4Matrix,i/ (double) steps));
                        hair5Transformation = new AffineTransform(convexCombination(initialHair5Matrix, finalHair5Matrix,i/ (double) steps));
                        hair6Transformation = new AffineTransform(convexCombination(initialHair6Matrix,finalHair6Matrix,i/ (double) steps));

                        scarfTransformation = new AffineTransform(convexCombination(initialScarfMatrix, finalScarfMatrix, i/(double) steps));
                        scarfTailTransformation = new AffineTransform(convexCombination(initialScarfTailMatrix, finalScarfTailMatrix, i/(double) steps));

                        cloud1Transformation = new AffineTransform(convexCombination(initialCloud1Matrix, finalCloud1Matrix, i/(steps + 5.0)));
                        cloud2Transformation = new AffineTransform(convexCombination(initialCloud2Matrix, finalCloud2Matrix, i/(steps + 5.0)));
                        cloud3Transformation = new AffineTransform(convexCombination(initialCloud3Matrix, finalCloud3Matrix, i/(steps + 5.0)));

                        mainClothingTransformation = new AffineTransform(convexCombination(initialMainClothingMatrix, finalMainClothingMatrix, i/ (double) steps));
                        mainClothingCloverTransformation = new AffineTransform(convexCombination(initialMainClothingCloverMatrix, finalMainClothingCloverMatrix, i/ (double) steps));
                        whiteSkirtTransformation = new AffineTransform(convexCombination(initialWhiteSkirtMatrix, finalWhiteSkirtMatrix, i/ (double) steps));
                        whiteSkirtMinorDetailTransformation = new AffineTransform(convexCombination(initialWhiteSkirtMinorDetailMatrix, finalWhiteSkirtMinorDetailMatrix, i/ (double) steps));
                        innerClothingTransformation = new AffineTransform(convexCombination(initialInnerClothingMatrix, finalInnerClothingMatrix, i/ (double) steps));
                    }

                    star1Transformation.setTransform(accumulatedRotationStar1);
                    star2Transformation.setTransform(accumulatedRotationStar2);
                    star3Transformation.setTransform(accumulatedRotationStar3);

                    //Generate the intermediate shapes.
                    gloveAnimation = gloveTransformation.createTransformedShape(glove);
                    gloveShineAnimation = gloveShineTransformation.createTransformedShape(gloveShine);

                    leftSleeveAnimation = leftSleeveTransformation.createTransformedShape(leftSleeve);
                    leftSleeveOutlineAnimation = leftSleeveOutlineTransformation.createTransformedShape(leftSleeveOutline);

                    star1Animation = star1Transformation.createTransformedShape(star1);
                    star2Animation = star2Transformation.createTransformedShape(star2);
                    star3Animation = star3Transformation.createTransformedShape(star3);

                    featherAnimation = featherTransformation.createTransformedShape(feather);

                    scarfAnimation = scarfTransformation.createTransformedShape(scarfOutline);
                    scarfDetailAnimation = scarfTransformation.createTransformedShape(scarfDetail);
                    scarfMinorDetailAnimation = scarfTransformation.createTransformedShape(scarfMinorDetail);
                    scarfTailAnimation = scarfTailTransformation.createTransformedShape(scarfTail);

                    hair1Animation = hair1Transformation.createTransformedShape(hair1);
                    hair2Animation = hair2Transformation.createTransformedShape(hair2);
                    hair3Animation = hair3Transformation.createTransformedShape(hair3);
                    hair4Animation = hair4Transformation.createTransformedShape(hair4);
                    hair5Animation = hair5Transformation.createTransformedShape(hair5);
                    hair6Animation = hair6Transformation.createTransformedShape(hair6);

                    cloud1Animation = cloud1Transformation.createTransformedShape(cloud1);
                    cloud2Animation = cloud2Transformation.createTransformedShape(cloud2);
                    cloud3Animation = cloud3Transformation.createTransformedShape(cloud3);

                    mainClothingAnimation = mainClothingTransformation.createTransformedShape(mainClothing);
                    mainClothingCloverAnimation = mainClothingCloverTransformation.createTransformedShape(mainClothingClover);
                    whiteSkirtAnimation = whiteSkirtTransformation.createTransformedShape(whiteSkirt);
                    whiteSkirtMinorDetailAnimation = whiteSkirtMinorDetailTransformation.createTransformedShape(whiteSkirtMinorDetail);
                    innerClothingAnimation = innerClothingTransformation.createTransformedShape(innerClothing);

                    //Wait a bit before the next image (frame) is drawn.
                    sustain(5);

                    //Clear the whole window.
                    clearWindow(g2d);

                    // Drawing
                    // Background Image of Klee
                    g2d.drawImage(backgroundImage, 0, 0, null);

                    // Explosion
                    g2d.drawImage(explosion, 0, 0, null);

                    // Clouds
                    draw(g2d, Color.WHITE, cloud1Animation, cloudOutline, 10.0f);
                    draw(g2d, Color.WHITE, cloud2Animation, cloudOutline, 10.0f);
                    draw(g2d, Color.WHITE, cloud3Animation, cloudOutline, 10.0f);

                    // Star
                    draw(g2d, star1Animation, Color.WHITE, 2.0f, false);
                    draw(g2d, star2Animation, Color.WHITE, 2.0f, false);
                    draw(g2d, star3Animation, Color.WHITE, 2.0f, false);

                    // Dodoco
                    draw(g2d, dodocoOutline, dodocoColor, 2.0f, false);
                    draw(g2d, dodocoDetail, dodocoDetailColor, 2.0f, false);
                    draw(g2d, dodocoDetailColor, dodocoBeltDetail, Color.BLACK, 1.0f);
                    draw(g2d, Color.WHITE, dodocoEye, Color.BLACK, 2.0f);
                    draw(g2d, dodocoMouth, Color.BLACK, 1.0f, true);
                    draw(g2d, dodocoPetalColor, dodocoPetal, Color.BLACK, 2.0f);
                    draw(g2d, dodocoStem, dodocoStemColor, 2.0f, false);
                    draw(g2d, dodocoOutline, Color.BLACK, 2.0f, true);
                    draw(g2d, dodocoMinorDetail, Color.BLACK, 1.5f, true);
                    draw(g2d, dodocoBlush, new Color(156, 126, 169), 1.5f, false);

                    // Bunny
                    draw(g2d, Color.WHITE, bunnyOutline, Color.BLACK, 2.0f);
                    draw(g2d, bunnyEarDetail, new Color(230, 168, 136), 1.5f, false);

                    draw(g2d, bunnyEyeLeft, Color.BLACK, 2.0f, true);
                    draw(g2d, bunnyEyeRight, Color.BLACK, 2.0f, true);
                    draw(g2d, bunnyMouth, Color.BLACK, 1.5f, true);

                    // Foot
                    draw(g2d, skirtColor, foot, Color.BLACK, 2.0f);

                    // Skirt
                    draw(g2d, skirtColor, whiteSkirtAnimation, Color.BLACK, 2.0f);
                    draw(g2d, whiteSkirtMinorDetailAnimation, new Color(189, 176, 168, 100), 2.25f, true);

                    // Main Clothing
                    draw(g2d, clothingColor, mainClothingAnimation, Color.BLACK, 4.0f);
                    draw(g2d, mainClothingCloverAnimation, cloverColor,2.0f, false);
                    draw(g2d, leftSleeveAnimation, clothingColor, 2.0f, false);
                    draw(g2d, leftSleeveOutlineAnimation, Color.BLACK, 2.0f, true);

                    // Inner Clothing
                    draw(g2d, Color.WHITE, innerClothingAnimation, Color.BLACK, 2.0f);

                    // Scarf
                    draw(g2d, scarfColor, scarfAnimation, Color.BLACK, 2.0f);
                    draw(g2d, scarfDetailAnimation, Color.BLACK, 2.0f, true);
                    draw(g2d, scarfMinorDetailAnimation, Color.BLACK, 1.25f, true);
                    draw(g2d, scarfColor, scarfTailAnimation, Color.BLACK, 2.0f);

                    // Right Glove
                    // Original value of stroke is 2.0f and still stc
                    draw(g2d, cuffColor, rightCuff, Color.BLACK, 3.0f);
                    draw(g2d, rightGloveColor, rightWrist, Color.BLACK, 2.0f);
                    draw(g2d, gloveColor, rightGlove, Color.BLACK, 1.0f);
                    draw(g2d, gapBetweenFinger, Color.BLACK, 2.0f, true);

                    // Face/Skin
                    draw(g2d, face, skinColor, 1.25f, false);

                    // Feather
                    draw(g2d, featherColor, featherAnimation, Color.BLACK, 2.0f);

                    // Mouth
                    draw(g2d, mouthColor, mouth, Color.BLACK, 2.0f);

                    // Blush Left Cheek
                    draw(g2d, blushColor, blush1, new Color(0,0,0,0), 0.0f);
                    draw(g2d, blushDetail1, blushDetailColor, 1.5f, true);

                    // Blush Right Cheek
                    draw(g2d, blushColor, blush2, new Color(0,0,0,0), 0.0f);
                    draw(g2d, blushDetail2, blushDetailColor, 1.5f, true);

                    // Placed after mouth so that mouth fill will not overlap the outline of the face
                    draw(g2d, face, Color.BLACK, 2.0f, true);

                    // Hat
                    draw(g2d, hatColor, hat, Color.BLACK, 2.0f);
                    draw(g2d, cloverColor, hatDetail, Color.BLACK, 1.5f);
                    draw(g2d, hatAccessoryOneColor, hatAccessoryOne, Color.BLACK, 2.0f);
                    draw(g2d, hatAccessoryTwoColor, hatAccessoryTwo, Color.BLACK, 2.0f);
                    draw(g2d, cloverColor, hatAccessoryDetail, Color.BLACK, 1.5f);

                    // Mouth
                    draw(g2d, Color.WHITE, teeth, Color.BLACK, 2.0f);

                    // Left Ear
                    draw(g2d, earColor, earLeft, Color.BLACK, 2.0f);

                    // Right Ear
                    draw(g2d, earRight, earColor, 2.0f, false);
                    draw(g2d, earblushRight, blushColor, 2.0f, false);
                    draw(g2d, earRight, Color.BLACK, 2.0f, true);

                    // Left Eye
                    draw(g2d, eyeLeft, eyeOneColor, 2.0f, false);
                    draw(g2d, eyeDetail, eyeDetailColor, 2.0f, false);
                    // Overlay the outline of the left eye
                    draw(g2d, eyeLeft, Color.BLACK, 2.0f, true);
                    draw(g2d, eyelashLeft, Color.BLACK, 2.0f, false);
                    draw(g2d, eyeMinorDetail, Color.BLACK, 2.0f, true);

                    // Right Eye
                    draw(g2d, eyeRight, eyeOneColor, 2.0f, false);
                    draw(g2d, eyeDetailRight, eyeDetailColor, 2.0f, false);
                    // Overlay the outline of the right eye
                    draw(g2d, eyeRight, Color.BLACK, 2.0f, true);
                    draw(g2d, eyelashRight, Color.BLACK, 2.0f, false);
                    draw(g2d, eyeMinorDetailReflectionRight, Color.BLACK, 2.0f, true);

                    // Hair
                    draw(g2d, hairColor, hair1Animation, Color.BLACK, 2.0f);

                    draw(g2d, hairColor, hair, Color.BLACK, 2.0f);
                    draw(g2d, hairColor, hair2Animation, Color.BLACK, 2.0f);
                    draw(g2d, hairColor, hair3Animation, Color.BLACK, 2.0f);
                    draw(g2d, hairColor, hair4Animation, Color.BLACK, 2.0f);
                    draw(g2d, hairColor, hair5Animation, Color.BLACK, 2.0f);
                    draw(g2d, hairColor, hair6Animation, Color.BLACK, 2.0f);
                    draw(g2d, hair7, hairColor, 2.0f, false);

                    // Hat Cover
                    draw(g2d, hatCoverColor, hatCover, Color.BLACK, 1.5f);

                    // Left Glove
                    draw(g2d, gloveColor, gloveAnimation, Color.BLACK, 2.0f);
                    draw(g2d, gloveShineColor, gloveShineAnimation, Color.BLACK, 2.0f);

                    if (alpha > 0) {
                        draw(g2d, background, new Color(0, 0,0,alpha), 2.0f, false);
                        alpha = alpha - 3;
                    }

                    // Accumulation Technique
                    accumulatedRotationStar1.preConcatenate(singleRotationStar1);
                    accumulatedRotationStar2.preConcatenate(singleRotationStar2);
                    accumulatedRotationStar3.preConcatenate(singleRotationStar3);

                    // Reference: https://zetcode.com/javagames/animation/
                    // This smoothens the animation without this then it will stutter
                    Toolkit.getDefaultToolkit().sync();
                }

                long endTime = System.currentTimeMillis();

                totalTime = totalTime + (endTime - startTime);
                System.out.println("Total Run Time: " + totalTime + " milliseconds");

                if (totalTime >= 12000) {
                    System.out.println("Total Run Time Reset to 0");
                    System.out.println("==========================");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Responsible for interpolation
    public static double[] convexCombination(double[] a, double[] b, double alpha) {
        double[] result = new double[a.length];

        for (int i=0; i<result.length; i++) {
            result[i] = (1-alpha)*a[i] + alpha*b[i];
        }

        return(result);
    }
    
    public void clearWindow(Graphics2D g) {
        g.setPaint(Color.white);
        g.fill(new Rectangle(0,0,windowWidth,windowWidth));
        g.setPaint(Color.black);
    }
    
    public void sustain(long t) {
          long finish = (new Date()).getTime() + t;
          while( (new Date()).getTime() < finish ){
              // sustain the frames
          }
    }
    
    public static void main(String[] argv) {
        int width = 900;
        int height = 506;
        FinalsProjectHizon frame = new FinalsProjectHizon(width,height);
        frame.setTitle("Final Project - Hizon");
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        // Prevent resizing the frame
        frame.setResizable(false);
        frame.setSize(width,height);
        frame.setVisible(true);
    }
}
