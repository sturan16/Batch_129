package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {
        /*
        Kullanicdan bir tam sayi aliniz
        Tam sayi 100den kucuk ise kullaniciya "Kaybettiniz" mesaji vererek oyunu sonlandiriniz
        Tam sayi 100 ve 100den buyuk ise "Kazandiniz" mesaji vererek oyuna devam ettiriniz
         */

        Scanner input =new Scanner(System.in);
        int num=0;


        do{
            System.out.println("Bir sayi giriniz...");
             num= input.nextInt();

            if(num>=100){
                System.out.println("Kazandiniz....");
            }

        }while (num>=100);//sart kısmı 100 den buyuk ıse oyun devam etsin demek

        System.out.println("Kaybettiniz...");




        /*
scope== curly braces icinde kullanilan degerler body'nin disinda kullanilinca hata verir
(kirmizi renk olur)
dolayisiyla do'nun body'sinddeki num bodynin disinkdaki while disinda hata verir
 */


    }
}
