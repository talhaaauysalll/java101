import java.util.Scanner;

public class UceVeDordeTamBolunenSayilar {
    public static void main(String[] args) {
        int girilenSayi,toplam=0;
        double ortalama;

        Scanner input=new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        girilenSayi=input.nextInt();

        for(int i=0;i<girilenSayi;i++){
            if(i%3==0 && i%4==0){
                toplam=toplam+i;
            }
        }
        ortalama=toplam/girilenSayi;
        System.out.print("Ortalama=" +ortalama);
    }
}
