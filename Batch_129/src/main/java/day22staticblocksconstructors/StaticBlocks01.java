package day22staticblocksconstructors;

public class StaticBlocks01 {

    //Bir variable olusturdugunuzda, deger atamazsaniz o variable'i "initialize"(baslatmak) etmediniz demektir.
    //Static variable'lar static blocklar icinde initialize edilirse o class'in icinde herseyden once hazir hale getirilmis olur.
    //BAzen main method calistirilmadan önce variable'larin hazir hale getirilmesi gerekir,bu yuzden static blocklar kullanilir.

    //Note 1: Static blocklar static bvariable'lari initialize etmek icin kullanilir
    //Note 2:Static blocklar class icinde "herseyden once" calisir.
    static double pi;
    static String shape;



    static {//staticblocks : main motor çalıştırılmadan önce variable ları hazır hale getirir static bloklar her zaman mainden once baslar..
        pi=3.14;
        System.out.println("Static blok1");
    }
    static {
        shape="Circle";
        System.out.println("Static blok2");
    }


    public static void main(String[] args) {
        System.out.println("main method");
        System.out.println(pi);

    }
}
