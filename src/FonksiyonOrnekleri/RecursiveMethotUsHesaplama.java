package FonksiyonOrnekleri;

import java.util.Scanner;

public class RecursiveMethotUsHesaplama {
    static int usHesapla(){
        int taban,kuvvet;
        Scanner input=new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz = ");
        taban=input.nextInt();
        System.out.print("Üs Değerini Giriniz =");
        kuvvet=input.nextInt();
        int sonuc= (int) Math.pow(taban,kuvvet);
        System.out.println("Sonuç:"+sonuc);
        return usHesapla();
    }
    public static void main(String[] args) {
        usHesapla();

    }
}
