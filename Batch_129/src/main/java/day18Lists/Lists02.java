package day18Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lists02 {
    public static void main(String[] args) {

        //Example 1: Bir tane Integer List olusturunuz
        //           Bu listte birbirine en yakin iki tamsayiyi yaziniz
        //     [12,23,9,11,31] ==>[12,11]
        List<Integer>nums =new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(9);
        nums.add(11);
        nums.add(35);
        Collections.sort(nums);
        System.out.println(nums);

        int minDiff= nums.get(1)-nums.get(0);

        for(int i=1;i<nums.size();i++){
            minDiff=Math.min(minDiff,nums.get(i)-nums.get(i-1));


        }
        System.out.println(minDiff);

            for(int k=1;k<nums.size();k++){
                if(nums.get(k)-nums.get(k-1)==minDiff){
                    System.out.println(nums.get(k)+"ve"+nums.get(k-1));
                }
            }



        }




    }

