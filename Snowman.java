import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Snowman extends Applet implements ActionListener
{
    int x=0;
    int y=0;
    Button b1 = new Button("UP");
    Button b2 = new Button("LEFT");
    Button b3 = new Button("RIGHT");
    Button b4 = new Button("DOWN");
    
    public void init()
    {
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            x=x+0;
            y=y+(-10);
            repaint();
        }
        if(ae.getSource()==b2)
        {
            x=x+(-10);
            y=y+0;
            repaint();
        }
        if(ae.getSource()==b3)
        {
            x=x+10;
            y=y+0;
            repaint();
        }
        if(ae.getSource()==b4)
        {
            x=x+0;
            y=y+10;
            repaint();
        }       
    }
    
    public void paint(Graphics g)
    {
        setBackground(Color.BLACK);
        g.setColor(Color.WHITE);
        g.fillOval(250+x,250+y,100,100);
        g.fillOval(260+x,170+y,80,80);
        g.setColor(Color.BLACK);
        g.drawArc(275+x,180+y,50,50,240,60);
        g.setColor(Color.BLACK);
        g.fillOval(280+x,190+y,15,15);
        g.fillOval(305+x,190+y,15,15);
        setForeground(Color.BLACK);
    }
}

/*<html>

<applet code ="Snowman.class" width=800 height=800>

</applet>

</html>*/