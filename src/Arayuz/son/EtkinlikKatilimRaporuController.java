/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arayuz.son;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author grung
 */
public class EtkinlikKatilimRaporuController implements Initializable {

    @FXML
    private Button ekle;
    @FXML
    private TextField adSoyad;
    @FXML
    private TextField etkinlik_gir;
    @FXML
    private Button sil;
    @FXML
    private Button guncelle;
    @FXML
    private ComboBox<String> katilmadurumu;
    @FXML
    private ListView<String> tablo;
    @FXML
    private Button once;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        katilmadurumu.getItems().add("katıldı");
        katilmadurumu.getItems().add("katılmadı");
       
    }    


    @FXML
    void ekle(ActionEvent event) {
         try {
    		ogr().ogrenciEtkinlikKaydet();
    		Guncelle(event);
    	}
    	catch(Exception e){
    	}
    }

    private ogrenciler ogr(){
        ogrenciler ogr = new ogrenciler();
    		ogr.setAdSoyad(adSoyad.getText());
    		ogr.setEtkinlik_gir(etkinlik_gir.getText());
                ogr.setKatilmadurumu(katilmadurumu.getSelectionModel().getSelectedItem().toString());
    		
                return ogr;
    }
    
    @FXML
    void adSoyad(ActionEvent event) {
    }

    @FXML
   void etkinlik_gir(ActionEvent event) {
    }

    @FXML
    void Guncelle(ActionEvent event) {
        try{
    		ogr().ogrenciEtkinlikGuncelle(tablo.getSelectionModel().getSelectedItem().toString());
        }catch(Exception e){
            e.getMessage();
        }
        tablo.getItems().clear();
		ArrayList<String> okunan = new ArrayList();
		Dosya od = new Dosya();
		okunan=od.OgrDosyaOkuma("etkinlik.txt");
		for (int i = 0; i <okunan.size(); i++) {
			tablo.getItems().add(okunan.get(i));
		}
    }
    

    @FXML
    void sil(ActionEvent event) {
         ogrenciler ogr = new ogrenciler();		
		String ogrSil = tablo.getSelectionModel().getSelectedItem();
		ogr.ogrenciSil(ogrSil,"etkinlik.txt");
		Guncelle(event);
		System.out.println("Seçilen Silindi");
    }

    @FXML
    void oncekinedon(MouseEvent event) throws IOException {
        Stage s = (Stage) once.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("OgretmenAnasayfa.fxml"));

        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }

    
}
