package day07ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //Example3) verieln bir sayının pozitif negatif veya nötr oldugunu kontrol eden  kodu yazınız

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi girirniz");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("pozitif");
        } else if (num < 0) {
            System.out.println("negatif");
        } else {
            System.out.println("notr");
        }


    }
}
