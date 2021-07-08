package Ogretmen;

import Veli.YemekMenusu;
import dosyaislemleri.Dosyaislemleri;
import java.util.Scanner;

public class BeslenmeRaporu{ 
    private String isimSoyisim;
	private String yemekYemeBilgisi;

        Scanner klavye=new Scanner(System.in);
        Dosyaislemleri dosya=new Dosyaislemleri();
        
	/*?public BeslenmeRaporu(String isimSoyisim, String yemekYemeBilgisi) {
		this.isimSoyisim = isimSoyisim;
		this.yemekYemeBilgisi = yemekYemeBilgisi;
	}*/
        

	public String getYemekYemeBilgisi() {
		return yemekYemeBilgisi;
	}

	public void setYemekYemeBilgisi(String yemekYemeBilgisi) {
		this.yemekYemeBilgisi = yemekYemeBilgisi;
	}

	public String getIsimSoyisim() {
		return isimSoyisim;
	}
	public void setIsimSoyisim(String isimSoyisim) {
		this.isimSoyisim = isimSoyisim;
	}

	
	public void cikti()
        {
            
                dosya.olustur("ogrenciler");
                dosya.read("ogrenciler");
		System.out.println("");
		System.out.println("-------B E S L E N M E  R A P O R U-------");
          
                System.out.println("Yemek yeme bilgisini ogrenmek istediginiz ogrencinin adini giriniz:"); 
                this.isimSoyisim=klavye.next();
              
                switch(isimSoyisim)
                        
                        {
                            case "Yagmur":
                            yemekYemeBilgisi="yedi";
                            System.out.println(isimSoyisim+" isimli ogrenci yemegini "+yemekYemeBilgisi);
                            break;
                            
                          
                            case "Cansu":
                            yemekYemeBilgisi="yemedi";
                            System.out.println(isimSoyisim+" isimli ogrenci yemegini "+yemekYemeBilgisi);
                            break;
                            
                            case "Tugba":
                            yemekYemeBilgisi="yedi";
                            System.out.println(isimSoyisim+" isimli ogrenci yemegini "+yemekYemeBilgisi);
                            break;
                            
                            default:
                                System.out.println("BOYLE BIR OGRENCIMIZ BULUNMAMAKTADIR...");
                            break;
                        }
                 
		
		 
                 
        }
        
}