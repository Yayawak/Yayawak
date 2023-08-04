package GUI.Scene;
import java.awt.Color;

import javax.swing.JPanel;
import GUI.MainFrame;
import GUI.Components.PhysBox;
import java.awt.*;

public class Ground extends PhysBox {
    private static int mainframe_h = MainFrame.frame.getHeight();
    private static int mainframe_w = MainFrame.frame.getWidth();
    public Ground() {
        super(
            new Rectangle(
            0,
            (int)(mainframe_h - (mainframe_h * 0.3)),
            mainframe_w,
            200
            ),
            Color.DARK_GRAY
        );
    }
}
