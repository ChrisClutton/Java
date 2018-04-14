package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/* 4th GUI */

class GUI4 extends JFrame
{
    private JLabel label;
    private JButton button;

    public GUI4()
    {
        setLayout(new FlowLayout());

        button = new JButton("Click for text");
        add(button);

        label = new JLabel("");
        add(label);

        event e = new event();
        button.addActionListener(e);
    }

    public class event implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            label.setText("Now you can see words here");
        }
    }

    public static void main(String args[])
    {
        GUI4 gui = new GUI4();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setTitle("GUI4 Program");
        gui.setSize(300,100);
        gui.setVisible(true);
    }
}
