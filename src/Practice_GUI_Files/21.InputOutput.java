package Practice_GUI_Files;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/* Input/Output program */

class InputOutput extends JFrame {

    JLabel label;
    JTextField tf;
    JButton button;

    public InputOutput() {
        setLayout(new FlowLayout());

        label = new JLabel("Enter text to write to file");
        add(label);

        tf = new JTextField(10);
        add(tf);

        button = new JButton("Write to file");
        add(button);

        Event e = new Event();
        button.addActionListener(e);
    }

    public class Event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                String word = tf.getText();
                FileWriter stream = new FileWriter("C:\\Users\\Chris\\Documents\\file.txt");
                BufferedWriter out = new BufferedWriter(stream);
                out.write(word);
                out.close();
            } catch (Exception ex) {}
        }
    }

    public static void main(String args []) {
        InputOutput gui = new InputOutput();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(300, 100);
        gui.setTitle("Writer");
        gui.setVisible(true);
    }
}
