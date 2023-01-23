package day20passbyvalueoverloading;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {
    /*
      bir list oluşturalım.
      sonra list elemanlarını degiştir methodu yazıp orada
      list elemanlarından bazılarını degiştirelim.
      method void olsun.
      main methoda döndükten sonra yeniden listi yazdıralım
      */

    public static void main(String[] args) {

        List<String>harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        harfler.add("D");


        listElemanDegistir(harfler);
        System.out.println("main icinde methoddan sonra harfler : " + harfler);//[R, B, C, D]
        ////Listemizde icindeki elemanlardan bir yada birkacını degistirmdigimizde
        ////Listeyi degistiris olmuyıruz. Pass By Value  array ve listlerde de aynen gecerlidir.
        //// Ama listenin kendisini degistirmis olmuyoruz

        ListDegistir(harfler);
        System.out.println("main icinde harfler methoddan sonra : " +harfler);//[R, B, C, D]


    }//main

    private static void ListDegistir(List<String> harfler) {
        harfler=new ArrayList<>();
        System.out.println("Methodda yeni list : " + harfler);//[]bos list olur
    }

    private static void listElemanDegistir(List<String> harfler) {

        harfler.set(0,"R");
        System.out.println("method icinde : " + harfler);//[R, B, C, D]


    }//method
}//class
