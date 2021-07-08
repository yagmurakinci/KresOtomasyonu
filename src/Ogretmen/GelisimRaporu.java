/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ogretmen;

import dosyaislemleri.Dosyaislemleri;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class GelisimRaporu {
    private String isimSoyisim;
	private String motorGelisim;
	private String sosyalDuygusalGelisim;
	private String dilGelisimi;
	private String bilisselGelisim;
	private String ozbakimBecerileri;
	private double boy;
	private double kilo;

        Scanner klavye=new Scanner(System.in);
        Dosyaislemleri dosya=new Dosyaislemleri();
        
	/*?public GelisimRaporu(String isimSoyisim, String motorGelisim, String sosyalDuygusalGelisim, String dilGelisimi, String bilisselGelisim, String ozbakimBecerileri, double boy, double kilo) {
		this.isimSoyisim = isimSoyisim;
		this.motorGelisim = motorGelisim;
		this.sosyalDuygusalGelisim = sosyalDuygusalGelisim;
		this.dilGelisimi = dilGelisimi;
		this.bilisselGelisim = bilisselGelisim;
		this.ozbakimBecerileri = ozbakimBecerileri;
		this.boy = boy;
		this.kilo = kilo;
	}*/

	public String getIsimSoyisim() {
		return isimSoyisim;
	}

	public void setIsimSoyisim(String isimSoyisim) {
		this.isimSoyisim = isimSoyisim;
	}

	public String getMotorGelisim() {
		return motorGelisim;
	}

	public void setMotorGelisim(String motorGelisim) {
		this.motorGelisim = motorGelisim;
	}

	public String getSosyalDuygusalGelisim() {
		return sosyalDuygusalGelisim;
	}

	public void setSosyalDuygusalGelisim(String sosyalDuygusalGelisim) {
		this.sosyalDuygusalGelisim = sosyalDuygusalGelisim;
	}

	public String getDilGelisimi() {
		return dilGelisimi;
	}

	public void setDilGelisimi(String dilGelisimi) {
		this.dilGelisimi = dilGelisimi;
	}

	public String getBilisselGelisim() {
		return bilisselGelisim;
	}

	public void setBilisselGelisim(String bilisselGelisim) {
		this.bilisselGelisim = bilisselGelisim;
	}

	public String getOzbakimBecerileri() {
		return ozbakimBecerileri;
	}

	public void setOzbakimBecerileri(String ozbakimBecerileri) {
		this.ozbakimBecerileri = ozbakimBecerileri;
	}

	public double getBoy() {
		return boy;
	}

	public void setBoy(double boy) {
		this.boy = boy;
	}

	public double getKilo() {
		return kilo;
	}

	public void setKilo(double kilo) {
		this.kilo = kilo;
	}

	public void cikti(String isimSoyisim) 
        {
          this.isimSoyisim=isimSoyisim;
          System.out.println("---------G E L I S I M  R A P O R U----------");
          System.out.println("Gelisim bilgilerini ogrenmek istediginiz ogrencinin adini giriniz:");
          isimSoyisim=klavye.next();
              switch(isimSoyisim)
            {
                case "Cansu":
                
		//System.out.println("Ogrencinin ismi:" + this.getIsimSoyisim());
                this.motorGelisim="iyi";
		System.out.println("Ogrencinin Motor Gelisimi:" + this.motorGelisim);
                this.sosyalDuygusalGelisim="pekiyi";
		System.out.println("Ogrencinin Sosyal ve Duygusal Gelisimi:" + this.sosyalDuygusalGelisim);
               this.dilGelisimi="pekiyi";
               System.out.println("Ogrencinin Dil Gelisimi:" + this.dilGelisimi);
               this.bilisselGelisim="gelistirilmeli";
		System.out.println("Ogrencinin Bilissel Gelisimi:" + this.bilisselGelisim);
                this.ozbakimBecerileri="pekiyi";
		System.out.println("Ogrencinin OzBakim Becerileri:" + this.ozbakimBecerileri);
                this.boy=1.30;
		System.out.println("Ogrencinin Guncel Boyu:" + this.boy);
                this.kilo=35;
		System.out.println("Ogrencinin Guncel Kilosu:" + this.kilo);    
                    break;
                    
               
                case "Yagmur":
		//System.out.println("Ogrencinin ismi:" + this.getIsimSoyisim());
                	this.motorGelisim="iyi";
            		System.out.println("Ogrencinin Motor Gelisimi:" + this.motorGelisim);
                            this.sosyalDuygusalGelisim="pekiyi";
            		System.out.println("Ogrencinin Sosyal ve Duygusal Gelisimi:" + this.sosyalDuygusalGelisim);
                           this.dilGelisimi="pekiyi";
                           System.out.println("Ogrencinin Dil Gelisimi:" + this.dilGelisimi);
                           this.bilisselGelisim="gelistirilmeli";
            		System.out.println("Ogrencinin BiliÅŸsel Gelisimi:" + this.bilisselGelisim);
                            this.ozbakimBecerileri="pekiyi";
            		System.out.println("Ogrencinin OzBakim Becerileri:" + this.ozbakimBecerileri);
                            this.boy=1.30;
            		System.out.println("Ogrencinin Guncel Boyu:" + this.boy);
                            this.kilo=35;
            		System.out.println("Ogrencinin Guncel Kilosu:" + this.kilo);    
                                break;
                        
                    
                case "Tugba":
                //System.out.println("Ogrencinin ismi:" + this.getIsimSoyisim());
                	this.motorGelisim="iyi";
            		System.out.println("Ogrencinin Motor Gelisimi:" + this.motorGelisim);
                            this.sosyalDuygusalGelisim="kotu";
            		System.out.println("Ogrencinin Sosyal ve Duygusal Gelisimi:" + this.sosyalDuygusalGelisim);
                           this.dilGelisimi="kotu";
                           System.out.println("Ogrencinin Dil Gelisimi:" + this.dilGelisimi);
                           this.bilisselGelisim="kotu";
            		System.out.println("Ogrencinin BiliÅŸsel Gelisimi:" + this.bilisselGelisim);
                            this.ozbakimBecerileri="kotu";
            		System.out.println("Ogrencinin OzBakim Becerileri:" + this.ozbakimBecerileri);
                            this.boy=1.10;
            		System.out.println("Ogrencinin Guncel Boyu:" + this.boy);
                            this.kilo=50;
            		System.out.println("Ogrencinin Guncel Kilosu:" + this.kilo);    
                                break;
                    
                     default:
                       System.out.println("BOYLE BIR OGRENCIMIZ BULUNMAMAKTADIR...");   
                     break;
                            
            }
            
		
	}
}
