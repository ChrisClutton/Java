package Practice_Graphics_Files;

import java.awt.*;
import javax.swing.*;

class Frame {

    public static void main(String args[]) {
        new Frame();

    }

    public Frame() {
        JFrame gui = new JFrame();
        gui.setTitle("Paintings");
        gui.setSize(300, 300);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Painting panel = new Painting();

        Container pane = gui.getContentPane();
        pane.setLayout(new GridLayout(1, 1));

        pane.add(panel);
        gui.setVisible(true);
    }
}
