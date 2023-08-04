package GUI;

import java.awt.Color;

import GUI.Components.PhysBox;
import java.awt.event.*;
import java.awt.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class Character extends PhysBox implements KeyListener {
    private static int speed = 20;
    private static int[] pos = {0,0};
    private float[] velocity = {0,0};
    float g = 9.8f;
    public Character() {
        super(
            // 300, 100, 50, 100, Color.green
            new Rectangle(300, 100, 50, 100),
            Color.green
        );
        ScheduledExecutorService executer = Executors.newScheduledThreadPool(1);
        // executer.scheduleAtFixedRate(runner, 0 , 100, TimeUnit.MILLISECONDS);
        executer.scheduleAtFixedRate(runner, 0 ,
            // 100, TimeUnit.MILLISECONDS);
            1, TimeUnit.SECONDS);
        pos[0] = getX();
        pos[1] = getY();
    }

    Runnable runner = new Runnable() {
        @Override
        public void run() {
            addGravity();
        }
    };

    private void addGravity() {
        velocity[1] = (int)(velocity[1] + g);
        shiftCharacter(0, -(int)velocity[1]);
    }

    private void shiftCharacter(int shiftX, int shiftY
        ) {
        int newX = getX() + shiftX;
        int newY = getY() - shiftY;
        setLocation(newX, newY);
        repaint();
    }



    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // if (e.getKeyChar() == '')
        int keyCode = e.getKeyCode();

        switch (keyCode ) {
            case KeyEvent.VK_UP:
                shiftCharacter(0, speed);
                break;
            case KeyEvent.VK_DOWN:
                shiftCharacter(0, -speed);
                break;
            case KeyEvent.VK_LEFT:
                shiftCharacter(-speed, 0);
                break;
            case KeyEvent.VK_RIGHT:
                shiftCharacter(speed, 0);
                break;

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }
}
