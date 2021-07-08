package GenelBilgilendirmeler;



public  class OkulBilgileri extends OkulFiyatBilgileri {
	private String isim;
	private String adres;
	private long telefon;

      

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim=isim;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres=adres;
	}

	public long getTelefon() {
		return telefon;
	}

	public void setTelefon(int telefon) {
		this.telefon=telefon;
	}

	public void cikti()
	{

		dosya.olustur("OkulBilgileri");
		dosya.read("OkulBilgileri");

                okulfiyatbilgileri();
	}

}