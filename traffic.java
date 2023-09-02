import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TrafficLight extends JPanel implements ItemListener
{
    int c=0;
    JRadioButton jb1= new JRadioButton("RED");
    JRadioButton jb2= new JRadioButton("YELLOW");
    JRadioButton jb3= new JRadioButton("GREEN");

    JFrame jf=new JFrame("Traffic Light");
    ButtonGroup b=new ButtonGroup();

    TrafficLight()
    {
        jb1.setBounds(100,300,100,100);
        jb2.setBounds(200,300,100,500);
        jb3.setBounds(300,300,500,500);

        b.add(jb1);
        b.add(jb2);
        b.add(jb3);

        add(jb1);
        add(jb2);
        add(jb3);

        jb1.addItemListener(this);
        jb2.addItemListener(this);
        jb3.addItemListener(this);

        jf.add(this);
        jf.setVisible(true);
        jf.setSize(600,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
    }

    public void itemStateChanged(ItemEvent ie)
    {
        if(ie.getSource()==jb1)
        {
            if(ie.getStateChange()==1)
            c=1;
            repaint();
        }
        if(ie.getSource()==jb2)
        {
            if(ie.getStateChange()==2)
            c=2;
            repaint();
        }
        if(ie.getSource()==jb3)
        {
            if(ie.getStateChange()==3)
            c=3;
            repaint();
        }
    }

    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawOval(275,100,50,50);
        g.drawOval(275,200,50,50);
        g.drawOval(275,300,50,50);

        if(c==1)
        {
            g.setColor(Color.RED);
            g.fillOval(275,100,50,50);
            g.setColor(Color.WHITE);
            g.fillOval(275,200,50,50);
            g.setColor(Color.WHITE);
            g.fillOval(275,300,50,50);
            c=0;
        }

        if(c==2)
        {
            g.setColor(Color.WHITE);
            g.fillOval(275,100,50,50);
            g.setColor(Color.YELLOW);
            g.fillOval(275,200,50,50);
            g.setColor(Color.WHITE);
            g.fillOval(275,300,50,50);
            c=0;
        }

        if(c==3)
        {
            g.setColor(Color.WHITE);
            g.fillOval(275,100,50,50);
            g.setColor(Color.WHITE);
            g.fillOval(275,200,50,50);
            g.setColor(Color.GREEN);
            g.fillOval(275,300,50,50);
            c=0;
        }

    }

    public static void main(String[] args)
    {
        new TrafficLight();
    }
}
