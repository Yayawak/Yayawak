package GUI;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

import GUI.Components.PhysBox;
import GUI.Scene.Ground;

public class MainFrame {
    public static JFrame frame;
    public static JButton btn;
    public MainFrame() {
        frame = new JFrame();
        btn = new JButton("Down please");
        initialize();
    }

    private void initialize() {
        frame.setVisible(true);
        frame.setSize(1000, 500);
        JPanel panel_0 = new JPanel();
        panel_0.setLayout(null);
        setupTestButton();


        //* ADDERS
        // panel_0.add(new Ground());
        // Character c = new Character();
        // frame.addKeyListener(c);
        // panel_0.add(c);

        frame.add(panel_0);
        frame.setLocationByPlatform(true);
        closeFrame();
    }

    private void setupTestButton() {
        int fx = (int)(frame.getWidth() * .8);
        int fy = (int) (frame.getHeight() * .1);
        btn.setBounds(fx, fy, 150, 50);
        btn.setBackground(Color.magenta);
        btn.addActionListener(e -> {
        });
    }

    private void closeFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
