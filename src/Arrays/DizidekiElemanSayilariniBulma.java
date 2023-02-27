package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanSayilariniBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin boyutunu n : ");
        int n=input.nextInt();
        int[] list=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Dizinin "+(i+1)+" .elemanını giriniz : ");
            int value=input.nextInt();
            list[i]=value;
        }
        Arrays.sort(list);
        System.out.print("Sıralama : "+Arrays.toString(list));
    }
}
