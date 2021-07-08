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
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author grung
 */
public class GelisimRaporuController implements Initializable {

    @FXML
    private Button ekle;
    @FXML
    private TextArea motorGelisim;
    @FXML
    private TextArea sosyalDuygusalGelisim;
    @FXML
    private TextArea ozbakimGelisim;
    @FXML
    private TextArea dilGelisim;
    @FXML
    private TextField adSoyad_gir;
    @FXML
    private TextArea bilisselGelisim;
    @FXML
    private ListView<String> tablo;
    @FXML
    private Button sil;
    @FXML
    private Button guncelle3;
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
    void ekle(ActionEvent event) {
        try {
    		ogrenciler ogr = new ogrenciler();
    		ogr.setAdsoyadgelisim(adSoyad_gir.getText());
                ogr.setMotorGelisim(motorGelisim.getText());
    		ogr.setSosyalDuygusalGelisim(sosyalDuygusalGelisim.getText());
                ogr.setOzbakimGelisim(ozbakimGelisim.getText());
                ogr.setDilGelisim(dilGelisim.getText());
                ogr.setBilisselGelisim(bilisselGelisim.getText());
                ogr.ogrenciGelisimKaydet();
    		Guncelle(event);
    	}
    	catch(Exception e){
    	}
    }

    @FXML
     void motorGelisim(MouseEvent event) {
    }

    @FXML
    void sosyalDuygusalGelisim(MouseEvent event) {
    }

    @FXML
    void ozbakimGelisim(MouseEvent event) {
    }

    @FXML
    void dilGelisim(MouseEvent event) {
    }

    @FXML
    void adSoyad_gir(ActionEvent event) {
    }

    @FXML
    void bilisselGelisim(MouseEvent event) {
    }

    private ogrenciler ogr(){
        ogrenciler ogr = new ogrenciler();
    		ogr.setAdsoyadgelisim(adSoyad_gir.getText());
                ogr.setMotorGelisim(motorGelisim.getText());
    		ogr.setSosyalDuygusalGelisim(sosyalDuygusalGelisim.getText());
                ogr.setOzbakimGelisim(ozbakimGelisim.getText());
                ogr.setDilGelisim(dilGelisim.getText());
                ogr.setBilisselGelisim(bilisselGelisim.getText());
                return ogr;
    }

    @FXML
   void sil(ActionEvent event) {
        ogrenciler ogr = new ogrenciler();		
		String ogrSil = tablo.getSelectionModel().getSelectedItem();
		ogr.ogrenciSil(ogrSil,"gelisim.txt");
		Guncelle(event);
		System.out.println("Seçilen Silindi");
    }

    @FXML
    void Guncelle(ActionEvent event) {
        try{
            ogr().ogrenciGelisimGuncelle(tablo.getSelectionModel().getSelectedItem().toString());
        }catch(Exception e){
            e.getMessage();
        }
        tablo.getItems().clear();
		ArrayList<String> okunan = new ArrayList();
		Dosya od = new Dosya();
		okunan=od.OgrDosyaOkuma("gelisim.txt");
		for (int i = 0; i <okunan.size(); i++) {
		tablo.getItems().add(okunan.get(i));
    }}

    @FXML
    void oncekinedon(MouseEvent event) throws IOException {
        Stage s = (Stage) once.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("OgretmenAnasayfa.fxml"));

        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }
    

    
}
