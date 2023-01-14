package DonguKosulOrnekleri;

import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        String ay,burc="";
        int gun;

        Scanner input=new Scanner(System.in);

        System.out.print("Doğduğunuz Ayı Giriniz:");
        ay=input.nextLine();
        System.out.print("Doğduğunuz Günü Giriniz:");
        gun=input.nextInt();
        if(gun<0 || gun>31){
            System.out.print("Doğum Günününüz Geçersiz Bir Değerdir...");
        }
        else {
            if ((ay.equals("Aralık") && gun >= 22 || ay.equals("Ocak") && (gun <= 21))) {
                burc = "Oğlak Burcusunuz";
            } else if (ay.equals("Ocak") && gun >= 22 || ay.equals("Şubat") && gun <= 19) {
                burc = "Kova Burcusunuz";
            } else if (((ay.equals("Şubat")) && (gun >= 20)) || (((ay.equals("Mart")) && (gun <= 20)))) {
                burc = "Balık Burcusunuz";
            } else if (((ay.equals("Mart")) && (gun >= 21)) || (((ay.equals("Nisan")) && (gun <= 20)))) {
                burc = "Koç Burcusunuz";
            } else if (((ay.equals("Nisan")) && (gun >= 21)) || (((ay.equals("Mayıs")) && (gun <= 21)))) {
                burc = "Boğa Burcusunuz";
            } else if (((ay.equals("Mayıs")) && (gun >= 22)) || (((ay.equals("Haziran")) && (gun <= 22)))) {
                burc = "İkizler Burcusunuz";
            } else if (((ay.equals("Haziran")) && (gun >= 23)) || (((ay.equals("Temmuz")) && (gun <= 22)))) {
                burc = "Yengeç Burcusunuz";
            } else if (((ay.equals("Temmuz")) && (gun >= 23)) || (((ay.equals("Ağustos")) && (gun <= 22)))) {
                burc = "Aslan Burcusunuz";
            } else if (((ay.equals("Ağustos")) && (gun >= 23)) || (((ay.equals("Eylül")) && (gun <= 22)))) {
                burc = "Başak Burcusunuz";
            } else if (((ay.equals("Eylül")) && (gun >= 23)) || (((ay.equals("Ekim")) && (gun <= 22)))) {
                burc = "Terazi Burcusunuz";
            } else if (((ay.equals("Ekim")) && (gun >= 23)) || (((ay.equals("Kasım")) && (gun <= 21)))) {
                burc = "Akrep Burcusunuz";
            } else if (((ay.equals("Kasım")) && (gun >= 22)) || (((ay.equals("Aralık")) && (gun <= 21)))) {
                burc = "Yay Burcusunuz";
            } else {
                System.out.print("Sistemde bir hata oluştu tekrar deneyiniz...");
            }
        }
            System.out.print(burc);
    }
}
