package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03Ex {
    public static void main(String[] args) {
        //Logic: YEni bir array olsuturup karakter sayisi 5 ve  5 den kucuk olan elemanlari yeni arraye transfer edecegiz
        //        Boylelikle yeni array de karakter sayisi 5 den buyuk olan hıcbır eleman olmayacak.

        String color[]=new String[6];

        color[0]="Kırmızı";
        color[1]="Sarı";
        color[2]="YEsil";
        color[3]="pembe";
        color[4]="Turuncu";
        color[5]="Kahverengi";

        int counter=0;

        for(String w:color){
            if(w.length()<=5){
                counter++;
            }

        }
        System.out.println(counter);

        int idx=0;
        String newCol[] = new String[counter];
        for(String w:color){

            if(w.length()<=5){
                newCol[idx]=w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newCol));






    }
}
