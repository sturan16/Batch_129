package calısmalarım.calısma12122022.day09incrementdecrementternaryswitch;

public class NestedTernary01 {
    public static void main(String[] args) {
        //Example 1:verilen yılın "Artık yıl"(Leap Year) olup olmadıgını kontrol eden kodu yazınız
        //     1) Yıl 100 e bölünürse 400'e de bolunmelıdır 1600==> Leap   1800==>LEap degıl
        //     2) Yıl 100'e bolunmuyorsa 4'e bolunmelıdır 2004==> Leap   2005 ==> Leap degıl



        int year1= 2006;
        String result1 = year1%100==0 ? (year1%400==0? "Leap Year" : "Not leap") : (year1%4==0 ? "leap" : "Not leap" );
        System.out.println(result1);










    }
}
