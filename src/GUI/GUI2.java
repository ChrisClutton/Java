package GUI;

import java.awt.*;
import javax.swing.*;

/* This is my 2nd attempt at making a GUI in Java */

class GUI2 extends JFrame
{
    private JLabel label;
    private JButton button;
    private JTextField textfield;

    public GUI2()
    {
        setLayout(new FlowLayout());

        label = new JLabel("Hi, I'm a label");
        add(label);

        textfield = new JTextField(15);
        add(textfield);

        button = new JButton("CLICK ME!!!!");
        add(button);
    }

    public static void main (String args[])
    {
        GUI2 gui = new GUI2();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(500, 250);
        gui.setTitle("Title");
    }
}
