package GenelBilgilendirmeler;

import dosyaislemleri.Dosyaislemleri;

public abstract class GenelEtkinlikler  {
	private String paten;
	private String yuzme;
	private String sinema;
	private String muzegezisi;
	private String lunapark;
	private String piknik;

	Dosyaislemleri dosya=new Dosyaislemleri();



	public String getPaten() {
		return paten;
	}
	public void setPaten(String paten) {
		this.paten = paten;
	}

	public String getYuzme() {
		return yuzme;
	}
	public void setYuzme(String yuzme) {
		this.yuzme = yuzme;
	}

	public String getSinema() {
		return sinema;
	}
	public void setSinema(String sinema) {
		this.sinema = sinema;
	}

	public String getMuzegezisi() {
		return muzegezisi;
	}
	public void setMuzegezisi(String muzegezisi) {
		this.muzegezisi = muzegezisi;
	}

	public String getLunapark() {
		return lunapark;
	}
	public void setLunapark(String lunapark) {
		this.lunapark = lunapark;
	}

	public String getPiknik() {
		return piknik;
	}
	public void setPiknik(String piknik) {
		this.piknik = piknik;
	}

	public void geneletkinlikler()
	{ 
            

		dosya.olustur("GenelEtkinlikler");
		//System.out.println("---------G E N E L  E T K İ N L İ K L E R-----------" );
		dosya.read("GenelEtkinlikler");

	}
}
