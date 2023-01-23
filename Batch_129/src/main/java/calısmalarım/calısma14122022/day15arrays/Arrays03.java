package calısmalarım.calısma14122022.day15arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2,3,12,0,0,0]
        int a [] ={0, 2, 3, 0, 12, 0}; // a degisirse b de degişirse diye a.lenght yaptık
                                       // 2 array olusturduk

        int b[] = new int[a.length];

        int idx =0;

       for(int w:a){
           if(w!=0){
               b[idx] =w;
               idx++;
           }

        }
        System.out.println(Arrays.toString(b));





    }
}
