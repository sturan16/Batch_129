package calısmalarım.day05typecastinstringmanipulationsexample;

public class SwapValuesExample {
    public static void main(String[] args) {
       int sayı1= 20;
        System.out.println("sayı1 = " + sayı1);
       int sayı2 = 25;
        System.out.println("sayı2 = " + sayı2);
       int temp = 0;


       temp = sayı1;
       sayı1 = sayı2;
       sayı2 = temp ;

        System.out.println("sayı1=" + sayı1);
        System.out.println("sayı2="+ sayı2);

        //2.yol*******

        int x = 12;
        System.out.println("x = " + x);
        int y =20 ;
        System.out.println("y = " + y);

        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int w = 4;
        System.out.println("w = " + w);
        int e = 5;
        System.out.println("e = " + e);

        w=e+w;
        e=w-e;
        w=w-e;
        System.out.println("w = " + w);
        System.out.println("e = " + e);


        int yag1 = 254;
        System.out.println("yag1 = " + yag1);
        int su1= 100;
        System.out.println("su1 = " + su1);

        yag1=yag1+su1;
        su1=yag1-su1;
        yag1=yag1-su1;
        System.out.println("yag1 = " + yag1);
        System.out.println("su1 = " + su1);












    }
}
