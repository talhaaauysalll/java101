package DonguKosulOrnekleri;

import java.util.Scanner;

public class BasamakSayisiToplama {
    public static void main(String[] args) {
        int sayi,basamakDegeri,toplam=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        sayi=input.nextInt();
        while (sayi!=0){
            basamakDegeri=sayi%10;
            toplam+=basamakDegeri;
            sayi/=10;
        }
        System.out.println(toplam);
    }
}
