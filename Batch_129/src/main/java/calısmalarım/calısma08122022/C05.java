package calısmalarım.calısma08122022;

import java.util.Scanner;

public class C05 {
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

        System.out.println("Lütfen passwordunuzu giriniz");
        String pwd = input.nextLine();
        boolean pwdUzun = pwd.length()>7;

        boolean space = !pwd.contains(" ");

        boolean buyukHArf = pwd.replaceAll("[^A-Z]","").length()>0;

       boolean kucukHArf =  pwd.replaceAll("[^a-z]","").length()>0;

       boolean sembol = pwd.replaceAll("[a-zA-Z0-9]","").length()>0;

       boolean rakam = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println(pwdUzun);
        System.out.println(space);
        System.out.println(buyukHArf);
        System.out.println(kucukHArf);
        System.out.println(sembol);
        System.out.println(rakam);

        System.out.println("password gecerli mi =" +(pwdUzun && space && buyukHArf && kucukHArf && sembol && rakam));












    }




}
