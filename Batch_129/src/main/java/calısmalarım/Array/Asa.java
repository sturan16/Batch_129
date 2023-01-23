package calısmalarım.Array;

import java.util.Scanner;

public class Asa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int num = sc.nextInt();
        Asal(num);

    }

    public static void Asal(int num) {
        int count = 0;
        if (num > 1) {
            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    count++;

                }
            }
            if (count == 0) {
                System.out.println(num + "Asal sayıdır.");
            } else {
                System.out.println(num + "Asal sayı değildir.");
            }

        } else {
            System.out.println(num + "Asal sayı değildir ");


        }

    }
}
