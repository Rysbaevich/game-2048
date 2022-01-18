package view;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        GamePanel gamePanel = new GamePanel();

        this.add(gamePanel);
        this.setVisible(true);

    }

}
