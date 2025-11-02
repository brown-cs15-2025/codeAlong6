package codeAlong6;

import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

public class Game {
    private Pane pane;
    private Cloud cloud;

    public Game(Pane gamePane) {
        this.pane = gamePane;
        this.pane.setFocusTraversable(true);
        this.pane.setOnKeyPressed((KeyEvent e) -> this.onKeyPressed(e));
        this.cloud = new Cloud(Constants.CLOUD_1, gamePane);
        new Cloud(Constants.CLOUD_2, gamePane);
    }

    private void onKeyPressed(KeyEvent e) {
        switch (e.getCode()) {
            case RIGHT:
                this.cloud.moveRight();
            default:
                break;
        }
        e.consume();
    }
}
