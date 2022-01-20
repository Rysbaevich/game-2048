package view;

import domain.GameField;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private GameField gameField;
    private int tileSize;

    public GamePanel(GameField gameField) {
        this.setBackground(Color.BLACK);

        this.gameField = gameField;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int borderSize = 15;
        int size = 400;

        tileSize = size / 4;

        size += borderSize * 5;

        int x = (this.getWidth() - size) / 2;
        int y = (this.getHeight() - size) / 2;

        g.setColor(Color.LIGHT_GRAY);
        g.fillRoundRect(x, y, size, size, 15,15);

        g.setColor(Color.BLACK);
        for (int row = y + borderSize, i = 0; row < y + size; row += tileSize, i++) {
            for (int col = x + borderSize, j = 0; col < x + size; col += tileSize, j++) {

                switch (gameField.getMatrix()[i][j]) {
                    case 0:
                        g.setColor(new Color(0, 0, 0));
                        drawTile(g, col, row, "");
                        break;
                    case 2:
                        g.setColor(new Color(255, 3, 23));
                        drawTile(g, col, row, "2");
                        break;
                    case 4:
                        g.setColor(new Color(92, 255, 205));
                        drawTile(g, col, row, "4");
                        break;
                    case 8:
                        g.setColor(new Color(184, 217, 237));
                        drawTile(g, col, row, "8");
                        break;
                    case 16:
                        g.setColor(new Color(72, 87, 255));
                        drawTile(g, col, row, "16");
                        break;
                    case 32:
                        g.setColor(new Color(217, 255, 105));
                        drawTile(g, col, row, "32");
                        break;
                    case 64:
                        g.setColor(new Color(216, 71, 255));
                        drawTile(g, col, row, "64");
                        break;
                    case 128:
                        g.setColor(new Color(255, 195, 32));
                        drawTile(g, col, row, "128");
                        break;
                    case 256:
                        g.setColor(new Color(2, 195, 62));
                        drawTile(g, col, row, "256");
                        break;
                    case 512:
                        g.setColor(new Color(87, 217, 255));
                        drawTile(g, col, row, "512");
                        break;
                    case 1024:
                        g.setColor(new Color(255, 176, 168));
                        drawTile(g, col, row, "1024");
                        break;
                    case 2048:
                        g.setColor(new Color(203, 191, 255));
                        drawTile(g, col, row, "2048");
                        break;
                }
                col += borderSize;
            }
            row += borderSize;
        }
    }

    private void drawTile(Graphics g, int x, int y, String number) {
        g.fillRoundRect(x, y, tileSize, tileSize, 10, 10);

        int size = 60 - 10 * number.length();

        x = x + tileSize / 2 - size / 2;
        y = y + tileSize / 2;

        g.setColor(Color.WHITE);

        g.setFont(new Font(Font.MONOSPACED, Font.BOLD, size));

        g.drawString(number, x, y);
    }

}
