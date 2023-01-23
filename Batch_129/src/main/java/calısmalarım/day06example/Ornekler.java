package calısmalarım.day06example;

import java.util.Scanner;

public class Ornekler {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz");
        String ad = input.nextLine();
        System.out.println("Lütfen soyadınızı giriniz");
        String soyad = input.nextLine();
        int ad1 = ad.length();
        System.out.println(ad1);
        int soyad1 = soyad.length();
        System.out.println(soyad1);
        if (ad1 > soyad1) {
            System.out.println("Saim büyüktür Turan");
        }
        if (soyad1 > ad1) {
            System.out.println("Turan büyüktür Saim");
        }

        //Example: Kullanıcıdan 4 harfli bir kelime isteyin ve tersten yazdırın
        System.out.println("Lütfen 4 harfli bir kelime giriniz");
        String fourLetter = input.nextLine();




    }
}
