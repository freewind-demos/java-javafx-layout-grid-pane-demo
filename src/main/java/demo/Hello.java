package demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Hello extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello");
        GridPane root = new GridPane() {{
            setHgap(10);
            setVgap(10);
            setPadding(new Insets(0, 10, 0, 10));

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    add(cell(i + "," + j), i, j);
                }
            }

            add(cell("7, 8, 3, 3"), 7, 8, 3, 3);
            add(cell("8, 2, 3, 3"), 8, 2, 3, 3);
        }};
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    private Pane cell(final String label) {
        return new Pane() {{
            setStyle("-fx-background-color: RED");
            setPrefWidth(50);
            setPrefHeight(50);
            getChildren().add(new Label(label));
        }};
    }
}