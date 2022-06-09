package ru.gb.study.java.andrey.level2_hw_lesson4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextArea historyArea;
    @FXML
    private TextField userMessage;

    public void clickSendButton(ActionEvent actionEvent) {
        String message = userMessage.getText();
        historyArea.appendText(message + "\n");
        userMessage.clear();
        userMessage.requestFocus();
    }
}
