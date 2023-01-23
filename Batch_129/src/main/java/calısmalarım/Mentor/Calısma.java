package calısmalarım.Mentor;

import java.util.Scanner;

public class Calısma {
    public static void main(String[] args) {
        // 2 tam sayidan kucuk olan konsola yazdıran programi yaziniz
        int a=14;
        int b=14;
        int sonuc = a<b ? a:b;
        System.out.println(sonuc);

        //Size verilen sayının 3 basamaklı olup olmadıgını kontrol eden kodu yazınız
        int c = -98;
        c = Math.abs(c);
        String sonuc1 =  c>99 && c<1000 ? "3 basamaklidir" : "3 basamakli degildir";
        System.out.println(sonuc1);


        //Example 2:
        //Kullanicidan bir sifre isteyiniz
        //Şifreyi kontrol etmek için kodu yazınız.
        //8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır.
        //8 karakterden fazla içermiyorsa, baş harfi 'K' olmalıdır.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifre giriniz");
        String pwd=input.nextLine();
        String pwd1 = pwd.toUpperCase();




        String sonuc2 = pwd1.length()>7 ? (pwd1.startsWith("A") ? "Gecerli":"GEcersiz"): (pwd1.startsWith("K")? "Gecerli":"Gecersiz");
        System.out.println(sonuc2);













    }
}
