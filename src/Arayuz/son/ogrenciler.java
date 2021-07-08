package Arayuz.son;

import java.util.Date;

public class ogrenciler {
		String OgrAdSoyad;
		String OgrTc;
		String OgrCinsiyet;
                String tarih;
                String tarih_gir1;
                String yemedurumu;
                String adSoyad_gir;
                String adSoyad;
                String katilmadurumu;
                String motorGelisim;
                String sosyalDuygusalGelisim;
                String ozbakimGelisim;
                String dilGelisim;
                String bilisselGelisim;
                String ilacAd_gir;
                String ilacSaat_gir;
                String tarih_gir2;
                String uykuDurumu;
                String adsoyadilac;
                String adsoyadgelisim;
                
                
                
                
    public String getTarih_gir2() {
        return tarih_gir2;
    }

    public void setTarih_gir2(String tarih_gir2) {
        this.tarih_gir2 = tarih_gir2;
    }            
                
     public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getTarih_gir1() {
        return tarih_gir1;
    }

    public void setTarih_gir1(String tarih_gir1) {
        this.tarih_gir1 = tarih_gir1;
    }            
                

    public String getAdsoyadgelisim() {
        return adsoyadgelisim;
    }

    public void setAdsoyadgelisim(String adsoyadgelisim) {
        this.adsoyadgelisim = adsoyadgelisim;
    }
                

    public String getAdsoyadilac() {
        return adsoyadilac;
    }

    public void setAdsoyadilac(String adsoyadilac) {
        this.adsoyadilac = adsoyadilac;
    }


    public String getUykuDurumu() {
        return uykuDurumu;
    }

    public void setUykuDurumu(String uykuDurumu) {
        this.uykuDurumu = uykuDurumu;
    }
                
                

    public String getIlacAd_gir() {
        return ilacAd_gir;
    }

    public void setIlacAd_gir(String ilacAd_gir) {
        this.ilacAd_gir = ilacAd_gir;
    }

    public String getIlacSaat_gir() {
        return ilacSaat_gir;
    }

    public void setIlacSaat_gir(String ilacSaat_gir) {
        this.ilacSaat_gir = ilacSaat_gir;
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

    public String getOzbakimGelisim() {
        return ozbakimGelisim;
    }

    public void setOzbakimGelisim(String ozbakimGelisim) {
        this.ozbakimGelisim = ozbakimGelisim;
    }

    public String getDilGelisim() {
        return dilGelisim;
    }

    public void setDilGelisim(String dilGelisim) {
        this.dilGelisim = dilGelisim;
    }

    public String getBilisselGelisim() {
        return bilisselGelisim;
    }

    public void setBilisselGelisim(String bilisselGelisim) {
        this.bilisselGelisim = bilisselGelisim;
    }

    public String getKatilmadurumu() {
        return katilmadurumu;
    }

    public void setKatilmadurumu(String katilmadurumu) {
        this.katilmadurumu = katilmadurumu;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getEtkinlik_gir() {
        return etkinlik_gir;
    }

    public void setEtkinlik_gir(String etkinlik_gir) {
        this.etkinlik_gir = etkinlik_gir;
    }
                String etkinlik_gir;
                

    public String getAdSoyad_gir() {
        return adSoyad_gir;
    }

    public void setAdSoyad_gir(String adSoyad_gir) {
        this.adSoyad_gir = adSoyad_gir;
    }


    public String getYemedurumu() {
        return yemedurumu;
    }

    public void setYemedurumu(String yemedurumu) {
        this.yemedurumu = yemedurumu;
    }

		public String getOgrAdSoyad() {
			return OgrAdSoyad;
		}

		public void setOgrAdSoyad(String ogrAdSoyad) {
			OgrAdSoyad = ogrAdSoyad;
		}

		public String getOgrTc() {
			return OgrTc;
		}

		public void setOgrTc(String ogrTc) {
			OgrTc = ogrTc;
		}

		public String getOgrCinsiyet() {
			return OgrCinsiyet;
		}

		public void setOgrCinsiyet(String ogrCinsiyet) {
			OgrCinsiyet = ogrCinsiyet;
		}
                
                
                
                
                //butonlar
		
		public void ogrenciKaydet() {
			String gelen = getOgrAdSoyad() + " - " + getOgrTc() + " - " + getOgrCinsiyet();
			Dosya ds = new Dosya();
			ds.DosyaKaydet(gelen,"dosya.txt");
		}
		
                public void ogrenciBeslenmeKaydet() {
			String gelen = getAdSoyad_gir() + " - " + getYemedurumu() + " - " + getTarih_gir1();
			Dosya ds = new Dosya();
			ds.DosyaKaydet(gelen,"beslenme.txt");
		}
                
                  public void ogrenciEtkinlikKaydet() {
			String gelen = getAdSoyad() + " - " + getEtkinlik_gir()+"-" + getKatilmadurumu();
			Dosya ds = new Dosya();
			ds.DosyaKaydet(gelen,"etkinlik.txt");
		} 
                
                  public void ogrenciGelisimKaydet() {
			String gelen = getAdsoyadgelisim() + " - " + getMotorGelisim() + " - " + getSosyalDuygusalGelisim() + " - " + getOzbakimGelisim() + " - " + getDilGelisim() + " - " + getBilisselGelisim();
			Dosya ds = new Dosya();
			ds.DosyaKaydet(gelen,"gelisim.txt");
                  }
                  
                  public void ogrenciIlacKaydet() {
			String gelen = getAdsoyadilac() + " - " + getIlacAd_gir()+"-" + getIlacSaat_gir();
                        
			Dosya ds = new Dosya();
			ds.DosyaKaydet(gelen,"ilac.txt");
                  }
                  
                   public void ogrenciUykuKaydet() {
			String gelen = getAdSoyad_gir() + " - " + getUykuDurumu() + " - " + getTarih_gir2();
                        Dosya ds = new Dosya();
			ds.DosyaKaydet(gelen,"uyku.txt");
                  }
                  
                  
                
		public void ogrenciSil(String s,String dosya) {
			Dosya od = new Dosya();
			od.OgrSil(s,dosya);
		}
                
		//ogrenci kayit
		public void ogrenciGuncelle(String silinen) {
			
			String b;
			
			b= getOgrAdSoyad() + " - " + getOgrTc() + " - " + getOgrCinsiyet();
			Dosya ds = new Dosya();
			ds.OgrGuncelle(silinen, b,"dosya.txt");
		}
		
                //beslenme raporu
                public void ogrenciBeslenmeGuncelle(String silinen) {
			String b;
			b= getAdSoyad_gir() + " - " + getYemedurumu() + " - " + getTarih_gir1();
			Dosya ds = new Dosya();
			ds.OgrGuncelle(silinen, b,"beslenme.txt");
		}
                
               //etkinlik raporu
                 public void ogrenciEtkinlikGuncelle(String silinen) {
			
			String b;
			
			b= getAdSoyad() + " - " + getEtkinlik_gir()+"-" + getKatilmadurumu();
			Dosya ds = new Dosya();
			ds.OgrGuncelle(silinen, b,"etkinlik.txt");
		}
                 
                 //gelisim raporu
                 public void ogrenciGelisimGuncelle(String silinen) {
			String b;
			b= getAdsoyadgelisim() + " - " + getMotorGelisim() + " - " + getSosyalDuygusalGelisim() + " - " + getOzbakimGelisim() + " - " + getDilGelisim() + " - " + getBilisselGelisim();
			Dosya ds = new Dosya();
			ds.OgrGuncelle(silinen, b,"gelisim.txt");
		}
                 
                 //ilac raporu
                 
                 public void ogrenciIlacGuncelle(String silinen) {
			String b;
			b= getAdsoyadilac()+ " - " + getIlacAd_gir()+" - " + getIlacSaat_gir();
			Dosya ds = new Dosya();
			ds.OgrGuncelle(silinen, b,"ilac.txt");
                 }
                 
                 //uyku raporu
                 public void ogrenciUykuGuncelle(String silinen) {
			String b;
			b= getAdSoyad_gir() + " - " + getUykuDurumu() + " - " + getTarih_gir2();
			Dosya ds = new Dosya();
			ds.OgrGuncelle(silinen, b,"uyku.txt");
		}
                 

}
