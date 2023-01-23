package day31collections;

import java.util.HashSet;

public class HashSet01 {
    /*
       Collections'lari coklu eleman depolamak icin kullaniriz
       Hash bir tekniktir biz bu teknigi kullanarak unique data'lar uretiriz (Benzersiz)
       Mesela universitenin olusturdugu ogrenci numarasi olusturma islemine hash code islemi denir
       IT de set  tekrar kabul etmez.Yani;tekrarsiz verileri depolamak icin kullanilir.
       Mesela e-mail depolayan bir DB icin HashSet en iyisidir.

       "Set" ler 3'e ayrilir.
         i)HashSet :        a)Super hizlidir,cunku HashSet'ler verdiginiz elemanlari siralamak icin zaman kaybetmezler
                              yani; HashSet'lere eklenen elemanlar rastgele siralanirlar.
                            b)HashSetler tekrarli elemana musaade etmezler.
                            c)HashSetler sadece bir tane "null" i eleman olarak kabul ederler.
         ii)LinkedHashSet : a)LinkedHashSet elemanlari  "inertion order" a gore dizer.(Bizim girdigimiz siraya gore dizer.)
                            b)LinkedHashSet elemanlari siralamakta zaman kaybettigi icin HashSete gore yavastir.(mesela kayit sirasi oldugunda bu collection kullanilir.)
                            c)LinkedHasSet'ler  tekrarli elemana musaade etmezler.
         iii)TreeSet :      a)TreeSet elemanlari "natural order"(kucukten buyuge veya alfabetik siraya gore dizer ) a gore dizer.
                            b)TreeSet, "natural order" yaparken cok zaman harcar o yuzden en yavas "Set" dir.


         */
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>();
        hs.add(12);
        hs.add(234);
        hs.add(78);
        hs.add(5);
        System.out.println(hs);//[5, 234, 12, 78] --> gordugunuz gibi random bir siralama yapti.

       int hc=  hs.hashCode();
        System.out.println(hc);//329 bu hashsetin kodu


    }
}
