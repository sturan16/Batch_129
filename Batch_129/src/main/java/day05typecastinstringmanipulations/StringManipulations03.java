package day05typecastinstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {

        /*

       Example 1 : Asagıdakı kurallara göre kullanıcının girdigi password'u kontrol ediniz.
              i) En az 8 karakter olsun
              ii) Space karakteri passwordde olmasın
              iii)en az bir tane buyuk harf olsun
              iv)en az bir tane kucuk harf olsun
              v) az bir tane sembol olsun
              vi)en az bir tane rakam olsun






         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen passwordu giriniz");
        String pwd = input.nextLine();

        //i) En az 8 karakter olsun
        boolean first = pwd.length()>7;
        System.out.println(first);

        //ii) Space karakteri passwordde olmasın
        boolean second = !pwd.contains(" ");
        System.out.println(second);

        //iii)en az bir tane buyuk harf olsun
        //Note: Büyük harf olmayanları sil
        //      kalan karakter sayısına bak
        //      karakter sayısı 0 ise buyuk harf yok demektir
        //      0 dan buyuk ise buyuk harf var demektir.
        boolean third = pwd.replaceAll("[^A-Z]","").length()>0; //Methodları aynı satırda yan yana kullanmaya "method chain" denir
        System.out.println(third);

        //iv)en az bir tane kucuk harf olsun
        boolean four = pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println(four);

        //v) az bir tane sembol(harf ve rakam harici hersey) olsun
        boolean fifth = pwd.replaceAll("[a-zA-z0-9]","").length()>0;
        System.out.println(fifth);

        //vi)en az bir tane rakam olsun
        boolean sixth = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println(sixth);

        System.out.println("Password gecerli mi?=" +(first && second && third && four && fifth && sixth));



    }
}
