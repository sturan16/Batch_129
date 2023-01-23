package day07ifstatements;

import java.util.Scanner;

public class IfStatements06 {
    public static void main(String[] args) {
        /*
        Example1:
        Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
        asagidaki tabloya gore yazdiran kodu olusturunuz
        0-4 ==> bebek
        5-12 ==> cocuk
        13-20 ==> genc
        21-30 ==> yetiskin
        Tanimlanmamis Evre
        Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yasınızı girirniz");
        byte age = input.nextByte();
        if (age<0 ) {
            System.out.println("Gecerlı bır yas gırınız");
        } else if (age<5) {
            System.out.println("bebek");
        } else if (age<13 ){
            System.out.println("cocuk");
        }else if (age<21){
            System.out.println("genç");
        }else if(age<31){
            System.out.println("yetişkin");
        }else{
            System.out.println("Tanımlanmamış yaş....");
        }


            }


        }
