package calısmalarım;

import java.util.Scanner;

public class ModulSonIkıRakamBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan 4 basamkalı bir sayı alıp son iki rakamının toplamını bulunuz.
        System.out.println("Lütfen 4 basamaklı bir sayı giriniz");
        Integer fourNum = input.nextInt();
        System.out.println("fourNum = " + fourNum);
        int sonIkıNum = fourNum %100;
        System.out.println("sonIkıNum = " + sonIkıNum);
        int sonIkıTop = (sonIkıNum %10 + sonIkıNum/10);
        System.out.println("sonIkıTop = " + sonIkıTop);
        int ilkIkıRkm = fourNum/100;
        System.out.println("ilkIkıRkm = " + ilkIkıRkm);
        int ilkIkıTop = (ilkIkıRkm%10+ilkIkıRkm/10);
        System.out.println("ilkIkıTop = " + ilkIkıTop);
        System.out.println("Butun Toplam =" +(sonIkıTop+ilkIkıTop));


    }
}
