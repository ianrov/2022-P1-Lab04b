// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE

        g.drawRect(125,125,250,250);
        g.drawRect(25,25,250,250);

        g.drawLine(25,25,125,125);
        g.drawLine(25,275,125,375);
        g.drawLine(275,275,375,375);
        g.drawLine(275,25,375,125);


        // DRAW SPHERE

        g.drawOval(75,75,250,250);
        g.drawOval(112,75,175,250);
        g.drawOval(150,75,100,250);
        g.drawOval(187,75,25,250);

        g.drawOval(75,112,250,175);
        g.drawOval(75,150,250,100);
        g.drawOval(75,187,250,25);

        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE

        g.drawOval(700,350,250,250);

        g.drawLine(700,475,825,600);
        g.drawLine(700,475,920,395);
        g.drawLine(825,600,920,395);

        g.drawOval(748,440,118,118);

        // DRAW APCS

            //This is the A

        g.drawRect(100,400,100,175);
        g.fillRect(100,400,100,175);

        g.setColor(Color.white);
        g.fillRect(130,430,40,40);

        g.fillRect(130,500,40,80);

            //This is the P

        g.setColor(Color.black);
        g.drawRect(225,400,100,175);
        g.fillRect(225,400,100,175);

        g.setColor(Color.white);
        g.fillRect(255,430,40,40);

        g.fillRect(255,500,100,100);

            //This is the C

        g.setColor(Color.black);
        g.drawRect(350,400,100,175);
        g.fillRect(350,400,100,175);

        g.setColor(Color.white);
        g.fillRect(375,430,100,120);

        //This is the S

        g.setColor(Color.black);
        g.drawRect(475,400,100,175);
        g.fillRect(475,400,100,175);

        g.setColor(Color.white);
        g.fillRect(505,430,75,45);
        g.fillRect(475,505,75,40);


        g.setColor(Color.black);




        // DRAW PACMEN FLOWER

        g.fillArc(700,50,100,100,45,-270);
        g.fillArc(765,115,100,100,45,270);
        g.fillArc(635,115,100,100,-135,270);
        g.fillArc(700,180,100,100,-45,270);

    }

}


