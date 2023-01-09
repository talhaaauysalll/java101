import java.util.Scanner;

public class NotOrtalamasiHesaplamaIfElse {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        int mat,fizik,kimya,turkce,muzik;
        System.out.print("Matematik Notunuzu Giriniz: ");
        mat=input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik=input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya=input.nextInt();

        System.out.print("Turkce Notunuzu Giriniz: ");
        turkce=input.nextInt();

        System.out.print("Muzik Notunuzu Giriniz: ");
        muzik=input.nextInt();

        if(mat<0 && mat>100) {mat=0;}
        if(fizik<0 && fizik>100) {fizik=0;}
        if(kimya<0 && kimya>100) {kimya=0;}
        if(turkce<0 && turkce>100) {turkce=0;}
        if(muzik<0 && muzik>100) {muzik=0;}

        int toplam=mat+fizik+kimya+turkce+muzik;
        double sonuc=toplam/5;
        if(sonuc<=55){
            System.out.print("Kaldınız");
        }
        else {
            System.out.print("Geçtiniz");
        }
        System.out.print("Ortalamanız= "+sonuc);
    }
}
