package calısmalarım.calısma10122022;

import java.util.Scanner;

public class C02 {
    /*Example 1: Kullanicidan 3 tane sayi aliniz.
            Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
    Eger ucgen ise "eskenar"
    Ucgen olma durumunu
    kontrol ediniz.
    INFO :
    Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
    herhangi (iki) "kenar" 'farki' 'ucuncu' kenardan ("kucuk") "olmali"
    a+b>c>a-b
    a+c>b>a-c
    b+c>a>b-c
            a=b=c ise eskenar ucgen*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lüfen kenar uzunlugu gırınız");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if ((a + b > c && c > Math.abs(a - b)) && (a + c > b && b > Math.abs(a - c)) && (b + c > a && a > Math.abs(b - c))) {
            if (a == b && a == c && b == c) {
                System.out.println("Ucgen hemde eskenar ucgen");
            }else {
                System.out.println("Ucgen ama eskenar degıl");
            }

        }else {
            System.out.println("Ücgen degıl");
        }
    }

}















