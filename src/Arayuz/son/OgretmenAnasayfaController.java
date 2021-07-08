
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


public class OgretmenAnasayfaController implements Initializable {

    @FXML
    private Button ogrenci_bilgi;
    @FXML
    private Button ders_programi;
    @FXML
    private Button beslenme_raporu;
    @FXML
    private Button uyku_raporu;
    @FXML
    private Button ilac_takibi;
    @FXML
    private Button gelisim_raporu;
    @FXML
    private Button etkinlik_raporu;
    @FXML
    private Button anasayfa;
	
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    
    @FXML
    private void ogrencibilgilerisayfasi(MouseEvent event) throws IOException {
          Stage s = (Stage)ogrenci_bilgi.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("OgrenciKayit.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
        
    }

    @FXML
    private void dersprogramiisayfasi(MouseEvent event) throws IOException
    {
        Stage s = (Stage)ders_programi.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("DersProgrami.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
        
       
    }

    @FXML
    private void beslenme_raporu(MouseEvent event) throws IOException {
         Stage s = (Stage)beslenme_raporu.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("BeslenmeRaporu.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }

    @FXML
    private void uyku_raporu(MouseEvent event) throws IOException {
        Stage s = (Stage)uyku_raporu.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("UykuRaporu.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }

    @FXML
    private void ilac_takibi(MouseEvent event) throws IOException {
        Stage s = (Stage)ilac_takibi.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("IlacTakipRaporu.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }

    @FXML
    private void gelisim_raporu(MouseEvent event) throws IOException {
         Stage s = (Stage)gelisim_raporu.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("GelisimRaporu.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }

    @FXML
    private void etkinlik_raporu(MouseEvent event) throws IOException {
         Stage s = (Stage)etkinlik_raporu.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("EtkinlikKatilimRaporu.fxml"));
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
