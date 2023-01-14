package DonguKosulOrnekleri;

import java.util.Scanner;

public class GirilenSayiyaKadarSayilarinUssunuAlma {
    public static void main(String[] args) {
        int girilenSayi,dordunUssu=1,besinUssu=1;

        Scanner input=new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        girilenSayi=input.nextInt();

        for (int i=1;i<=girilenSayi;i++){
            dordunUssu=dordunUssu*4;
            System.out.println("4^"+i+"="+dordunUssu);

        }
        System.out.println("-------------");
        for (int i=1;i<=girilenSayi;i++){
            besinUssu=besinUssu*5;
            System.out.println("5^"+i+"="+besinUssu);
        }


    }
}
