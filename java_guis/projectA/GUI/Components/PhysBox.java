package GUI.Components;
import java.awt.*;
import java.util.List;

import javax.swing.*;

public class PhysBox extends Rect {
    // physics behavior
    private static List<PhysBox> allPhysBox;
    public PhysBox(Rectangle r, Color c) {
        super(r, c);
        allPhysBox.add(this);
    }

    // Point point = new Point(5, 5);

    public void checkCollision() {
        Rectangle thisRect = getBounds();
    }
}
