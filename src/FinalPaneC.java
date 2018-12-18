import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FinalPaneC extends Main{

    @FXML
    private Label totalOutput;

    @FXML
    private Label aBombEquivalent;


    @FXML
    private void initialize() {
        totalOutput.setText(String.format("%6.3e",totalPE));
        double temp = (SPE - totalPE) / aBombPowerx9;
        for(int i = 0; i < 9; i++)
            temp = temp/10;
        aBombEquivalent.setText(String.format("%6.3e",temp));
    }

    @FXML
    void backToChoicePane(ActionEvent event) {
        switchUI("ChoicePane.fxml", totalOutput);
    }
}
