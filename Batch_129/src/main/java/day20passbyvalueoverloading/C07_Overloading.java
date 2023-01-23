package day20passbyvalueoverloading;

public class C07_Overloading {
    public static void main(String[] args) {
        /*
        AYNI ISIMDE AYNI CLASSTA BIRDEN FAZLA METHOD OLUSTURABILIRMIYIZ?

        JAva ayni isimde ayni classta birden fazla method olgunda

        icerisindeki Data type'ina , data sayisina ya da yerlerine gore en uygun olani secer.
        Eger bir classta isimleri ayni data typleri farkli methodlar olusturursak buna method Overloading denir.
        Java hangi methodu kullanacagina karar verirken optimizasyona gider.
        En uygun olani en az AutoWidining gerektireni secer.


         */
       String str="Java ile guzel Dunya";
        System.out.println(str.substring(2));//va ile guzel Dunya
        System.out.println(str.replace("Java", "*"));//* ile guzel Dunya
        System.out.println(str.replace('J', '*'));//*ava ile guzel Dunya

        topla(3,5);
        topla(8.6,5);
        topla(2.4,6.8);



    }//main
    private static void topla(double a, double  b) {

        System.out.println(a+b);


    }

    private static void topla(double a, int b) {

        System.out.println(a+b);


    }

    private static void topla(int a, int b) {

        System.out.println(a+b);


    }


}//class
