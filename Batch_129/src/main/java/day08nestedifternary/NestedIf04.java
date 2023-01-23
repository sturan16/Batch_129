package day08nestedifternary;

import java.util.Scanner;

public class NestedIf04 {
    public static void main(String[] args) {
        /*
              Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
              Eger calisan kadinsa
              60 yasindan buyukse “Emekli Olabilir “yazdirin
              Eger calisan erkek ise
              65 yasindan buyukse “Emekli Olabilir” yazdiran kodu olusturunuz
    */
        Scanner input = new Scanner(System.in);

        System.out.println("Cinsiyetinizi giriniz..Erkek,Kadın,Diğerleri");
        String gender = input.next();

        System.out.println("Yasınızı gırınız");
        int age = input.nextInt();

        if(age<0 || age>120){
            System.out.println("Lütfen yası 0-120 arasında gırınız");
        }else if(gender.equalsIgnoreCase("Kadin")){
    if (age>60){
        System.out.println("Emekli olabilir");
    }else{
        System.out.println("Çalısmalı");
    }

        } else if(gender.equalsIgnoreCase("Erkek")){
    if(age>65){
        System.out.println("Emekli olabilir");
    }else{
        System.out.println("Calısmalı");
    }
        }else {
            System.out.println("TAnımlı degıl");
        }






















    }

}
