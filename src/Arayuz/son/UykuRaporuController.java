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
public class UykuRaporuController implements Initializable {

    @FXML
    private Button ekle;
    @FXML
    private TextField adSoyad_gir;
    @FXML
    private Button sil;
    @FXML
    private Button guncelle;
    @FXML
    private ListView<String> tablo;
    @FXML
    private TextField tarih_gir2;
    @FXML
    private ComboBox<String> uykuDurumu;
    @FXML
    private Button once;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        uykuDurumu.getItems().add("Uyudu");
        uykuDurumu.getItems().add("Uyumadı");
        // TODO
    }

    @FXML
    void ekle(ActionEvent event) {
        try {
            ogr().ogrenciUykuKaydet();
            Guncelle5(event);
        } catch (Exception e) {
        }
    }

    private ogrenciler ogr() {
        ogrenciler ogr = new ogrenciler();
        ogr.setAdSoyad_gir(adSoyad_gir.getText());
        ogr.setUykuDurumu(uykuDurumu.getSelectionModel().getSelectedItem().toString());
        ogr.setTarih_gir2(tarih_gir2.getText());
        return ogr;
    }

    @FXML
    void sil(ActionEvent event) {
        ogrenciler ogr = new ogrenciler();
        String ogrSil = tablo.getSelectionModel().getSelectedItem();
        ogr.ogrenciSil(ogrSil, "uyku.txt");
        Guncelle5(event);
        System.out.println("Seçilen Silindi");
    }

    void tarih_gir(ActionEvent event) {
    }

    @FXML
    void Guncelle5(ActionEvent event) {
        try {
            ogr().ogrenciUykuGuncelle(tablo.getSelectionModel().getSelectedItem().toString());
        } catch (Exception e) {
            e.getMessage();
        }
        tablo.getItems().clear();
        ArrayList<String> okunan = new ArrayList();
        Dosya od = new Dosya();
        okunan = od.OgrDosyaOkuma("uyku.txt");
        for (int i = 0; i < okunan.size(); i++) {
            tablo.getItems().add(okunan.get(i));
        }

    }

    private String sec() {
        String sec = tablo.getSelectionModel().getSelectedItem();
        return sec;
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
    private void uykuTarih(ActionEvent event) {
    }

}
