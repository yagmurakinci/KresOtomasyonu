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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author grung
 */
public class veliPage implements Initializable {

    @FXML
    private Button dersprogrami;
    @FXML
    private Button duyurular;
    @FXML
    private Button yemek_menusu;
    @FXML
    private Button etkinlikler;
    @FXML
    private Button anasayfa;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       dersprogrami.setOnAction((ActionEvent event) -> {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DersProgrami.fxml"));

            try {
                Parent root = loader.load();
                DersProgramiController derscontroller = loader.getController();

                Stage stage = new Stage();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        );
       
       
    }    


   

    @FXML
    private void duyurular(MouseEvent event) throws IOException {
         Stage s = (Stage)duyurular.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Duyurular.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }

    
    Conformbox c =new Conformbox();
    @FXML
    private void yemekMenu(MouseEvent event) throws IOException 
    {
        
        //c.display("Yemek Menusu","pğkdz - ebmfd \n\n");
        
        Stage s = (Stage)yemek_menusu.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("YemekMenusu.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }

    @FXML
    private void etkinlikler(MouseEvent event) throws IOException {
        
        
       // c.display("ETKİNLİKLER", "paten \n yüzme \n müze");
        
        Stage s = (Stage)etkinlikler.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("etkinlikkk.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }

    
    @FXML
    private void dersProgrami(MouseEvent event) throws IOException {
        Stage s = (Stage) dersprogrami.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("DersProgrami.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }

    @FXML
    private void anasayfayadon(MouseEvent event) throws IOException
    {
        Stage s = (Stage) anasayfa.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }
    
}
