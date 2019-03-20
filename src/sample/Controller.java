package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label helloWorld1;
    public Label labela;

    public void submit (ActionEvent actionEvent){
        helloWorld1.setText("Hi!");
    }

    public void ispisi(ActionEvent actionEvent) {
        labela.setText("hello world");
    }
}

