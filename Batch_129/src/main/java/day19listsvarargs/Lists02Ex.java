package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists02Ex {
    public static void main(String[] args) {
        /*
       Rastgele kullanici adi olusturan JAVA kodu yaziniz.
       1. Kullanicidan ismini isteyelim
       2. Kullanici adindaki bastaki ve sondaki bosluklari silelim.
       3. Kullanici adinin alinabilir olup olmadigina bakalim.
       4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
       5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
       */
        List<String> databaseIsim = new ArrayList();
        databaseIsim.add("AYSE");
        databaseIsim.add("AHMET");
        databaseIsim.add("SERDAR");
        databaseIsim.add("OKAN");
        databaseIsim.add("BETUL");
        Scanner input =new Scanner(System.in);

do {
    System.out.println("Lutfen isminizi giriniz");
    String userName = input.nextLine().trim().toUpperCase();


    if (!databaseIsim.contains(userName)) {
        System.out.println("Kullanicinin girdigi isim kullanilabilri");
        databaseIsim.add(userName);
    } else if (databaseIsim.contains(userName)) {
        System.out.println("Kullanicinin girdigi isim databese de var farklı bir isim olarak degisitiriyoruz");
        databaseIsim.add(userName + (int) (Math.random() * 100));
    }
    System.out.println(databaseIsim);
}while (true);
    }
}
