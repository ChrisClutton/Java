package Practice_GUI_Files;

import java.awt.*;
import javax.swing.*;

class HelpWindow extends JDialog {
    JLabel label;

    public HelpWindow(JFrame frame) {
        super (frame, "Help Window", true);
        setLayout(new FlowLayout());

        label = new JLabel("This is a help menu!");
        add(label);
    }

}
