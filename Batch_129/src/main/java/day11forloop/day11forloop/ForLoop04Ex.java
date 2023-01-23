package day11forloop.day11forloop;

public class ForLoop04Ex {
    public static void main(String[] args) {
        //Example 1: 5den 8 e kadar tam sayilarin toplamını veren kodu yaziniz
        //         5+6+7+8 ==>26
        int sum=0;

        for(int i=5;i<9;i++){
            sum= sum + i;
        }
        System.out.println(sum);


        //Example 1: 20den 80 e kadar tam sayilarin toplamını veren kodu yaziniz
        sum=0;
       for(int i=20;i<81;i++){
           sum = sum +i;
       }
        System.out.println(sum);

//Example 2:7den 9 e kadar tam sayilarin carpımını veren kodu yaziniz
       int sum1 =1;
       for(int i=7;i<10;i++){
           sum1 = sum1*i;
       }
        System.out.println(sum1);


        //Example 3:25 den 30 a kadar olan sayıların carpımını veren kodu yazınız
       int  sum2=1;

       for(int i=25;i<31;i++){
           sum2 = sum2*i;
       }
        System.out.println(sum2);








    }
}
