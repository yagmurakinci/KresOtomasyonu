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
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author grung
 */
public class BeslenmeRaporuController implements Initializable {

    @FXML
    private Button ekle;
    @FXML
    private TextField adSoyad_gir;
    @FXML
    private ListView<String> tablo;
    @FXML
    private Button sil;
    @FXML
    private ComboBox<String> yemedurumu;
    @FXML
    private Button guncelle2;
    @FXML
    private Button once;
    @FXML
    private TextField tarih_gir1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         yemedurumu.getItems().add("Yedi");
         yemedurumu.getItems().add("Yemedi");
        // TODO
    }    


    @FXML
    void ekle(ActionEvent event) {
        try {
    		
    		ogr().ogrenciBeslenmeKaydet();
    		Guncelle(event);
    	}
    	catch(Exception e){
    	}
    }

    private ogrenciler ogr(){
        ogrenciler ogr = new ogrenciler();
    		ogr.setAdSoyad_gir(adSoyad_gir.getText());
    		ogr.setYemedurumu(yemedurumu.getSelectionModel().getSelectedItem().toString());
                ogr.setTarih_gir1(tarih_gir1.getText());
                return ogr;
    }
    
    @FXML
    void adSoyad_gir(ActionEvent event) {
    }


    @FXML
    void sil(ActionEvent event) {
        ogrenciler ogr = new ogrenciler();		
		String ogrSil = tablo.getSelectionModel().getSelectedItem();
		ogr.ogrenciSil(ogrSil,"beslenme.txt");
		Guncelle(event);
		System.out.println("Seçilen Silindi");
    }
    
    @FXML
    void Guncelle(ActionEvent event) {
        try{
            ogr().ogrenciBeslenmeGuncelle(tablo.getSelectionModel().getSelectedItem().toString());
        }catch(Exception e){
            e.getMessage();
        }
                
        tablo.getItems().clear();
		ArrayList<String> okunan = new ArrayList();
		Dosya od = new Dosya();
		okunan=od.OgrDosyaOkuma("beslenme.txt");
		for (int i = 0; i <okunan.size(); i++) {
			tablo.getItems().add(okunan.get(i));
		}
    }

    void tarih_gir(ActionEvent event) {
    }

    @FXML
    void oncekinedon(MouseEvent event) throws IOException {
        Stage s = (Stage) once.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("OgretmenAnasayfa.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }

    @FXML
    void beslenmeTarih(ActionEvent event) {
    }
    
}
