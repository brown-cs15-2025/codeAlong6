package codeAlong6;

import javafx.scene.layout.Pane;

public class Cloud {

    private Bubble[] bubbles;

    public Cloud(int[][] coords, Pane pane) {
        this.bubbles = new Bubble[Constants.NUM_BUBBLES];
        this.generateBubbles(pane, coords);
    }

    private void generateBubbles(Pane pane, int[][] coords) {
        for (int i = 0; i < this.bubbles.length; i++) {
            int xCoord = coords[i][0];
            int yCoord = coords[i][1];
            this.bubbles[i] = new Bubble(pane, xCoord, yCoord);
        }
    }

    public void moveRight() {
        for (Bubble bubble: this.bubbles) {
            bubble.moveRight();
        }
    }
}
