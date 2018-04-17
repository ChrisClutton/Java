package Practice_GUI_Files;

import java.awt.*;
import javax.swing.*;

/* Create windows containing pictures */

class AddImage extends JFrame
{
    private ImageIcon image1;
    private JLabel label1;
    private ImageIcon image2;
    private JLabel label2;

    AddImage()
    {
        setLayout(new FlowLayout());

        image1 = new ImageIcon(getClass().getResource("Karl Anderson.png"));

        label1 = new JLabel(image1);
        add(label1);

        image2 = new ImageIcon(getClass().getResource("Suzuki.jpg"));

        label2 = new JLabel(image2);
        add(label2);
    }

    public static void main(String args[])
    {
        AddImage gui = new AddImage();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Title");
    }
}

