package advanced_practice.practice07;

import java.util.Scanner;

public class Q02_TasKAgitMakas {
    //    Taş-Kağıt-Makas oyunu yazınız.
//    -Oyuncudan tahmin alınız.
//    -Bilgisayarın tahmini ile karşılaştırınız.
//    -3'e ilk ulaşan kazanır
//    -3 farkla kazanan Altın Skor, 2 farkla kazanan Gümüş Skor, 1 farkla kazanan Bronz Skor ile kazanır.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int oyuncuKazanmaSayisi = 0;
        int bilgisayarKazanmaSayisi = 0;
        int sayac = 0;

        int random = (int) (Math.random() * 4);

        while (oyuncuKazanmaSayisi < 3 && bilgisayarKazanmaSayisi < 3) {
            sayac++;
            System.out.println(sayac + " . Secim giriniz : \nTas \nKagit \nMakas ");
            String oyuncuTahmini = input.next().toLowerCase().trim();
            if (!(oyuncuTahmini.equals("tas") || oyuncuTahmini.equals("kagit") || oyuncuTahmini.equals("makas"))) {
                System.out.println("Gecerli bir tahmin giriniz");
                sayac--;
                continue;

            }


            String[] arrTasKagitMakas = {"tas", "kagit", "makas"};
            int rastgeleIdx = (int) (Math.random() * 3);//0,1,2 ureticek
            String bilgisayarTahmini = arrTasKagitMakas[rastgeleIdx];
            System.out.println("bilgisayarTahmini = " + bilgisayarTahmini);

            if (oyuncuTahmini.equals(bilgisayarTahmini)) {

                System.out.println("\nBerabere! Skor : " + oyuncuKazanmaSayisi + "==" + bilgisayarKazanmaSayisi);

            } else if (oyuncuTahmini.equals("tas") && bilgisayarTahmini.equals("makas") || oyuncuTahmini.equals("kagit") && bilgisayarTahmini.equals("tas")
                    || oyuncuTahmini.equals("makas") && bilgisayarTahmini.equals("kagit")) {

                oyuncuKazanmaSayisi++;
                System.out.println("\nOyuncu Kazandi Skor : " + oyuncuKazanmaSayisi + "==" + bilgisayarKazanmaSayisi);

            } else {
                bilgisayarKazanmaSayisi++;
                System.out.println("\nBilgisayar kazandi! Skor : " + oyuncuKazanmaSayisi + "==" + bilgisayarKazanmaSayisi);
            }


        }
        System.out.println("---Oyun Bittiii----");
        String skor;

        if (oyuncuKazanmaSayisi == 3) {
            if (bilgisayarKazanmaSayisi == 0) {
                skor = "Altin";

            } else if (bilgisayarKazanmaSayisi == 1) {
                skor = "Gumus";
            } else {
                skor = "Bronz";
            }
            System.out.println("Oyunu" +skor + " skor ile kazandiniz");
        } else {
                if (oyuncuKazanmaSayisi == 0) {
                    skor = "Altin";

                } else if (oyuncuKazanmaSayisi == 1) {
                    skor = "Gumus";
                } else {
                    skor = "Bronz";
                }
                System.out.println("Bilgisayar " +skor + " skor ile kazandi");

            }
        }


    }

