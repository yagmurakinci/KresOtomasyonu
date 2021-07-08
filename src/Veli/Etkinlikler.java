/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veli;


import dosyaislemleri.Dosyaislemleri;


public class Etkinlikler 
{
        private String paten;
	private String yuzme;
	private String sinema;
	private String muzegezisi;
	private String lunapark;
	private String piknik;

        
    Dosyaislemleri dosya=new Dosyaislemleri();


        public void cikti(){
            dosya.olustur("Etkinlikler");
            //System.out.println("-----E T K Ä° N L Ä° K L E R Ä° M Ä° Z------" );
            dosya.read("Etkinlikler");		
           
           
            /*System.out.println("");
            System.out.println("-ETKÄ°NLÄ°KLERÄ°MÄ°Z-");
            System.out.println("OCAK AYI ETKÄ°NLÄ°Ä�Ä°MÄ°Z:" +this.paten);
            System.out.println("Å�UBAT AYI ETKÄ°NLÄ°Ä�Ä°MÄ°Z:" +this.sinema);
            System.out.println("MART AYI ETKÄ°NLÄ°Ä�Ä°MÄ°Z:" +this.muzegezisi);
            System.out.println("NÄ°SAN AYI ETKÄ°NLÄ°Ä�Ä°MÄ°Z:" +this.yuzme);
            System.out.println("MAYIS AYI ETKÄ°NLÄ°Ä�Ä°MÄ°Z:" +this.lunapark);
            System.out.println("HAZÄ°RAN AYI YILSONU ETKÄ°NLÄ°Ä�Ä°MÄ°Z:" +this.piknik);*/
            
           
        }

}
