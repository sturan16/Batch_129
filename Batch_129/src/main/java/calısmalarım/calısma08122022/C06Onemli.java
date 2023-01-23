package calısmalarım.calısma08122022;

import java.util.Scanner;

public class C06Onemli {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen mail adresinizi giriniz");
        String mail = input.next();
        System.out.println(mail);

        boolean mail1 = mail.contains("@gmail.com");
        if (mail1 == false) {
            System.out.println("lutfen gmail adresinizi giriniz");
        }
        boolean mail2 = mail.endsWith("@gmail.com");
        if (mail2 == true) {
            System.out.println("Email adresiniz kaydedildi");
        }
        if (mail2 == false) {
            System.out.println("Lütfen yazımı kontrol ediniz");
        }






    }
}
