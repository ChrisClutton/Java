package Practice_GUI_Files;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/* beeper with GUI */

class Beeper extends JFrame
{
    JButton button;
    JLabel label;
    int counter = 0, x = 0;
    String s;

    public Beeper()
    {
        setLayout(new FlowLayout());

        button = new JButton("CLICK FOR SOUND");
        add(button);

        label = new JLabel("");
        add(label);

        event e  = new event();
        button.addActionListener(e);
    }

    public class event implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Toolkit.getDefaultToolkit().beep();
            counter++;
            if(x==0)
            {
                s = "time";
            }
            else if (x==1)
            {
                s = "times";
            }
            label.setText("You have clicked " + counter + " " + s);
            x = 1;
        }
    }
    public static void main(String args[])
    {
        Beeper gui = new Beeper();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(300, 200);
        gui.setVisible(true);
        gui.setTitle("Beeper");
    }
}
