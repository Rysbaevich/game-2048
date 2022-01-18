package view;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    public GamePanel() {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int size = 420;

        int x = (this.getWidth() - size) / 2;
        int y = (this.getHeight() - size) / 2;

        g.fillRoundRect(x, y, size, size, 10,10);
    }
}
