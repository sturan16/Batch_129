package calısmalarım.Arraylists;

import java.util.ArrayList;

public class Ex03 {
    public static void main(String[] args) {
        //Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(2);
        nums.add(15);
        nums.add(9);
        nums.add(6);
        nums.add(13);
        nums.add(4);
        nums.add(51);
        int sum =1;

        for(Integer w:nums){
            if(w%2==0){

                sum =sum*w;

            }
        }
        System.out.println(sum);



    }
}
