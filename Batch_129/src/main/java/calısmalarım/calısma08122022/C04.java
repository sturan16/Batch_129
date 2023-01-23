package calısmalarım.calısma08122022;

public class C04 {
    public static void main(String[] args) {
        String s = "Learn Java earn money";

        //Example 1:"s" string'inin "money" iel bitip bitmedigini kontrol ediniz.
        boolean money = s.endsWith("money");
        System.out.println(money);

        //Example 2:"s" string'indeki money kelimesini "dollar" kelimesine ceviriniz?
        String change = s.replace("money","dollar");
        System.out.println(change);

        //Example 3:"s" string'indeki earn kelimesini "win" kelimesine ceviriniz?
        String change1 = s.replace("earn","win");
        System.out.println(change1);

        //Example 4:"s" string'indeki "a" harflerini "*" kelimesine ceviriniz?
        String harf = s.replace('a','*');
        System.out.println(harf);

        //Example 5:"s" string'indeki "n" harflerini "xxx" kelimesine ceviriniz?
        String harf1 = s.replace("n","xxx");
        System.out.println(harf1);


        //Example 6:"s" string'indeki  tüm "e" harflerini siliniz?
        String delete = s.replace("e","");
        System.out.println(delete);

        String t = "Ali 13 yasindadir!...";
        //Example 7:"t" string'indeki  tüm rakamları(0...9) "*" ceviriniz
        String rakam = t.replaceAll("[0-9]","*");
        System.out.println(rakam);

        //Example 8:"t" string'indeki  tüm rakamları ve harfleri "!" ceviriniz
        String t2 =t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println(t2);


        //Example 9:"t" string'indeki  tüm sesli  harfleri "?" ceviriniz

        String t3 = t.replaceAll("[aeiouAEIOU]","?");
        System.out.println(t3);

        //Example 10:"t" string'indeki  kucuk harfler disindaki tum karakterleri "<>" ceviriniz
        String t4=  t.replaceAll("[^a-z]","<>");
        System.out.println(t4);

        //Example 11:"t" string'indeki  tüm harfler disindaki tum karakterleri "+" ceviriniz
        String t5 = t.replaceAll("[^a-zA-Z]","+");
        System.out.println(t5);

        //Example 11:"t" string'indeki  tüm harfler disindaki tum karakterleri "+" ceviriniz

        String t6 = t.replaceAll("[^ ]","+");
        System.out.println(t6);












    }
}
