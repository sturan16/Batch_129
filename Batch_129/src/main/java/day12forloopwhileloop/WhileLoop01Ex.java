package day12forloopwhileloop;

public class WhileLoop01Ex {
    public static void main(String[] args) {
        //Example 1:3 den 6 a kadar tam sayilari konsola yazdiriniz

        int i=3;
        while (i<7){
            System.out.print(i+" ");

            i++;
        }
        System.out.println();
        //Example 2:   23 den 12 ye kadar cift tam sayilari konsola yazdiriniz
        int k=23;
        while(k>11){
            if(k%2==0){
                System.out.print(k+" ");
            }
            k--;
        }
        System.out.println();
        //Example 3:   Verilen bir tam sayinin rakamlari toplamini konsola yazdiran kodu konsola yazdiriniz

       int sayi=-265;
       sayi = Math.abs(sayi);

       int sum =0;
       while(sayi>0){
           sum = sum +sayi%10;

           sayi/=10;
       }
        System.out.println(sum);












    }
}
