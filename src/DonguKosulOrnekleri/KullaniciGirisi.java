package DonguKosulOrnekleri;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String username,password,passwordRepeat,choose;

        Scanner input=new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        username=input.nextLine();
        System.out.print("Parolanızı Giriniz: ");
        password=input.nextLine();

        if((username.equals("patika"))&&(password.equals("java123"))){
            System.out.print("Sisteme Hoşgeldiniz :)");
        }
        else{
            System.out.println("Kullanıcı adınız veya parolanız yanlış");
            System.out.print("Parolanızı değiştirmek ister misiniz? (e / h)");
            choose=input.nextLine();
            switch (choose){
                case "e":
                    System.out.print("Yeni Parolanızı Giriniz: ");
                    password=input.nextLine();
                    System.out.print("Yeni Parolanızı Tekrar Giriniz: ");
                    passwordRepeat=input.nextLine();
                    if(password.equals("java123")){
                        System.out.print("Parolanız oluşturulamadı lütfen başka parola giriniz!");
                    }
                    else if (password.equals(passwordRepeat)){
                        System.out.print("Şifreniz başarılı bir şekilde sıfırlandı");
                    }
                    else System.out.print("Lütfen Tekrar Deneyiniz...");
                    break;
                case "h":
                    System.out.print("İyi Günler");

            }
        }
    }
}
