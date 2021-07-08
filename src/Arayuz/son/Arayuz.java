/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arayuz.son;


import GenelBilgilendirmeler.OkulBilgileri;
import Ogretmen.BeslenmeRaporu;
import Ogretmen.EtkinlikKatilimRaporu;
import Ogretmen.GelisimRaporu;
import Ogretmen.IlacTakipRaporu;
import Ogretmen.UykuRaporu;
import Veli.Duyuru;
import Veli.EtkinlikIzinOnayi;
import Veli.Etkinlikler;
import Veli.YemekMenusu;
import Yonetici.OgrenciKayit;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class Arayuz extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

   
    public static void main(String[] args) {
        launch(args);
        
        OkulBilgileri okulbilgi = new OkulBilgileri() ;
        OgrenciKayit ok=new OgrenciKayit();
        Duyuru duyuru=new Duyuru();
        BeslenmeRaporu beslenmerapor= new BeslenmeRaporu();
        YemekMenusu yemek= new YemekMenusu();
        Etkinlikler etkinlik = new Etkinlikler();
        EtkinlikIzinOnayi etkinlikizinonay = new EtkinlikIzinOnayi("");
        EtkinlikKatilimRaporu etkinlikrapor= new EtkinlikKatilimRaporu();
        GelisimRaporu gelisimrapor=new GelisimRaporu();
        IlacTakipRaporu ilactakip = new IlacTakipRaporu();
        UykuRaporu uykurapor = new UykuRaporu();
        
      
        Scanner klavye=new Scanner(System.in);
        int secim ;
      
       
      
      System.out.println("OGRENMEK ISTEDIGINIZ DURUM ICIN BELIRTILEN RAKAMA BASINIZ...");
      
      System.out.println("*Ogrenci Kayit icin 1'e basiniz: ");
      System.out.println("*Genel Bilgilendirme icin 2'ye basiniz: ");
      System.out.println("*Ders Programi ve Duyurular icin 3'e basiniz: ");      
      System.out.println("*Yemek Menusu icin 4'e basınız:");
      System.out.println("*Etkinlik Sayfasi ve Etkinlik Onayi icin 5'e basiniz: ");
      System.out.println("*Ogrenciye ait Raporlar icin 6'ya basiniz: ");
     
      
      
      secim=klavye.nextInt(); 
      
         switch(secim)
      {
          case 1:
              ok.ogrencibilgileri();
          break;
          
          
          case 2:
        	  okulbilgi.cikti();
          break;
          
          case 3:
                 duyuru.cikti();
         break;
        
          case 4:
              yemek.cikti0();
                  
          break;
          
          case 5:
               etkinlik.cikti();
               etkinlikizinonay.cikti();
              
          break;
          
          case 6:
                     
             int sec;
             System.out.println(" 'Gelisim' raporunu goruntulemek icin 1'e basiniz: ");
             System.out.println(" 'Ilac Takip' raporunu goruntulemek icin 2'ye basiniz: ");
             System.out.println(" 'Uyku' raporunu goruntulemek icin 3'e basiniz: ");
             System.out.println(" 'Beslenme' raporunu goruntulemek icin 4'e basiniz: ");
             System.out.println(" 'Etkinlik' raporunu goruntulemek icin 5'e basiniz: ");
             sec=klavye.nextInt();
             if(sec==1)
             {
               gelisimrapor.cikti("");    
             }else if(sec==2)
             {
                ilactakip.cikti("");     
             }else if(sec==3)
             {
              uykurapor.cikti("");   
             }else if(sec==4)
             {
               beslenmerapor.cikti();  
             }else if(sec==5)
             {
               etkinlikrapor.cikti();  
             }
                break;
                   
                }
    }
    
}
