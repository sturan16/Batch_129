package calısmalarım.day06example;

import java.util.Scanner;

public class MaterialsTecpro {
    public static void main(String[] args) {
        //Ornek

        String J = "  Java ogrenmek123 Cok guzel@  ";
        String J1 = J.trim().toLowerCase().replaceAll("[^ A-Za-z]", "").replaceAll("j", "J");
        System.out.println(J1);


        //Ornek

        String str1 = "$13.99";
        String str2 = "$10.55";

        String ceviri1 = str1.replace("$", "");
        System.out.println(ceviri1);

        String ceviri2 = str2.replace("$", "");
        System.out.println(ceviri2);

        Double toplam = Double.valueOf(ceviri1) + Double.valueOf(ceviri2);
        System.out.println(toplam);

        //Ornek

        Scanner input = new Scanner(System.in);


        System.out.println("Lütfen isim giriniz");
        String name = input.next();
        System.out.println(name);
        boolean g1 = name.contains("a");
        boolean g2 = name.contains("Z");


        if (g1 == true) {
            System.out.println("Gridiğiniz isim a harfi iceriyor");
        }
        if (g2 == true) {
            System.out.println("Girdiğiniz isim Z harfi içeriyor.");
        }

        System.out.println("Lütfen adınızı ve soyadınızı giriniz");
        String adSoyad = input.nextLine();






    }
}
