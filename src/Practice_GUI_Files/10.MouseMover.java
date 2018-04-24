package Practice_GUI_Files;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/* Program ot randomly move mouse around the screen */

class MouseMover extends JFrame {

    JLabel label1, label2, label3, label4, errorLabel;
    JTextField textField1, textField2, textField3, textField4;
    JButton button;

    public MouseMover() {

        setLayout(new GridLayout(5, 2, 5, 5));

        label1 = new JLabel("Enter number of movements");
        add(label1);

        textField1 = new JTextField();
        add(textField1);

        label2 = new JLabel("Enter delay between movements (ms)");
        add(label2);

        textField2 = new JTextField();
        add(textField2);

        label3 = new JLabel("Enter screen width in pixels");
        add(label3);

        textField3 = new JTextField();
        add(textField3);

        label4 = new JLabel("Enter screen height in pixels");
        add(label4);

        textField4 = new JTextField();
        add(textField4);

        button = new JButton("Start");
        add(button);

        errorLabel = new JLabel("");
        add(errorLabel);

        event e = new event();
        button.addActionListener(e);
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int num = (int)(Double.parseDouble(textField1.getText()));
                int delay = (int)(Double.parseDouble(textField2.getText()));
                int width = (int)(Double.parseDouble(textField3.getText()));
                int height = (int)(Double.parseDouble(textField4.getText()));

                if(num <= 0 || delay <= 0 || width <= 0 || height <= 0) {
                    errorLabel.setText("Please enter positive values");
                }
                else{
                    errorLabel.setText("");

                    try {
                        Robot codsworth = new Robot();
                        for (int x=0; x<=num; x++) {
                            codsworth.mouseMove((int)(Math.random()*width), (int)(Math.random()*height));
                            codsworth.delay(delay);
                        }
                    }
                    catch (AWTException ex) {
                        System.exit(0);
                    }
                }
            }
            catch (Exception exx) {
                errorLabel.setText("Numbers Only");
            }
        }
    }

    public static void main (String args []) {

        MouseMover gui = new MouseMover();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Nice Game");
    }
}
