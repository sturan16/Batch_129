package calısmalarım.Arraylists;

import java.util.ArrayList;

public class Ex02 {
    public static void main(String[] args) {
// Bir tamsayı listesinde 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz.
        ArrayList<Integer>nums = new ArrayList<>();
        nums.add(12);
        nums.add(20);
        nums.add(15);
        nums.add(9);
        nums.add(84);
        nums.add(13);
        nums.add(10);
        nums.add(51);
        int sum =0;

        for(Integer w:nums){
            if(w==13){
                break;

            }sum =sum +w;
        }
        System.out.println(sum);

    }
}
