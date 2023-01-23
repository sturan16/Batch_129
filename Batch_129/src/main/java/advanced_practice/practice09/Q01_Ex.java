package advanced_practice.practice09;

import java.util.Arrays;

public class Q01_Ex {
    //Bir array içerisindeki elementleri tekrarsız yazdıran bir kod yazınız.
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 7, 6, 8, 9, 10, 8, 7};
        Arrays.sort(arr);
        int idx = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[idx]=arr[i];
                idx++;
            }

        }
        arr[idx]=arr[arr.length-1];
        idx++;

        System.out.println(Arrays.toString(arr));

        int [] arrTekrarsiz=new int[idx];
        for (int i = 0; i <idx ; i++) {
            arrTekrarsiz[i]=arr[i];

        }
        System.out.println(Arrays.toString(arrTekrarsiz));


    }

}
