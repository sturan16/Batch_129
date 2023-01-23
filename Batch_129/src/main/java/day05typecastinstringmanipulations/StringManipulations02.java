package day05typecastinstringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {
        String s = "Learn Java earn money";

        //Example 1:"s" string'inin "money" iel bitip bitmedigini kontrol ediniz.
        boolean isEnd = s.endsWith("money");// tekli karekter ile de kullanılabilir örn:y,""(bosluk)demek harfi yazılabilir
        System.out.println(isEnd);

        //Example 2:"s" string'indeki money kelimesini "dollar" kelimesine ceviriniz?
        String newS1 = s.replace("money","dollar");
        System.out.println(newS1);//Learn Java earn dollar

        //Example 3:"s" string'indeki earn kelimesini "win" kelimesine ceviriniz?
        String newS2 = s.replace("earn","win");
        System.out.println(newS2);//Lwin Java win money

        //Example 4:"s" string'indeki "a" harflerini "*" kelimesine ceviriniz?

        //Note: Replace methodunda coklu karakter ıle calısırsanız mecbur cift tırnak kullanırız
        //      Ama tek karakterle calısırsanız cift tırnak veya tek tırnak kullanabılırsınız.
        String newS3= s.replace("a","*");//
        System.out.println(newS3);//Le*rn J*v* e*rn money

        //Note: Ama ya ikiside cift tırnak olmalıdır ya da ikiside tek tırnak olmalıdır.
        //Example 5:"s" string'indeki "n" harflerini "xxx" kelimesine ceviriniz?
        String newS4 = s.replace("n","xxx");
        System.out.println(newS4);//Learxxx Java earxxx moxxxey

        //Example 6:"s" string'indeki  tüm "e" harflerini siliniz?
        //Note:"Hiçbirşey" Char data type inda yoktur.Bu yüzden replace() methodu kullanarak silme islemi yaparsanız
        //      mutlaka çift tırnak kullanınız.
        String newS5 = s.replace("e","");
        System.out.println(newS5);//Larn Java arn mony

        String t = "Ali 13 yasindadir!...";


        //Example 7:"t" string'indeki  tüm rakamları(0...9) "*" ceviriniz
        //Note : Bir grup datayı degıstırmek icin replaceAll() kullanılır.
        //Note : Bir grup datayı ifade etmek icin "Regular Expressions"(Regex) kullanırız.
        String t1 = t.replaceAll("[0-9]","*");
        System.out.println(t1);

        /*
        Meshur Regex'ler
        1)Tüm rakamlar ==>[0-9]
        2)Tüm küçük harfler ==> [a-z]
        3)Tüm büyük harfler ==> [A-Z]
        4)Tüm küçük harfler ve büyük harfler ==> [a-zA-z]
        5)Tüm harfler ve rakamlar ==> [a-zA-z0-9]
        6)Tüm noktalama isaretleri ==> \\p{Punct}
        7)Tüm sesli harfler ==>[aeiouAEIOU]
          x, q, w harfleri ==> [xqw]

        8)Kucuk harflerden farklı tüm characterler ==>[^a-z]
        9)Tüm harflerden farklı tüm character'ler ==> [^a-zA-z]
        10) Space dısındakı tum karakter ==> \\S


         */

        //Example 8:"t" string'indeki  tüm rakamları ve harfleri "!" ceviriniz
        String t2 =t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println(t2);//!!! !! !!!!!!!!!!!...

        //Example 9:"t" string'indeki  tüm sesli  harfleri "?" ceviriniz
        String t3 = t.replaceAll("[aeiouAEIOU]","?");
        System.out.println(t3);//?l? 13 y?s?nd?d?r!...

        //Example 10:"t" string'indeki  kucuk harfler disindaki tum karakterleri "<>" ceviriniz
        String t4 = t.replaceAll("[^a-z]","<>");
        System.out.println(t4);//<>li<><><><>yasindadir<><><><>

        //Example 11:"t" string'indeki  tüm harfler disindaki tum karakterleri "+" ceviriniz
        String t5 = t.replaceAll("[^a-zA-Z]","+");
        System.out.println(t5);//Ali++++yasindadir++++

        //Example 11:"t" string'indeki  tüm harfler disindaki tum karakterleri "+" ceviriniz
        String t6 = t.replaceAll("[^ ]","tl");
        System.out.println(t6);//tltltl tltl tltltltltltltltltltltltltltl

        //Example 13:"t" string'indeki  sesli harfler disindaki tum karakterleri "&" ceviriniz
        String t7 = t.replaceAll("[^aeouiAEOIU]","&");
        System.out.println(t7);//A&i&&&&&a&i&&a&i&&&&&









    }
}
