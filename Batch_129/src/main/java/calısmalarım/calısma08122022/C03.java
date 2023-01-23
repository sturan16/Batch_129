package calısmalarım.calısma08122022;

public class C03 {
    public static void main(String[] args) {
        String s = "Java is easy";

        //Example 1 : "s" String'indeki tüm characterleri büyük harf yapınız.
        String buyuk = s.toUpperCase();
        System.out.println("buyuk = " + buyuk);

        String kucuk = s.toLowerCase();
        System.out.println("kucuk = " + kucuk);

        //Example 3 "s" String'indeki ilk characteri alınız
        char ilkHArf = s.charAt(0);
        System.out.println("ilkHArf = " + ilkHArf);

        //Example 4 "s" String'indeki ikinci ve sondan ikinci characteri alınız ve ekrana yanyana yazdır
        char oneChac = s.charAt(1);
        char secondChac = s.charAt(10);

        System.out.println(""+oneChac+secondChac);

        //Example 5 "s" String'inde kullanılan character sayısını bulunuz.
        int uzunluk = s.length();
        System.out.println("uzunluk = " + uzunluk);

        //Example 6 "s" String'inde ilk 4  characteri alınız.
        String fourChac = s.substring(0,4);
        System.out.println(fourChac);

        //Example 7 "s" String'inde "is"  characteri alınız.
        String isChac = s.substring(5,7);
        System.out.println(isChac);

        //Example 8 "s" String'inde "easy"  characteri alınız.
        String sonChac = s.substring(8,12);
        System.out.println(sonChac);

        //Example 9: "s" String'inde "money" kelimesinin olup olmadıgını kontrol ediniz.
        boolean mon = s.contains("money");
        System.out.println(mon);

        //Example10: "s" String'inin belli bir harfle baslayıp baslamadıgını kontrol ediniz.
        boolean baslama = s.startsWith("Jav");//Java,Jav,J,"" bunlarıda kullanabiliriz
        System.out.println(baslama);

        //Example11: "s" String'inin 6. characterden itibaren belli bir harfle baslayıp baslamadıgını kpontrol edınız.

        boolean ilk5HArf = s.startsWith("e",8);
        System.out.println(ilk5HArf);












    }
}
