package codeAlong6;

import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

public class Game {

    Pane pane;
    Cloud currCloud;
    public Game(Pane pane){
        this.pane = pane;
        this.pane.setFocusTraversable(true);
        this.pane.setOnKeyPressed((KeyEvent e) -> this.onKeyPressed(e));
    }

    public void onKeyPressed(KeyEvent e){
        switch (e.getCode()){
            case DIGIT1:
                this.currCloud = new Cloud(Constants.CLOUD_1,this.pane);
                break;
            case DIGIT2:
                this.currCloud = new Cloud(Constants.CLOUD_2,this.pane);
                break;
            case DOWN:
                this.currCloud.moveDown();
                break;
            default:
                break;
        }
        e.consume();
    }
}
