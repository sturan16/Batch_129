package day20passbyvalueoverloading;

import java.util.Arrays;

public class C03_ByPassValueArray {
    public static void main(String[] args) {

        /*
		 bir array oluşturalım.
		 sonra array elemanlarını  elemanDegistir methodu yazıp orada
		 array elemanlarından bazılarını degiştirelim.
		 method void olsun.
		 main methoda döndükten sonra yeniden array'i yazdıralım
		 */
        int sayilar[]={3,4,5,6};

        elemanDegistir(sayilar);
        System.out.println("main icinde eleman degisince sayilar[] = " + Arrays.toString(sayilar));

        arrayiDegistir(sayilar);
        System.out.println("method icinde arrayi degistir : " + Arrays.toString(sayilar));//[10, 4, 5, 6]



    }//main

    private static void arrayiDegistir(int[] sayilar) {
        sayilar=new int[6];
        System.out.println("method icinde arrayi degistir : " + Arrays.toString(sayilar));//[0, 0, 0, 0, 0, 0]
    }

    private static void elemanDegistir(int[] sayilar) {

        sayilar[0]=10;
        System.out.println("method icinde eleman degisince sayilar[] = " + Arrays.toString(sayilar));
        //[10, 4, 5, 6]


    }


}//class
