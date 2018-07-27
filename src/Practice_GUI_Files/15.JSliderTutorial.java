package Practice_GUI_Files;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

/* Program for Sliders */

class JSliderTutorial extends JFrame {

    JSlider slider;
    JLabel label;

    public JSliderTutorial() {
        setLayout( new FlowLayout());

        slider = new JSlider(JSlider.HORIZONTAL, 0, 20, 0);
        slider.setMajorTickSpacing(5);
        slider.setPaintTicks(true);
        add(slider);

        label = new JLabel("Current value : 0");
        add(label);

        event e = new event();
        slider.addChangeListener(e);
    }

    public class event implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            int value = slider.getValue();

            label.setText("Current value: " + value);
        }
    }

    public static void main(String atgs[]) {
        JSliderTutorial gui = new JSliderTutorial();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(300,100);
        gui.setVisible(true);
        gui.setTitle(("My First Slier Program"));
    }
}
