package view;

import domain.Controller;

import javax.swing.*;

public class MainFrame extends JFrame {

    private Controller controller;

    public MainFrame() {
        controller = new Controller();

        GamePanel gamePanel = new GamePanel(controller.getGameField());

        this.add(gamePanel);

        this.setTitle("Game 2048");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

}
