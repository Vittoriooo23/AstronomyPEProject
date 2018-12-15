import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class ChoicePaneC extends Main{

    @FXML
    private CheckBox SunCB;

    @FXML
    private CheckBox ISSCB;

    @FXML
    private Label WhichPlanetLabel;

    @FXML
    private CheckBox MarsCB;

    @FXML
    private CheckBox MoonCB;

    @FXML
    private CheckBox EarthCB;

    @FXML
    private CheckBox AsteroidCB;

    @FXML
    private Button Science;

    @FXML
    void EarthSelected(ActionEvent event) {
        MarsCB.setSelected(false);
        SunCB.setSelected(false);
    }

    @FXML
    void MarsSelected(ActionEvent event) {
        EarthCB.setSelected(false);
        SunCB.setSelected(false);
    }

    @FXML
    void SunSelected(ActionEvent event) {
        MarsCB.setSelected(false);
        EarthCB.setSelected(false);
    }

    @FXML
    void ISSSelected(ActionEvent event) {
        AsteroidCB.setSelected(false);
        MoonCB.setSelected(false);
    }

    @FXML
    void AsteroidSelected(ActionEvent event) {
        ISSCB.setSelected(false);
        MoonCB.setSelected(false);
    }

    @FXML
    void MoonSelected(ActionEvent event) {
        ISSCB.setSelected(false);
        AsteroidCB.setSelected(false);
    }

    @FXML
    void Begin(ActionEvent event) {
        if(EarthCB.isSelected() && ISSCB.isSelected()){
            switchUI("EarthISS.fxml", WhichPlanetLabel);
        }
        else if(EarthCB.isSelected() && AsteroidCB.isSelected()){
            switchUI("EarthAsteroid.fxml", WhichPlanetLabel);
        }
        else if(EarthCB.isSelected() && MoonCB.isSelected()){
            switchUI("EarthMoon.fxml", WhichPlanetLabel);
        }
        else if(MarsCB.isSelected() && ISSCB.isSelected()){
            switchUI("MarsISS.fxml", WhichPlanetLabel);
        }
        else if(MarsCB.isSelected() && AsteroidCB.isSelected()){
            switchUI("MarsAsteroid.fxml", WhichPlanetLabel);
        }
        else if(MarsCB.isSelected() && MoonCB.isSelected()){
            switchUI("MarsMoon.fxml", WhichPlanetLabel);
        }
        else if(SunCB.isSelected() && ISSCB.isSelected()){
            switchUI("SunISS.fxml", WhichPlanetLabel);
        }
        else if(SunCB.isSelected() && AsteroidCB.isSelected()){
            switchUI("SunAsteroid.fxml", WhichPlanetLabel);
        }
        else if(SunCB.isSelected() && MoonCB.isSelected()){
            switchUI("SunMoon.fxml", WhichPlanetLabel);
        }

    }
}
