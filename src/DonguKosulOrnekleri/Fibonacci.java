package DonguKosulOrnekleri;

public class Fibonacci {
    public static void main(String[] args){

        int sayi1=0,sayi2=1;
        for (int i = 1; i <= 9; i++) {
            int toplam=sayi1+sayi2;
            System.out.println(sayi1+" + "+sayi2+" = "+toplam);
            sayi1=sayi2;
            sayi2=toplam;
        }

    }
}
