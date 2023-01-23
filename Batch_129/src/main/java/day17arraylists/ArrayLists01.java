package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists01 {
    /*
    1)ArrayList'ler coklu data depolamak icin kullanilir.
    2)ArrayList'ler non-primitive data tipindeki coklu datalari depolamak icin kullanilir.
      Listler "non-primitive" data kabul ederler "array"ler ise primitive data veya reference kabul ederler.
    3)ArrayList'leri(list) olustururken icine koyacaginiz eleman sayisini basta söylemeye gerek yoktur.
      Listler eleman sayisinda "flexible" dirlar ama "array"ler "flexible" degildirler.
    4)Madem "Array" ler eleman sayisinda flexible degil nicin Java "Array" leri iptal etmedi.
      i)Eleman sayisi belli olan datalari depolamak icin "Array"ler tercih edilir.
      ii)Array'ler cok hizli calisir
      iii)Array'ler memory'de cok az yer kaplar.

     */
    public static void main(String[] args) {

        //List nasil olsuturulur?
        ArrayList<Integer>ages =new ArrayList<>();

        System.out.println(ages);//[]

        //Listlere eleman nasil eklenir?
        ages.add(12);
        ages.add(9);
        ages.add(10);
        ages.add(888);
        System.out.println(ages);//[12,9,10]
        //Liste eleman eklemek icin add() methodunu kullaniriz
        //add() methodu elemanlari sizin verdiginiz sirada "list"e ekler.(Insertion Order)


        ages.add(1,656);//[12,656,9,10]
        ages.add(3,777);//[12,656,9,777,10]
        System.out.println(ages);//[12, 656, 9, 777, 10, 888] en sona eleman eklemek icin index kullanilmaz


        //Liste coklu eleman nasil eklenir? veya List'e baska bir list nasil eklenir?
        //Bir "List"e coklu eleman eklemek icin ,o elemanlari once bir Listin icine koymalisiniz

        ArrayList<Integer>newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        ages.addAll(newAges);//[12, 656, 9, 777, 10, 888,8,9,10]

        ages.addAll(2,newAges);//[12, 656, 8, 9, 10 , 777, 10, 888]
        //istedigimiz yere eklemek icin addAll ekleriz.
        System.out.println(ages);


        //toArray() metodu: eleman sayisini degitirmeyecegimizden eminsek array' ye cevirip memory kullnimini azaltabiliriz
        //toClear() medodu: Bir List'teki tum elemanlari siler.
//        ages.clear();
//        System.out.println(ages);//[]

        //contains() method'u bir elemanin list'te var olup olmadigini nasil kontrol ederiz?
        boolean r = ages.contains(656);
        System.out.println(r);


        //Bir list'in baska bir List  ile ayni olup olmadigini nasil kontrol ederiz?
        //Iki listin esit olabilmesi icin ayni indexde ayni elemanlar olmalidir.
        ArrayList<String>names = new ArrayList<>();
        names.add("Tom");
        names.add("Jim");
        names.add("Kim");

        ArrayList<String>names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean s =names.equals(names2);
        System.out.println(s);//false

        //Example 1: Verilen iki Integer Listte tamamiyle ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz.

        ArrayList<Integer>nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer>nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);

        Collections.sort(nums2);

        boolean t = nums1.equals(nums2);
        System.out.println(t);//true














    }
}
