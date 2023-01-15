package DonguKosulOrnekleri;

import java.util.Scanner;

public class EbobEkokBulanProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen birinci sayıyı giriniz: ");
        int numberOne = sc.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        int numberTwo = sc.nextInt();

        if (numberOne < numberTwo) {
            int i = numberOne;
            while (0 < i) {
                i--;
                if (numberOne % i == 0 && numberTwo % i == 0) {
                    System.out.println(numberOne + " ve " + numberTwo + " sayılarının EBOB'u: " + i);
                    System.out.println(numberOne + " ve " + numberTwo + " sayılarının EKOK'u: " + (numberOne * numberTwo) / i);
                    break;
                }

            }

        } else {
            int i = numberTwo;
            while (0 < i) {
                i--;
                if (numberOne % i == 0 && numberTwo % i == 0) {
                    System.out.println(numberOne + " ve " + numberTwo + " sayılarının EBOB'u: " + i);
                    System.out.println(numberOne + " ve " + numberTwo + " sayılarının EKOK'u: " + (numberOne * numberTwo) / i);
                    break;
                }

            }

        }
    }
}



