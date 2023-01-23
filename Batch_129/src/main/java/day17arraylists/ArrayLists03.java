package day17arraylists;

import java.util.ArrayList;

public class ArrayLists03 {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");
        System.out.println(cities);

        //remove() methodu index ile kullanilirse o index teki elemani siler.

        String n = cities.remove(1);

        System.out.println(n);//Istanbul

        System.out.println(cities);

        //remove() methodu eleman ile kullanilirse ilk gorunumu siler.
        //remove() methodu eleman ile kullanilirse size o elemani silip silmedigini ifade eden ture veya false verir.
        //Eger eleman listte var ise o elemani siler ve size true der.
        //Eger eleman listte yok ise o elemani silemedigi icin size false der.

        boolean p = cities.remove("Kayseri");
        System.out.println(p);//True

        System.out.println(cities);



    }
}
