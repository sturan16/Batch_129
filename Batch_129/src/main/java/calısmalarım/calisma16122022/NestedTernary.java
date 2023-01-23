package calısmalarım.calisma16122022;

import java.util.Scanner;

public class NestedTernary {
    //Kullanıcıdan bir tam sayi aliniz
    //SAyı pozitifse cift sayi veya cift sayi degil
    //Sayı pozitif degilse 3 basamakli veya 3 basamakli değil yazınız
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayı=input.nextInt();

        String sonuc = sayı>0 ? sayı%2==0 ? "cift sayi":"cift sayi degil": sayı>-100 && sayı>-1000 ? "3 basamaklı":"3 basamakli degil";
        int age =27;
        int weight=50;

       String result = age>25 ? weight >=48 ? "Kan verebilirsin":"KAn veremezsin" :age>20 && age<25 ? "meyvesuyu icebilirisn":"MEyvesuyu içemez";







    }
}
