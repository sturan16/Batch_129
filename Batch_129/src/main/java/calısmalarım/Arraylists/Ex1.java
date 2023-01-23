package calısmalarım.Arraylists;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer>myLists = new ArrayList<>();
        myLists.add(12);
        myLists.add(31);
        myLists.add(7);
        myLists.add(13);
        myLists.add(10);
        myLists.add(22);
        myLists.add(14);

        int sum =0;
        for(Integer w:myLists){
            sum = sum+w;
        }
        System.out.println(sum);


    }
}
