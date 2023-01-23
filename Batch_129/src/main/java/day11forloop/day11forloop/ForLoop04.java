package day11forloop.day11forloop;

public class ForLoop04 {
    public static void main(String[] args) {
        //Example 1: 5den 8 e kadar tam sayilarin toplamını veren kodu yaziniz
        //         5+6+7+8 ==>26
        int sum= 0;//olusacak yeni degeri memoryde saklamak icin variable olusturuyorunuz
        for(int i=5;i<90;i++){

           sum = sum +i;

        }
        System.out.println(sum);

        //Example 2:7den 9 e kadar tam sayilarin carpımını veren kodu yaziniz
        int sum1 =1;
        for(int i=7;i<10;i++){
            sum1 =sum1 * i;
        }
        System.out.println(sum1);


    }
}
