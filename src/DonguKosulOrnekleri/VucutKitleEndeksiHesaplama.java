package DonguKosulOrnekleri;

import java.util.Scanner;

public class VucutKitleEndeksiHesaplama {
    public static void main(String[] args) {
        double kilo,boy,vki;

        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz= ");
        boy=input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz= ");
        kilo=input.nextDouble();

        vki=kilo / (boy*boy);
        System.out.print("Vücut Kitle Endeksiniz= "+vki);

    }
}
