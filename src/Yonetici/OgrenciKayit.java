package Yonetici;

import dosyaislemleri.Dosyaislemleri;
import java.util.Scanner;

public class OgrenciKayit {
        private String isim;
        private String soyisim;
        private String cinsiyet;
        private int dogumyili;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }
	

	/*public OgrenciKayit(String isimsoyisim, String cinsiyet, int dogumyili) {
		this.isimsoyisim = isimsoyisim;
		this.cinsiyet = cinsiyet;
		this.dogumyili = dogumyili;
	}*/
    
        Dosyaislemleri dosya=new Dosyaislemleri();
        
        Scanner klavye=new Scanner(System.in);

	
	public String getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	public int getDogumyili() {
		return dogumyili;
	}
	public void setDogumyili(int dogumyili) {
		this.dogumyili = dogumyili;
	}
        
         public void ogrencibilgileri()
         {
            System.out.println("------O G R E N C I  K A Y I T---------"); 
            System.out.println("Lutfen kaydedilecek ogrencinin adini giriniz:");
            this.isim=klavye.next();
             
            System.out.println("Lutfen kaydedilecek ogrencinin soyadini giriniz");
            this.soyisim=klavye.next();
             
            System.out.println("Lutfen kaydedilecek ogrencinin dogum yilini giriniz");
            this.dogumyili=klavye.nextInt();
             
            System.out.println("Lutfen kaydedilecek ogrencinin cinsiyetini giriniz");
            this.cinsiyet=klavye.next();
             
        dosya.olustur("yenikayit");
        dosya.write(("Son Kaydedilen Ogrencinin Adi:") +this.getIsim()+("     Son Kaydedilen Ogrencinin Soyadi:") +this.getSoyisim()+("     Son Kaydedilen Ogrencinin Cinsiyeti:") + this.getCinsiyet() +("     Son Kaydedilen Ogrencinin Dogum Yili:")   + this.getDogumyili() ,  "yenikayit");
        dosya.read("yenikayit"); 
         }

  
    }
        
