package DonguKosulOrnekleri;

import java.util.Scanner;

public class MukemmelSayiBulma {
    public static void main(String[] args) {
        int sayi,toplam=0;

        Scanner input=new Scanner(System.in);
        do {
            System.out.print("Bir sayı giriniz: ");
            sayi=input.nextInt();
            for (int i = 1; i <sayi ; i++) {
                if(sayi%i==0){
                    toplam+=i;
                }
            }
            if(toplam==sayi){
                System.out.println(sayi+" Mükemmel Sayıdır");
                toplam=0;
            }else {
                System.out.println(sayi+" Mükemmel Sayı Değildir.");
                toplam=0;
            }
        }while (sayi!=0);


    }
}
