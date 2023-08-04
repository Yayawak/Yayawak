import javax.swing.SwingUtilities;

import GUI.MainFrame;

public class Main {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame mainFrame = new MainFrame();
                // new
            }
        });
    }
}
