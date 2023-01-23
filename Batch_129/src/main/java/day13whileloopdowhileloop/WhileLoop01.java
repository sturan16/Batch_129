package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {

       // Example 1: Kullanicinin verdiği sayi icin carpim toplosunu olsuturup consola yazdiran kodu yaziniz
        //          3==> 3*1=3  3*2=6 3*3=9 ........ 3*10=30

        Scanner input =new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek ıcın bir sayı giriniz...");
        int num=input.nextInt();
       int num2=  Math.abs(num);

        int i=1;

        while(i<11){
                System.out.println(num + "*" + i + "=" + (num * i));
            i++;
        }
        // Example 2:Verilen bir stringde her harfin sonrasina * sembolunu ekleyınız.
        //          Java ==>J*a*v*a*

        System.out.println("Bir kelime giriniz");

        String word = input.next();

        int k=0;
        while (k<word.length()){

            System.out.print(word.charAt(k)+"*");

            k++;

        }








    }
}
