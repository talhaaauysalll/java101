package DonguKosulOrnekleri;

import java.util.Scanner;

public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        int kenar1,kenar2,kenar3,u;
        double cevre,alan;
        Scanner input=new Scanner(System.in);

        System.out.print("1. Kenarı Giriniz :");
        kenar1=input.nextInt();

        System.out.print("2. Kenarı Giriniz :");
        kenar2=input.nextInt();

        System.out.print("3. Kenarı Giriniz :");
        kenar3=input.nextInt();

        u=(kenar1+kenar2+kenar3)/2;
        cevre=2*u;
        alan=u*(u-kenar1)*(u-kenar2)*(u-kenar3);
        alan=alan*alan;

        System.out.println("Üçgenin çevresi= "+cevre);
        System.out.print("Üçgenin alanı= "+alan);
    }
}
