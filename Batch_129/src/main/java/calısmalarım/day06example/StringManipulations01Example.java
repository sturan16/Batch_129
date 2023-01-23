package calısmalarım.day06example;

public class StringManipulations01Example {
    public static void main(String[] args) {
        //bas ve sondakı spaceleri sil
        String s = "   Ali Can  ";
        System.out.println(s);
        String s1 = s.trim();
        System.out.println(s1);

        //fiyatlaı verilen ürünlerin toplam fiyatını bul
        String tv = "$456.99";
        String laptop = "$875.99";

        String tv1 = tv.replace("$","");
        System.out.println(tv1);
        String laptop1 = laptop.replace("$","");
        System.out.println(laptop1);

       Double toplamFıyat =  Double.valueOf(tv1) + Double.valueOf(laptop1);
        System.out.println(toplamFıyat);

        //Example fiyatları verilen ürünlerin carpımını bulunuz

        String cheese = "$1.3";
        String bread = "$2.4";

        String cheese1 = cheese.replace("$","");
        System.out.println(cheese1);

        String bread1 = bread.replace("$","");
        System.out.println(bread1);

        Double totalPrice = Double.valueOf(cheese1) * Double.valueOf(bread1);
        System.out.println(totalPrice);


        //Example verilen ismin ilk isminin ilk harfini ve son isminin ilk harfini ekrana yanyanayazdırınız.
        String name = "  ali CAn  ";
        char name1 = name.toUpperCase().trim().charAt(0);
        System.out.println(name1);
        char name2 = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(name2);
        System.out.println("" +name1+name2);

        //bir stringin space icermedigini konrol eden kodu yazınız
        String spc = "";

        boolean result1 = spc.length()==0;
        System.out.println(result1);

        boolean result2 = spc.isEmpty();
        System.out.println(result2);

        //Example bir stringin space haric hiçbir karakter icermedigini konrol eden kodu yazınız

        String t = "   ";

        boolean t1 = t.replace(" ", "").length()==0;
        System.out.println(t1);

        boolean t3 = t.isBlank();
        System.out.println(t3);

        boolean t4 = t.replace(" ","").isEmpty();
        System.out.println(t4);


        //Bir Stringde  a,i,e characterlerinin ilk görünümlerinin indexleri toplamını ekrana yazdırınız

        String r = "Java is easy to learn";
        int r1 = r.indexOf('a');
        System.out.println(r1);//1
        int r2 = r.indexOf('i');
        System.out.println(r2);//5
        int r3 =r.indexOf('e');
        System.out.println(r3);//8
        System.out.println("İndexler toplamı ="+ (r1+r2+r3));

        //Example 7 : Bir Stringde  "Java" kelimesinin ilk  olarak kacıncı indexde kullanıldıgını gösteren kodu yazınız.
        //        "Ah Java vah Java sensiz olmuyor Java."

        String j = "Ah Java vah Java sensiz olmuyor Java.";
        int indexJ = j.indexOf("Java");
        System.out.println(indexJ);

        //Example 8 :Bir Stringde  a,e,i characterlerinin son görünümlerinin indexleri toplamını ekrana yazdırınız.
        //           "Java is easy to learn"//

        String yaz = "Java is easy to learn";
        int idx1= yaz.lastIndexOf('a');
        System.out.println(idx1);

        int idx2 = yaz.lastIndexOf('e');
        System.out.println(idx2);

        int idx3 = yaz.lastIndexOf('i');
        System.out.println(idx3);

        System.out.println("Son İndexler Toplamı ="+(idx1+idx2+idx3));


        //example 9: Bir stringdeki tekrarsız karakterleri ekrana yazdırınız.
        //          xyxs==>y,s

        String tekrar = "xyxs";
        char tkr1 = tekrar.charAt(0);
        if(tekrar.indexOf(tkr1) == tekrar.lastIndexOf(tkr1)){
            System.out.println(tkr1);
        }
        char tkr2 =tekrar.charAt(1);
        if(tekrar.indexOf(tkr2)== tekrar.lastIndexOf(tkr2)){
            System.out.println(tkr2);
        }
        char tkr3 =tekrar.charAt(2);
        if(tekrar.indexOf(tkr3)== tekrar.lastIndexOf(tkr3)){
            System.out.println(tkr3);
        }
        char tkr4 = tekrar.charAt(3);
        if(tekrar.indexOf(tkr4)== tekrar.lastIndexOf(tkr4)){
            System.out.println(tkr4);

        }




























    }
}
