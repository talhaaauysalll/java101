package DonguKosulOrnekleri;

import java.util.Scanner;

public class TersUcgenCizenProgram {
    public static void main(String[] args) {
        int girilenSayi;

        Scanner input=new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        girilenSayi=input.nextInt();

        for (int i =girilenSayi; i >=1 ; i--) {
            for (int j = girilenSayi; j >i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
