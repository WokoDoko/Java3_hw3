import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


// С переходом на Java15 получаю ошибку "Error: JavaFX runtime components are missing, and are required to run this application". Не понимаю, как исправить.

public class StartClient extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("/main.fxml"));
    primaryStage.setTitle("Walkie Talkie");
    primaryStage.getIcons().add(new Image("/images/send_button_paw.png"));
    primaryStage.setScene(new Scene(root, 400, 500));
    primaryStage.show();
  }


  public static void main(String[] args) {
    launch(args);
  }
}
