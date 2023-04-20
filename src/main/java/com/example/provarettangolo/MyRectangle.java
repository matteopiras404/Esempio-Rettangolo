package com.example.provarettangolo;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MyRectangle extends Node {
    Stage stage;
    int x,y;
    float width, height;
    Rectangle rectangle;
    MyRectangle(Stage stage, int x, int y, float width, float height){
        this.stage = stage;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.rectangle = new Rectangle();

        rectangle.setFill(Color.GRAY);
    }

    public Rectangle getRect(){
        //Setting the properties of the rectangle
        rectangle.setX(x);
        rectangle.setY(y);
        rectangle.setWidth(width);
        rectangle.setHeight(height);

        return rectangle;
    }

    public void setColor(Color color){
        rectangle.setFill(color);
    }


}
