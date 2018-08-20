package Practice_Graphics_Files;

import java.awt.*;
import javax.swing.*;

class Frame3 {

    public static void main(String args[]) {
        new Frame3();

    }

    public Frame3() {
        JFrame gui = new JFrame();
        gui.setTitle("Grids");
        gui.setSize(300, 300);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panels panel = new Panels();

        Container pane = gui.getContentPane();
        pane.setLayout(new GridLayout(1, 1));

        pane.add(panel);
        gui.setVisible(true);
    }
}
