package src.view.game;

import src.utils.SnakeGameParameters;
import src.utils.SnakeGameState;

import javax.swing.*;
import java.awt.*;

public class SnakeGamePane extends JPanel {
    SnakeGameField gameField;
    SnakeGameStats gameStats;
    JButton leaveButton;

    public SnakeGamePane() {
        // Create contents
        gameField = new SnakeGameField();
        gameStats = new SnakeGameStats();
        leaveButton = new JButton("Leave game");

        // Set layout
        this.setLayout(new GridLayout(1, 2, 10, 10));

        // Craft right pane - stats and "leave" button
        JPanel paneUI = new JPanel();
        paneUI.setLayout(new BoxLayout(paneUI, BoxLayout.Y_AXIS));
        paneUI.add(gameStats, BorderLayout.CENTER);
        paneUI.add(leaveButton, BorderLayout.PAGE_END);

        this.add(gameField);
        this.add(paneUI);
    }

    public JButton getLeaveElement() {
        return leaveButton;
    }

    public void setParameters(SnakeGameParameters gameParameters) {
        gameField.setDimensions(gameParameters.height, gameParameters.width);
    }

    public void updateGameField(SnakeGameState gameState) {
        gameField.updateGameField(gameState);
    }

    public void gameExit() {
        gameField.gameExit();
    }
}
