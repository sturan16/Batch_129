package calısmalarım.Lists;

import java.util.ArrayList;
import java.util.List;

public class Lists06 {
    //Listede 15 veya 13 varsa, bu elemanları kaldırınız.
    public static void main(String[] args) {
        List<Integer> h = new ArrayList<>();
        h.add(10);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        h.add(13);

        if(h.contains(15)&&h.contains(13)){
            for (int i = 0; i <h.size() ; i++) {

                if(h.get(i)==15){
                    int idx15=h.indexOf(15);
                    h.remove(idx15);
                }
                if(h.get(i)==13){
                    int idx13=h.indexOf(13);
                    h.remove(idx13);
                }

            }
            System.out.println(h);
        }









}
}
