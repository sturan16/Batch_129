package calısmalarım;

import java.util.Scanner;

public class BurcSorusu {
    public static void main(String[] args) {
/*
//example: burc bulan programın kodunu yazınız
    /*
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
 */
        Scanner input= new Scanner(System.in);
        System.out.println("*****Lütfen Dogdugunuz Ayi Giriniz*****");
        int mount=input.nextInt();

        System.out.println("*****Lütfen Dogdugunuz Günü Giriniz*****");
        int day = input.nextInt();

        switch (mount){
            case 1:
                if(day>=1 && day<=31){
                    if(day<22){
                        System.out.println("Oglak Burcu");
                    }else{
                        System.out.println("Kova Burcu");
                    }
                    }else{
                    System.out.println("Gecerli bir gün giriniz");
                }
                break;
            case 2:
                if(day>=1 && day<=28){
                    if(day<20){
                        System.out.println("Kova");
                    }else{
                        System.out.println("Balık");
                    }
                }else{
                    System.out.println("Gecerli bir gün giriniz");
                }break;

            case 3:
                if(day>=1 && day<=31){
                    if(day<21){
                        System.out.println("Balık");
                    }else{
                        System.out.println("Koc");
                    }
                }else {
                    System.out.println("Gecerli bir gün giriniz");
                }break;

            case 4:
                if(day>=1 && day<=30){
                    if(day<21){
                        System.out.println("Koc");
                    }else{
                        System.out.println("Boga");
                    }
                }else {
                    System.out.println("Gecerli bir gün giriniz");
                } break;

            case 5:
                if(day>=1 && day<=31){
                    if(day<22){
                        System.out.println("Boga");
                    }else{
                        System.out.println("Ikızler");
                    }
                }else {
                    System.out.println("Gecerli bir gün giriniz");
                } break;

            case 6:
                if(day>=1 && day<=30){
                    if(day<23){
                        System.out.println("Ikızler");
                    }else{
                        System.out.println("Yengec");
                    }
                }else {
                    System.out.println("Gecerli bir gün giriniz");
                }
                break;
            case 7:
                if(day>=1 && day<=31){
                    if(day<23){
                        System.out.println("Yengec");
                    }else{
                        System.out.println("Aslan");
                    }
                }else {
                    System.out.println("Gecerli bir gün giriniz");
                }
                break;
            case 8:
                if(day>=1 && day<=31){
                    if(day<23){
                        System.out.println("Aslan");
                    }else{
                        System.out.println("Basak");
                    }
                }else {
                    System.out.println("Gecerli bir gün giriniz");
                }
                break;
            case 9:
                if(day>=1 && day<=30){
                    if(day<23){
                        System.out.println("Basak");
                    }else{
                        System.out.println("Terazi");
                    }
                }else {
                    System.out.println("Gecerli bir gün giriniz");
                }
                break;
            case 10:
                if(day>=1 && day<=31){
                    if(day<23){
                        System.out.println("Terazi");
                    }else{
                        System.out.println("Akrep");
                    }
                }else {
                    System.out.println("Gecerli bir gün giriniz");
                }
                break;
            case 11:
                if(day>=1 && day<=30){
                    if(day<22){
                        System.out.println("Akrep");
                    }else{
                        System.out.println("Yay");
                    }
                }else {
                    System.out.println("Gecerli bir gün giriniz");
                }
                break;
            case 12:
                if(day>=1 && day<=31){
                    if(day<22){
                        System.out.println("Yay");
                    }else{
                        System.out.println("Oglak");
                    }
                }else {
                    System.out.println("Gecerli bir gün giriniz");
                }
                break;
            default:
                System.out.println("GEcersiz ay giridiniz");


        }




    }
}
