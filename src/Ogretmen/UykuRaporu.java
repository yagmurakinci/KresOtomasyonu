package Ogretmen;

import java.util.Scanner;

public class UykuRaporu {
    private String isimSoyisim;
    private double uykuSaati;
	private double uyanmaSaati;
	private double toplamUyku;
	
	
	/*public UykuRaporu (double uykuSaati, double uyanmaSaati, double toplamUyku) {
		this.uykuSaati=uykuSaati;
		this.uyanmaSaati=uyanmaSaati;
		this.toplamUyku=toplamUyku; }*/
        
         Scanner klavye=new Scanner(System.in);
		
	public String getIsimSoyisim() {
		return isimSoyisim;
	}
	public void setIsimSoyisim(String isimSoyisim) {
		this.isimSoyisim = isimSoyisim;
	}
	
	public double getuykuSaati () {
		return uykuSaati;
	}
	public void setuykuSaati (double uykuSaati) {
		this.uykuSaati=uykuSaati;
	}
	
	public double getuyanmaSaati () {
		return uyanmaSaati;
	}
	public void setuyanmaSaati (double uyanmaSaati) {
		this.uyanmaSaati=uyanmaSaati;
	}

	public double gettoplamUyku () {
		return toplamUyku;
	}
	public void settoplamUyku (double toplamUyku) {
		this.toplamUyku=toplamUyku;
	}
	
	
             public void cikti(String isimSoyisim) 
        {
           System.out.println("------- U Y K U  R A P O R U-------");
          this.isimSoyisim=isimSoyisim;
          System.out.println("Uyku bilgilerini ogrenmek istediginiz ogrencinin adini giriniz:");
          isimSoyisim=klavye.next();
              switch(isimSoyisim)
            {
                case "Cansu":
		//System.out.println("Ogrencinin ismi:" + this.getIsimSoyisim());
                this.uykuSaati= 13.15;
		System.out.println("Ogrencinin uyku saati:" + this.uykuSaati);
                this.uyanmaSaati=14.45; 
		System.out.println("Ogrencinin uyanma saati:" + this.uyanmaSaati);
                this.toplamUyku=2;
                System.out.println("Ogrencinin toplam uyku saati:" +this.toplamUyku);
                 
                 break;
                 
                case "Yagmur":
 		//System.out.println("Ogrencinin ismi:" + this.getIsimSoyisim());
                this.uykuSaati= 13.15;
		System.out.println("Ogrencinin uyku saati:" + this.uykuSaati);
                this.uyanmaSaati=14.45; 
		System.out.println("Ogrencinin uyanma saati:" + this.uyanmaSaati);
                this.toplamUyku=2;
                System.out.println("Ogrencinin toplam uyku saati:" +this.toplamUyku);
                 
                 break;
                 
                case "Tugba":
                //System.out.println("Ogrencinin ismi:" + this.getIsimSoyisim());
                this.uykuSaati= 13.15;
		System.out.println("Ogrencinin uyku saati:" + this.uykuSaati);
                this.uyanmaSaati=14.45; 
		System.out.println("Ogrencinin uyanma saati:" + this.uyanmaSaati);
                this.toplamUyku=2;
                System.out.println("Ogrencinin toplam uyku saati:" +this.toplamUyku);
                 
                 break;
                 
                 default:
                       System.out.println("BOYLE BIR OGRENCIMIZ BULUNMAMAKTADIR...");   
                     break;
                      
              }
            
        }
		/*System.out.println("");
		System.out.println("------- Ogrenci Uyku Bilgisi -------");
		System.out.println("Uyku Saati:" + this.uykuSaati);
		System.out.println("Uyanma Saati:" + this.uyanmaSaati);
		System.out.println("Toplam Uyku:" + this.toplamUyku);
	}*/

    
    
}
