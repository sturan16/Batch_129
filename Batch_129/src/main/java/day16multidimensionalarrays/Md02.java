package day16multidimensionalarrays;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {

        //Example 1:Bir  integer multidimensional array olsuturunuz
        //          toplam eleman sayisini konsola yazdiriniz
        int a [][] = { {13,213,4},{12,87},{4,7,1,9},{99} };
        System.out.println(Arrays.deepToString(a));
        //for ilk array icin yazildi
        //{13,213,4} il olarak buraya gidecegi icin int[] yaptık cunku bu bir array
        int sum=0;
        for( int[] w : a){

             sum = sum+w.length;

        }
        System.out.println(sum);

    }
}
