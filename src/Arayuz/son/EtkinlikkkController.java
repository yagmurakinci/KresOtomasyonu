/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class EtkinlikkkController implements Initializable {

    private Button sayfayadon;
   
    @FXML
    private Button once;
    @FXML
    private Button onayla;
    @FXML
    private Button onaylama;

    /**
     * Initializes the controller class.
     */
    
    Conformbox c=new Conformbox();
    @Override
     public void initialize(URL url, ResourceBundle rb) {
         
       
    }    

   

    @FXML
    void oncekinedon(MouseEvent event) throws IOException {
        Stage s = (Stage) once.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("veli.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }

    @FXML
    void onayla(MouseEvent event) {
      c.display("ETKİNLİKLER", "Etkinliğe katılımı onayladınız");
    }

    @FXML
    void onaylama(MouseEvent event) {
        c.display("ETKİNLİKLER", "Etkinliğe katılımı onaylamadınız");
    }
    
}
