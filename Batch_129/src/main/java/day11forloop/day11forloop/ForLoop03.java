package day11forloop.day11forloop;

public class ForLoop03 {
    public static void main(String[] args) {
        //Example 1) Size verilen bir stringi tersten yazdiriniz
        String s = "Java";
        String t = "";


        for (int i = s.length() - 1; i >= 0; i--) {
            t = t + s.charAt(i);

        }System.out.println(t);

        //Example 2) Size verilen bir stringin palindrom olup olmadıgını kontrol eden kodu yazdiriniz
        //       civic,kucuk,11211==> Palindrome
        //Logic:Stringi ters cevir sonra da duz hali ile ters halini karsılastır aynı ise palindrome de.
        String r = "Civic";
        String ters ="";

        for(int i=r.length()-1 ; i>=0 ;i--){
            ters = ters +r.charAt(i);
        }
        if(r.equalsIgnoreCase(ters)){
            System.out.println(r + " :palindromedur");
        }else {
            System.out.println(r + " :palindrome degıldır");
        }







    }


}

