import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int yil,dordeBolumundenKalan,dortYuzeBolumundenKalan;

        Scanner input=new Scanner(System.in);

        System.out.print("Artık Yıl Giriniz: ");
        yil=input.nextInt();

        dordeBolumundenKalan=yil%4;
        dortYuzeBolumundenKalan=yil%400;
        if(dordeBolumundenKalan==0 || dortYuzeBolumundenKalan==0){
            System.out.print(yil+ " bir artık yıldır");
        }
        else {
            System.out.print(yil+ " bir artık yıl değildir.");
        }

    }
}
