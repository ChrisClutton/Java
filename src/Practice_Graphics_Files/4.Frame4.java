package Practice_Graphics_Files;

import java.awt.*;
import javax.swing.*;

class Frame4 {

    public static void main(String args[]) {
        new Frame4();

    }

    public Frame4() {
        JFrame gui = new JFrame();
        gui.setTitle("Random Colour Panels");
        gui.setSize(300, 300);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container pane = gui.getContentPane();
        pane.setLayout(new GridLayout(5, 5));

        for(int x = 1; x <= 25; x++) {
            RandomColorPanel panel = new RandomColorPanel();
            pane.add(panel);
        }

        gui.setVisible(true);
    }
}
