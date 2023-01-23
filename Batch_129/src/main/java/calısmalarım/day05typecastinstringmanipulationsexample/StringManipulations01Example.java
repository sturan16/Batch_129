package calısmalarım.day05typecastinstringmanipulationsexample;

public class StringManipulations01Example {
    public static void main(String[] args) {

        String y ="Hayat Bazen Tatlıdır";

        //Example 1 : "s" String'indeki tüm characterleri büyük harf yapınız.
        String y1 = y.toUpperCase();
        System.out.println("y1 = " + y1);

        //Example 2 "s" String'indeki tüm characterleri kücük harf yapınız.
        String y2 = y.toLowerCase();
        System.out.println("y2 = " + y2);

        //Example 3 "s" String'indeki ilk characteri alınız
        char y3 = y.charAt(0);
        System.out.println("y3 = " + y3);

        //Example 4 "s" String'indeki ikinci ve sondan ikinci characteri alınız ve ekrana yanyana yazdırınız
        char y4 =y.charAt(1);
        char y5 =y.charAt(18);
        System.out.print(y4);
        System.out.println(y5);
        System.out.println(""+y4 + y5);

        //Example 5 "s" String'inde kullanılan character sayısını bulunuz.
        int y6 = y.length();
        System.out.println("y6 = " + y6);

        ////Example 6 "s" String'inde ilk 4  characteri alınız.
        String y7 = y.substring(0,4);
        System.out.println("y7 = " + y7);

        //Example 8 "s" String'inde "Bazen"  characteri alınız.
        String y8 =y.substring(6,11);
        System.out.println("y8 = " + y8);

        //Example 9: "y" String'inde "bazen" kelimesinin olup olmadıgını kontrol ediniz.

        boolean y9 = y.contains("Bazen");
        System.out.println("y9 = " + y9);

        //Example 10: "y" String'inde "baz" kelimesinin olup olmadıgını kontrol ediniz.
        boolean y10=y.contains("Baz");
        System.out.println("y10 = " + y10);

        //Example10: "y" String'inin belli bir harfle baslayıp baslamadıgını kontrol ediniz.

        boolean y11 =y.startsWith("Hayat");
        System.out.println("y11 = " + y11);

        boolean y12= y.startsWith("");
        System.out.println("y12 = " + y12);

        boolean y13 = y.startsWith("H");
        System.out.println("y13 = " + y13);

        //Example 11 :"y" String'inin 6. characterden itibaren belli bir harfle baslayıp baslamadıgını kpontrol edınız.
        boolean y14 = y.startsWith("B",6);
        System.out.println("y14 = " + y14);

        boolean y15= y.startsWith("t",4);
        System.out.println("y15 = " + y15);







    }
}
