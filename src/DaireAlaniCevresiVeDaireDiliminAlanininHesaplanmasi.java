import java.util.Scanner;

public class DaireAlaniCevresiVeDaireDiliminAlanininHesaplanmasi {
    public static void main(String[] args) {
        int yaricap;
        double alan,cevre,daireDilimiAlani,merkezAciOlcusu,pi=3.14;

        Scanner input=new Scanner(System.in);
        System.out.print("Yarıçap değerini giriniz= ");
        yaricap=input.nextInt();
        System.out.print("Merkez açı ölçüsünü giriniz= ");
        merkezAciOlcusu=input.nextInt();

        alan=pi*yaricap*yaricap;
        cevre=2*pi*yaricap;
        daireDilimiAlani=(pi*(yaricap*yaricap)*merkezAciOlcusu)/360;

        System.out.println("Yarıçapı verilen dairenin çevresi= "+cevre);
        System.out.println("Yarıçapı verilen dairenin alanı= "+alan);
        System.out.println("Yarıçapı ve merkez açı ölçüsü verilen daire dilimin alanı= "+daireDilimiAlani);
    }
}
