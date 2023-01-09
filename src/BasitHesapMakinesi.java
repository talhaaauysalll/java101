import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {
        int sayi1, sayi2,sonuc;
        String yapilacakIslem;

        Scanner input=new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz: ");
        sayi1=input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        sayi2=input.nextInt();
        System.out.print("Yapılacak İşlemi Belirtiniz( +, -, *, / ): ");
        yapilacakIslem=input.next();

        switch (yapilacakIslem){
            case "+":
                sonuc=sayi1+sayi2;
                System.out.print(sayi1+" + "+sayi2+" = "+sonuc);
                break;
            case "-":
                sonuc=sayi1-sayi2;
                System.out.print(sayi1+" - "+sayi2+" = "+sonuc);
                break;
            case "*":
                sonuc=sayi1*sayi2;
                System.out.print(sayi1+" * "+sayi2+" = "+sonuc);
                break;
            case "/":
                sonuc=sayi1/sayi2;
                System.out.print(sayi1+" / "+sayi2+" = "+sonuc);
                break;
        }

    }
}
