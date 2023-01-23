package calısmalarım.day06example;

import java.util.Scanner;

public class OrnekCalısma2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen gmail adresinizi giriniz");
        String gmail = input.nextLine();
        System.out.println(gmail);
        boolean g1 = gmail.endsWith("@gmail.com");
        System.out.println(g1);
        if (g1) {
            System.out.println("Email adresiniz kaydedildi");
        }
        if (!g1) {
            System.out.println("Lütfen kontrol ediniz");
        }


        String J = "  Java ogrenmek123 Cok guzel@  ";
        String J1 = J.trim().toLowerCase().replaceAll("[^ A-Za-z]","").replaceAll("j","J");
        System.out.println(J1);

        String str1 = "$13.99";
        String str2 = "$10.55";

        String ceviri1 = str1.replace("$","");
        System.out.println(ceviri1);

        String ceviri2 = str2.replace("$","");
        System.out.println(ceviri2);

        Double toplam = Double.valueOf(ceviri1) + Double.valueOf(ceviri2);
        System.out.println(toplam);













    }

}
