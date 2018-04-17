package Practice_GUI_Files;

import java.awt.*;
import javax.swing.*;

/* Create window with label, button and text field */

class AddToWindow extends JFrame
{
    private JLabel label;
    private JButton button;
    private JTextField textfield;

    public AddToWindow()
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
        AddToWindow gui = new AddToWindow();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(500, 250);
        gui.setTitle("Title");
    }
}
