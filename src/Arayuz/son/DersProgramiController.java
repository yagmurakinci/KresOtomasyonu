package Arayuz.son;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author grung
 */
public class DersProgramiController implements Initializable {

    @FXML
    private Button once;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    void oncekinedon(MouseEvent event) throws IOException {
        Stage s = (Stage) once.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("veli.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show(); }
    
}
