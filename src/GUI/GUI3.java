package GUI;

import java.awt.*;
import javax.swing.*;

/* Third GUI attempt */

class GUI3 extends JFrame
{
    private ImageIcon image1;
    private JLabel label1;
    private ImageIcon image2;
    private JLabel label2;

    GUI3()
    {
        setLayout(new FlowLayout());

        image1 = new ImageIcon(getClass().getResource("Laurisse.jpg"));

        label1 = new JLabel(image1);
        add(label1);

        image2 = new ImageIcon(getClass().getResource("Mountie.png"));

        label2 = new JLabel(image2);
        add(label2);
    }

    public static void main(String args[])
    {
        GUI3 gui = new GUI3();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Title");
    }
}
