package DonguKosulOrnekleri;

import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {
        double odenecekTutar,hesaplananTutar,katedilenYol,acilisUcreti=10,kmBasinaFiyat=2.2;

        Scanner input=new Scanner(System.in);
        System.out.print("Gidilen Yol (KM)= ");
        katedilenYol=input.nextDouble();

        hesaplananTutar=(katedilenYol*kmBasinaFiyat)+acilisUcreti;
        odenecekTutar=(hesaplananTutar<20)? odenecekTutar=20:hesaplananTutar;

        System.out.print("Ödenecek Olan Tutar= "+odenecekTutar);



    }
}
