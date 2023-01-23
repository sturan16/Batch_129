package calısmalarım.calısma08122022;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen pozitif integer deger giriniz");
        int a = input.nextInt();

        if (a > 5 && a < 100) {
            System.out.println("....Elma...");
        }
        if (a > 50 && a < 75) {
            System.out.println("....Armut....");
        }
        if (!(a > 99 && a < 1000) && !(a>9 && a<100)) {
            System.out.println("...Karpuz....");


        }


        int sayı2 = 10;
        System.out.println(sayı2);
        int sayı3 = 15;
        System.out.println(sayı3);

        sayı2 =sayı2 + sayı3;
        sayı3 =sayı2 - sayı3;
        sayı2 =sayı2 - sayı3;
        System.out.println(sayı2);
        System.out.println(sayı3);





    }
}



