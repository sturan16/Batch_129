package day05typecastinstringmanipulations;

public class StringManipulations01 {

    //String bir non-primitive data type'dır ve aynı zamanda bir classdır.

    public static void main(String[] args) {

        String s = "Java is easy";

        //Example 1 : "s" String'indeki tüm characterleri büyük harf yapınız.
        String sUpper=s.toUpperCase();//toUpper büyüyk harf yapar
        System.out.println(sUpper);

        //Example 2 "s" String'indeki tüm characterleri kücük harf yapınız.
        String sLower = s.toLowerCase();//toLower kucuk yapar
        System.out.println(sLower);

        //Example 3 "s" String'indeki ilk characteri alınız
        char firstChar = s.charAt(0);
        System.out.println(firstChar);

        //Example 4 "s" String'indeki ikinci ve sondan ikinci characteri alınız ve ekrana yanyana yazdırınız
        char secondChar = s.charAt(1);//a

        char secondLastChar = s.charAt(10);//s
        //1.Yol :Aynı satırda yanyana yazdırmak icin
        System.out.print(secondChar);
        System.out.println(secondLastChar);

        //2.yol:Aynı satırda yanyana yazdırmak icin
        System.out.println(""+ secondChar + secondLastChar);

        //Example 5 "s" String'inde kullanılan character sayısını bulunuz.
        int sLength = s.length();
        System.out.println(sLength);//12

        //Example 6 "s" String'inde ilk 4  characteri alınız.
        //substring(0,4) ==> "0" yani ilk index dahil, "4" yani ikinci index haricdir.(0,4)
        String sub1=s.substring(0,4);
        System.out.println(sub1);

        //Example 7 "s" String'inde "is"  characteri alınız.
        String sub2 =s.substring(5,7);
        System.out.println(sub2);

        //Example 8 "s" String'inde "easy"  characteri alınız.
        String sub3= s.substring(8,12);
        System.out.println(sub3);

        //Bir characterden baslayıp Stringin sonuna kadar almak isterseniz, ikinci İndexi yazmayınız.
        //s.substring(8,12); yerine s.substring(8); kullanırız.
        String sub4 = s.substring(8);
        System.out.println(sub4);

        //Example 9: "s" String'inde "money" kelimesinin olup olmadıgını kontrol ediniz.
        boolean isExist = s.contains("easy");
        System.out.println(isExist);

        boolean isExist1 = s.contains("money");
        System.out.println(isExist1);

        /*
        Bir methodu öğrenirken 3 seyi mutlaka ögrenin;
        1)Bu method ne iş yapar.
        2)Bu methodun farklı kullanımları nasıldır.
        3)Bu method size ne return eder.

         */
        //Example10: "s" String'inin belli bir harfle baslayıp baslamadıgını kontrol ediniz.
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);

        boolean isStart2 = s.startsWith("");
        System.out.println(isStart2);

        boolean isStart3 =s.startsWith("J");
        System.out.println(isStart3);

        //Example11: "s" String'inin 6. characterden itibaren belli bir harfle baslayıp baslamadıgını kpontrol edınız.
        boolean isBegin=s.startsWith("i",5);     //5 in  anlamı ilk 5 karakteri görmemek demek.geri kalan kısımda i harfi ile baslıyormu diye bakarız
        System.out.println(isBegin);                         //prefix baslangıc demek










    }
}
