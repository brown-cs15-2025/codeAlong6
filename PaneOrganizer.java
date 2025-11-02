package codeAlong6;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 * Organizes GUI layout for workshop5.
 */
public class PaneOrganizer {
    private BorderPane root;

    public PaneOrganizer() {
        this.root = new BorderPane();
        this.setUp();
    }

    public Pane getRoot() {
        return this.root;
    }

    private void setUp() {
        Pane gamePane = new Pane();
        this.root.setCenter(gamePane);
        new Game(gamePane);
    }
}
