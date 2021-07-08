/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arayuz.son;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class FXMLDocumentController implements Initializable {

    @FXML
    private Button genelbilgilendirme;
    @FXML
    private Button yonetici;
    @FXML
    private Button veli;
    @FXML
    private Button ogretmen;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    public void genelbilgilendirme(ActionEvent event)throws IOException {
        Stage s = (Stage)genelbilgilendirme.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("GenelBilgilendirme.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }

    @FXML
    public void yonetici(ActionEvent event)throws IOException {
        Stage s = (Stage)yonetici.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("YoneticiGiris.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }

    @FXML
    public void veli(ActionEvent event)throws IOException {
        Stage s = (Stage)veli.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("veliSignUpp.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }

    @FXML
    public void ogretmen(ActionEvent event)throws IOException {
        Stage s = (Stage)ogretmen.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("OgretmenGiris.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }


    
}
