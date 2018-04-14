package GUI;

import javax.swing.JFrame;

/* This is my first attempt at making a GUI in Java */

public class FirstGui extends JFrame
{
    public static void main (String args[])
    {
        FirstGui gui = new FirstGui();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(200, 200);
        gui.setVisible(true);
        gui.setTitle("First GUI");
    }

}
