package DonguKosulOrnekleri;

import java.util.Scanner;

public class GirilenSayilardanMinMaxBulma {
    public static void main(String[] args) {
        int dongu,girilenSayi,enBuyuk=0,enKucuk=0,geciciSayi;
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        dongu=input.nextInt();

        for(int i=0;i<dongu;i++){
            System.out.print("Sayı giriniz: ");
            girilenSayi=input.nextInt();
            geciciSayi=girilenSayi;
            if(geciciSayi>enBuyuk){
                enBuyuk=geciciSayi;
            }else if (geciciSayi<enKucuk){
                enKucuk=geciciSayi;
            }
        }
        System.out.println("En büyük sayi: "+enBuyuk);
        System.out.println("En küçük sayi: "+enKucuk);

    }
}
