package calısmalarım.Lists;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {
    //Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);
        int sum=0;
        for (Integer w:myList){
            if(w%2==0){
                sum+=w;
            }
        }
        System.out.println("Cift sayilarin toplami : " +sum);
    }
}
