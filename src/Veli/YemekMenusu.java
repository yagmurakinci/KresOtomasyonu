package Veli;


import dosyaislemleri.Dosyaislemleri;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class YemekMenusu{ 
	DosyaOkuma d = new DosyaOkuma();
        Dosyaislemleri dosya=new Dosyaislemleri();
	private LinkedList<String> anaYemek ,tatli,mesrubat,corba,hamurisi;
    public int a;
	private int m,t,c,h;
        private String yemekler;
	//public  YemekMenusu() 
        ///{
            public void cikti0()
            {
                anaYemek=new LinkedList<String>(); 
                tatli=new LinkedList<String>(); 
                mesrubat=new LinkedList<String>();
		corba=new LinkedList<String>();
		hamurisi=new LinkedList<String>();
		DosyaOkuma d=new DosyaOkuma();
		anaYemek=d.oku("C:\\Users\\Administrator\\Desktop\\asd\\Anayemek.txt");
		tatli=d.oku("C:\\Users\\Administrator\\Desktop\\asd\\tatli.txt");
		mesrubat=d.oku("C:\\Users\\Administrator\\Desktop\\asd\\mesrubat.txt");
		corba=d.oku("C:\\Users\\Administrator\\Desktop\\asd\\corba.txt");
		hamurisi=d.oku("C:\\Users\\Administrator\\Desktop\\asd\\hamurisi.txt");
		cikti();

            }


   //overload
	public void cikti(){
		a=anaYemek.size();
		t=tatli.size();
		c=corba.size();
		h=hamurisi.size();
		m=mesrubat.size();
		cikti(this.a,this.c,this.t,this.m,this.h);
	}
	public void cikti(int a,int m,int t,int c,int h)
        {
             dosya.olustur("yemekMenusuPazartesi"); 
             dosya.write(("Pazartesi:")+  this.anaYemek.get(random(a)) +("-") +  this.corba.get(random(c))  +("-") + this.tatli.get(random(t)) +("-") + this.mesrubat.get(random(m))+("-") + this.hamurisi.get(random(h)), "yemekMenusuPazartesi"); 
             
             dosya.olustur("yemekMenusuSali"); 
             dosya.write(("Sali:")+this.anaYemek.get(random(a)) +("-") + this.corba.get(random(c))  +("-") + this.tatli.get(random(t)) +("-") + this.mesrubat.get(random(m))+("-") + this.hamurisi.get(random(h)), "yemekMenusuSali"); 
            
             dosya.olustur("yemekMenusuCarsamba"); 
             dosya.write(("Carsamba:") + this.anaYemek.get(random(a)) +("-") + this.corba.get(random(c))  +("-") + this.tatli.get(random(t)) + ("-") +this.mesrubat.get(random(m))+("-") + this.hamurisi.get(random(h)), "yemekMenusuCarsamba"); 
            
             dosya.olustur("yemekMenusuPersembe"); 
             dosya.write(("Persembe:")+ this.anaYemek.get(random(a)) + ("-") +this.corba.get(random(c))  +("-") + this.tatli.get(random(t)) +("-") + this.mesrubat.get(random(m))+("-") + this.hamurisi.get(random(h)), "yemekMenusuPersembe"); 
            
             dosya.olustur("yemekMenusuCuma"); 
             dosya.write(("Cuma:")+this.anaYemek.get(random(a)) +("-") + this.corba.get(random(c))  + ("-") +this.tatli.get(random(t)) + ("-") +this.mesrubat.get(random(m))+("-") + this.hamurisi.get(random(h)), "yemekMenusuCuma"); 
            
		System.out.println("--------------Y E M E K  M E N U S U-----------------");
                 dosya.read("yemekMenusuPazartesi");
                 dosya.read("yemekMenusuSali");
                 dosya.read("yemekMenusuCarsamba");
                 dosya.read("yemekMenusuPersembe");
                 dosya.read("yemekMenusuCuma");
                 
                 
		//System.out.println("PAZARTESI:"); 
                //System.out.println("SALI:"+this.anaYemek.get(random(a))+"--"+this.corba.get(random(c))+"--"+this.tatli.get(random(t))+"--"+this.mesrubat.get(random(m))+"--"+this.hamurisi.get(random(h)));
		///System.out.println("CARSAMBA:"+this.anaYemek.get(random(a))+"--"+this.corba.get(random(c))+"--"+this.tatli.get(random(t))+"--"+this.mesrubat.get(random(m))+"--"+this.hamurisi.get(random(h)));
	//	System.out.println("PERSEMBE:"+this.anaYemek.get(random(a))+"--"+this.corba.get(random(c))+"--"+this.tatli.get(random(t))+"--"+this.mesrubat.get(random(m))+"--"+this.hamurisi.get(random(h)));
	//	System.out.println("CUMA:"+this.anaYemek.get(random(a))+"--"+this.corba.get(random(c))+"--"+this.tatli.get(random(t))+"--"+this.mesrubat.get(random(m))+"--"+this.hamurisi.get(random(h)));
             
	}
	public int random(int temp){
		Random r=new Random(); //random sÄ±nÄ±fÄ±
		temp=r.nextInt(temp);
		return temp;
	}
	public void yemekler(){ 
		 
           
	}

    public ArrayList<String> yemekListesi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 
