package advanced_practice.practice11;

public class PangramEx {
    //String trAlfabe = "abcçdefgğhiıjklmnoöprsştuüvyz";
//    Bir cümlenin pangram olup olamadığını kontrol eden bir kod yazınız.
//    Not: Pangram, bir dilin alfabesi içerisindeki tüm harfleri içeren anlamlı cümledir.
//    TR: Pijamalı hasta yağız şoföre çabucak güvendi.
//    ENG: The quick brown fox jumps over the lazy dog.

    public static void main(String[] args) {
        System.out.println(isPangram1("Pijamalı hasta yağız şoföre çabucak güvendi"));
    }
    public static boolean isPangram1(String str){
        String trAlfabe = "abcçdefgğhiıjklmnoöprsştuüvyz";
        str=str.replaceAll(" ","").toLowerCase();
        boolean sonuc=false;
        for (int i = 0; i <trAlfabe.length() ; i++) {
            if(str.contains(""+trAlfabe.charAt(i))){
               sonuc=true;
            }

        }
        return sonuc;
    }
}
