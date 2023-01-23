package calısmalarım.calısma10122022;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
        /*
              Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
              Eger calisan kadinsa
              60 yasindan buyukse “Emekli Olabilir “yazdirin
              Eger calisan erkek ise
              65 yasindan buyukse “Emekli Olabilir” yazdiran kodu olusturunuz
    */

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen 0-120 arasında deger giriniz....");
        int sayı = input.nextInt();
        System.out.println("Lütfen cinsiyet giriniz..Erkek kadın digerleri");
        String gender = input.next();


        if(sayı<0 || sayı>120){
            System.out.println("Lütfen gecerli bir deger giriniz");
        }else if(gender.equalsIgnoreCase("Kadın")){
            if (sayı>60){
                System.out.println("emekli oabilir");
            }else {
                System.out.println("Çalısmalı");
            }
        }else if(gender.equalsIgnoreCase("Erkek")){
            if(sayı>65){
                System.out.println("Emekli olabilir");
            }else {
                System.out.println("Calısmalı");
            }
        }else {
            System.out.println("Tanımlı degıl");
        }







    }
    }
