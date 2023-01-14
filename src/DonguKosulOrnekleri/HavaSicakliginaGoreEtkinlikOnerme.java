package DonguKosulOrnekleri;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input=new Scanner(System.in);

        System.out.print("Sıcaklık Değerini Giriniz: ");
        sicaklik=input.nextInt();

        if(sicaklik<5){

            System.out.print("Kayak yapabilirsiniz...");
        } else if (sicaklik>=5 && sicaklik<15) {
            System.out.print("Sinemaya gidebilirsiniz...");
        } else if (sicaklik>=15 && sicaklik<25) {
            System.out.print("Pikniğe gidebilirsiniz...");
        } else if (sicaklik>=25) {
            System.out.print("Yüzmeye gidebilirsiniz.");
        }


    }
}
