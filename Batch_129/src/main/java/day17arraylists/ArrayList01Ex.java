package day17arraylists;

import java.util.ArrayList;

public class ArrayList01Ex {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ahmet");
        names.add("Mehmet");
        names.add("Yunus");
        names.add("Saim");
        names.add("Ebubekir");
        System.out.println(names);

        names.add(1, "Semih");
        System.out.println(names);
        names.add(3, "Salih");
        System.out.println(names);

        ArrayList<String> newNames = new ArrayList<>();
        newNames.add("Halil");
        newNames.add("Samet");
        newNames.add("Huseyin");
        System.out.println(newNames);
        newNames.addAll(1, names);
        System.out.println(newNames);


    }
}
