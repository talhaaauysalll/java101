package FonksiyonOrnekleri;

import java.util.Scanner;

public class DeseneGoreMetotOlusturma {


    static void desenOlusturma(int n, boolean azaltalimMi, int ilkSayi){

        if(!azaltalimMi){
            n = n + 5;
            if(n == ilkSayi){
                System.out.print(n + " ");
                return;
            }
            System.out.print(n + " ");
            desenOlusturma(n,false, ilkSayi);

        }
        if(azaltalimMi){

            if(n == ilkSayi) {
                System.out.print("Çıktısı: "+n + " ");
            }

            n = n - 5;
            if(n<0 || n==0){
                System.out.print(n + " ");
                desenOlusturma(n,false, ilkSayi);
            }

            else{
                System.out.print(n + " ");
                desenOlusturma(n,true, ilkSayi);
            }
        }

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int nSayisi=input.nextInt();
        desenOlusturma(nSayisi,true, nSayisi);

    }
}
