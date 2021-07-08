package Veli;

import dosyaislemleri.Dosyaislemleri;


public class Duyuru extends DersProgrami {
    private String veliduyurusu;
    Dosyaislemleri dosya=new Dosyaislemleri();
    
  
    
public Duyuru()
{
    
}
        public void cikti()
    {
        dosya.olustur("duyurular");
        dosya.read("duyurular"); 
        ciktii();
    }

    
            
}