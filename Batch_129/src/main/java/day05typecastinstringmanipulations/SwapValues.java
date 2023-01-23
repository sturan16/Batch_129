package day05typecastinstringmanipulations;

public class SwapValues {

    //Swap yer degıstırmek demektir.
    // 1.kapta patates var 2.kap domates var ==> 1.kap domates 2.kap patates
    public static void main(String[] args) {
        int a = 12;
        int b = 5;//Swap'den sonra ==> a=5 ve b= 12 olur.
        int temp = 0; // temporary gecici demektir.
        System.out.println("a:" +a);//12
        System.out.println("b:" +b);//5


      //*****1.Yol****

        //1.Adım
        temp = a;
        //2.Adım
        a= b;
        //3.Adım
        b = temp;
        System.out.println("a:" + a);//5
        System.out.println("b:" + b);//12

        //2.Yol:
        int x = 12;
        int y = 5;
        System.out.println("x=" + x);
        System.out.println("y=" + y );

        x= x+y;

        y= x-y;

        x =x-y;

        System.out.println("x="+ x);
        System.out.println("y="+ y);

        int sayı1 = 20;
        int sayı2= 25;
        System.out.println("sayı1=" +sayı1);
        System.out.println("sayı2=" +sayı2);

        sayı1= sayı1+sayı2;
        sayı2= sayı1 - sayı2;
        sayı1= sayı1-sayı2;
        System.out.println("sayı1=" +sayı1);
        System.out.println("sayı2=" +sayı2);







    }
}
