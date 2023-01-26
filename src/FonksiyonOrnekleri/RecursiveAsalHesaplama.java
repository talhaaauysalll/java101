package FonksiyonOrnekleri;

import java.util.Scanner;

public class RecursiveAsalHesaplama {

    static int asalSayiHesapla(){
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi=input.nextInt();
        int sayac=0;
        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0){
                sayac++;
            }
        }
        if(sayac==0){
            System.out.println(sayi+" Asal bir sayıdır");
        }
        else
        {
            System.out.println(sayi+" Asal bir sayı değildir.");
        }
        return asalSayiHesapla();
    }
    public static void main(String[] args) {
        asalSayiHesapla();
    }
}
