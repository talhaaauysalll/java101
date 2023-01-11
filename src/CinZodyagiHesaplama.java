import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        int kalan,dogumTarihi;

        Scanner input=new Scanner(System.in);

        System.out.print("Doğum Tarihinizi Giriniz: ");
        dogumTarihi=input.nextInt();

        kalan=dogumTarihi%12;
        switch (kalan) {
            case 0 -> System.out.print("Maymun");
            case 1 -> System.out.print("Horoz");
            case 2 -> System.out.print("Köpek");
            case 3 -> System.out.print("Domuz");
            case 4 -> System.out.print("Fare");
            case 5 -> System.out.print("Öküz");
            case 6 -> System.out.print("Kaplan");
            case 7 -> System.out.print("Tavşan");
            case 8 -> System.out.print("Ejderha");
            case 9 -> System.out.print("Yılan");
            case 10 -> System.out.print("At");
            case 11 -> System.out.print("Koyun");
            default -> System.out.print("Herhangi bir sonuç çıkmamıştır...");
        }
    }
}
