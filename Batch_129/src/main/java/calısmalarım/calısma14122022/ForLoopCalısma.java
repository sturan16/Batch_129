package calısmalarım.calısma14122022;

import java.util.Scanner;

public class ForLoopCalısma {
    public static void main(String[] args) {
        for(int i=0; i<11         ;  i++    ){
            System.out.println("Java guzeldir");
        }


        for(int i=30;i>9; i--){
            System.out.print(i+",");
        }
        System.out.println("");

        for(int i=100;i>49;i--){
            System.out.print(i+",");
        }
        System.out.println("");
       /* Scanner input =new Scanner(System.in);
        System.out.println("Lütfen 100 den kucuk bir tam sayi giriniz");
        Integer sayı = input.nextInt();
        for(int i=1;i<sayı;i++){
            if(i%3==0){
                System.out.print(i+",");
            }*/
       /* Scanner input =new Scanner(System.in);
        System.out.println("Lütfen 100den kucuk tamsayı degeri giriniz");
        Integer sayı1 = input.nextInt();
        for (int i=1 ; i<sayı1       ; i++  ){
            if(i%3==0 && i%5==0){
                System.out.print(i+",");
            }*/
        /*Scanner input =new Scanner(System.in);
        System.out.println("Lütfen 100 den kucuk bir tam sayı giriniz");
        Integer sayı2=input.nextInt();

        for (int i=1;i<=sayı2 ; i++){
            if(sayı2<101) {
                if (i%15==0) {
                    System.out.println("Java Guzeldir");
                    continue;
                } if (i%3==0) {
                    System.out.println("Java");
                   continue;
                } if (i%5==0) {
                    System.out.println("Guzeldir");
                    continue;
                }
                System.out.println(i);
            }else {
                System.out.println("100 den kucuk deger gırınız");
            }*/


            String name ="Hilal";
            for(int k=name.length()-1;k>=0  ; k--){
                System.out.print(name.charAt(k));

            }
            String a1="java kolaydir";
            for(int k= a1.length()-1;k>=0;k--){
                System.out.println(a1.charAt(k));
            }


            String l ="Java hayat";
            for(int i =l.length()-1;i>=0 ; i--){
                System.out.print(l.charAt(i));

            }

           String j = "kldasldmmasda";
            for(int i=j.length()-1;i>=0 ; i--){
                System.out.print(j.charAt(i));
            }








        }




    }





