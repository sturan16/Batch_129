package calısmalarım.Array;

import java.util.Arrays;
import java.util.Collections;

public class Ex11 {
    public static void main(String[] args) {
//        Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
//Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0
        Integer[] arr = new Integer[]{5, 0, 2, 0, 3};
        Integer[]brr=new Integer[arr.length];
        int ilkIdx=0;
        int lastIdx=0;

        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=0){
                brr[ilkIdx]=arr[i];
                ilkIdx++;
            }
            }


        System.out.println(Arrays.toString(brr));




    }

}
