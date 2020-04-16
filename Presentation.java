package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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


public class Presentation extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        /*Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hall");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();*/

        StackPane root = new StackPane();
        Label title = new Label("Neue Vorstellung erstellen");
        Text filmName = new Text("Film");
        Text hall = new Text("Saal");
        Text time = new Text("Zeit");
        Button drop = new Button("Abbrechen");
        Button add = new Button("Hinzufügen");

        ComboBox hours = new ComboBox(FXCollections.observableArrayList("01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24"));
        hours.setPrefWidth(50);
        ComboBox minutes = new ComboBox(FXCollections.observableArrayList("00","05","10","15","20","25","30","35","40","45","50","55"));
        minutes.setPrefWidth(50);
        Text text = new Text(":");
        GridPane gridPaneMini = new GridPane();
        gridPaneMini.add(hours,0,0);
        gridPaneMini.add(text, 1,0);
        gridPaneMini.add(minutes,2,0);
        gridPaneMini.setHgap(5);
        ComboBox comboBoxFilm = new ComboBox(FXCollections.observableArrayList("Star Wars", "Zoomania","Resident Evil"));
        ComboBox comboBoxHall = new ComboBox(FXCollections.observableArrayList("Saal 1","Saal 2", "Saal 3"));


        GridPane gridPane = new GridPane();
        gridPane.setHgap(70);
        gridPane.setVgap(30);
        gridPane.add(filmName, 0, 1);
        gridPane.add(hall, 0, 2);
        gridPane.add(time, 0, 3);
        gridPane.add(drop, 0, 4);
        gridPane.add(comboBoxFilm, 1, 1);
        gridPane.add(comboBoxHall, 1, 2);
        gridPane.add(gridPaneMini, 1, 3);
        gridPane.add(add, 1, 4);


        BorderPane borderPane = new BorderPane();
        borderPane.setTop(title);
        borderPane.setCenter(gridPane);
        borderPane.setPadding(new Insets(10, 20, 0, 20));


        root.getChildren().add(borderPane);

        primaryStage.setTitle("Presentation");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
