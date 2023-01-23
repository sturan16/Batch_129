package calısmalarım.day05typecastinstringmanipulationsexample;

import java.util.Scanner;

public class StringManipulations03Example {

    public static void main(String[] args) {
        /*
        Example 1 : Asagıdakı kurallara göre kullanıcının girdigi password'u kontrol ediniz.
              i) En az 8 karakter olsun
              ii) Space karakteri passwordde olmasın
              iii)en az bir tane buyuk harf olsun
              iv)en az bir tane kucuk harf olsun
              v) az bir tane sembol olsun
              vi)en az bir tane rakam olsun


         */

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Password giriniz");
        String pwd = input.nextLine();
        System.out.println("pwd = " + pwd);

        boolean pwd1 = pwd.length()>7;
        System.out.println("pwd1 = " + pwd1);

        boolean pwd2 = !pwd.contains(" ");
        System.out.println("pwd2 = " + pwd2);

        boolean pwd3 = pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("pwd3 = " + pwd3);

        boolean pwd4 = pwd.replaceAll("[A-Z]","").length()>0;
        System.out.println("pwd4 = " + pwd4);//Note [^a-z] de olur

        boolean pwd5 = pwd.replaceAll("[a-zA-z0-9]","").length()>0;
        System.out.println("pwd5 = " + pwd5);

        boolean pwd6 = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("pwd6 = " + pwd6);

        System.out.println("Password gecerli mi ?=" + (pwd1 && pwd2 && pwd3 && pwd4 && pwd5 && pwd6));





    }
}
