/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ogretmen;

import dosyaislemleri.Dosyaislemleri;
import java.util.Scanner;

public class IlacTakipRaporu {
    private String isimSoyisim;
	private String ilacIsim;
	private double ilacZamani;
        
          Scanner klavye=new Scanner(System.in);
          Dosyaislemleri dosya=new Dosyaislemleri();

   

	/*public IlacTakipRaporu(String isimSoyisim, String ilacIsim, double ilacZamani) {
		this.isimSoyisim = isimSoyisim;
		this.ilacIsim = ilacIsim;
		this.ilacZamani = ilacZamani;
	}*/

   

	public String getIsimSoyisim() {
		return isimSoyisim;
	}
	public void setIsimSoyisim(String isimSoyisim) {
		this.isimSoyisim = isimSoyisim;
	}
	
	public String getIlacIsim() {
		return ilacIsim;
	}
	public void setIlacIsim(String ilacIsim) {
		this.ilacIsim = ilacIsim;
	}
	public double getilacZamani () {
		return ilacZamani;
	}
	public void setilacZamani (double ilacZamani) {
		this.ilacZamani=ilacZamani;
	}

            public void cikti(String isimSoyisim) 
        {
            
          this.isimSoyisim=isimSoyisim;
          System.out.println("-------I L A C  T A K I P  R A P O R U-------");
          System.out.println("Ilac Takip bilgilerini ogrenmek istediginiz ogrencinin adini giriniz:");
          isimSoyisim=klavye.next();
              switch(isimSoyisim)
            {
                case "Cansu":
                
		//System.out.println("Ogrencinin ismi:" + this.getIsimSoyisim());
                this.ilacIsim= "xanax";
		System.out.println("Ogrencinin kullanmasi gereken ilac:" + this.ilacIsim);
                this.ilacZamani=13.00;
		System.out.println("Ogrencinin ilaci kullanmasi gereken saat:" + this.ilacZamani);
                    break;
                    
                 case "Yagmur":
                 //System.out.println("Ogrencinin ismi:" + this.getIsimSoyisim());
                 this.ilacIsim= "xanax";
                 System.out.println("Ogrencinin kullanmasi gereken ilac:" + this.ilacIsim);
                 this.ilacZamani=13.30;
                 System.out.println("Ogrencinin ilaci kullanmasi gereken saat:" + this.ilacZamani);
                    break;   
                    
                 case "Tugba":
                //System.out.println("Ogrencinin ismi:" + this.getIsimSoyisim());
                this.ilacIsim= "xanax";
		System.out.println("Ogrencinin kullanmasi gereken ilac:" + this.ilacIsim);
                this.ilacZamani=13.30;
		System.out.println("Ogrencinin ilaci kullanmasi gereken saat:" + this.ilacZamani);
                    break;   
                    
                 default:
                     System.out.println("BOYLE BIR OGRENCIMIZ BULUNMAMAKTADIR...");
                     
                     break;
                    
              }
          
            dosya.olustur("IlacTakipRaporu");
            System.out.println("Ilac Takip Raporu" );
            dosya.read("IlacTakipRaporu"); 		
            	
            
		//System.out.println("");
		//System.out.println("------- Ilac Bilgisi -------");
		//System.out.println("Ogrencinin ismi:" + this.isimSoyisim);
		//System.out.println("Ilacin ismi:" + this.ilacIsim);
		//System.out.println("Ilacin zamani:" + this.ilacZamani);
        }
}

