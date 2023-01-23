package day04asciiwrapperclassoperatorsmemoryusage;

import java.sql.SQLOutput;

public class WrapperClass {
    public static void main(String[] args) {
        //primitive     :   char      -  boolean - byte - short -   int -    long -  float - double
        //Wrapper Class : Character      Boolean   Byte   Short   Integer    Long    Float   Double
        //Wrapper Class lar non primitivedir oyüzden memory de cok yer kaplarlar,o yuzden sart degılse Wrapper class
        //kullanmayı tercih etmeyiz.

        int n = 12;     //n. yaptıgımızda method cıkmaz karsımıza cunku primitiveler method ıcermez.
        Integer m = 12; //m. yaptıggımızda methodlar karsımıza cıkar bunlara wrappeer class denır.Method ıcerır.

        byte p = 23;
        Byte r = 43;

        //Example1: short data tipinin min ve max dgerlerını kod yazarak bulunuz.
        short max = Short.MAX_VALUE;
        System.out.println("max = " + max);
        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);

        //Example 2 : int data tipinin minimum degeri ile byte data type inin maximum degerinin toplamını yazınız
        int minInt = Integer.MIN_VALUE;
        System.out.println("minInt = " + minInt);
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("maxByte = " + maxByte);
        System.out.println("top ="+(minInt+maxByte));

        //Example 3: 1) primitive int'i Wrapper intigera ceviriniz(Autoboxing)
        int num = 22;
        Integer wrapperNum = num;
        System.out.println(wrapperNum);//22
        //            2) wrapper Byte primitive byte cevir(Unboxing)
        Byte k = 43;
        byte prımıtıveK = k;
        System.out.println(prımıtıveK);//43

        //Example 4 i)
        //primitive Char ı  Wrapper Charactere ceviriniz
        //Wrapper Boolean primitive boolena ceviriniz

        char initial = 'T';
        Character initialWrapper = initial;
        System.out.println(initialWrapper);
        Boolean isOld = true;
        boolean isOldPrimitive = isOld;
        System.out.println(isOldPrimitive);

        //Example 5 Size String olarak verilen iki fiyatın toplamını ekrana yazdırınız.
        String shirt = "2300";
        String shoes = "5200";

        //Java da "+" sembolu ikı sayı arasında kullanılırsa "toplama ıslemı" olur.
        //Java da "+" sembolu iki Strıng arasında veya bir String ve bir sayı arasında kullanılırsa "concatenatıon islemi" olur.
        //"Concatenatıon ıslemı" bırlestırme yapar.
        //Note: Concatenatıon ıslemlerınde Java matematıksel ıslem oncelıgı kurallarını kullanır
        System.out.println(shirt + shoes);//23005200

        int toplamFıyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFıyat);

        //Example 6 Size String olarak verilen iki fiyatın toplamını ekrana yazzdırınız.
        //Note: valueOf() methodu tum karakterlerı rakam olan Strıngleri sayılara cevırır.
        //Eger valueOf() methodu kullanırken Strıngın icine rakam olmayan bir karakter koyarsanız hata alırsınız
        //Bu hatayı düzeltmeyi daha sonra ogrenecegız.
        String tv = "$11000";
        String radıo = "$3000";

        int totalPrıce = Integer.valueOf(tv)+ Integer.valueOf(radıo);


    }
}
