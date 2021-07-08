package Veli;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class DosyaOkuma {
    private LinkedList<String> liste;
    Scanner dosya;
    public LinkedList<String> oku(String url) {
    liste =new LinkedList<String>();
        try {
            File f = new File(url);
            dosya = new Scanner(f);
            while(dosya.hasNext()) {
                liste.add(dosya.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return liste;
    }
}