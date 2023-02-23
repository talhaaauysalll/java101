package Arrays;

public class HarmonikSayiHesaplama {
    public static void main(String[] args) {
        double harmonikSeri=0.0;
        int[] liste={4,5,6};
        for (int i = 0; i < liste.length; i++) {
            harmonikSeri+=(double) 1/liste[i];
        }
        double harmonikOrtalama=liste.length/harmonikSeri;
        System.out.println(harmonikOrtalama);
    }
}
