package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {

        //Note 1:sort() methodu sayisal data type lari kucukten buyuge siralar.(ascending order)
        //Note 2 :sort() methodu String data type lari alfabetik olarak siralar.(alphabetical order)
        //Note 3:ascending order + alphabetical order ==> Natural Order
        //Note 4:sort() methodu Array elemanlarini "Natural Order" a gore siralar.

        //Note 5:"binarySearch()" methodu bir elemanin bir arrayde olup olmadigini kontrol etmek icin kullanilir.
        //       "binarySearch()" methodu kullanmadan once "sort()" methodu kullanmak zorundayiz.
        //       "sort()" methodunu kullanmazsaniz buldugnuz sonuc guvenilir olmaz.
        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        Arrays.sort(colors);

        System.out.println(Arrays.toString(colors));//[Blue, Brown, Green, Orange, Red, Yellow]

        int num1 =Arrays.binarySearch(colors,"Blue");

        System.out.println(num1);//0 ==> Var hemde index 0 da

        int num2 =Arrays.binarySearch(colors,"Orange");

        System.out.println(num2);//3 ==> VAr hemde index 3 de

        int num3 =Arrays.binarySearch(colors,"Tarik");

        System.out.println(num3);// -6 ==>"-" bu eleman yok demek.
                                 //       "6" ise olsaydi 6.eleman olurdu demek.




    }
}
