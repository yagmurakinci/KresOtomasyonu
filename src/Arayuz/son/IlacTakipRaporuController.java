
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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author grung
 */
public class IlacTakipRaporuController implements Initializable {

    @FXML
    private TextField adSoyad_gir;
    @FXML
    private TextField ilacAd_gir;
    @FXML
    private TextField ilacSaat_gir;
    @FXML
    private Button ekle;
    @FXML
    private Button sil;
    @FXML
    private ListView<String> tablo;
    @FXML
    private Button guncelle4;
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
    		ogr().ogrenciIlacKaydet();
    		Guncelle(event);
                
    	}
    	catch(Exception e){
    	}

    }
    
    private ogrenciler ogr(){
        ogrenciler ogr = new ogrenciler();		
                        ogr.setAdsoyadilac(adSoyad_gir.getText());
    		ogr.setIlacAd_gir(ilacAd_gir.getText());
    		ogr.setIlacSaat_gir(ilacSaat_gir.getText());
                return ogr;
    }

    @FXML
    void sil(ActionEvent event) {
         ogrenciler ogr = new ogrenciler();		
		ogr.ogrenciSil(sec(),"ilac.txt");
		Guncelle(event);
		System.out.println("Seçilen Silindi");
    }

    @FXML
    void Guncelle(ActionEvent event) {
        try{
                        
                ogr().ogrenciIlacGuncelle(tablo.getSelectionModel().getSelectedItem().toString());
        }
        catch(Exception e){
            e.getMessage();
        }
        tablo.getItems().clear();
		ArrayList<String> okunan = new ArrayList();
		Dosya od = new Dosya();
		okunan=od.OgrDosyaOkuma("ilac.txt");
		for (int i = 0; i <okunan.size(); i++) {
		tablo.getItems().add(okunan.get(i));
                }
        
    }
    private String sec(){
                String sec=tablo.getSelectionModel().getSelectedItem();
               return sec;
    }

    @FXML
    void adSoyad(ActionEvent event) {
    }

    @FXML
    void IlacAd(ActionEvent event) {
    }

    @FXML
    void IlacSaat(ActionEvent event) {
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
