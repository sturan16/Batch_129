package advanced_practice.practice09;

import java.time.LocalTime;
import java.util.Scanner;

public class Q05_Ex {
    //İki zar atıp sonucunu atıldığı saniyeye göre 2 veya 5 ile çarpıp bilgisayarın puanıyla karşılaþtıran bir method yazınız.
    //Zarın atıldığı saniye 5'in katı ise zar sayısı 5 ile çarpılıp puana eklenecek, çiftse zar sayısı iki ile çarpılıp puana eklenecek,
    //tekse zar sayısı puana eklenecek.
    static int oyuncuPuan = 0;
    static int bilgisayarPuan = 0;
    static int sayac=1;

    public static void main(String[] args) {
        zarAtMethod();
    }

    public static void zarAtMethod() {
        Scanner input = new Scanner(System.in);
        System.out.println("Devam etmek icin 'Z' tusuna basiniz");
        String secim = input.next();
        if (secim.equalsIgnoreCase("z")) {

            do {

                System.out.println(+sayac + ".Atis");
                int oyuncuZar = (int) (Math.random() * 6 + 1);
                System.out.println("Oyuncunun attigi zar : " + oyuncuZar);
                int oyuncuSaniye = LocalTime.now().getSecond();
                System.out.println("Oyuncunun attigi saniye : " + oyuncuSaniye);
                if (oyuncuSaniye % 5 == 0) {
                    oyuncuPuan += oyuncuZar * 5;
                } else if (oyuncuSaniye % 2 == 0) {
                    oyuncuPuan += oyuncuZar * 2;
                } else {
                    oyuncuPuan += oyuncuZar;
                }
                System.out.println("Oyuncunun toplam puani : " + oyuncuPuan);
                System.out.println();

                int bilgisayarZar = (int) (Math.random() * 6 + 1);
                System.out.println("Bilgisayarin attigi zar : " + bilgisayarZar);
                int bilgisayarSaniye = oyuncuSaniye + 1;
                System.out.println("Bilgisayarin attigi saniye : " + bilgisayarSaniye);
                if (bilgisayarSaniye % 5 == 0) {
                    bilgisayarPuan += bilgisayarZar * 5;
                } else if (bilgisayarSaniye % 2 == 0) {
                    bilgisayarPuan += bilgisayarZar * 2;
                } else {
                    bilgisayarPuan += oyuncuZar;
                }
                System.out.println("Bilgisayarin toplam puani : " + bilgisayarPuan);
                sayac++;
                System.out.println();
            } while (sayac <= 2);
            if (bilgisayarPuan > oyuncuPuan) {
                System.out.println("Bilgisayar kazandi : " + bilgisayarPuan + "==" + oyuncuPuan);
            } else if (oyuncuPuan > bilgisayarPuan) {
                System.out.println("Oyuncu kazandi : " + oyuncuPuan + "==" + bilgisayarPuan);
            } else {
                System.out.println("Oyun berabere : " + oyuncuPuan + "==" + bilgisayarPuan);
            }
        }else {
            System.out.println("gecersiz giris yaptiniz");
            zarAtMethod();

        }
    }

}
