package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
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


public class Film extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        /*Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hall");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();*/

        StackPane root = new StackPane();
        Label title = new Label("Neuen Film erstellen");
        Text filmName = new Text("Name");
        Text fsk = new Text("FSK");
        Text category = new Text("Kategorie");

        RadioButton normal = new RadioButton("Normal");
        RadioButton DDD = new RadioButton("3D");
        RadioButton DDDD = new RadioButton("4D");
        Button drop = new Button("Abbrechen");
        Button add = new Button("Hinzufügen");
        ComboBox comboBoxFSK = new ComboBox(FXCollections.observableArrayList("0","6","12","16","18"));
        ComboBox comboBoxCategory = new ComboBox(FXCollections.observableArrayList("Thriller","Action","Drama","Horror","Fantasy"));
        TextField textFieldFilmName = new TextField();
        textFieldFilmName.setPrefWidth(110);

        ToggleGroup toggleGroup = new ToggleGroup();
        normal.setToggleGroup(toggleGroup);
        DDD.setToggleGroup(toggleGroup);
        DDDD.setToggleGroup(toggleGroup);

        GridPane gridPane = new GridPane();
        gridPane.setHgap(70);
        gridPane.setVgap(10);
        gridPane.add(filmName, 0, 1);
        gridPane.add(fsk, 0, 2);
        gridPane.add(category, 0, 3);
        gridPane.add(normal, 0, 4);
        gridPane.add(drop, 0, 5);
        gridPane.add(DDD, 1, 4);
        gridPane.add(textFieldFilmName, 2, 1);
        gridPane.add(comboBoxFSK, 2, 2);
        gridPane.add(comboBoxCategory, 2, 3);
        gridPane.add(DDDD, 2, 4);
        gridPane.add(add, 2, 5);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(title);
        borderPane.setCenter(gridPane);
        borderPane.setPadding(new Insets(10, 20, 0, 20));

        root.getChildren().add(borderPane);

        primaryStage.setTitle("Film");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
