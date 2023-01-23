package day16multidimensionalarrays;

import java.util.Arrays;

public class Md04 {
    public static void main(String[] args) {
        //Example 1 : Bir multidimesional array olsuturunuz ve bir dimensionalli arraya donusturunuz
        // [[2,5],[3],[4,7,11]]==>[2,5,3,437,11]

        int a[][]={{2,5},{3},{4,7,11}};
        System.out.println(Arrays.deepToString(a));

        //a arrayindeki toplam eleman sayisini bulunuz
         int totalElement=0;
         for(int [] w:a){
             totalElement =totalElement +w.length;

         }
         //"b" isimli tek dimonsinalli bir array olsuturunuz
        int b[]= new int[totalElement];
        System.out.println(Arrays.toString(b));


        //"a" arrayindeki elemanlari "b" arrrayine transfer ediniz.
        int idx=0;
        for(int[] w:a){
            for(int k:w){
                b[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(b));

    }
}
