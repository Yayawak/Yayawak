package Scenes;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import Components.Rect;


// public class MainFrame extends JFrame {
public class MainFrame {
    static JFrame mainFrame;
    // static int mfWidth = getWi

    public MainFrame() {
        mainFrame = new JFrame();
        initMF();
        JPanel mainPanel = new JPanel();

        Rect bg = new Rect(new Rectangle(
            // 10, 30, 200, 100
            // 10, 30, getWidth(), getHeight()
            0, 0, mainFrame.getWidth(),
            mainFrame.getHeight()
        ),
            new Color(0, 128, 128, 128)
        );

        GridFrame gridFrame = new GridFrame(5, 4, 0.8f);

        mainPanel.add(gridFrame);
        mainPanel.add(bg);
        mainPanel.setLayout(null);
        mainFrame.add(mainPanel);
    }

    void initMF() {
        mainFrame.setSize(700, 500);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
