import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class MarsAsteroidC extends Main{

    @FXML
    private ChoiceBox<String> distanceChB;

    @FXML
    private TextField distanceTF;

    @FXML
    private Label Calculate;

    @FXML
    private TextField massTF;

    @FXML
    private Label outputDistance;

    @FXML
    private TextField convDistanceTF;

    @FXML
    private void initialize() {
        distanceChB.getItems().addAll("miles", "meters");
    }

    @FXML
    void ConvertUnit(ActionEvent event) {
        if(distanceChB.getValue()=="miles"){
            outputDistance.setText(df.format(Double.parseDouble(convDistanceTF.getText())*1.60934) + "km");
        }
        else if(distanceChB.getValue()=="meters"){
            outputDistance.setText(df.format(Double.parseDouble(convDistanceTF.getText())*.001) + "km");
        }
    }

    @FXML
    void runCalculations(MouseEvent event) {
        if(Double.parseDouble(massTF.getText()) > 0 && Double.parseDouble(distanceTF.getText()) > 0) {
            totalPE = -1 * G * MarsMassx23 * Double.parseDouble(massTF.getText()) / (Double.parseDouble(distanceTF.getText())+ 6371);
            SPE = -1 * G * MarsMassx23 * Double.parseDouble(massTF.getText()) / 6371;
            for(int i = 0; i < 23; i++)
                totalPE = totalPE * 10;

        }
        switchUI("FinalPane.fxml", Calculate);
    }


    @FXML
    void backToChoicePane(ActionEvent event) {
        switchUI("ChoicePane.fxml", Calculate);
    }

}
