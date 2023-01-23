package calısmalarım.calısma14122022.day15arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays01Ex {
    public static void main(String[] args) {
        //Example 1: Kullanici ile beraber bir array olusturunuz.okul öğrenci listesi olusturunuz
        //Mesela 8 tane yazdı sıkıldı yarın tekrardan devam edecek 24 tane yazacak ogretmen

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ogrenci sayisini giriniz");
        int ogrSayisi = input.nextInt();

        String ogrIsımleri[] = new String[ogrSayisi];

        for(int i=1;i<=ogrSayisi;i++){
            System.out.println("Lutfen" + i + ".ogrenci adini giriniz");
            String ogrAdi=input.next();
            if(ogrAdi.equalsIgnoreCase("Q")){
                break;

            }

            ogrIsımleri[i-1] =ogrAdi;


        }
        System.out.println(Arrays.toString(ogrIsımleri));




    }
}
