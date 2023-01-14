package DonguKosulOrnekleri;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armutFiyat=2.14,elmaFiyat=3.67,domatesFiyat=1.11,muzFiyat=0.95,patlicanFiyat=5;
        double armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo;
        double hesaplananTutar;

        Scanner input=new Scanner(System.in);
        System.out.print("Armut Kaç Kilo= ");
        armutKilo=input.nextDouble();
        System.out.print("Elma Kaç Kilo= ");
        elmaKilo=input.nextDouble();
        System.out.print("Domates Kaç Kilo= ");
        domatesKilo=input.nextDouble();
        System.out.print("Muz Kaç Kilo= ");
        muzKilo=input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo= ");
        patlicanKilo=input.nextDouble();

        hesaplananTutar=(armutKilo*armutFiyat)+(elmaKilo*elmaFiyat)+(domatesKilo*domatesFiyat)+(muzFiyat*muzKilo)+(patlicanKilo*patlicanFiyat);

        System.out.println("Toplam tutar= "+hesaplananTutar);

    }
}
