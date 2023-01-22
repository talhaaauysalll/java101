package DonguKosulOrnekleri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HackerRankJavaLoopsI {
    public static void main(String[] args) throws IOException {

        /*int result;
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for (int i = 1; i <= 10; i++) {
            result=n*i;
            System.out.println(n+" x "+i+" = "+result);
        }*/
        int result;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 1; i <= 10; i++) {
            result=N*i;
            System.out.println(N+" x "+i+" = "+result);
        }

        bufferedReader.close();


    }
}
