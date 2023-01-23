package day17arraylists;

import java.util.ArrayList;

public class ArrayLists03Ex {
    public static void main(String[] args) {

        ArrayList<String>cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");
        System.out.println(cities);

        String bir = cities.remove(1);
        System.out.println(bir);
        System.out.println(cities);

        boolean a = cities.remove("Kayseri");
        System.out.println(a);
        System.out.println(cities);


    }
}
