package calısmalarım.calısma12122022;

import java.util.Scanner;

public class SwitchCalısma2 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayı isteyin
        girilen sayı
        10 ise "İki basamaklı en kuuck sayı"
        100 ise "üc basamaklı en kucuk sayı"
        1000 ise "dort basamaklı en kucuk sayı"
        diger durumlarda "girdigin sayıyı degıstır yaz"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int num= input.nextInt();

        switch (num){
            case 10:
                System.out.println("İki basamaklı en kuuck sayı");
                break;
            case 100:
                System.out.println("üc basamaklı en kucuk sayı");
                break;
            case 1000:
                System.out.println("dort basamaklı en kucuk sayı");
                break;
            default:
                System.out.println("girdigin sayıyı degıstır");



        }










    }
}
