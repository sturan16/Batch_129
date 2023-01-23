package calısmalarım.day05typecastinstringmanipulationsexample;

public class StringManipulations02Example {

    public static void main(String[] args) {
        String s = "Learn Java earn money";
        //Example 1:"s" string'inin "money" ile bitip bitmedigini kontrol ediniz.
        boolean s1 =s.endsWith("money");
        System.out.println("s1 = " + s1);

        //Example 2:"s" string'inin "ey" ile bitip bitmedigini kontrol ediniz.
        boolean s2= s.endsWith("ey");
        System.out.println("s2 = " + s2);

        //Example 3:"s" string'indeki money kelimesini "dollar" kelimesine ceviriniz?
        String s3 = s.replace("money","dollar");
        System.out.println("s3 = " + s3);

        ////Example 4:"s" string'indeki "a" harflerini "*" kelimesine ceviriniz?
        String s4 = s.replace('a','*');
        System.out.println("s4 = " + s4);

        //Example 5:"s" string'indeki "n" harflerini "xxx" kelimesine ceviriniz?
        String s5 = s.replace("n","xxx");
        System.out.println("s5 = " + s5);

        //Example 6:"s" string'indeki  tüm "e" harflerini siliniz?
        String s6 = s.replace("e","");
        System.out.println("s6 = " + s6);

        String t = "Ali 13 yasindadir!...";

        //Example 7:"t" string'indeki  tüm rakamları(0...9) "*" ceviriniz
        String t1 = t.replaceAll("[0-9]","*");
        System.out.println("t1 = " + t1);

        //Example 8:"t" string'indeki  tüm rakamları ve harfleri "!" ceviriniz
        String t2 = t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println("t2 = " + t2);

        //Example 9:"t" string'indeki  tüm sesli  harfleri "?" ceviriniz
        String t3 = t.replaceAll("[aeiouAEIOU]","?");
        System.out.println("t3 = " + t3);

        //Example 10:"t" string'indeki  kucuk harfler disindaki tum karakterleri "<>" ceviriniz
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println("t4 = " + t4);

        //Example 11:"t" string'indeki  tüm harfler disindaki tum karakterleri "+" ceviriniz.
        String t5 = t.replaceAll("[^a-zA-z]","+");
        System.out.println("t5 = " + t5);

        //Example 12:"t" string'indeki  spaceler disindaki tum karakterleri "tl" ceviriniz.
        String t6 = t.replaceAll("[^ ]","tl");
        System.out.println("t6 = " + t6);

        //Example 13:"t" string'indeki  sesli harfler disindaki tum karakterleri "&" ceviriniz
        String t7 = t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println("t7 = " + t7);








    }
}
