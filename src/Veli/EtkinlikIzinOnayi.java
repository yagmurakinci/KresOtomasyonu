package Veli;

import dosyaislemleri.Dosyaislemleri;
import java.util.Scanner;

public class EtkinlikIzinOnayi{
    private String izinOnayi;
    Dosyaislemleri dosya=new Dosyaislemleri();
    Scanner klavye=new Scanner(System.in);
    public EtkinlikIzinOnayi(String izinOnayi){
        this.izinOnayi=izinOnayi;
    }
     public void cikti(){
         
         int secim;
         dosya.olustur("EtkinlikIzinOnayi");
            System.out.println("------E T K I N L I K  I Z I N  O N A Y I------" );
            dosya.read("EtkinlikIzinOnayi");	
            
            System.out.println("Ogrencinin adini giriniz:"); 
                String isim=klavye.next();
              
                switch(isim)
                    
                        {
                            case "Yagmur":
                                System.out.println("Ogrencinizin etkinlige katilimini onayliyorsaniz 1'e onaylamiyorsaniz 2'ye basiniz:");
                                secim=klavye.nextInt();
                                if(secim==1)
                                {
                                    izinOnayi="Onayliyorum";
                                }else if(secim==2)
                                {
                                    izinOnayi="Onaylamiyorum"; 
                                }
                            
                            System.out.println(isim+" isimli ogrencinin etkinlige katilimini "+izinOnayi);
                            break;
                            
                            case "Cansu":
                            	System.out.println("Ogrencinizin etkinlige katilimini onayliyorsaniz 1'e onaylamiyorsaniz 2'ye basiniz:");
                                secim=klavye.nextInt();
                                if(secim==1)
                                {
                                    izinOnayi="Onayliyorum";
                                }else if(secim==2)
                                {
                                    izinOnayi="Onaylamiyorum"; 
                                }
                            
                            System.out.println(isim+" isimli ogrencinin etkinlige katilimini "+izinOnayi);
                            break;
                            
                            case "Tugba":
                            	System.out.println("Ogrencinizin etkinlige katilimini onayliyorsaniz 1'e onaylamiyorsaniz 2'ye basiniz:");
                                secim=klavye.nextInt();
                                if(secim==1)
                                {
                                    izinOnayi="Onayliyorum";
                                }else if(secim==2)
                                {
                                    izinOnayi="Onaylamiyorum"; 
                                }
                            
                            System.out.println(isim+" isimli ogrencinin etkinlige katilimini "+izinOnayi);
                            break;
                          
                            default:
                                System.out.println("BOYLE BIR OGRENCIMIZ BULUNMAMAKTADIR...");
                                break;
                                
                            
                       
                       }
         //System.out.println("--ETKÄ°NLÄ°K Ä°ZÄ°N ONAYI--");
         //System.out.println("YapÄ±lacak olan etkinliÄŸe Ã§ocuÄŸumun katÄ±lmasÄ±nÄ±, ONAYLIYORUM. "+izinOnayi);
     

   
}
}
