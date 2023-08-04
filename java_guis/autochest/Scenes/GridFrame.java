package Scenes;

import javax.swing.JPanel;
import javax.swing.text.AttributeSet.ColorAttribute;

import Components.Rect;

import java.awt.*;
import java.util.stream.IntStream;

public class GridFrame extends JPanel {
    int[] mainFrameWH = {
        MainFrame.mainFrame.getWidth(),
        MainFrame.mainFrame.getHeight()
    };
    int[] mainFrameXY = {
        MainFrame.mainFrame.getX(),
        MainFrame.mainFrame.getY(),
    };
    float scale;
    int[] gridWH = new int[2];
    int[] oneGridWH = new int[2];
    int row;
    int col;

    public GridFrame(int row, int col, float scale) {
        this.row = row;
        this.col = col;
        this.scale = scale;
        init();
        draw();
    }

    void init() {
        gridWH[0] = (int)(mainFrameWH[0] * scale);
        gridWH[1] = (int)(mainFrameWH[1] * scale);
        setLayout(null);
        setSize(gridWH[0], gridWH[1]);
        // setSize(200,400);

        oneGridWH[0] = (int)(gridWH[0] / col);
        oneGridWH[1] = (int)(gridWH[1] / row);
        System.out.println(oneGridWH[0]);
        System.out.println(oneGridWH[1]);
    }

    void draw() {
        // setSize(new Dimension);

        Rect[] grids = new Rect[row * col];
        int curY = mainFrameXY[1];
        int count = 0;
        for (int i = 0; i < row; i++) {
            int curX = mainFrameXY[0];
            for (int j = 0; j < col; j++) {
                // Color c = (count % 2 == 0) ? Color.red : Color.blue;
                Color c = (count % 2 == 0) ?
                    (j % 2 == 0) ? Color.red : Color.blue
                    : Color.green;
                Rect r = new Rect(
                    new Rectangle(curX, curY, oneGridWH[0], oneGridWH[1]) ,
                    c
                );
                grids[count] = r;
                ;
                curX += oneGridWH[0];
                count += 1;
            }
            curY += oneGridWH[1];
        }
        IntStream.range(0, grids.length).
            mapToObj(i -> grids[i]).
            forEach(g -> {
                // System.out.println(g.getBounds(getBounds()));
                add(g);
            });
    }

}
