package DonguKosulOrnekleri;

import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args){
        int us,kuvvet,sonuc=1;

        Scanner input=new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        us=input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
        kuvvet=input.nextInt();

        for (int i=1;i<=kuvvet;i++){
            sonuc*=us;
            System.out.println(us+"^"+i+"="+sonuc);
        }

    }
}
