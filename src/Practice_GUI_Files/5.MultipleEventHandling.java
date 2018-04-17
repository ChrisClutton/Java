package Practice_GUI_Files;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/* GUI with multiple event handling functionality */

class MultipleEventHandling extends JFrame
{
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JButton button2;
    private int x = 0, y = 0;

    public MultipleEventHandling()

    {
        setLayout(new FlowLayout());

        button1 = new JButton("Click for text");
        add(button1);

        label1 = new JLabel("");
        add(label1);

        button2 = new JButton ("Click for more text");
        add(button2);

        label2 = new JLabel("");
        add(label2);

        event e = new event();
        button1.addActionListener(e);

        event2 e2 = new event2();
        button2.addActionListener(e2);
    }

    public class event implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(x==0)
            {
                label1.setText("Now you can see words here");
                x = 1;
            }
            else if (x==1)
            {
                label1.setText("");
                x = 0;
            }
        }
    }

    public class event2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e2)
        {
            if(y==0)
            {
                label2.setText("This is label 2's text");
                y = 1;
            }
            else if (y==1)
            {
                label2.setText("");
                y = 0;
            }
        }
    }

    public static void main(String args[])
    {
        MultipleEventHandling gui = new MultipleEventHandling();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setTitle("GUI5 Program");
        gui.setSize(300,100);
        gui.setVisible(true);
    }
}
