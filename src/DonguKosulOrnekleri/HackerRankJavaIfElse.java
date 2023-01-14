package DonguKosulOrnekleri;

import java.util.Scanner;

public class HackerRankJavaIfElse {
    public static void main(String[] args) {
        int N;

        Scanner input=new Scanner(System.in);
        N=input.nextInt();
        
        if(N%2==1){
            System.out.print("Weird");
        } else if (N%2==0 && (N>=2 && N<=5)) {
            System.out.print("Not Weird");
        } else if (N%2==0 && (N>=6 && N<=20)) {
            System.out.print("Weird");
        } else if (N%2==0 && N>20) {
            System.out.print("Not Weird");
        }
    }
}
