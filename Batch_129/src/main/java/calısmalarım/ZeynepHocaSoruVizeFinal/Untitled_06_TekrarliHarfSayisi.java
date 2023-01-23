package calısmalarım.ZeynepHocaSoruVizeFinal;

import java.util.Arrays;
import java.util.Scanner;

public class Untitled_06_TekrarliHarfSayisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String word = input.nextLine();

        String arr[] = word.split("");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int counter = 0;
        for (int i =1; i < arr.length - 1; i++) {
            if (arr[i - 1].equals(arr[i])) {
                counter++;
            } else {
                System.out.println(arr[i - 1] + " sayisi " + (counter + 1));
                counter = 0;

            }
            if (i == arr.length - 1) {
                System.out.println(arr[i] + " sayisi " + (counter + 1));
            }

        }


    }
}