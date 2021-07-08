/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arayuz.son;

import java.io.IOException;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class OgrenciKayitController {

    @FXML
    public ListView<String> tablo;

    @FXML
    public TextField adsoyad;

    @FXML
    public TextField tc;

    @FXML
    public ComboBox<String> cinsiyet;
    @FXML
    private Button anasayfa;

    @FXML
    void ekle(ActionEvent event) {
    	try {
    		ogrenciler ogr = new ogrenciler();
    		ogr.setOgrAdSoyad(adsoyad.getText());
    		ogr.setOgrTc(tc.getText());
    		ogr.setOgrCinsiyet(cinsiyet.getSelectionModel().getSelectedItem().toString());
    		ogr.ogrenciKaydet();
    		Guncelle(event);
    	}
    	catch(Exception e){
    	}
    }

    @FXML
    void guncelle(ActionEvent event) {
    		
		String ogrSil = tablo.getSelectionModel().getSelectedItem();
		try {
			
    		ogrenciler ogr2 = new ogrenciler();
    		ogr2.setOgrAdSoyad(adsoyad.getText());
    		ogr2.setOgrTc(tc.getText());
    		ogr2.setOgrCinsiyet(cinsiyet.getSelectionModel().getSelectedItem().toString());
    		ogr2.ogrenciGuncelle(ogrSil);
    		Guncelle(event);
    	}
    	catch(Exception e){
    	}
    }

    @FXML
    void sil(ActionEvent event) {
    	ogrenciler ogr = new ogrenciler();		
		String ogrSil = tablo.getSelectionModel().getSelectedItem();
		ogr.ogrenciSil(ogrSil,"dosya.txt");
		Guncelle(event);
		System.out.println("Seçilen Silindi");
    }
    
    @FXML
    public void Guncelle(ActionEvent event){
		tablo.getItems().clear();
		ArrayList<String> okunan = new ArrayList();
		Dosya od = new Dosya();
		okunan=od.OgrDosyaOkuma("dosya.txt");
		for (int i = 0; i <okunan.size(); i++) {
			tablo.getItems().add(okunan.get(i));
		}
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

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * Initializes the controller class.
     */
   /* @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ekle(ActionEvent event) {
    }

    @FXML
    private void sil(ActionEvent event) {
    }

    @FXML
    private void guncelle(ActionEvent event) {
    }

    @FXML
    private void adsoyad(ActionEvent event) {
    }

    @FXML
    private void tc(ActionEvent event) {
    }*/
    

