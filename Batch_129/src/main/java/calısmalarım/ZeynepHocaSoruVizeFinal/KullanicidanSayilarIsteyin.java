package calısmalarım.ZeynepHocaSoruVizeFinal;

import java.util.Scanner;

public class KullanicidanSayilarIsteyin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi=0;
        int toplam=0;
        int sayac = 0;
        while (sayac<10 && toplam<500){
            System.out.println("Lutfen toplamak istediginiz sayilari giriniz");
            sayi = input.nextInt();
            toplam +=sayi;
            sayac++;
        }
        if(sayac<10 &&toplam<500){
            System.out.println(sayac+ "tane sayi girdiniz.Toplami "+toplam);
        }else {
            System.out.println("bu kadar sayi yeter."+sayac+"tane sayi girdiniz.Toplami"+toplam );
        }
    }
}
