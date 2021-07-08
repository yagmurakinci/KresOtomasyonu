package GenelBilgilendirmeler;


public abstract  class OkulFiyatBilgileri extends GenelEtkinlikler {
	private double aylikFiyat;
	private double yillikFiyat;
        
	public OkulFiyatBilgileri()
	{

	}

	public double getAylik() {
		return aylikFiyat;
	}

	public void setAylik(double aylikFiyat) {
		this.aylikFiyat=aylikFiyat;
	}

	public double getYillik() {
		return yillikFiyat;
	}

	public void setYillik(double yillikFiyat) {
		this.yillikFiyat=yillikFiyat;
	}

	public void okulfiyatbilgileri()
	{
          
		dosya.olustur("OkulFiyatBilgileri");
		dosya.read("OkulFiyatBilgileri");
                geneletkinlikler();
        }

   
}
