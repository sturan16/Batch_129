package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //Example 1:String bir array olsuturunuz, 6 tane eleman yerlestiriniz ve karakter sayisi 5 den cok olan elemanlari siliniz.

        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        System.out.println(Arrays.toString(colors));

        //Logic: YEni bir array olsuturup karakter sayisi 5 ve  5 den kucuk olan elemanlari yeni arraye transfer edecegiz
        //        Boylelikle yeni array de karakter sayisi 5 den buyuk olan hıcbır eleman olmayacak.

        //Soru: Hocam array olsuturmak icin 2 sey belirlenmelidir.
        //      1) Elemanlarin data type i
        //      2)Yeni arrayde kac eleman olucak.

        //Verilen arrayde eleman sayisi 5 ve 5 den kucuk olan kac eleman var bulmaliyiz.
        int counter = 0;
        //REd,Orange,Blue,Yellow,Green,Brown
        for (String w : colors) {

            if (w.length() <= 5) {
                counter++;
            }
        }

        System.out.println(counter);//eleman sayisi 4 olan array olusturucaz counterdan aldıgımız degerden dolayı

        //Yeni array olustur

        String newColors[] = new String[counter];//==>[null,null,null,null]

        //KArakter sayisi  5 ve 5 den kucuk olanlari yeni arraye transfer et
        int idx = 0;//nullların indexlerini temsil eder.


        //REd,Orange,Blue,Yellow,Green,Brown
        for (String w : colors) {


            if (w.length() <= 5) {//redi alır w ye koyar kosulu saglıyorsa asagıya koyar.
                newColors[idx] = w;

                idx++;
            }


        }
        System.out.println(Arrays.toString(newColors));
        //arrayler collectionlara gore ilkel yapidadir, collectionlarda biz istedigimiz elemani silebiliyoruz
        //fakat arraylerde elemanlari silmemiz icin yeni array olusturmamiz gerekiyor


    }


}

