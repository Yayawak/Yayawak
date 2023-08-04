package GUI.Components;
import java.awt.*;
import javax.swing.*;

public class Rect extends JPanel {
    private Color color;
    public Rect(Rectangle r, Color color) {
        super();
        // Rectangle r = new Rectangle(x, y, w, h);
        this.color = color;
        setBackground(color);
        setBounds(r);
    }
}
