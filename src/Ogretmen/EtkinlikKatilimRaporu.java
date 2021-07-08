package Ogretmen;

import dosyaislemleri.Dosyaislemleri;
import java.util.Scanner;

public  class EtkinlikKatilimRaporu {
    private String isimSoyisim;
    private String etkinlikKatilmaBilgisi;
        
        
        Scanner klavye=new Scanner(System.in);
        Dosyaislemleri dosya=new Dosyaislemleri();

    /*public EtkinlikKatilimRaporu(String isimSoyisim, String etkinlikKatilmaBilgisi) {
		this.isimSoyisim = isimSoyisim;
		this.etkinlikKatilmaBilgisi = etkinlikKatilmaBilgisi;
	}*/

	public String getEtkinlikKatilmaBilgisi() {
		return etkinlikKatilmaBilgisi;
	}

	public void setEtkinlikKatilmaBilgisi(String etkinlikKatilmaBilgisi) {
		this.etkinlikKatilmaBilgisi = etkinlikKatilmaBilgisi;
	}

	public String getIsimSoyisim() {
		return isimSoyisim;
	}
	public void setIsimSoyisim(String isimSoyisim) {
		this.isimSoyisim = isimSoyisim;
	}

	
	public void cikti() {
            dosya.olustur("EtkinlikKatilimRaporu");
            System.out.println("Etkinlik Katilim Raporu" );
            dosya.read("EtkinlikKatilimRaporu");
            
                System.out.println("");
		System.out.println("-------E T K I N L I K  K A T I L I M  R A P O R U--------");
                dosya.olustur("ogrenciler");
                dosya.read("ogrenciler");
                System.out.println("Etkinlik katilim raporunu gormek istediginiz ogrencinin adini giriniz:"); 
                this.isimSoyisim=klavye.next();
              
                switch(isimSoyisim)
                        
                        {
                            case "Yagmur":
                            String etkinlikKatilimBilgisi = "katildi";
                            System.out.println(this.getIsimSoyisim()+" isimli ogrenci etkinlige "+etkinlikKatilimBilgisi);
                            break;
                            
                            case "Cansu":
                            etkinlikKatilimBilgisi="katildi";
                            System.out.println(this.getIsimSoyisim()+" isimli ogrenci etkinlige "+etkinlikKatilimBilgisi);
                            break;
                            
                            case "Tugba":
                            etkinlikKatilimBilgisi="katilmadi";
                            System.out.println(this.getIsimSoyisim()+" isimli ogrenci etkinlige "+etkinlikKatilimBilgisi);
                            break;
                            
                            default:
                                System.out.println("BOYLE BIR OGRENCIMIZ BULUNMAMAKTADIR...");
                            break;
                            
		//System.out.println("");
		//System.out.println("------- Ogrenci Etkinlige Katilim Bilgisi -------");
		//System.out.println(isimSoyisim+" isimli ogrenci etkinlige "+katilmaDurumu);
	}
           		
            	
        }
}
