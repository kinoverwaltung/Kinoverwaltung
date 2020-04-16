package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Hall extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        /*Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hall");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();*/

        StackPane root = new StackPane();
        Label title = new Label("Neuen Raum erstellen");
        Text roomName = new Text("Name");
        Text row = new Text("Reihen");
        Text column = new Text("Spalten");
        Text roomNameColored = new Text("Farbe");
        RadioButton normal = new RadioButton("Normal");
        RadioButton DDD = new RadioButton("3D");
        RadioButton DDDD = new RadioButton("4D");
        Button drop = new Button("Abbrechen");
        Button add = new Button("Hinzufügen");

        TextField textFieldRoomName = new TextField();
        textFieldRoomName.setPrefWidth(110);
        SpinnerValueFactory<Integer> value = new SpinnerValueFactory.IntegerSpinnerValueFactory(3, 15);
        SpinnerValueFactory<Integer> value2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(3, 15);
        Spinner<Integer> columnSpinner = new Spinner<Integer>();
        Spinner<Integer> rowSpinner = new Spinner<Integer>();
        rowSpinner.setValueFactory(value);
        columnSpinner.setValueFactory(value2);
        ToggleGroup toggleGroup = new ToggleGroup();
        normal.setToggleGroup(toggleGroup);
        DDD.setToggleGroup(toggleGroup);
        DDDD.setToggleGroup(toggleGroup);
        ColorPicker colorPicker = new ColorPicker(Color.BLACK);

        GridPane gridPane = new GridPane();
        gridPane.setHgap(70);
        gridPane.setVgap(10);
        gridPane.add(roomName, 0, 1);
        gridPane.add(column, 0, 2);
        gridPane.add(row, 0, 3);
        gridPane.add(roomNameColored, 0, 4);
        gridPane.add(normal, 0, 5);
        gridPane.add(drop, 0, 6);
        gridPane.add(DDD, 1, 5);
        gridPane.add(textFieldRoomName, 2, 1);
        gridPane.add(columnSpinner, 2, 2);
        gridPane.add(rowSpinner, 2, 3);
        gridPane.add(colorPicker, 2, 4);
        gridPane.add(DDDD, 2, 5);
        gridPane.add(add, 2, 6);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(title);
        borderPane.setCenter(gridPane);
        borderPane.setPadding(new Insets(10, 20, 0, 20));

        colorPicker.setOnAction(actionEvent -> {
            roomNameColored.setFill(colorPicker.getValue());
        });

        root.getChildren().add(borderPane);

        primaryStage.setTitle("Hall");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
