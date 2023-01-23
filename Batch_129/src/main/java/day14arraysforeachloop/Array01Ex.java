package day14arraysforeachloop;

import java.util.Stack;

public class Array01Ex {
    public static void main(String[] args) {
        //        Example 1: String array olsuturn icine 5 tane eleman ekleyin sonrada ilk eleman ile son elemanin icerdigi
//         karakter sayilari toplamini ekrana yazdiriniz
//        String arr[]=new String[5];
//
//        arr[0]="Math";
//        arr[1]="Science";
//        arr[2]="Music";
//        arr[3]="English";
//        arr[4]="Art";
//
//        System.out.println(arr[0].length()+arr[arr.length-1].length());

        //        Example 1: String array olsuturn icine 5 tane eleman ekleyin sonrada tüm elemanlarin icerdigi
//         karakter sayilari toplamini ekrana yazdiriniz
        String brr[]=new String[5];

        brr[0]="Miami";
        brr[1]="İstanbul";
        brr[2]="Frankfurt";
        brr[3]="Dhaka";
        brr[4]="Athena";

       int total =0;

       for(int i=0;i<brr.length;i++){
           total = total + brr[i].length();
       }
        System.out.println(total);

       int sum=0;

       for(String w: brr){
           sum = sum +w.length();

       }
        System.out.println(sum);






    }
}
