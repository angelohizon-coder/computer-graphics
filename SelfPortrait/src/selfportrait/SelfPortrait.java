/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfportrait;

import java.awt.geom.*;
import java.awt.*;

/**
 *
 * @author Angelo
 */
public class SelfPortrait extends Frame {

    public void paint(Graphics g) {
        background(g);
        name(g);
        shirt(g);
        whiteSkin(g);
        hairColorLight(g);
        hairColor(g);
        hairColorHighlights(g);
        exterior(g);
        hair(g);
        chin(g);
        lightSkin(g);
        skin(g);
        lips(g);
        ear(g);
        glasses(g);
        eyebrows(g);
        nose(g);
    }
    
    public void name(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 15));
        g2d.drawString("Angelo Louis L. Hizon",50,75);
        g2d.drawString("2019-132083",50,100);
    }
    
    public void background(Graphics g) {
         Graphics2D g2d = (Graphics2D) g;
        float[] hsb = new float[3];
        hsb = Color.RGBtoHSB(216,212,211, null);
        float hue, saturation, bright;
        hue = hsb[0];
        saturation = hsb[1];
        bright = hsb[2];
        g2d.setColor(Color.getHSBColor(hue, saturation, bright));
        
        Rectangle2D.Double b1 = new Rectangle2D.Double(0, 700, 1000, 1000);
        g2d.fill(b1);
    }
    
    public void shirt(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        float[] hsb = new float[3];
        hsb = Color.RGBtoHSB(246,241,232, null);
        float hue, saturation, bright;
        hue = hsb[0];
        saturation = hsb[1];
        bright = hsb[2];
        g2d.setColor(Color.getHSBColor(hue, saturation, bright));
        
        Rectangle2D.Double sh1 = new Rectangle2D.Double(70, 700, 240, 130);
        g2d.fill(sh1);
        
        Rectangle2D.Double sh2 = new Rectangle2D.Double(80, 680, 30, 30);
        g2d.fill(sh2);
        
        Rectangle2D.Double sh3 = new Rectangle2D.Double(50, 720, 30, 110);
        g2d.fill(sh3);
        
        Rectangle2D.Double sh4 = new Rectangle2D.Double(20, 760, 30, 70);
        g2d.fill(sh4);
        
        float[] hsb1 = new float[3];
        hsb1 = Color.RGBtoHSB(231,219,195, null);
        float hue1, saturation1, bright1;
        hue1 = hsb1[0];
        saturation1 = hsb1[1];
        bright1 = hsb1[2];
        g2d.setColor(Color.getHSBColor(hue1, saturation1, bright1));
        
        Rectangle2D.Double sh5 = new Rectangle2D.Double(80, 680, 70, 30);
        g2d.fill(sh5);
        
        Rectangle2D.Double sh6 = new Rectangle2D.Double(80, 690, 70, 30);
        g2d.fill(sh6);
        
        Rectangle2D.Double sh7 = new Rectangle2D.Double(90, 700, 70, 30);
        g2d.fill(sh7);
        
        Rectangle2D.Double sh8 = new Rectangle2D.Double(90, 710, 70, 30);
        g2d.fill(sh8);
        
        Rectangle2D.Double sh9 = new Rectangle2D.Double(110, 720, 70, 30);
        g2d.fill(sh9);
        
        Rectangle2D.Double sh10 = new Rectangle2D.Double(120, 730, 70, 30);
        g2d.fill(sh10);
        
        Rectangle2D.Double sh11 = new Rectangle2D.Double(120, 740, 70, 30);
        g2d.fill(sh11);
        
        Rectangle2D.Double sh12 = new Rectangle2D.Double(140, 750, 70, 30);
        g2d.fill(sh12);
        
        Rectangle2D.Double sh13 = new Rectangle2D.Double(150, 770, 70, 30);
        g2d.fill(sh13);
        
        Rectangle2D.Double sh14 = new Rectangle2D.Double(150, 780, 70, 30);
        g2d.fill(sh14);
        
        Rectangle2D.Double sh15 = new Rectangle2D.Double(160, 800, 70, 30);
        g2d.fill(sh15);
    }
    
    public void hairColorHighlights(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        float[] hsb = new float[3];
        hsb = Color.RGBtoHSB(166,160,153, null);
        float hue, saturation, bright;
        hue = hsb[0];
        saturation = hsb[1];
        bright = hsb[2];
        g2d.setColor(Color.getHSBColor(hue, saturation, bright));
        
        Rectangle2D.Double hch1 = new Rectangle2D.Double(30, 360, 10, 10);
        g2d.fill(hch1);
        
        Rectangle2D.Double hch2 = new Rectangle2D.Double(40, 350, 10, 10);
        g2d.fill(hch2);
        
        Rectangle2D.Double hch3 = new Rectangle2D.Double(30, 420, 10, 10);
        g2d.fill(hch3);
        
        Rectangle2D.Double hch4 = new Rectangle2D.Double(50, 450, 10, 10);
        g2d.fill(hch4);
        
        Rectangle2D.Double hch5 = new Rectangle2D.Double(80, 360, 10, 20);
        g2d.fill(hch5);
        
        Rectangle2D.Double hch6 = new Rectangle2D.Double(80, 360, 20, 10);
        g2d.fill(hch6);
        
        Rectangle2D.Double hch7 = new Rectangle2D.Double(90, 340, 20, 20);
        g2d.fill(hch7);
        
        Rectangle2D.Double hch8 = new Rectangle2D.Double(100, 330, 20, 10);
        g2d.fill(hch8);
        
        Rectangle2D.Double hch9 = new Rectangle2D.Double(120, 340, 20, 20);
        g2d.fill(hch9);
        
        Rectangle2D.Double hch10 = new Rectangle2D.Double(140, 340, 10, 10);
        g2d.fill(hch10);
        
        Rectangle2D.Double hch11 = new Rectangle2D.Double(160, 330, 10, 20);
        g2d.fill(hch11);
        
        Rectangle2D.Double hch12 = new Rectangle2D.Double(200, 320, 10, 10);
        g2d.fill(hch12);
        
        Rectangle2D.Double hch13 = new Rectangle2D.Double(210, 330, 10, 10);
        g2d.fill(hch13);
        
        Rectangle2D.Double hch14 = new Rectangle2D.Double(250, 330, 10, 10);
        g2d.fill(hch14);
        
        Rectangle2D.Double hch15 = new Rectangle2D.Double(250, 290, 10, 10);
        g2d.fill(hch15);
        
        Rectangle2D.Double hch16 = new Rectangle2D.Double(310, 260, 10, 10);
        g2d.fill(hch16);
        
        Rectangle2D.Double hch17 = new Rectangle2D.Double(330, 260, 20, 20);
        g2d.fill(hch17);
        
        Rectangle2D.Double hch18 = new Rectangle2D.Double(350, 270, 10, 10);
        g2d.fill(hch18);
        
        Rectangle2D.Double hch19 = new Rectangle2D.Double(320, 270, 20, 40);
        g2d.fill(hch19);
        
        Rectangle2D.Double hch20 = new Rectangle2D.Double(300, 290, 20, 10);
        g2d.fill(hch20);
        
        Rectangle2D.Double hch21 = new Rectangle2D.Double(340, 300, 10, 10);
        g2d.fill(hch21);
    }
    
    public void exterior(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        // Exterior
        Rectangle2D.Double r1 = new Rectangle2D.Double(20, 760, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r1);
        
        Rectangle2D.Double r2 = new Rectangle2D.Double(30, 750, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r2);
       
        Rectangle2D.Double r3 = new Rectangle2D.Double(40, 750, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r3);
        
        Rectangle2D.Double r4 = new Rectangle2D.Double(50, 740, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r4);
        
        Rectangle2D.Double r5 = new Rectangle2D.Double(50, 730, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r5);
        
        Rectangle2D.Double r6 = new Rectangle2D.Double(50, 720, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r6);
        
        Rectangle2D.Double r7 = new Rectangle2D.Double(60, 710, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r7);
        
        Rectangle2D.Double r8 = new Rectangle2D.Double(70, 700, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r8);
        
        Rectangle2D.Double r9 = new Rectangle2D.Double(70, 690, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r9);
        
        Rectangle2D.Double r10 = new Rectangle2D.Double(80, 680, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r10);
        
        Rectangle2D.Double r11 = new Rectangle2D.Double(90, 670, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r11);
        
        Rectangle2D.Double r12 = new Rectangle2D.Double(100, 660, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r12);
        
        Rectangle2D.Double r13 = new Rectangle2D.Double(100, 670, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r13);
        
        Rectangle2D.Double r14 = new Rectangle2D.Double(100, 660, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r14);
        
        Rectangle2D.Double r15 = new Rectangle2D.Double(100, 650, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r15);
        
        Rectangle2D.Double r16 = new Rectangle2D.Double(100, 640, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r16);
        
        Rectangle2D.Double r17 = new Rectangle2D.Double(100, 630, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r17);
        
        Rectangle2D.Double r18 = new Rectangle2D.Double(100, 620, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r18);
        
        Rectangle2D.Double r19 = new Rectangle2D.Double(90, 610, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r19);
        
        Rectangle2D.Double r20 = new Rectangle2D.Double(80, 600, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r20);
        
        Rectangle2D.Double r21 = new Rectangle2D.Double(80, 590, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r21);
        
        Rectangle2D.Double r22 = new Rectangle2D.Double(70, 580, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r22);
        
        Rectangle2D.Double r23 = new Rectangle2D.Double(70, 570, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r23);
        
        Rectangle2D.Double r24 = new Rectangle2D.Double(70, 560, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r24);
        
        Rectangle2D.Double r25 = new Rectangle2D.Double(70, 550, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r25);
        
        Rectangle2D.Double r26 = new Rectangle2D.Double(70, 540, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r26);
        
        Rectangle2D.Double r27 = new Rectangle2D.Double(70, 530, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r27);
        
        Rectangle2D.Double r28 = new Rectangle2D.Double(70, 520, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r28);
        
        Rectangle2D.Double r29 = new Rectangle2D.Double(60, 510, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r29);
        
        Rectangle2D.Double r30 = new Rectangle2D.Double(60, 500, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r30);
        
        Rectangle2D.Double r31 = new Rectangle2D.Double(60, 490, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r31);
        
        Rectangle2D.Double r32 = new Rectangle2D.Double(50, 480, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r32);
        
        Rectangle2D.Double r33 = new Rectangle2D.Double(50, 470, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r33);
        
        Rectangle2D.Double r34 = new Rectangle2D.Double(50, 460, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r34);
        
        Rectangle2D.Double r35 = new Rectangle2D.Double(40, 450, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r35);
        
        Rectangle2D.Double r36 = new Rectangle2D.Double(30, 440, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r36);
        
        Rectangle2D.Double r37 = new Rectangle2D.Double(30, 430, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r37);
        
        Rectangle2D.Double r38 = new Rectangle2D.Double(20, 420, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r38);
        
        Rectangle2D.Double r39 = new Rectangle2D.Double(20, 410, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r39);
        
        Rectangle2D.Double r40 = new Rectangle2D.Double(20, 400, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r40);
        
        Rectangle2D.Double r41 = new Rectangle2D.Double(20, 390, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r41);
        
        Rectangle2D.Double r42 = new Rectangle2D.Double(20, 380, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r42);
        
        Rectangle2D.Double r43 = new Rectangle2D.Double(20, 370, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r43);
        
        Rectangle2D.Double r44 = new Rectangle2D.Double(20, 360, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r44);
        
        Rectangle2D.Double r45 = new Rectangle2D.Double(30, 350, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r45);
        
        Rectangle2D.Double r46 = new Rectangle2D.Double(40, 340, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r46);
        
        Rectangle2D.Double r47 = new Rectangle2D.Double(50, 330, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r47);
        
        Rectangle2D.Double r48 = new Rectangle2D.Double(60, 320, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r48);
        
        Rectangle2D.Double r49 = new Rectangle2D.Double(70, 310, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r49);
        
        Rectangle2D.Double r50 = new Rectangle2D.Double(80, 300, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r50);
        
        Rectangle2D.Double r51 = new Rectangle2D.Double(90, 290, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r51);
        
        Rectangle2D.Double r52 = new Rectangle2D.Double(100, 280, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r52);
        
        Rectangle2D.Double r53 = new Rectangle2D.Double(100, 270, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r53);
        
        Rectangle2D.Double r54 = new Rectangle2D.Double(110, 260, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r54);
        
        Rectangle2D.Double r55 = new Rectangle2D.Double(120, 260, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r55);
        
        Rectangle2D.Double r56 = new Rectangle2D.Double(130, 250, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r56);
        
        Rectangle2D.Double r57 = new Rectangle2D.Double(140, 240, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r57);
        
        Rectangle2D.Double r58 = new Rectangle2D.Double(150, 240, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r58);
        
        Rectangle2D.Double r59 = new Rectangle2D.Double(160, 240, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r59);
        
        Rectangle2D.Double r60 = new Rectangle2D.Double(170, 230, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r60);
        
        Rectangle2D.Double r61 = new Rectangle2D.Double(180, 230, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r61);
        
        Rectangle2D.Double r62 = new Rectangle2D.Double(190, 230, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r62);
        
        Rectangle2D.Double r63 = new Rectangle2D.Double(200, 230, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r63);
        
        Rectangle2D.Double r64 = new Rectangle2D.Double(210, 230, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r64);
        
        Rectangle2D.Double r65 = new Rectangle2D.Double(220, 230, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r65);
        
        Rectangle2D.Double r66 = new Rectangle2D.Double(230, 240, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r66);
        
        Rectangle2D.Double r67 = new Rectangle2D.Double(240, 240, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r67);
        
        Rectangle2D.Double r68 = new Rectangle2D.Double(250, 250, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r68);
        
        Rectangle2D.Double r69 = new Rectangle2D.Double(260, 250, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r69);
        
        Rectangle2D.Double r70 = new Rectangle2D.Double(270, 250, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r70);
        
        Rectangle2D.Double r71 = new Rectangle2D.Double(280, 250, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r71);
        
        Rectangle2D.Double r72 = new Rectangle2D.Double(290, 240, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r72);
        
        Rectangle2D.Double r73 = new Rectangle2D.Double(300, 240, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r73);
        
        Rectangle2D.Double r74 = new Rectangle2D.Double(310, 250, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r74);
        
        Rectangle2D.Double r75 = new Rectangle2D.Double(320, 260, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r75);
        
        Rectangle2D.Double r76 = new Rectangle2D.Double(330, 250, 30, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r76);
        
        Rectangle2D.Double r77 = new Rectangle2D.Double(360, 240, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r77);
        
        Rectangle2D.Double r78 = new Rectangle2D.Double(370, 250, 10, 20);
        g2d.setColor(Color.BLACK);
        g2d.fill(r78);
        
        Rectangle2D.Double r79 = new Rectangle2D.Double(380, 270, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r79);
        
        Rectangle2D.Double r80 = new Rectangle2D.Double(390, 280, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r80);
        
        Rectangle2D.Double r81 = new Rectangle2D.Double(400, 290, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r81);
        
        Rectangle2D.Double r82 = new Rectangle2D.Double(410, 300, 10, 20);
        g2d.setColor(Color.BLACK);
        g2d.fill(r82);
        
        Rectangle2D.Double r83 = new Rectangle2D.Double(420, 320, 10, 20);
        g2d.setColor(Color.BLACK);
        g2d.fill(r83);
        
        Rectangle2D.Double r84 = new Rectangle2D.Double(430, 340, 10, 20);
        g2d.setColor(Color.BLACK);
        g2d.fill(r84);
        
        Rectangle2D.Double r85 = new Rectangle2D.Double(440, 360, 10, 30);
        g2d.setColor(Color.BLACK);
        g2d.fill(r85);
        
        Rectangle2D.Double r86 = new Rectangle2D.Double(450, 390, 10, 20);
        g2d.setColor(Color.BLACK);
        g2d.fill(r86);
        
        Rectangle2D.Double r87 = new Rectangle2D.Double(440, 410, 10, 30);
        g2d.setColor(Color.BLACK);
        g2d.fill(r87);
        
        Rectangle2D.Double r88 = new Rectangle2D.Double(430, 440, 10, 40);
        g2d.setColor(Color.BLACK);
        g2d.fill(r88);
        
        Rectangle2D.Double r89 = new Rectangle2D.Double(420, 480, 50, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r89);
        
        Rectangle2D.Double r90 = new Rectangle2D.Double(470, 490, 20, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r90);
        
        Rectangle2D.Double r91 = new Rectangle2D.Double(480, 500, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r91);
        
        Rectangle2D.Double r92 = new Rectangle2D.Double(470, 510, 10, 20);
        g2d.setColor(Color.BLACK);
        g2d.fill(r92);
        
        Rectangle2D.Double r93 = new Rectangle2D.Double(460, 530, 10, 20);
        g2d.setColor(Color.BLACK);
        g2d.fill(r93);
        
        Rectangle2D.Double r94 = new Rectangle2D.Double(450, 550, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r94);
        
        Rectangle2D.Double r95 = new Rectangle2D.Double(440, 560, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(r95);
        
        Rectangle2D.Double r96 = new Rectangle2D.Double(430, 570, 10, 50);
        g2d.setColor(Color.BLACK);
        g2d.fill(r96);
        
        Rectangle2D.Double r97 = new Rectangle2D.Double(420, 620, 10, 30);
        g2d.setColor(Color.BLACK);
        g2d.fill(r97);
        
        Rectangle2D.Double r98 = new Rectangle2D.Double(410, 650, 10, 30);
        g2d.setColor(Color.BLACK);
        g2d.fill(r98);
        
        Rectangle2D.Double r99 = new Rectangle2D.Double(400, 680, 10, 20);
        g2d.setColor(Color.BLACK);
        g2d.fill(r99);
        
        Rectangle2D.Double re1 = new Rectangle2D.Double(390, 700, 10, 20);
        g2d.setColor(Color.BLACK);
        g2d.fill(re1);
        
        Rectangle2D.Double re2 = new Rectangle2D.Double(380, 720, 10, 20);
        g2d.setColor(Color.BLACK);
        g2d.fill(re2);
        
        Rectangle2D.Double re3 = new Rectangle2D.Double(370, 740, 10, 20);
        g2d.setColor(Color.BLACK);
        g2d.fill(re3);
        
        Rectangle2D.Double re5 = new Rectangle2D.Double(360, 750, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(re5);
        
        Rectangle2D.Double re6 = new Rectangle2D.Double(350, 760, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.fill(re6);
        
        Rectangle2D.Double re7 = new Rectangle2D.Double(330, 770, 20, 10);
        g2d.fill(re7);
        
        Rectangle2D.Double re8 = new Rectangle2D.Double(320, 780, 10, 10);
        g2d.fill(re8);
        
        Rectangle2D.Double re9 = new Rectangle2D.Double(310, 790, 10, 40);
        g2d.fill(re9);
    }
    
    public void hair(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        float[] hsb = new float[3];
        hsb = Color.RGBtoHSB(56,30,29, null);
        float hue, saturation, bright;
        hue = hsb[0];
        saturation = hsb[1];
        bright = hsb[2];
        g2d.setColor(Color.getHSBColor(hue, saturation, bright));
        
        Rectangle2D.Double h1 = new Rectangle2D.Double(70, 490, 10, 30);
        g2d.fill(h1);
        
        Rectangle2D.Double h2 = new Rectangle2D.Double(80, 480, 10, 10);
        g2d.fill(h2);
        
        Rectangle2D.Double h3 = new Rectangle2D.Double(90, 490, 10, 10);
        g2d.fill(h3);
        
        Rectangle2D.Double h4 = new Rectangle2D.Double(100, 500, 10, 10);
        g2d.fill(h4);
        
        Rectangle2D.Double h5 = new Rectangle2D.Double(110, 510, 10, 20);
        g2d.fill(h5);
        
        Rectangle2D.Double h6 = new Rectangle2D.Double(120, 530, 10, 10);
        g2d.fill(h6);
        
        Rectangle2D.Double h7 = new Rectangle2D.Double(130, 500, 10, 30);
        g2d.fill(h7);
        
        Rectangle2D.Double h8 = new Rectangle2D.Double(140, 450, 10, 50);
        g2d.fill(h8);
        
        Rectangle2D.Double h9 = new Rectangle2D.Double(150, 430, 10, 20);
        g2d.fill(h9);
        
        Rectangle2D.Double h10 = new Rectangle2D.Double(160, 410, 10, 20);
        g2d.fill(h10);
        
        Rectangle2D.Double h11 = new Rectangle2D.Double(170, 400, 10, 10);
        g2d.fill(h11);
        
        Rectangle2D.Double h12 = new Rectangle2D.Double(180, 390, 30, 10);
        g2d.fill(h12);
        
        Rectangle2D.Double h13 = new Rectangle2D.Double(210, 400, 20, 10);
        g2d.fill(h13);
        
        Rectangle2D.Double h14 = new Rectangle2D.Double(230, 390, 10, 10);
        g2d.fill(h14);
        
        Rectangle2D.Double h15 = new Rectangle2D.Double(240, 370, 10, 20);
        g2d.fill(h15);
        
        Rectangle2D.Double h16 = new Rectangle2D.Double(250, 350, 10, 20);
        g2d.fill(h16);
        
        Rectangle2D.Double h17 = new Rectangle2D.Double(260, 350, 20, 10);
        g2d.fill(h17);
        
        Rectangle2D.Double h18 = new Rectangle2D.Double(280, 360, 30, 10);
        g2d.fill(h18);
        
        Rectangle2D.Double h19 = new Rectangle2D.Double(310, 370, 10, 10);
        g2d.fill(h19);
        
        Rectangle2D.Double h20 = new Rectangle2D.Double(320, 380, 10, 20);
        g2d.fill(h20);
        
        Rectangle2D.Double h21 = new Rectangle2D.Double(330, 400, 10, 10);
        g2d.fill(h21);
        
        Rectangle2D.Double h22 = new Rectangle2D.Double(340, 410, 10, 10);
        g2d.fill(h22);
        
        Rectangle2D.Double h23 = new Rectangle2D.Double(350, 420, 10, 10);
        g2d.fill(h23);
        
        Rectangle2D.Double h24 = new Rectangle2D.Double(360, 380, 10, 40);
        g2d.fill(h24);
        
        Rectangle2D.Double h25 = new Rectangle2D.Double(350, 380, 10, 10);
        g2d.fill(h25);
        
        Rectangle2D.Double h26 = new Rectangle2D.Double(370, 390, 10, 20);
        g2d.fill(h26);
        
        Rectangle2D.Double h27 = new Rectangle2D.Double(380, 410, 20, 10);
        g2d.fill(h27);
        
        Rectangle2D.Double h28 = new Rectangle2D.Double(400, 420, 30, 10);
        g2d.fill(h28);
        
        Rectangle2D.Double h29 = new Rectangle2D.Double(420, 430, 10, 20);
        g2d.fill(h29);
    }
    
    public void hairColor(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        float[] hsb = new float[3];
        hsb = Color.RGBtoHSB(37,35,37, null);
        float hue, saturation, bright;
        hue = hsb[0];
        saturation = hsb[1];
        bright = hsb[2];
        g2d.setColor(Color.getHSBColor(hue, saturation, bright));
        
        Rectangle2D.Double hc1 = new Rectangle2D.Double(50, 390, 90, 70);
        g2d.fill(hc1);
        
        Rectangle2D.Double hc2 = new Rectangle2D.Double(60, 460, 80, 70);
        g2d.fill(hc2);
        
        Rectangle2D.Double hc3 = new Rectangle2D.Double(30, 390, 30, 10);
        g2d.fill(hc3);
        
        Rectangle2D.Double hc4 = new Rectangle2D.Double(40, 370, 10, 20);
        g2d.fill(hc4);
        
        Rectangle2D.Double hc5 = new Rectangle2D.Double(60, 380, 100, 10);
        g2d.fill(hc5);
        
        Rectangle2D.Double hc6 = new Rectangle2D.Double(90, 370, 20, 10);
        g2d.fill(hc6);
        
        Rectangle2D.Double hc7 = new Rectangle2D.Double(120, 370, 10, 10);
        g2d.fill(hc7);
        
        Rectangle2D.Double hc8 = new Rectangle2D.Double(140, 370, 40, 10);
        g2d.fill(hc8);
        
        Rectangle2D.Double hc9 = new Rectangle2D.Double(160, 360, 20, 10);
        g2d.fill(hc9);
        
        Rectangle2D.Double hc10 = new Rectangle2D.Double(170, 350, 10, 10);
        g2d.fill(hc10);
        
        Rectangle2D.Double hc11 = new Rectangle2D.Double(140, 390, 10, 20);
        g2d.fill(hc11);
        
        Rectangle2D.Double hc12 = new Rectangle2D.Double(110, 270, 40, 10);
        g2d.fill(hc12);
        
        Rectangle2D.Double hc13 = new Rectangle2D.Double(120, 280, 30, 40);
        g2d.fill(hc13);
        
        Rectangle2D.Double hc14 = new Rectangle2D.Double(120, 320, 10, 10);
        g2d.fill(hc14);
        
        Rectangle2D.Double hc15 = new Rectangle2D.Double(140, 300, 20, 20);
        g2d.fill(hc15);
        
        Rectangle2D.Double hc16 = new Rectangle2D.Double(130, 260, 20, 10);
        g2d.fill(hc16);
        
        Rectangle2D.Double hc17 = new Rectangle2D.Double(170, 240, 30, 50);
        g2d.fill(hc17);
        
        Rectangle2D.Double hc18 = new Rectangle2D.Double(180, 260, 30, 50);
        g2d.fill(hc18);
        
        Rectangle2D.Double hc19 = new Rectangle2D.Double(180, 310, 10, 20);
        g2d.fill(hc19);
        
        Rectangle2D.Double hc20 = new Rectangle2D.Double(180, 320, 20, 10);
        g2d.fill(hc20);
        
        Rectangle2D.Double hc21 = new Rectangle2D.Double(190, 320, 10, 40);
        g2d.fill(hc21);
        
        Rectangle2D.Double hc22 = new Rectangle2D.Double(190, 340, 20, 10);
        g2d.fill(hc22);
        
        Rectangle2D.Double hc23 = new Rectangle2D.Double(210, 310, 10, 10);
        g2d.fill(hc23);
        
        Rectangle2D.Double hc24 = new Rectangle2D.Double(220, 320, 10, 20);
        g2d.fill(hc24);
        
        Rectangle2D.Double hc25 = new Rectangle2D.Double(230, 340, 10, 10);
        g2d.fill(hc25);
        
        Rectangle2D.Double hc26 = new Rectangle2D.Double(230, 270, 10, 20);
        g2d.fill(hc26);
        
        Rectangle2D.Double hc27 = new Rectangle2D.Double(260, 320, 10, 10);
        g2d.fill(hc27);
        
        Rectangle2D.Double hc28 = new Rectangle2D.Double(270, 330, 40, 10);
        g2d.fill(hc28);
        
        Rectangle2D.Double hc29 = new Rectangle2D.Double(300, 340, 20, 10);
        g2d.fill(hc29);
        
        Rectangle2D.Double hc30 = new Rectangle2D.Double(310, 350, 120, 10);
        g2d.fill(hc30);
        
        Rectangle2D.Double hc31 = new Rectangle2D.Double(330, 360, 100, 10);
        g2d.fill(hc31);
        
        Rectangle2D.Double hc32 = new Rectangle2D.Double(330, 330, 100, 10);
        g2d.fill(hc32);
        
        Rectangle2D.Double hc33 = new Rectangle2D.Double(340, 340, 90, 10);
        g2d.fill(hc33);
        
        Rectangle2D.Double hc34 = new Rectangle2D.Double(370, 310, 50, 20);
        g2d.fill(hc34);
        
        Rectangle2D.Double hc35 = new Rectangle2D.Double(400, 300, 10, 10);
        g2d.fill(hc35);
        
        Rectangle2D.Double hc36 = new Rectangle2D.Double(390, 290, 10, 10);
        g2d.fill(hc36);
        
        Rectangle2D.Double hc37 = new Rectangle2D.Double(410, 370, 30, 30);
        g2d.fill(hc37);
        
        Rectangle2D.Double hc38 = new Rectangle2D.Double(410, 390, 50, 20);
        g2d.fill(hc38);
        
        Rectangle2D.Double hc39 = new Rectangle2D.Double(420, 410, 20, 10);
        g2d.fill(hc39);
        
        Rectangle2D.Double hc40 = new Rectangle2D.Double(390, 370, 20, 20);
        g2d.fill(hc40);
        
        Rectangle2D.Double hc41 = new Rectangle2D.Double(400, 390, 20, 10);
        g2d.fill(hc41);
        
        Rectangle2D.Double hc42 = new Rectangle2D.Double(280, 250, 30, 30);
        g2d.fill(hc42);
    }
    
    public void hairColorLight(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        float[] hsb = new float[3];
        hsb = Color.RGBtoHSB(97,91,93, null);
        float hue, saturation, bright;
        hue = hsb[0];
        saturation = hsb[1];
        bright = hsb[2];
        g2d.setColor(Color.getHSBColor(hue, saturation, bright));
        
        Rectangle2D.Double hcl1 = new Rectangle2D.Double(50, 330, 100, 120);
        g2d.fill(hcl1);
        
        Rectangle2D.Double hcl2 = new Rectangle2D.Double(30, 350, 100, 100);
        g2d.fill(hcl2);
        
        Rectangle2D.Double hcl3 = new Rectangle2D.Double(100, 270, 290, 100);
        g2d.fill(hcl3);
        
        Rectangle2D.Double hcl4 = new Rectangle2D.Double(140, 240, 90, 30);
        g2d.fill(hcl4);
        
        Rectangle2D.Double hcl5 = new Rectangle2D.Double(200, 250, 120, 30);
        g2d.fill(hcl5);
        
        Rectangle2D.Double hcl6 = new Rectangle2D.Double(330, 250, 50, 20);
        g2d.fill(hcl6);
        
        Rectangle2D.Double hcl7 = new Rectangle2D.Double(330, 290, 70, 20);
        g2d.fill(hcl7);
        
        Rectangle2D.Double hcl8 = new Rectangle2D.Double(320, 370, 80, 30);
        g2d.fill(hcl8);
        
        Rectangle2D.Double hcl9 = new Rectangle2D.Double(340, 400, 20, 20);
        g2d.fill(hcl9);
        
        Rectangle2D.Double hcl10 = new Rectangle2D.Double(380, 400, 40, 20);
        g2d.fill(hcl10);
        
        Rectangle2D.Double hcl11 = new Rectangle2D.Double(430, 360, 10, 100);
        g2d.fill(hcl11);
        
        Rectangle2D.Double hcl12 = new Rectangle2D.Double(140, 360, 100, 40);
        g2d.fill(hcl12);
        
        Rectangle2D.Double hcl13 = new Rectangle2D.Double(150, 400, 20, 30);
        g2d.fill(hcl13);
        
        Rectangle2D.Double hcl14 = new Rectangle2D.Double(80, 300, 20, 30);
        g2d.fill(hcl14);
        
        Rectangle2D.Double hcl15 = new Rectangle2D.Double(70, 320, 10, 10);
        g2d.fill(hcl15);
    }
    
    public void chin(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        float[] hsb = new float[3];
        hsb = Color.RGBtoHSB(56,30,29, null);
        float hue, saturation, bright;
        hue = hsb[0];
        saturation = hsb[1];
        bright = hsb[2];
        g2d.setColor(Color.getHSBColor(hue, saturation, bright));
        
        Rectangle2D.Double c1 = new Rectangle2D.Double(100, 610, 20, 10);
        g2d.fill(c1);
        
        Rectangle2D.Double c2 = new Rectangle2D.Double(110, 610, 10, 40);
        g2d.fill(c2);
        
        Rectangle2D.Double c3 = new Rectangle2D.Double(120, 600, 10, 10);
        g2d.fill(c3);
        
        Rectangle2D.Double c4 = new Rectangle2D.Double(130, 610, 10, 10);
        g2d.fill(c4);
        
        Rectangle2D.Double c5 = new Rectangle2D.Double(140, 620, 10, 30);
        g2d.fill(c5);
        
        Rectangle2D.Double c6 = new Rectangle2D.Double(150, 650, 10, 20);
        g2d.fill(c6);
        
        Rectangle2D.Double c7 = new Rectangle2D.Double(160, 670, 10, 10);
        g2d.fill(c7);
        
        Rectangle2D.Double c8 = new Rectangle2D.Double(170, 680, 10, 20);
        g2d.fill(c8);
        
        Rectangle2D.Double c9 = new Rectangle2D.Double(180, 700, 10, 10);
        g2d.fill(c9);
        
        Rectangle2D.Double c10 = new Rectangle2D.Double(190, 710, 10, 10);
        g2d.fill(c10);
        
        Rectangle2D.Double c11 = new Rectangle2D.Double(200, 720, 20, 10);
        g2d.fill(c11);
        
        Rectangle2D.Double c12 = new Rectangle2D.Double(220, 730, 10, 10);
        g2d.fill(c12);
        
        Rectangle2D.Double c13 = new Rectangle2D.Double(230, 740, 20, 10);
        g2d.fill(c13);
        
        Rectangle2D.Double c14 = new Rectangle2D.Double(250, 750, 20, 10);
        g2d.fill(c14);
        
        Rectangle2D.Double c15 = new Rectangle2D.Double(270, 760, 60, 10);
        g2d.fill(c15);
    }
    
    public void skin(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        float[] hsb = new float[3];
        hsb = Color.RGBtoHSB(108,83,73, null);
        float hue, saturation, bright;
        hue = hsb[0];
        saturation = hsb[1];
        bright = hsb[2];
        g2d.setColor(Color.getHSBColor(hue, saturation, bright));
        
        Rectangle2D.Double s1 = new Rectangle2D.Double(330, 750, 20, 20);
        g2d.fill(s1);
        
        Rectangle2D.Double s2 = new Rectangle2D.Double(340, 740, 20, 20);
        g2d.fill(s2);
        
        Rectangle2D.Double s3 = new Rectangle2D.Double(360, 720, 20, 20);
        g2d.fill(s3);
        
        Rectangle2D.Double s4 = new Rectangle2D.Double(360, 740, 10, 10);
        g2d.fill(s4);
        
        Rectangle2D.Double s5 = new Rectangle2D.Double(360, 670, 40, 30);
        g2d.fill(s5);
        
        Rectangle2D.Double s6 = new Rectangle2D.Double(380, 650, 30, 30);
        g2d.fill(s6);
        
        Rectangle2D.Double s7 = new Rectangle2D.Double(390, 620, 30, 30);
        g2d.fill(s7);
        
        Rectangle2D.Double s9 = new Rectangle2D.Double(390, 600, 40, 20);
        g2d.fill(s9);
        
        Rectangle2D.Double s10 = new Rectangle2D.Double(420, 590, 10, 10);
        g2d.fill(s10);
        
        Rectangle2D.Double s11 = new Rectangle2D.Double(390, 580, 10, 20);
        g2d.fill(s11);
        
        Rectangle2D.Double s12 = new Rectangle2D.Double(320, 680, 50, 20);
        g2d.fill(s12);
        
        Rectangle2D.Double s13 = new Rectangle2D.Double(370, 700, 20, 20);
        g2d.fill(s13);
        
        Rectangle2D.Double s14 = new Rectangle2D.Double(310, 680, 10, 10);
        g2d.fill(s14);
        
        Rectangle2D.Double s15 = new Rectangle2D.Double(320, 670, 10, 10);
        g2d.fill(s15);
        
        Rectangle2D.Double s16 = new Rectangle2D.Double(270, 660, 50, 10);
        g2d.fill(s16);
        
        Rectangle2D.Double s17 = new Rectangle2D.Double(260, 640, 30, 20);
        g2d.fill(s17);
        
        Rectangle2D.Double s18 = new Rectangle2D.Double(110, 670, 10, 30);
        g2d.fill(s18);
        
        Rectangle2D.Double s19 = new Rectangle2D.Double(120, 680, 10, 30);
        g2d.fill(s19);
        
        Rectangle2D.Double s20 = new Rectangle2D.Double(130, 690, 10, 30);
        g2d.fill(s20);
        
        Rectangle2D.Double s21 = new Rectangle2D.Double(140, 700, 10, 40);
        g2d.fill(s21);
        
        Rectangle2D.Double s22 = new Rectangle2D.Double(150, 710, 10, 40);
        g2d.fill(s22);
        
        Rectangle2D.Double s23 = new Rectangle2D.Double(160, 720, 40, 50);
        g2d.fill(s23);
        
        Rectangle2D.Double s24 = new Rectangle2D.Double(170, 710, 20, 10);
        g2d.fill(s24);
        
        Rectangle2D.Double s25 = new Rectangle2D.Double(200, 730, 20, 40);
        g2d.fill(s25);
        
        Rectangle2D.Double s26 = new Rectangle2D.Double(220, 740, 10, 60);
        g2d.fill(s26);
        
        Rectangle2D.Double s27 = new Rectangle2D.Double(230, 750, 20, 60);
        g2d.fill(s27);
        
        Rectangle2D.Double s28 = new Rectangle2D.Double(250, 760, 20, 60);
        g2d.fill(s28);
        
        Rectangle2D.Double s29 = new Rectangle2D.Double(260, 770, 40, 60);
        g2d.fill(s29);
        
        Rectangle2D.Double s30 = new Rectangle2D.Double(210, 770, 10, 10);
        g2d.fill(s30);
        
        Rectangle2D.Double s31 = new Rectangle2D.Double(300, 770, 10, 10);
        g2d.fill(s31);
        
        Rectangle2D.Double s32 = new Rectangle2D.Double(300, 790, 10, 10);
        g2d.fill(s32);
        
        Rectangle2D.Double s33 = new Rectangle2D.Double(130, 590, 10, 20);
        g2d.fill(s33);
        
        Rectangle2D.Double s34 = new Rectangle2D.Double(310, 640, 90, 20);
        g2d.fill(s34);
        
        Rectangle2D.Double s35 = new Rectangle2D.Double(180, 480, 40, 10);
        g2d.fill(s35);
        
        
        // Above the eyebrow
        Rectangle2D.Double s36 = new Rectangle2D.Double(240, 460, 100, 10);
        g2d.fill(s36);
        
        Rectangle2D.Double s37 = new Rectangle2D.Double(260, 450, 50, 10);
        g2d.fill(s37);
        
        Rectangle2D.Double s38 = new Rectangle2D.Double(290, 470, 50, 10);
        g2d.fill(s38);
        
        Rectangle2D.Double s39 = new Rectangle2D.Double(320, 480, 20, 10);
        g2d.fill(s39);
        
        Rectangle2D.Double s40 = new Rectangle2D.Double(380, 460, 50, 10);
        g2d.fill(s40);
        
        Rectangle2D.Double s41 = new Rectangle2D.Double(420, 470, 10, 10);
        g2d.fill(s41);
        
        // Below the eye
        Rectangle2D.Double s42 = new Rectangle2D.Double(240, 510, 10, 10);
        g2d.fill(s42);
        
        Rectangle2D.Double s43 = new Rectangle2D.Double(260, 520, 10, 10);
        g2d.fill(s43);
        
        Rectangle2D.Double s44 = new Rectangle2D.Double(280, 510, 20, 10);
        g2d.fill(s44);
        
        // Nose
        Rectangle2D.Double s45 = new Rectangle2D.Double(300, 590, 100, 10);
        g2d.fill(s45);
        
        Rectangle2D.Double s46 = new Rectangle2D.Double(290, 570, 20, 20);
        g2d.fill(s46);
        
        Rectangle2D.Double s47 = new Rectangle2D.Double(380, 550, 10, 40);
        g2d.fill(s47);
        
        Rectangle2D.Double s48 = new Rectangle2D.Double(320, 600, 50, 10);
        g2d.fill(s48);
        
        Rectangle2D.Double s49 = new Rectangle2D.Double(380, 560, 20, 20);
        g2d.fill(s49);
        
        // Skin Continuation
        Rectangle2D.Double s50 = new Rectangle2D.Double(290, 650, 10, 10);
        g2d.fill(s50);
        
        Rectangle2D.Double s51 = new Rectangle2D.Double(400, 430, 20, 10);
        g2d.fill(s51);
        
        Rectangle2D.Double s52 = new Rectangle2D.Double(190, 700, 10, 10);
        g2d.fill(s52);
        
        Rectangle2D.Double s53 = new Rectangle2D.Double(180, 690, 10, 10);
        g2d.fill(s53);
        
        Rectangle2D.Double s54 = new Rectangle2D.Double(200, 710, 10, 10);
        g2d.fill(s54);
        
        Rectangle2D.Double s55 = new Rectangle2D.Double(230, 730, 10, 10);
        g2d.fill(s55);
        
        Rectangle2D.Double s56 = new Rectangle2D.Double(250, 740, 10, 10);
        g2d.fill(s56);
        
        Rectangle2D.Double s57 = new Rectangle2D.Double(270, 750, 20, 10);
        g2d.fill(s57);
    }
    
    public void ear(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        float[] hsb = new float[3];
        hsb = Color.RGBtoHSB(151,116,99, null);
        float hue, saturation, bright;
        hue = hsb[0];
        saturation = hsb[1];
        bright = hsb[2];
        g2d.setColor(Color.getHSBColor(hue, saturation, bright));
        
        Rectangle2D.Double e1 = new Rectangle2D.Double(80, 490, 10, 100);
        g2d.fill(e1);
        
        Rectangle2D.Double e2 = new Rectangle2D.Double(90, 500, 10, 110);
        g2d.fill(e2);
        
        Rectangle2D.Double e3 = new Rectangle2D.Double(90, 510, 10, 100);
        g2d.fill(e3);
        
        Rectangle2D.Double e4 = new Rectangle2D.Double(100, 510, 10, 100);
        g2d.fill(e4);
        
        Rectangle2D.Double e5 = new Rectangle2D.Double(110, 530, 10, 80);
        g2d.fill(e5);
        
        Rectangle2D.Double e6 = new Rectangle2D.Double(120, 540, 10, 60);
        g2d.fill(e6);
    }
    
    public void lightSkin(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        float[] hsb = new float[3];
        hsb = Color.RGBtoHSB(179,146,132, null);
        float hue, saturation, bright;
        hue = hsb[0];
        saturation = hsb[1];
        bright = hsb[2];
        g2d.setColor(Color.getHSBColor(hue, saturation, bright));
        
        Rectangle2D.Double ls1 = new Rectangle2D.Double(130, 530, 40, 60);
        g2d.fill(ls1);
        
        Rectangle2D.Double ls2 = new Rectangle2D.Double(140, 540, 50, 80);
        g2d.fill(ls2);
        
        Rectangle2D.Double ls3 = new Rectangle2D.Double(140, 550, 70, 70);
        g2d.fill(ls3);
        
        Rectangle2D.Double ls4 = new Rectangle2D.Double(150, 600, 120, 50);
        g2d.fill(ls4);
        
        Rectangle2D.Double ls5 = new Rectangle2D.Double(160, 640, 150, 30);
        g2d.fill(ls5);
        
        Rectangle2D.Double ls6 = new Rectangle2D.Double(170, 650, 140, 30);
        g2d.fill(ls6);
        
        Rectangle2D.Double ls7 = new Rectangle2D.Double(180, 680, 130, 20);
        g2d.fill(ls7);
        
        Rectangle2D.Double ls8 = new Rectangle2D.Double(190, 700, 100, 10);
        g2d.fill(ls8);
        
        Rectangle2D.Double ls9 = new Rectangle2D.Double(200, 710, 90, 10);
        g2d.fill(ls9);
        
        Rectangle2D.Double ls10 = new Rectangle2D.Double(220, 720, 80, 10);
        g2d.fill(ls10);
        
        Rectangle2D.Double ls11 = new Rectangle2D.Double(230, 730, 150, 10);
        g2d.fill(ls11);
        
        Rectangle2D.Double ls12 = new Rectangle2D.Double(250, 740, 100, 10);
        g2d.fill(ls12);
        
        Rectangle2D.Double ls13 = new Rectangle2D.Double(270, 750, 60, 10);
        g2d.fill(ls13);
        
        Rectangle2D.Double ls14 = new Rectangle2D.Double(110, 640, 30, 30);
        g2d.fill(ls14);
        
        Rectangle2D.Double ls15 = new Rectangle2D.Double(120, 650, 30, 30);
        g2d.fill(ls15);
        
        Rectangle2D.Double ls16 = new Rectangle2D.Double(130, 670, 30, 20);
        g2d.fill(ls16);
        
        Rectangle2D.Double ls17 = new Rectangle2D.Double(140, 680, 30, 20);
        g2d.fill(ls17);
        
        Rectangle2D.Double ls18 = new Rectangle2D.Double(150, 700, 30, 10);
        g2d.fill(ls18);
        
        Rectangle2D.Double ls19 = new Rectangle2D.Double(160, 710, 10, 10);
        g2d.fill(ls19);
        
        Rectangle2D.Double ls20 = new Rectangle2D.Double(120, 620, 20, 20);
        g2d.fill(ls20);
        
        Rectangle2D.Double ls21 = new Rectangle2D.Double(120, 610, 10, 10);
        g2d.fill(ls21);
        
        Rectangle2D.Double ls22 = new Rectangle2D.Double(210, 560, 10, 40);
        g2d.fill(ls22);
        
        Rectangle2D.Double ls23 = new Rectangle2D.Double(220, 580, 10, 40);
        g2d.fill(ls23);
        
        Rectangle2D.Double ls24 = new Rectangle2D.Double(230, 590, 20, 10);
        g2d.fill(ls24);
        
        // Below the eye
        Rectangle2D.Double ls25 = new Rectangle2D.Double(230, 510, 10, 10);
        g2d.fill(ls25);
        
        Rectangle2D.Double ls26 = new Rectangle2D.Double(240, 520, 80, 10);
        g2d.fill(ls26);
        
        Rectangle2D.Double ls27 = new Rectangle2D.Double(300, 490, 30, 50);
        g2d.fill(ls27);
        
        Rectangle2D.Double ls28 = new Rectangle2D.Double(310, 540, 10, 10);
        g2d.fill(ls28);
        
        Rectangle2D.Double ls29 = new Rectangle2D.Double(300, 550, 10, 10);
        g2d.fill(ls29);
        
        Rectangle2D.Double ls30 = new Rectangle2D.Double(390, 500, 60, 30);
        g2d.fill(ls30);
        
        Rectangle2D.Double ls31 = new Rectangle2D.Double(390, 530, 20, 10);
        g2d.fill(ls31);
        
        Rectangle2D.Double ls32 = new Rectangle2D.Double(430, 530, 20, 10);
        g2d.fill(ls32);
        
        Rectangle2D.Double ls33 = new Rectangle2D.Double(440, 540, 10, 10);
        g2d.fill(ls33);
        
        Rectangle2D.Double ls34 = new Rectangle2D.Double(410, 550, 40, 10);
        g2d.fill(ls34);
        
        Rectangle2D.Double ls35 = new Rectangle2D.Double(460, 500, 10, 20);
        g2d.fill(ls35);
        
        Rectangle2D.Double ls36 = new Rectangle2D.Double(400, 570, 30, 30);
        g2d.fill(ls36);
        
        Rectangle2D.Double ls37 = new Rectangle2D.Double(160, 510, 20, 20);
        g2d.fill(ls37);
        
        Rectangle2D.Double ls38 = new Rectangle2D.Double(170, 500, 10, 10);
        g2d.fill(ls38);
        
        Rectangle2D.Double ls39 = new Rectangle2D.Double(160, 490, 10, 10);
        g2d.fill(ls39);
        
        Rectangle2D.Double ls40 = new Rectangle2D.Double(210, 510, 10, 30);
        g2d.fill(ls40);
        
        Rectangle2D.Double ls41 = new Rectangle2D.Double(250, 590, 70, 10);
        g2d.fill(ls41);
        
        Rectangle2D.Double ls42 = new Rectangle2D.Double(300, 600, 20, 10);
        g2d.fill(ls42);
        
        Rectangle2D.Double ls43 = new Rectangle2D.Double(270, 630, 30, 10);
        g2d.fill(ls43);
        
        Rectangle2D.Double ls44 = new Rectangle2D.Double(370, 630, 20, 10);
        g2d.fill(ls44);
        
        Rectangle2D.Double ls45 = new Rectangle2D.Double(370, 600, 20, 10);
        g2d.fill(ls45);
        
        Rectangle2D.Double ls46 = new Rectangle2D.Double(380, 610, 10, 20);
        g2d.fill(ls46);
        
        Rectangle2D.Double ls47 = new Rectangle2D.Double(150, 470, 20, 10);
        g2d.fill(ls47);
        
        Rectangle2D.Double ls48 = new Rectangle2D.Double(200, 470, 20, 10);
        g2d.fill(ls48);
        
        Rectangle2D.Double ls49 = new Rectangle2D.Double(230, 460, 20, 10);
        g2d.fill(ls49);
        
        Rectangle2D.Double ls50 = new Rectangle2D.Double(240, 450, 20, 10);
        g2d.fill(ls50);
        
        Rectangle2D.Double ls51 = new Rectangle2D.Double(200, 420, 40, 10);
        g2d.fill(ls51);
        
        Rectangle2D.Double ls52 = new Rectangle2D.Double(180, 410, 40, 10);
        g2d.fill(ls52);
        
        Rectangle2D.Double ls53 = new Rectangle2D.Double(180, 400, 30, 10);
        g2d.fill(ls53);
        
        Rectangle2D.Double ls54 = new Rectangle2D.Double(200, 430, 10, 20);
        g2d.fill(ls54);
        
        Rectangle2D.Double ls55 = new Rectangle2D.Double(250, 370, 10, 10);
        g2d.fill(ls55);
        
        Rectangle2D.Double ls56 = new Rectangle2D.Double(260, 360, 20, 10);
        g2d.fill(ls56);
        
        Rectangle2D.Double ls57 = new Rectangle2D.Double(270, 370, 40, 10);
        g2d.fill(ls57);
        
        Rectangle2D.Double ls58 = new Rectangle2D.Double(280, 380, 30, 10);
        g2d.fill(ls58);
        
        Rectangle2D.Double ls59 = new Rectangle2D.Double(290, 390, 10, 10);
        g2d.fill(ls59);
        
        Rectangle2D.Double ls60 = new Rectangle2D.Double(330, 450, 10, 10);
        g2d.fill(ls60);
        
        Rectangle2D.Double ls61 = new Rectangle2D.Double(340, 460, 40, 20);
        g2d.fill(ls61);
        
        Rectangle2D.Double ls62 = new Rectangle2D.Double(340, 480, 10, 10);
        g2d.fill(ls62);
        
        Rectangle2D.Double ls63 = new Rectangle2D.Double(360, 480, 10, 10);
        g2d.fill(ls63);
        
        Rectangle2D.Double ls64 = new Rectangle2D.Double(360, 450, 20, 10);
        g2d.fill(ls64);
        
        Rectangle2D.Double ls65 = new Rectangle2D.Double(380, 440, 10, 10);
        g2d.fill(ls65);
        
        Rectangle2D.Double ls66 = new Rectangle2D.Double(390, 430, 10, 10);
        g2d.fill(ls66);
        
        Rectangle2D.Double ls67 = new Rectangle2D.Double(300, 770, 20, 20);
        g2d.fill(ls67);
        
        Rectangle2D.Double ls68 = new Rectangle2D.Double(320, 770, 10, 10);
        g2d.fill(ls68);
        
        Rectangle2D.Double ls69 = new Rectangle2D.Double(170, 770, 40, 10);
        g2d.fill(ls69);
        
        Rectangle2D.Double ls70 = new Rectangle2D.Double(180, 780, 40, 20);
        g2d.fill(ls70);
        
        Rectangle2D.Double ls71 = new Rectangle2D.Double(190, 790, 40, 20);
        g2d.fill(ls71);
        
        Rectangle2D.Double ls72 = new Rectangle2D.Double(200, 800, 110, 30);
        g2d.fill(ls72);
    }
    
    public void lips(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        float[] hsb1 = new float[3];
        hsb1 = Color.RGBtoHSB(167,113,117, null);
        float hue1, saturation1, bright1;
        hue1 = hsb1[0];
        saturation1 = hsb1[1];
        bright1 = hsb1[2];
        g2d.setColor(Color.getHSBColor(hue1, saturation1, bright1));
        
        Rectangle2D.Double l1 = new Rectangle2D.Double(320, 660, 70, 10);
        g2d.fill(l1);
        
        Rectangle2D.Double l2 = new Rectangle2D.Double(330, 670, 30, 10);
        g2d.fill(l2);
        
        Rectangle2D.Double l3 = new Rectangle2D.Double(310, 670, 10, 10);
        g2d.fill(l3);
        
        float[] hsb2 = new float[3];
        hsb2 = Color.RGBtoHSB(56,30,29, null);
        float hue2, saturation2, bright2;
        hue2 = hsb2[0];
        saturation2 = hsb2[1];
        bright2 = hsb2[2];
        g2d.setColor(Color.getHSBColor(hue2, saturation2, bright2));
        
        Rectangle2D.Double l4 = new Rectangle2D.Double(300, 650, 50, 10);
        g2d.fill(l4);
        
        float[] hsb3 = new float[3];
        hsb3 = Color.RGBtoHSB(83,45,46, null);
        float hue3, saturation3, bright3;
        hue3 = hsb3[0];
        saturation3 = hsb3[1];
        bright3 = hsb3[2];
        g2d.setColor(Color.getHSBColor(hue3, saturation3, bright3));
        
        Rectangle2D.Double l5 = new Rectangle2D.Double(350, 650, 40, 10);
        g2d.fill(l5);
        
        Rectangle2D.Double l6 = new Rectangle2D.Double(330, 640, 10, 10);
        g2d.fill(l6);
        
        Rectangle2D.Double l7 = new Rectangle2D.Double(370, 640, 10, 10);
        g2d.fill(l7);
    }
    
    public void glasses(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        float[] hsb1 = new float[3];
        hsb1 = Color.RGBtoHSB(95,69,61, null);
        float hue1, saturation1, bright1;
        hue1 = hsb1[0];
        saturation1 = hsb1[1];
        bright1 = hsb1[2];
        g2d.setColor(Color.getHSBColor(hue1, saturation1, bright1));
        
        Rectangle2D.Double g1 = new Rectangle2D.Double(150, 480, 30, 10);
        g2d.fill(g1);
        
        Rectangle2D.Double gl1 = new Rectangle2D.Double(220, 470, 10, 10);
        g2d.fill(gl1);
        
        Rectangle2D.Double g2 = new Rectangle2D.Double(170, 490, 20, 10);
        g2d.fill(g2);
        
        g2d.setColor(Color.BLACK);
        
        Rectangle2D.Double g3 = new Rectangle2D.Double(190, 490, 30, 10);
        g2d.fill(g3);
        
        Rectangle2D.Double g4 = new Rectangle2D.Double(210, 500, 20, 10);
        g2d.fill(g4);
        
        Rectangle2D.Double g5 = new Rectangle2D.Double(220, 510, 10, 10);
        g2d.fill(g5);
        
        g2d.setColor(Color.getHSBColor(hue1, saturation1, bright1));
        
        Rectangle2D.Double g6 = new Rectangle2D.Double(220, 520, 10, 10);
        g2d.fill(g6);
        
        g2d.setColor(Color.BLACK);
        
        Rectangle2D.Double g7 = new Rectangle2D.Double(220, 530, 10, 20);
        g2d.fill(g7);
        
        g2d.setColor(Color.getHSBColor(hue1, saturation1, bright1));
        
        Rectangle2D.Double g8 = new Rectangle2D.Double(230, 540, 10, 20);
        g2d.fill(g8);
        
        Rectangle2D.Double g9 = new Rectangle2D.Double(240, 550, 10, 10);
        g2d.fill(g9);
        
        Rectangle2D.Double g10 = new Rectangle2D.Double(250, 560, 40, 10);
        g2d.fill(g10);
        
        g2d.setColor(Color.BLACK);
        
        Rectangle2D.Double g11 = new Rectangle2D.Double(290, 560, 20, 10);
        g2d.fill(g11);
        
        Rectangle2D.Double g12 = new Rectangle2D.Double(310, 550, 10, 10);
        g2d.fill(g12);
        
        Rectangle2D.Double g13 = new Rectangle2D.Double(320, 520, 10, 30);
        g2d.fill(g13);
        
        g2d.setColor(Color.getHSBColor(hue1, saturation1, bright1));
        
        Rectangle2D.Double g14 = new Rectangle2D.Double(320, 510, 70, 10);
        g2d.fill(g14);
        
        Rectangle2D.Double g15 = new Rectangle2D.Double(330, 520, 20, 10);
        g2d.fill(g15);
        
        Rectangle2D.Double g16 = new Rectangle2D.Double(330, 530, 10, 20);
        g2d.fill(g16);
        
        Rectangle2D.Double g17 = new Rectangle2D.Double(360, 520, 30, 10);
        g2d.fill(g17);
        
        Rectangle2D.Double g18 = new Rectangle2D.Double(370, 530, 10, 20);
        g2d.fill(g18);
        
        Rectangle2D.Double g19 = new Rectangle2D.Double(370, 530, 20, 10);
        g2d.fill(g19);
        
        Rectangle2D.Double g20 = new Rectangle2D.Double(320, 550, 10, 20);
        g2d.fill(g20);
        
        Rectangle2D.Double g21 = new Rectangle2D.Double(310, 560, 10, 10);
        g2d.fill(g21);
        
        g2d.setColor(Color.BLACK);
        
        Rectangle2D.Double g23 = new Rectangle2D.Double(380, 540, 10, 10);
        g2d.fill(g23);
        
        Rectangle2D.Double g24 = new Rectangle2D.Double(390, 550, 10, 10);
        g2d.fill(g24);
       
        float[] hsb2 = new float[3];
        hsb2 = Color.RGBtoHSB(37,35,37, null);
        float hue2, saturation2, bright2;
        hue2 = hsb2[0];
        saturation2 = hsb2[1];
        bright2 = hsb2[2];
        g2d.setColor(Color.getHSBColor(hue2, saturation2, bright2));
        
        Rectangle2D.Double g25 = new Rectangle2D.Double(220, 480, 50, 20);
        g2d.fill(g25);
        
        Rectangle2D.Double g26 = new Rectangle2D.Double(230, 470, 30, 10);
        g2d.fill(g26);
        
        Rectangle2D.Double g27 = new Rectangle2D.Double(270, 470, 20, 10);
        g2d.fill(g27);
        
        Rectangle2D.Double g28 = new Rectangle2D.Double(280, 480, 20, 10);
        g2d.fill(g28);
        
        Rectangle2D.Double g29 = new Rectangle2D.Double(290, 490, 10, 10);
        g2d.fill(g29);
        
        g2d.setColor(Color.BLACK);
        
        Rectangle2D.Double g30 = new Rectangle2D.Double(300, 480, 20, 10);
        g2d.fill(g30);
        
        g2d.setColor(Color.getHSBColor(hue1, saturation1, bright1));
        
        Rectangle2D.Double g31 = new Rectangle2D.Double(320, 490, 40, 10);
        g2d.fill(g31);
        
        Rectangle2D.Double g32 = new Rectangle2D.Double(330, 500, 40, 10);
        g2d.fill(g32);
        
        g2d.setColor(Color.getHSBColor(hue2, saturation2, bright2));
        
        Rectangle2D.Double g33 = new Rectangle2D.Double(360, 490, 40, 10);
        g2d.fill(g33);
        
        Rectangle2D.Double g34 = new Rectangle2D.Double(370, 500, 10, 10);
        g2d.fill(g34);
        
        Rectangle2D.Double g35 = new Rectangle2D.Double(370, 480, 40, 10);
        g2d.fill(g35);
        
        Rectangle2D.Double g36 = new Rectangle2D.Double(380, 470, 40, 10);
        g2d.fill(g36);
        
        g2d.setColor(Color.getHSBColor(hue1, saturation1, bright1));
        
        Rectangle2D.Double g37 = new Rectangle2D.Double(400, 550, 10, 10);
        g2d.fill(g37);
        
        Rectangle2D.Double g38 = new Rectangle2D.Double(390, 540, 10, 10);
        g2d.fill(g38);
        
        Rectangle2D.Double g39 = new Rectangle2D.Double(400, 560, 40, 10);
        g2d.fill(g39);
        
        Rectangle2D.Double g40 = new Rectangle2D.Double(440, 550, 10, 10);
        g2d.fill(g40);
        
        Rectangle2D.Double g41 = new Rectangle2D.Double(460, 520, 10, 10);
        g2d.fill(g41);
        
        Rectangle2D.Double g42 = new Rectangle2D.Double(460, 490, 10, 10);
        g2d.fill(g42);
        
        Rectangle2D.Double g43 = new Rectangle2D.Double(470, 500, 10, 10);
        g2d.fill(g43);
        
        float[] hsb3 = new float[3];
        hsb3 = Color.RGBtoHSB(108,83,73, null);
        float hue3, saturation3, bright3;
        hue3 = hsb3[0];
        saturation3 = hsb3[1];
        bright3 = hsb3[2];
        g2d.setColor(Color.getHSBColor(hue3, saturation3, bright3));
        
        Rectangle2D.Double g44 = new Rectangle2D.Double(420, 500, 20, 20);
        g2d.fill(g44);
        
        Rectangle2D.Double g45 = new Rectangle2D.Double(430, 490, 10, 10);
        g2d.fill(g45);
        
        float[] hsb4 = new float[3];
        hsb4 = Color.RGBtoHSB(134,118,115, null);
        float hue4, saturation4, bright4;
        hue4 = hsb4[0];
        saturation4 = hsb4[1];
        bright4 = hsb4[2];
        g2d.setColor(Color.getHSBColor(hue4, saturation4, bright4));
        
        Rectangle2D.Double g46 = new Rectangle2D.Double(230, 500, 70, 10);
        g2d.fill(g46);
        
        Rectangle2D.Double g47 = new Rectangle2D.Double(270, 490, 20, 10);
        g2d.fill(g47);
        
        Rectangle2D.Double g48 = new Rectangle2D.Double(270, 480, 10, 10);
        g2d.fill(g48);
        
        Rectangle2D.Double g49 = new Rectangle2D.Double(260, 470, 10, 10);
        g2d.fill(g49);
        
        Rectangle2D.Double g50 = new Rectangle2D.Double(250, 510, 30, 10);
        g2d.fill(g50);
        
        Rectangle2D.Double g51 = new Rectangle2D.Double(300, 490, 10, 10);
        g2d.fill(g51);
        
        Rectangle2D.Double g52 = new Rectangle2D.Double(380, 500, 40, 10);
        g2d.fill(g52);
        
        Rectangle2D.Double g53 = new Rectangle2D.Double(400, 490, 30, 10);
        g2d.fill(g53);
        
        Rectangle2D.Double g54 = new Rectangle2D.Double(410, 480, 10, 10);
        g2d.fill(g54);
        
        Rectangle2D.Double g55 = new Rectangle2D.Double(390, 510, 10, 10);
        g2d.fill(g55);
    }
    
    public void eyebrows(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        float[] hsb1 = new float[3];
        hsb1 = Color.RGBtoHSB(97,91,93, null);
        float hue1, saturation1, bright1;
        hue1 = hsb1[0];
        saturation1 = hsb1[1];
        bright1 = hsb1[2];
        g2d.setColor(Color.getHSBColor(hue1, saturation1, bright1));
        
        Rectangle2D.Double eb1 = new Rectangle2D.Double(210, 440, 10, 20);
        g2d.fill(eb1);
        
        Rectangle2D.Double eb2 = new Rectangle2D.Double(220, 430, 90, 20);
        g2d.fill(eb2);
        
        Rectangle2D.Double eb3 = new Rectangle2D.Double(310, 440, 20, 20);
        g2d.fill(eb3);
        
        Rectangle2D.Double eb4 = new Rectangle2D.Double(240, 420, 30, 10);
        g2d.fill(eb4);
        
        Rectangle2D.Double eb5 = new Rectangle2D.Double(380, 450, 40, 10);
        g2d.fill(eb5);
        
        Rectangle2D.Double eb6 = new Rectangle2D.Double(390, 440, 40, 10);
        g2d.fill(eb6);
    }
    
    public void nose(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        float[] hsb1 = new float[3];
        hsb1 = Color.RGBtoHSB(89,66,59, null);
        float hue1, saturation1, bright1;
        hue1 = hsb1[0];
        saturation1 = hsb1[1];
        bright1 = hsb1[2];
        g2d.setColor(Color.getHSBColor(hue1, saturation1, bright1));
        
        Rectangle2D.Double n1 = new Rectangle2D.Double(320, 510, 70, 10);
        g2d.fill(n1);
        
        Rectangle2D.Double n2 = new Rectangle2D.Double(330, 500, 40, 10);
        g2d.fill(n2);
        
        Rectangle2D.Double n3 = new Rectangle2D.Double(320, 490, 40, 10);
        g2d.fill(n3);
        
        Rectangle2D.Double n4 = new Rectangle2D.Double(330, 520, 20, 10);
        g2d.fill(n4);
        
        Rectangle2D.Double n5 = new Rectangle2D.Double(330, 530, 10, 20);
        g2d.fill(n5);
        
        Rectangle2D.Double n6 = new Rectangle2D.Double(360, 520, 30, 10);
        g2d.fill(n6);
        
        Rectangle2D.Double n7 = new Rectangle2D.Double(370, 530, 20, 10);
        g2d.fill(n7);
        
        Rectangle2D.Double n8 = new Rectangle2D.Double(370, 540, 10, 10);
        g2d.fill(n8);
        
        Rectangle2D.Double n9 = new Rectangle2D.Double(380, 550, 10, 40);
        g2d.fill(n9);
        
        Rectangle2D.Double n10 = new Rectangle2D.Double(320, 550, 10, 20);
        g2d.fill(n10);
        
        Rectangle2D.Double n11 = new Rectangle2D.Double(310, 560, 10, 10);
        g2d.fill(n11);
        
        Rectangle2D.Double n12 = new Rectangle2D.Double(300, 580, 90, 10);
        g2d.fill(n12);
        
        Rectangle2D.Double n13 = new Rectangle2D.Double(310, 590, 70, 10);
        g2d.fill(n13);
    }
    
    public static void whiteSkin(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        float[] hsb = new float[3];
        hsb = Color.RGBtoHSB(221,183,171, null);
        float hue, saturation, bright;
        hue = hsb[0];
        saturation = hsb[1];
        bright = hsb[2];
        g2d.setColor(Color.getHSBColor(hue, saturation, bright));
        
        Rectangle2D.Double ws1 = new Rectangle2D.Double(140, 490, 250, 200);
        g2d.fill(ws1);
        
        Rectangle2D.Double ws2 = new Rectangle2D.Double(290, 690, 80, 40);
        g2d.fill(ws2);
        
        Rectangle2D.Double ws3 = new Rectangle2D.Double(400, 490, 60, 60);
        g2d.fill(ws3);
        
        Rectangle2D.Double ws4 = new Rectangle2D.Double(150, 430, 280, 60);
        g2d.fill(ws4);
        
        Rectangle2D.Double ws5 = new Rectangle2D.Double(170, 370, 240, 60);
        g2d.fill(ws5);
    }
    
    public static void main(String[] args) {
        SelfPortrait i = new SelfPortrait();
        
        float[] hsb = new float[3];
        hsb = Color.RGBtoHSB(231,227,223, null);
        float hue, saturation, bright;
        hue = hsb[0];
        saturation = hsb[1];
        bright = hsb[2];
        
        i.setTitle("Self-Portrait");
        i.setBackground(Color.getHSBColor(hue, saturation, bright));
        i.setSize(550,850);
        i.setForeground(Color.BLACK);
        i.setVisible(true); 
    }
    
}