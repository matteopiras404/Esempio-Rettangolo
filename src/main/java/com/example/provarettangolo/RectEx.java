package com.example.provarettangolo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RectEx extends Application {

    private final int W_W = 300, W_H = 200;

    @Override
    public void start(Stage stage) {

        MyRectangle rec1 = new MyRectangle(stage, 100, W_H / 3, 50, 30);
        MyRectangle rec2 = new MyRectangle(stage, 200, W_H / 3, 20, 30);
        rec2.setColor(Color.BLUE);

        //Creating a Group object
        Group root = new Group();
        root.getChildren().addAll(rec1.getRect(), rec2.getRect());

        //Creating a scene object
        Scene scene = new Scene(root, W_W, W_H);

        //Setting title to the Stage
        stage.setTitle("Drawing a Rectangle");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }

    public static void main(String[] args){ launch(args); }
}


