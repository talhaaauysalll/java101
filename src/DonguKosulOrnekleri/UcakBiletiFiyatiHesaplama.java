package DonguKosulOrnekleri;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        double normalTutar,yasIndirimiHesaplama,gidisDonusBiletIndirimi,indirimliTutar,toplamTutar,yasIndirimOrani=1,mesafeBasinaUcret=0.1;

        Scanner input=new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe=input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yas=input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2=> Gidiş Dönüş) : ");
        yolculukTipi=input.nextInt();

        if(mesafe<=0 || yas<0 || yolculukTipi<1 || yolculukTipi>2){
            System.out.print("Hatalı Veri Girdiniz...");
        }
        else{
            if(yas<12) {
                yasIndirimOrani=0.5;
            } else if (yas >=12 && yas<=24) {
                yasIndirimOrani=0.1;
            }
            else if(yas>=65){
                yasIndirimOrani=0.3;
            }
            else {
                yasIndirimOrani=0;
            }
            normalTutar=mesafe*mesafeBasinaUcret;
            yasIndirimiHesaplama=normalTutar*yasIndirimOrani;
            indirimliTutar=normalTutar-yasIndirimiHesaplama;
            if(yolculukTipi==2){
                gidisDonusBiletIndirimi=indirimliTutar*0.2;
                toplamTutar=(indirimliTutar-gidisDonusBiletIndirimi)*2;
                System.out.print("Toplam Tutar= "+toplamTutar);
            }else {
                toplamTutar=indirimliTutar;
                System.out.print("Toplam Tutar= "+toplamTutar);
            }
        }


    }
}
