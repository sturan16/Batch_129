package calısmalarım;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calısmalarım_02Scanner {
    //Kullanıcıdan iki tam sayı alıp bu sayıların toplam fark ve carpımlarını yazdırınız
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen iki tam sayı giriniz");
        Integer firstNum = input.nextInt();
        Integer secondNum = input.nextInt();

        System.out.println("toplam = " + (firstNum + secondNum ));
        System.out.println("cıkarma = " + (firstNum - secondNum ));
        System.out.println("carpma = " + (firstNum * secondNum ));

        //Example 2: Kullanıcıdan karenin bir kenar uzunlugunu alın ve karenın cevresını ve alanını hesaplayınız

        System.out.println("Lütfen Karenın bır kenar uzunlugunu yazınız");
        Double kareKenar = input.nextDouble();

        System.out.println("alan = " + (kareKenar*kareKenar ));
        System.out.println("cevre = " + (4*kareKenar));

        //Example 3 Kullanıcıdan yarıcap isteyip dairenın cevresı ve alanını bulunuz

        System.out.println("Lutfen yarıcap gırınız");
        double yarıCap = input.nextDouble();
        double pi = 3.14;

        System.out.println("alan = " + (pi*yarıCap*yarıCap));
        System.out.println("cevre = " + (2*pi*yarıCap));

        //Example 4 Kullanıcıdan ismini ve soyismini isteyip yazdırınız









    }




}
