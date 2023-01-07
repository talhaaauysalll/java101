import java.util.Scanner;

public class KDVTutariHesaplama {
    public static void main(String[] args) {

        double yuzdeSekizKDV=0.08, yuzdeOnSekizKDV=0.18;
        Scanner input=new Scanner(System.in);
        System.out.print("Hesabı Giriniz: ");
        double hesap=input.nextDouble();
        double hesabaKatilacakKDV=((hesap>0)&&(hesap<1000)? yuzdeOnSekizKDV:yuzdeSekizKDV);
        double kdvTutari=hesap*hesabaKatilacakKDV;
        double kdvliHesap=kdvTutari+hesap;
        System.out.println("KDV'siz Fiyat = "+hesap);
        System.out.println("KDV'li Fiyat =" + kdvliHesap);
        System.out.print("KDV Tutarı =" + kdvTutari);



    }
}
