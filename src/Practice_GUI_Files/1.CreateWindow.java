package Practice_GUI_Files;

import javax.swing.JFrame;

/* Create basic Window */

class CreateWindow extends JFrame
{
    public static void main (String args[])
    {
        CreateWindow gui = new CreateWindow();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(200, 200);
        gui.setVisible(true);
        gui.setTitle("First GUI");
    }

}
