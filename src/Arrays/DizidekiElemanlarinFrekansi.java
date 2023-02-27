package Arrays;

import java.util.Arrays;

public class DizidekiElemanlarinFrekansi {
    public static void main(String[] args) {
        int[] list={10,20,20,10,10,20,5,20};
        for (int i = 0; i < list.length; i++) {
            int count=0;
                for (int j = 0; j < list.length; j++) {
                    if(list[i]==list[j]){
                        if(j<i){
                            break;
                        }
                        count++;
                    }

                }
            if(count>0){
                System.out.println(list[i]+" sayısı "+count+" kere "+"tekrar edildi");
                count=0;
            }
            }
        }
    }

