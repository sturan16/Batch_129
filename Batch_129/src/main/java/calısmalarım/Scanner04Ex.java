package calısmalarım;

import java.util.Scanner;

public class Scanner04Ex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan 2 sayı alıp 4 işlem yapan ve islemlerin sonuclarını ekrana yazdıran kodu yazınız.
        System.out.println("Lütfen iki sayı giriniz");
        int firstNumber =input.nextInt();
        int secondNumber = input.nextInt();
        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);
    }

}
