package day04asciiwrapperclassoperatorsmemoryusage;

public class Operators01 {
    /*
    1) +,-,*,/ ıslemlerı Java damatematıkte kullanıldıgı gıbı kullanılır.
    Note 1 : int / int ==> int olur
    Note 2 : double / int ==> double olur.Cunku Java 'da matematıksel ıslemlerde farklı data tıplero kullanılırsa sonuc buyuk data type da olur


    2)Java'da "logical operator" lar vardır.
    AND ve OR işlemleri "logical operator" lardır.
    1) AND işleminden true alabilmek için her şey true olmalıdır.
       AND işlemi "perfectionist" tir.
       AND işleminde bir tane false sonucu false yapar.
           2) OR isleminde(ne true sonucu true yapmaya yeter.
       OR ıslemınde sonucun false olması ıcın hersey false olmalıdır.
       OR ıslemı "polyanna" gıbıdır.
    3) NOT Operatoru(!) true olanı false, false olanı true yapar.
      !true = false
      !false = true
      !!true = true

      Karsılastırma operatorleri
      <, > ,<=, =>, ==, !=
      Note :Karsılastırma operatorlerını kullandıgınızda kesınlıkle boolean alırsınız

      Note : Biz And islemi icin '&&' kullanırız ama "&" kullanımda gecerlıdır.
             Farkları nedir?
             "&&" kullanım ilk ifade false oldugunda digerlerini kontrol etmez dolayısıyla hızlı calısır
             "&" kullanım ilk ifade ne olursa olsun digerlerini kontrol eder dolayısıyla yavas calısır
             Bu yuzden bız hep "&&" kullanırız.
     */
    public static void main(String[] args) {
        boolean first =3<5;//true
        boolean second = 2+3 !=5;//false
        boolean third = 2+3*5 >= 19;//false
        System.out.println(first+ " - "+ second+" -"+ third);

        System.out.println(first && second);

        System.out.println(first || second || third);

        boolean tt = 5>4;
        boolean ww = 4<5;
        System.out.println(tt && ww);

    }

}
