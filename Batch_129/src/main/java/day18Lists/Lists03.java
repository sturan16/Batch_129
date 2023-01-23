package day18Lists;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {
    public static void main(String[] args) {
        //Example2: Bir Integer Listteki 7 haric tüm elemanlarin degerlerini 3 arttiriniz
        List<Integer> nums =new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(7);
        nums.add(12);
        nums.add(11);

        //1.Yol
                      //12,13,7,12,11
        for (Integer w:nums){
            if(w==7){
                continue;
            }
            nums.set(nums.indexOf(w),w+3);
        }
        System.out.println(nums);//[15, 16, 7, 15, 14]
        //2.Yol:

        for(int i=0;i< nums.size();i++){
            int eleman =nums.get(i);
            if(eleman==7){
                continue;
            }
            nums.set(i,eleman+3);
        }
        System.out.println(nums);

        /*
        nums.indexof(w) ilk gorunum indexini verir.List tekrarli elemana sahip ise
        nums.indexof(w) kullanimi risk olusturablir.Bu yuzden soruda guvenli yol"for-loop"dur.
         */





            }
}
