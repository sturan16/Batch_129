package calısmalarım.day06example;

import java.util.Scanner;

public class Ornekler1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sifrenizi giriniz");
        String sifre = input.nextLine();
        System.out.println(sifre);

        boolean sfr1 = sifre.length()>7;
        System.out.println(sfr1);

        boolean sfr2 = !sifre.contains(" ");
        System.out.println(sfr2);









    }
}
