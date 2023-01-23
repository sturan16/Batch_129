package calısmalarım.ZeynepHocaSoruVizeFinal;

import java.util.Scanner;

public class TasKAgıtMakas {
    public static void main(String[] args) {
        /* TASK:
         tas >makas
         makas >kagit
         kagit >tas
    Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
    Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
    While dongumuzun icerisinde kullanicidan aldigimiz secimi “secim” isimli degiskene atiyoruz.
    Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
    Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
    Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
    En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
    dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.*/

        Scanner input = new Scanner(System.in);




        int kskor = 0;
        int bskor = 0;
        int oyunSayisi = 1;



        do {
            System.out.println("Lutfen tas,kagit,makas dan birini giriniz");

            String kullaniciSecim = input.next().toLowerCase();
            int bilgSecim = (int) (Math.random() * 3);
            System.out.println(oyunSayisi + ". oyun");



            switch (kullaniciSecim) {
                case "tas": {
                    System.out.println("kullanicinin secimi tas");
                    if (bilgSecim == 0) {
                        System.out.println("Bilgisayarin secimi Tas");
                        System.out.println("oyun berabere");
                        System.out.println("kullanici skor = " + kskor + " bilgisayar skor= " + bskor);


                    } else if (bilgSecim == 1) {
                        System.out.println("Bilgisayarin secimi kagit ");
                        System.out.println("Bilgisayar kazandi");
                        bskor = bskor + 1;
                        System.out.println("kullanici skor = " + kskor + " bilgisayar skor= " + bskor);


                    } else if (bilgSecim == 2) {
                        System.out.println("Bilgisayarin secimi makas");
                        System.out.println("Kullanici kazandi");
                        kskor = kskor + 1;
                        System.out.println("kullanici skor = " + kskor + " bilgisayar skor= " + bskor);


                    }

                }
                break;


                case "kagit": {
                    System.out.println("kullanicinin secimi kagıt");
                    if (bilgSecim == 0) {
                        System.out.println("Bilgisayarin secimi Tas");
                        System.out.println("bilgisayar kazandi");
                        bskor = bskor + 1;
                        System.out.println("kullanici skor = " + kskor + " bilgisayar skor= " + bskor);


                    } else if (bilgSecim == 1) {
                        System.out.println("Bilgisayarin secimi kagit ");
                        System.out.println("oyun berabere");
                        System.out.println("kullanici skor = " + kskor + " bilgisayar skor= " + bskor);


                    } else if (bilgSecim == 2) {
                        System.out.println("Bilgisayarin secimi makas");
                        System.out.println("Bigisayar kazandi");
                        bskor = bskor + 1;
                        System.out.println("kullanici skor = " + kskor + " bilgisayar skor= " + bskor);
                    }

                }
                break;

                case "makas": {

                    System.out.println("kullanicinin secimi makas");
                    if (bilgSecim == 0) {
                        System.out.println("Bilgisayarin secimi Tas");
                        System.out.println("bilgisayar kazandi");
                        bskor = bskor + 1;
                        System.out.println("kullanici skor = " + kskor + " bilgisayar skor= " + bskor);


                    } else if (bilgSecim == 1) {
                        System.out.println("Bilgisayarin secimi kagit ");
                        System.out.println("Kullanici kazandi");
                        kskor = kskor + 1;
                        System.out.println("kullanici skor = " + kskor + " bilgisayar skor= " + bskor);


                    } else if (bilgSecim == 2) {
                        System.out.println("Bilgisayarin secimi makas");
                        System.out.println("Oyun berabere");
                        System.out.println("kullanici skor = " + kskor + " bilgisayar skor= " + bskor);

                    }


                }
                break;


                default:
                    System.out.println("Hatali giris yaptiniz");
                    oyunSayisi--;


            }

                oyunSayisi++;

                if (kskor > 4 || bskor > 4) {
                    break;

                }


            }
            while (true) ;



            if (kskor > bskor) {
                System.out.println("kullanici kazanmisitir");
            } else {
                System.out.println("Bilgisayar kazanmistir");

        }

            System.out.println("Oyun bitmistir.");






        }
    }



