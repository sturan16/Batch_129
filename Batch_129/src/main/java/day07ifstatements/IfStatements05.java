package day07ifstatements;

import java.util.Scanner;

public class IfStatements05 {
    public static void main(String[] args) {
        //Example Ay isimlerı gırılınce kacıncı ay oldugunu yazan kodu yazınız.
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ay ısmı girirniz");
        String mounthName = input.next();
        if (mounthName.equalsIgnoreCase("January")) {
            System.out.println(1);
        } else if (mounthName.equalsIgnoreCase("February")) {
            System.out.println(2);
        } else if (mounthName.equalsIgnoreCase("March")) {
            System.out.println(3);
        } else if (mounthName.equalsIgnoreCase("april")) {
            System.out.println(4);
        } else if (mounthName.equalsIgnoreCase("may")) {
            System.out.println(5);
        } else if (mounthName.equalsIgnoreCase("june")) {
            System.out.println(6);
        } else if (mounthName.equalsIgnoreCase("July")) {
            System.out.println(7);
        } else if (mounthName.equalsIgnoreCase("August")) {
            System.out.println(8);
        } else if (mounthName.equalsIgnoreCase("september")) {
            System.out.println(9);
        } else if (mounthName.equalsIgnoreCase("october")) {
            System.out.println(10);
        } else if (mounthName.equalsIgnoreCase("november")) {
            System.out.println(11);
        } else if (mounthName.equalsIgnoreCase("december")) {
            System.out.println(12);
        } else {
            System.out.println("Invalıd month name....");
        }
        /*
        Note :Strınglerın esıtlıklerını kontrol ederken "==" yerıne "equals()" kullanırız.
              Niye ?
              Cunku "==" sembolu ıkı Strıngı karsılastırırken hem adreslerıne hemde degerlerıne bakar
              ıkısıde aynı ıse size Strıngler esıttır der ama bız code yazarken Strınglerın adreslerı ıle degıl
              degerlerı ile ılgılenırız. Bu yuzden Strıng karsılastırmlarında "==" kullanmayız

              "Equals" methodu ıse ıkı Strıngı karsılastırıken sadece degerlerıne bakar, degerlerı aynı ıse
              bu ıkı Strıng esıttır der degerler farklı ıse bu ıkı strıng farklıdır der kı bu bizim kod yazarken
      ihtiyac duydugumuz seydir.
         */

        String s = "Tom";
       String t = "Terry";
       String r = new String("Tom");
       String m = "Tom";

        System.out.println(s==t);//false cunku adresler ve degerler farklı
        System.out.println(s.equals(t));//false cunku degerler farklı

        System.out.println(s==r);//false cunku adresler farklı
        System.out.println(s.equals(r));//true cunku equals sadece degerlere bakar."s" ve "r" nin degerleri aynı oldugundan true verır

        System.out.println(s==m);//true
        System.out.println(s.equals(m));//true















    }

}
