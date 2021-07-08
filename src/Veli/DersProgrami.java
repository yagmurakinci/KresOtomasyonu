package Veli;

import dosyaislemleri.Dosyaislemleri;

public abstract class DersProgrami {
    private String boyama;
	private String hamuroyunu;
	private String ingilizce;
	private String tiyatro;
	private String muzik;
	private String satranc;
	private String oyunvehareket;
	private String zekaoyunlari;
	private String gorselsanatlar;
	private String yemeksaati;

	Dosyaislemleri dosya=new Dosyaislemleri();
        
	/*public DersProgrami(String boyama, String hamuroyunu, String ingilizce, String tiyatro, String muzik, String satranc, String oyunvehareket, String zekaoyunlari, String gorselsanatlar, String yemeksaati) {
		this.boyama=boyama;
		this.hamuroyunu=hamuroyunu;
		this.ingilizce=ingilizce;
		this.tiyatro=tiyatro;
		this.muzik=muzik;
		this.satranc=satranc;
		this.oyunvehareket=oyunvehareket;
		this.zekaoyunlari=zekaoyunlari;
		this.gorselsanatlar=gorselsanatlar;
		this.yemeksaati=yemeksaati;
		
	}*/
        
        public DersProgrami()
        {
            
        }
	
	public String getBoyama() {
		return boyama;
	}

	public void setBoyama(String boyama) {
		this.boyama = boyama;
	}

	public String getHamuroyunu() {
		return hamuroyunu;
	}

	public void setHamuroyunu(String hamuroyunu) {
		this.hamuroyunu = hamuroyunu;
	}
	
	public String getIngilizce() {
		return ingilizce;
	}

	public void setIngilizce(String ingilizce) {
		this.ingilizce = ingilizce;
	}

	public String getTiyatro() {
		return tiyatro;
	}

	public void setTiyatro(String tiyatro) {
		this.tiyatro = tiyatro;
	}

	public String getMuzik() {
		return muzik;
	}

	public void setMuzik(String muzik) {
		this.muzik = muzik;
	}

	public String getSatranc() {
		return satranc;
	}

	public void setSatranc(String satranc) {
		this.satranc = satranc;
	}

	public String getOyunvehareket() {
		return oyunvehareket;
	}

	public void setOyunvehareket(String oyunvehareket) {
		this.oyunvehareket = oyunvehareket;
	}

	public String getZekaoyunlari() {
		return zekaoyunlari;
	}

	public void setZekaoyunlari(String zekaoyunlari) {
		this.zekaoyunlari = zekaoyunlari;
	}

	public String getGorselsanatlar() {
		return gorselsanatlar;
	}

	public void setGorselsanatlar(String gorselsanatlar) {
		this.gorselsanatlar = gorselsanatlar;
	}

	public String getYemeksaati() {
		return yemeksaati;
	}

	public void setYemeksaati(String yemeksaati) {
		this.yemeksaati = yemeksaati;
	}
	public void ciktii() {
            //DersProgrami dersprogram = new DersProgrami("Boyama," ,"Hamur oyunu,", "Ingilizce,", "Tiyatro,", "Muzik,", "Satranc,", "Oyun ve Hareket,", "Zeka Oyunlari,", "Gorsel Sanatlar,", "Yemek Saati");
	
            dosya.olustur("DersProgrami");
            dosya.read("DersProgrami");
            
             //System.out.println("");
		//System.out.println("------- DERS PROGRAMI -------");
		//System.out.println("PAZARTESI: boyama \t oyun ve hareket  +this.oyunvehareket +this.satranc +this.yemeksaati");
		/*System.out.println("SALI:" +this.ingilizce +this.muzik +this.hamuroyunu +this.yemeksaati);
		System.out.println("CARSAMBA:" +this.zekaoyunlari +this.tiyatro +this.oyunvehareket +this.yemeksaati );
		System.out.println("PERSEMBE:" +this.gorselsanatlar +this.ingilizce +this.muzik +this.yemeksaati);
		System.out.println("CUMA:" +this.tiyatro +this.boyama +this.satranc +this.yemeksaati );
		System.out.println("");*/
                
        }
    
}
