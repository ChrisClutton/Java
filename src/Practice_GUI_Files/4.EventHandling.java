package Practice_GUI_Files;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/* GUI with event handling functionality */

class EventHandling extends JFrame
{
    private JLabel label;
    private JButton button;

    public EventHandling()

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
        EventHandling gui = new EventHandling();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setTitle("GUI4 Program");
        gui.setSize(300,100);
        gui.setVisible(true);
    }
}
