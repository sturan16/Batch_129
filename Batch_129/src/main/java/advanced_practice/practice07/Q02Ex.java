package advanced_practice.practice07;

import java.util.Scanner;

public class Q02Ex {
    //    Taş-Kağıt-Makas oyunu yazınız.
//    -Oyuncudan tahmin alınız.
//    -Bilgisayarın tahmini ile karşılaştırınız.
//    -3'e ilk ulaşan kazanır
//    -3 farkla kazanan Altın Skor, 2 farkla kazanan Gümüş Skor, 1 farkla kazanan Bronz Skor ile kazanır.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int oyuncuKazanmaSayisi=0;
        int bilgisayarKazanmaSayisi=0;
        int sayac=0;
        String skor;
        int random= (int) (Math.random()*4);

        while(oyuncuKazanmaSayisi<3 &&bilgisayarKazanmaSayisi<3){
            sayac++;
            System.out.println("Lutfen "  +sayac+ " . secimi giriniz\ntas\nkagit\nmakas ");
            String oyuncuSecim=input.next().toLowerCase().trim();

            if(!(oyuncuSecim.equalsIgnoreCase("tas")||oyuncuSecim.equalsIgnoreCase("kagit")|| oyuncuSecim.equalsIgnoreCase("makas"))){
                System.out.println("Yanlis secim yaptiniz");
                sayac--;
                continue;
            }

            String [] arrTasKagitMakas= {"tas", "kagit", "makas"};
           int rastgeleIdx=(int)(Math.random()*3);
           String bilgisayarSecimi=arrTasKagitMakas[rastgeleIdx];
            System.out.println("bilgisayarSecimi = " + bilgisayarSecimi);

            if(oyuncuSecim.equals(bilgisayarSecimi)){
                System.out.println("Oyun berabere Skor : " +oyuncuKazanmaSayisi+ "=" + bilgisayarKazanmaSayisi);

            }else if(oyuncuSecim.equals("tas") && bilgisayarSecimi.equals("makas")|| oyuncuSecim.equals("kagit")&&bilgisayarSecimi.equals("tas")||
                    oyuncuSecim.equals("makas")&&bilgisayarSecimi.equals("kagit")){
                oyuncuKazanmaSayisi++;
                System.out.println("Oyuncu Kazandi Skor : " +oyuncuKazanmaSayisi+ "=" + bilgisayarKazanmaSayisi);
            }else {
                bilgisayarKazanmaSayisi++;
                System.out.println("Bilgisayar kazandi Skor : " +oyuncuKazanmaSayisi+ "=" + bilgisayarKazanmaSayisi);
            }

        }
        System.out.println("***Oyun bitti*****");

        if(oyuncuKazanmaSayisi==3) {
            if (bilgisayarKazanmaSayisi == 0) {
                skor = "Altin";
            } else if (bilgisayarKazanmaSayisi == 1) {
                skor = "Gumus";
            } else {
                skor = "Bronz";
            }
            System.out.println("Oyunu" +skor + " skor ile kazandiniz");
        }else {
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
