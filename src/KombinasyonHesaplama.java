import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        int n,r;
        int nFak=1,rFak=1,nFarkR=1;

        Scanner input=new Scanner(System.in);

        System.out.print("N Değerini Giriniz: ");
        n=input.nextInt();
        System.out.print("R Değerini Giriniz: ");
        r=input.nextInt();

        for (int i=1;i<=n;i++){
            nFak=nFak*i;
        }
        for (int i=1;i<=r;i++){
            rFak=rFak*i;
        }
        for (int i=1;i<=n-r;i++){
            nFarkR=nFarkR*i;
        }
        int kombinasyon=nFak / (rFak*nFarkR);
        System.out.print(n+" 'in "+r+" 'li kombinasyonu "+kombinasyon);
    }
}
