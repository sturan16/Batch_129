package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
//        Example 1: String array olsuturn icine 5 tane eleman ekleyin sonrada ilk eleman ile son elemanin icerdigi
//         karakter sayilari toplamini ekrana yazdiriniz

        String arr[]=new String[5];
        arr[0]="Math";
        arr[1]="Science";
        arr[2]="Music";
        arr[3]="English";
        arr[4]="Art";

        System.out.println(Arrays.toString(arr));


        System.out.println(arr[0].length()+arr[arr.length-1].length());//7//Arr arrayinin karakter sayısını bulmaya calistik

//        Example 1: String array olsuturn icine 5 tane eleman ekleyin sonrada tüm elemanlarin icerdigi
//         karakter sayilari toplamini ekrana yazdiriniz

        String brr[]=new String[5];
        brr[0]="Miami";
        brr[1]="İstanbul";
        brr[2]="Frankfurt";
        brr[3]="Dhaka";
        brr[4]="Athena";

        //1.yol
        int totalChar = 0;

        for(int i=0;i<brr.length;i++){

            totalChar = totalChar + brr[i].length();

        }

        System.out.println(totalChar);

        //2.Yol for each loop(enhanced loop) ==>  baslangic degeri, loopun calisma sarti ve increment/decrement kismini kendisi halleder
        //      for each loop "Array"lerde ve "Collection"larda kullanilir.
        //      Index kullanmaniz gerektiginde bazen for each loop caresiz kalir, mecburen diger looplari kullaniriz.
        int sum=0;
        //Miami,IStanbul,Frankfurt,Dhaka,Athena
        for(String w: brr){

            sum= sum +w.length();

        }
        System.out.println(sum);//33





    }
}
