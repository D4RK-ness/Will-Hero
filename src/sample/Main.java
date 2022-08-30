/*PRATEEK MISHRA 2020102
  KRISHNASAI ADDALA 2020142
 */

package sample;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainMenu.fxml")));
        primaryStage.setTitle("Willy Hero");
        primaryStage.setScene(new Scene(root, 585, 370));
        primaryStage.show();

        Controller controller = new Controller();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
