package Practice_GUI_Files;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* A program for Text Areas */

class Ta extends JFrame {
    JTextArea textarea;
    JButton button;
    JLabel label;

    public Ta() {
        setLayout(new FlowLayout());

        textarea = new JTextArea(5,30);
        add(textarea);

        button = new JButton("Click here to put text into label");
        add(button);

        label = new JLabel("");
        add(label);

        event e = new event();
        button.addActionListener(e);
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String text = textarea.getText();
            if(text == null ? "" == null : text.equals("")) {
                label.setText("Please enter some text");
            } else {
                label.setText(text);
                textarea.setText("");
            }
        }
    }

    public static void main (String args[]) {
        Ta gui = new Ta();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(400,200);
        gui.setVisible(true);
    }
}
