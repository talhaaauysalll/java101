package DonguKosulOrnekleri;

import java.util.Scanner;

public class HarmonikSayiHesaplama {
    public static void main(String[] args) {
        int sayi;
        double sonuc=0.0;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        sayi=input.nextInt();
        for (int i=1;i<=sayi;i++){
            sonuc+=(1.0/i);
        }
        System.out.print(sonuc);
    }
}
