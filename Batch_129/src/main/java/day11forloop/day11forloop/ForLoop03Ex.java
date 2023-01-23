package day11forloop.day11forloop;

public class ForLoop03Ex {
    public static void main(String[] args) {
        //Example 1) Size verilen bir stringi tersten yazdiriniz
        String s = "Java";
        String t = "";
//1.Yol
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
        //2.yol
        for (int i = s.length() - 1; i >= 0; i--) {
            t = t + s.charAt(i);

        }
        System.out.print(t);
        System.out.println();

        //Example 2) Size verilen bir stringin palindrom olup olmadıgını kontrol eden kodu yazdiriniz
        //       civic,kucuk,11211==> Palindrome

        String düz = "ahmet";
        String ters = "";

        for (int i = düz.length() - 1; i >= 0; i--) {
            ters = ters + düz.charAt(i);
        }

        if (ters.equalsIgnoreCase(düz)) {
            System.out.println(düz + "Palindromdur");
        } else {
            System.out.println(düz + " = palindrom degildir");
        }


        String a = "Baba";
        String b = "";


        for (int i = a.length() - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        if (a.equalsIgnoreCase(b)) {
            System.out.println(a + " = palindromdur ");

        } else {
            System.out.println(a + "= Palindrom degildir.");


        }


    }
}





















