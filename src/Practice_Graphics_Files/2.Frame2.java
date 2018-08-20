package Practice_Graphics_Files;

import java.awt.*;
import javax.swing.*;

class Frame2 {

    public static void main(String args[]) {
        new Frame2();

    }

    public Frame2() {
        JFrame gui = new JFrame();
        gui.setTitle("Illusions");
        gui.setSize(270, 180);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        IllusionPanel panel = new IllusionPanel();

        Container pane = gui.getContentPane();
        pane.setLayout(new GridLayout(1, 1));

        pane.add(panel);
        gui.setVisible(true);
    }
}

