package calısmalarım.calısma12122022;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        //Example 1:Kullanıcıdan iki sayı ve yapılacak ıslemi alan ve +,-,*,/, % islemini yapan kodu yazınız
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iki sayı griniz");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("Lütfen yapılacak islemi giriniz");
        char ıslem = input.next().charAt(0);

        switch (ıslem){
            case'+':
                System.out.println( a + " + " + b +  " = " +(a+b));
                break;
            case'-':
                System.out.println( a + " - " + b +  " = " +(a-b));
                break;
            case'*':
                System.out.println( a + " * " + b +  " = " +(a*b));
                break;
            case'/':
                System.out.println( a + " / " + b +  " = " +(a/b));
                break;
            case'%':
                System.out.println( a + " % " + b +  " = " +(a%b));
                break;
            default:
                System.out.println("Lütfen gecerli bir islem giriniz");

        }


    }
}
