package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        //Variables oluşturmak
        // Java cümlesi = Statement
        //Java'da esittir demek "==". Yani Matematik'de "=" Java'da "=="
        //Java'da "=" "assigment operator"dır. SAğdaki değeri alır soldaki kutuya koyar.
        //Acces modifier yazmazsanız "acces modifier" "default" demektir.
        //Data Type + Variable Name  ==> Variable Declaration
        //Assignment Operator+Variable Degeri ==> Assignment
        //Eger Variable Declaration yapar, Assignment yapmazsanız Java kendi degerlerini(default) koyar.
        //Default degerler sayılar için sifirdir.
        // Data type yazınız    Variable ismi yazınız    Atama Operatörü(Assigment Operator)   Variable değeri  İngilizcedeki nokta gibi
        //   int                         age                           =                                13              ;

        //Stringlere verilen değerler çift tırnak içinde olmalıdır.
        //Stringler için "default value" "null" dir.
         //Ornek1
        //String studentName = "Ali Can";

        /*
          Java'da temelde iki tip data vardır;
          1) primitive data
               char: Tek karekterler icin kullanılır. A, x, ?, 5
               boolean: booleanlar sadece iki farklı değer alabilir: True veya false
               byte: -128 den +127 ye kadar tam sayı degerleri için kullanılır.(1 byte)
               short: -32768 ile +32767 arasındaki tam sayılar icin kullanılır.(2 byte)
               int: -2147483648 ile 2147483647 arasındaki sayılar(4 byte)
               long: -9,362,365,365,365,365,125 ile +9,235,235,256,254,254,265 arasındaki sayılar(8 byte)
               - float - double
          2) non-primitive data type


         */

        //Ornek 2 : char data tipinde ilk ismin ilk harfi olarak bir variable oluşturunuz ve bir deger atayınız.
        //Note: char data tipinde degerler tek tırnak icine konulur.

        char isminIlkHarf = 'A';

        //Ornek 3 : boolean data type'inde emeklimisin için variable oluşturun ve false degerini atayın

        boolean emeklimisin = false;

        //Ornek 4 : byte data type'inda ogrenci yası icin variable olusturunuz ve deger atayınız

        byte studentAge= 100;

        // Ornek 5: Site nufusu için variable oluşturun ve deger atayınız

        short siteNufusu = 15000;

        //Ornek 6: Ulke nufusları icin variable olusturup deger atayınız.

        int countryPopulation = 1864365231;

        //Ornek 7: Insan vucudundakı hucre sayısı icin variable olusturup deger atayınız
        //Note: Bir deger long ise sonuna "L"(Tercih edilir) veya "l" konulur.
        long cellNumberInHumanBody = 87654125555215L;
        //Eger long'a atadıgınız deger int'lerin aralıgında ise sonuna "L" koymaya gerek yok
        long weightOfSun = 1234567;


    }
}

