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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author grung
 */
public class YoneticiGirisController implements Initializable {

    @FXML
    private TextField kullaniciadi;
    @FXML
    private PasswordField sifre;
    @FXML
    private Button giris;
    @FXML
    private Button anasayfa1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void kullaniciadi(ActionEvent event) {
    }

    @FXML
    private void sifre(ActionEvent event) {
    }

    @FXML
    void girisyap(MouseEvent event) throws IOException 
    {
        if(this.kullaniciadi.getText().equals("Admin")&&this.sifre.getText().equals("password")){
        Stage s = (Stage) giris.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("OgrenciKayit.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
        }else{
                Conformbox c=new Conformbox();
                    c.display("Uyarı", "Hatalı Kullanıcı Adı Veya Şifre");
        }
    }

    @FXML
    private void anasayfayadon(MouseEvent event) throws IOException
    {
        Stage s = (Stage) anasayfa1.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }
    
}
