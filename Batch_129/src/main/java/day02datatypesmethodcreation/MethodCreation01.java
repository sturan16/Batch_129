package day02datatypesmethodcreation;

import java.security.spec.RSAOtherPrimeInfo;

public class MethodCreation01 {

    /*
    Java'da method nasıl olusturulur?
    1)Main methodun dısında olusturulur.
    2) Access Modifier + return type + method ismi + () + {}

    Olusturulan methodlar nasıl kullanılır?
    1)Main methodun içinden kullanılır.
    2)Methodun ismini + ()
    3) Islem yapacagınız sayıları parantezin icine koyun

     */


    public static void main(String[] args) {

    int sonuc = add(30,50);
        System.out.println(sonuc);

       long carpim = multiply(10,20);
        System.out.println(carpim);

        int üclüSonuc = firstTwoMultiplyThirdAdd(12,15,25);
        System.out.println(üclüSonuc);

        double kup = getCube(5);
        System.out.println(kup);


       int rectangle = area (5,9);
        System.out.println(rectangle);

        int cevre = rectangleEnvironment(6,8);
        System.out.println(cevre);

        double circle = daireCevre(6);
        System.out.println(circle);

        double circleSonuc = daireAlan(5);
        System.out.println(circleSonuc);

        int sayıToplam = toplam (2,3);
        System.out.println(sayıToplam);

       double bolumSonuc = bolum (5,2 );
        System.out.println(bolumSonuc);

       double hardDiskSonucu = hardDisk (12.99);
        System.out.println(hardDiskSonucu);

        int uzunluk = turkeyKılomet( 25,36);
        System.out.println(uzunluk);


        double toplamMaas = ogretmen(1000,3000);
        System.out.println(toplamMaas);


       }



    public static int add(int a,int b){
     return a+b;
    }

    protected static long multiply (int a,int b){ return a*b;

    }

    // Ornek 1)Verilen üc sayıdan ilk ikisni carpan ve sonucu ücüncü ile toplayan methodu olusturunuz ve kullanınız

    private static int firstTwoMultiplyThirdAdd (int a, int b,int c){
        return a*b+c;
    }

    // Ornek 2) Verilen bir ondalık sayının küpünü hesaplayan methodu olusturup kullanınız.
    //Note : Access Modifier'i default yapmak için access modifier'i yazmayınız.

    static double getCube (double a){
        return  a*a*a;
    }

    //Odev 1) Kenar ölçüleri verilen bir dikdörtgenin alanını hesaplayan methodu olusturunuz

    public static int area (int a,int b){
        return a*b;
    }

    //Odev 2) Kenar ölcüleri verilen bir dikdörtgenin çevresini hesaplayan methodu olusturunuz

    private static int rectangleEnvironment (int a, int b){
        return 2*a+2*b;
    }

    //Odev 3) yarıcapı verilen bir dairenin çevresini hesaplayan methodu olusturunuz

    public  static double daireCevre (double a){
        return 2*3.14*a;
    }

    static  double daireAlan (double a){
        return 3.14*a*a;
    }

    public static int toplam ( int sayi1,int sayi2 ){
        return sayi1+ sayi2;
    }
    private static double bolum (double sayi1, double sayi2){
        return sayi1/sayi2;
    }

    protected static double hardDisk( double a){
        return 2*a*a;
    }

    public static int turkeyKılomet(int a, int b){
        return  245*a/2;
    }

    public static double ogretmen (double a, double b){return 1.25*a*b;

    }



}


