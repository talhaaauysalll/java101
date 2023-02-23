package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxDegerleriBulma {
    public static void main(String[] args) {
        int[] liste={15,12,788,1,-1,-778,2,0};
        int girilenSayi;
        Scanner input=new Scanner(System.in);
        System.out.print("Girilen Sayı : ");
        girilenSayi=input.nextInt();
        Arrays.sort(liste);
        System.out.println(Arrays.toString(liste));
        for (int i=0;i< liste.length;i++){
            if(girilenSayi<liste[i]){
                System.out.println("Girilen sayıdan küçük en yakın sayı : "+liste[i-1]);
                System.out.println("Girilen sayıdan büyük en yakın sayı : "+liste[i]);
                break;
            }
        }
    }
}
