package calısmalarım.ZeynepHocaSoruVizeFinal;

import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        int sayi = scan.nextInt();
        armstrong(sayi);
        girilenSayiyaKadarOlanArmstrong(sayi);
    }


    private static void armstrong(int n) {
        int sayininKupleriToplami = 0;
        int basamaktakiSayi = 0;
        int girilenSayi = n;

        while (n > 0) {
            basamaktakiSayi = n % 10;
            sayininKupleriToplami += (basamaktakiSayi * basamaktakiSayi * basamaktakiSayi);
            n = n / 10;
        }

        if (girilenSayi == sayininKupleriToplami)
            System.out.println(girilenSayi + " sayisi armstrong sayidir");
        else System.out.println(girilenSayi + " sayisi armstrong sayi degildir");

    }

    //soru 2 icin
    private static void girilenSayiyaKadarOlanArmstrong(int sayi) {
        for (int i = 1; i <= sayi; i++) {
            armstrong(i);
        }
    }
}

