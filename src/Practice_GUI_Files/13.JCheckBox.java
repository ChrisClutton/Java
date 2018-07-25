package Practice_GUI_Files;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* Program for check boxes */

class JCheckBoxTutorial extends JFrame {

    JCheckBox show1, show2;
    JLabel label1, label2;

    public JCheckBoxTutorial() {
        setLayout (new GridLayout(2,2));

        label1 = new JLabel("");
        add(label1);

        label2 = new JLabel("");
        add(label2);

        show1 = new JCheckBox("Show first label");
        add(show1);

        show2 = new JCheckBox("Show second label");
        add(show2);

        event e = new event();
        show1.addItemListener(e);
        show2.addItemListener(e);
    }

    public class event implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            if(show1.isSelected()) {
                label1.setText("You pushed the first checkbox!");
            } else {
                label1.setText("");
            }

            if(show2.isSelected()) {
                label1.setText("You pushed the second checkbox!");
            } else {
                label2.setText("");
            }
        }
    }

    public static void main (String args[]) {
        JCheckBoxTutorial gui = new JCheckBoxTutorial();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(450, 100);
        gui.setVisible(true);
        gui.setTitle("Checkbox Tutorial");
    }
}
