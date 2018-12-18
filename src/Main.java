import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.text.DecimalFormat;

import static javafx.application.Application.launch;

public class Main extends Application {

    public void switchUI(String fileName, Label locator){
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fileName));
            Stage stage = (Stage) locator.getScene().getWindow();
            Scene scene = new Scene(root, 1600,900);
            stage.setScene(scene);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/ChoicePane.fxml"));
            Scene scene = new Scene(root, 1600, 900);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Set Up");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static double totalPE;
    public static double SPE;

    public double EarthMassx24 = 5.972;
    public double MarsMassx23 = 6.39;
    public double SunMassx30 = 1.989;
    public double ISSMass = 417289;
    public double MoonMassx22 = 7.34767309;
    public double aBombPowerx9 = 4.184;
    DecimalFormat df = new DecimalFormat("#.###");

    public double G = .0000000000667;

    public static void main(String[] args) {
        launch(args);
    }


}
