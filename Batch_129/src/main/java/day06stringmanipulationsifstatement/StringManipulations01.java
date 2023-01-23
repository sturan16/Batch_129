package day06stringmanipulationsifstatement;

public class StringManipulations01 {
    public static void main(String[] args) {
        //Example 1: Bir stringin baş ve sonunda space karakteri varsa siliniz.
        //           "   Ali Can   " ==> "Ali Can"

        String s = "   Ali Can  ";
        System.out.println(s);

        //trim() methodu bir String'in bas ve sonundaki space characterleri siler, aradak space'lere dokunmaz.
        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        //Example 2:Asagıda fıyatları verılen urunlerın toplam fıyatını bulunuz.
        //          String tv ="$456.99";   String laptop ="$875.99"; ==> 456.99 + 875.99 = 1332.98
        String tv = "$456.99";
        String laptop = "$875.99";
        String tv1 = tv.replace("$", "");
        System.out.println(tv1);
        String laptop1 = laptop.replace("$", "");
        System.out.println(laptop1);

        Double totalPrice = Double.valueOf(tv1) + Double.valueOf(laptop1);
        System.out.println(totalPrice);

        //Example 3: Verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdırınız.
        //          "Ali Can" ==> AC

        String name = "   ali cAN  ";

        char first = name.trim().toUpperCase().charAt(0);
        //burda trim bastakı ve sondakı spacelerı sılıyor
        //toUppercase butun karakterlerı buyuk harf yapar
        //sonra da charAt(0) Stringe gider indeksi 0 olan karakteri alır ve char olarak verir.
        System.out.println(first);

        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        //split parcalamak demek Ali CAn ı spaceden parcaladık daha sonra charAt 0 yaparak ilk indeksi istedik
        //parcaladıgımız icin AlI ayrı CAn ayrı oldu.ALI nın ındeksı 0 oldu CAN indeksi 1 oldu.
        System.out.println(second);

        System.out.println("" + first + second);

        //Example4 :Bir stringin hic character icermedigini(bos) kontrol eden kodu yazınız.

        String str = "";  //"" bos demektir
        //1.Yol:lenght() kullan
        boolean result1 = str.length() == 0;// karsılastırma yapıyoruz burda o yüzden boolean olur
        System.out.println("String bos mu?=" + result1);//true

        //2.yol:isEmpty() kullan. Java bir konuda method üretmisse o methodu kullanmak en iyisidir.
        boolean result2 = str.isEmpty();
        System.out.println("String bos mu?=" + result2);//true

        //Example 5: bir Stringin space haric hiçbir karakter icermedigini kontrol eden kodu yazınız
        String t = "   ";

        //1.Yol
        boolean result3 = t.replace(" ", "").length() == 0;
        System.out.println("Sadece space mi var? =" + result3);

        //2.Yol
        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println(result4);

        //3.yol
        //İsblank methodu sadece space iceren Stringler icin true verir sapace dısında bir karakter iceririse false verir.
        //isBlank methodu bos Stringler icin de true verir.
        //isBlank() ==> spcae+ hicbirsey icin true      isEmpty ==>hicbirsey icin true
        boolean result5 = t.isBlank();
        System.out.println(result5);

        //Example 6 : Bir Stringde  a,e,i characterlerinin ilk görünümlerinin indexleri toplamını ekrana yazdırınız.
        //            "Java is easy to learn"==>
        String r = "Java is easy to learn";
        int idxA = r.indexOf('a');//1
        System.out.println(idxA);

        int idxI = r.indexOf('i');
        System.out.println(idxI);//5

        int idxE = r.indexOf('e');
        System.out.println(idxE);//8
        System.out.println("indexler toplamı=" + (idxA + idxE + idxI));//14

        //Example 7 : Bir Stringde  "Java" kelimesinin ilk  olarak kacıncı indexde kullanıldıgını gösteren kodu yazınız
        //             "Ah Java vah Java sensiz olmuyor Java"
        String u = "Ah Java vah Java sensiz olmuyor Java";
        //Note:indexOf("Java") kullanımında siz "Java" kelimesinin ilk görünümündeki ilk harfin(yani J nin) indexini almıs olursunuz
        int indexJava = u.indexOf("Java");

        System.out.println(indexJava);//3

        //Note: indexOf() methodu olmayan karakterler icin kullanılırsa her zaman "-1" verir.
        int idxOfXyz = u.indexOf("xyz");
        System.out.println(idxOfXyz);

        //Example 8 :Bir Stringde  a,e,i characterlerinin son görünümlerinin indexleri toplamını ekrana yazdırınız.
        //           "Java is easy to learn"//40

        String z = "Java is easy to learn";
        int frst = z.lastIndexOf('a');
        System.out.println(frst);//18
        int secondd = z.lastIndexOf('e');
        System.out.println(secondd);//17
        int third = z.lastIndexOf('i');
        System.out.println(third);//5

        System.out.println("toplamı=" + (frst + secondd + third));

        //Note: lastIndexOf() Stringde olmayan bir ifade icin kullanılırsa her zaman "-1" verir.


        //example 9: Bir stringdeki tekrarsız karakterleri ekrana yazdırınız.
        //          abbcccdc==>a,d
        String y = "aac";
        char ch1 = y.charAt(0);
        if (y.indexOf(ch1) == y.lastIndexOf(ch1)) {
            System.out.println(ch1);
        }
        char ch2 = y.charAt(1);
        if (y.indexOf(ch2) == y.lastIndexOf(ch2)) {
            System.out.println(ch2);
        }
        char ch3 = y.charAt(2);
        if (y.indexOf(ch3) == y.lastIndexOf(ch3)) {
            System.out.println(ch3);

        }


        //Note :BAzı kodların bazı şartlara baglı olarak calısması gerekir.
        //      Bazı kodları bazı sartlara göre aktıve etmek icin "if statement" kullanılır.
        //      if you study hard, you will learn Java


        //Example10: sayı pozitif ise ekrana pozitif yazdırın.//If Statements
        int num = 12;


        if (num > 0) {
            System.out.println("Pozitif");
        }

        //Example 11 : Sayı -1 ile 10 arasında ise ekrana rakam yazdırın.
        int sayı = 5;
        if (sayı > -1 && sayı < 10) {
            System.out.println("rkam");

        }


        //Example 12: Sayı üc basamaklı ise ekrana "woww"yazdırın
        int n = 123;
        n = Math.abs(n);//mutlak deger yapar - sayı verirsek onu pozitife cevirir.
        if (n > 99 && n < 1000) {
            System.out.println("woww!");
        }

        int f = -152;
        f = Math.abs(f);
        if (f > 99 && f < 1000) {
            System.out.println("woww");
        }
    }
}