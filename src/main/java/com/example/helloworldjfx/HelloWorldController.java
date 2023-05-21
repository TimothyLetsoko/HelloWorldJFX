package com.example.helloworldjfx;


import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloWorldController {
    @FXML
    private Label lblHello;
    private int counter = 2;
    public void greet(){
        if(counter%2==0){
            lblHello.setText("Hello World");
            counter++;
        }else{
            lblHello.setText("");
            counter++;
        }
    }
}