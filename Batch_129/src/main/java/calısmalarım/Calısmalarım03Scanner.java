package calısmalarım;

import java.util.Scanner;

public class Calısmalarım03Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Lütfen isminizi giriniz");
        String isim = input.nextLine();
        System.out.println("Lütfen soyadınızı giriniz");
        String soyad = input.nextLine();
        System.out.println("isim = " + isim);
        System.out.println("soyad = " + soyad);
        System.out.println("Kursumuza katılımınız alınmıstır, tesekkur ederiz");

        System.out.println("Lütfen adınızı ve soyadınızı giriniz");
        String adSoyad = input.nextLine();
        System.out.println("adSoyad = " + adSoyad);

        System.out.println("Lütfen isminizi giriniz");
        String isimi = input.next();
        System.out.println("isimi = " + isimi);

    }
}
