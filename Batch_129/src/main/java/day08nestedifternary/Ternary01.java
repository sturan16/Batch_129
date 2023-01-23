package day08nestedifternary;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        //Example 1 : Kullanıcıdan iki sayı alınız "buyuk olmayan(kucuk ya da esıt demek)sayıyı yazdırınız
        Scanner input = new Scanner(System.in);

        System.out.println("İki sayı giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();

        if(a<b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

        //2.Yol:Ternary
        //               condition      ?  condition true ise calısır   :   condition false ise calısır   ;
        double result =      a<b        ?         a                     :               b                 ;
        System.out.println(result);







    }
}
