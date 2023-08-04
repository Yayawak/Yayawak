package Components;

import javax.swing.JPanel;
import java.awt.*;

public class Rect extends JPanel {
    public Rect(Rectangle r, Color c) {
        setBounds(r);
        setBackground(c);
    }
}
