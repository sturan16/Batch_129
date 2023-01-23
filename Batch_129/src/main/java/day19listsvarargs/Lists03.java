package day19listsvarargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lists03 {
    public static void main(String[] args) {
        /*
                SAYI TAHMIN OYUNU
    Oyuncudan 1-10 arasi bir sayi isteyiniz
    Elinizdeki listede oyuncunun tahmin ettigi sayi varsa "BINGO" yazdiriniz
    Yoksa verdigi sayiyi listenize ekleyiniz.
    Ilk "BINGO" yu tamamlayana " KAZANDINIZ" yazdiriniz
    [5,8,2,9]  ==> 2 ==> [5,8,BINGO,9]
    [5,8,2,9]  ==> 3  ==>[5,8,BINGO,9,3]
    [5,8,BINGO,9,3] ==> [BINGO,BINGO,BINGO,BINGO,BINGO] ==> KAZANDINIZ
*/

        Scanner input =new Scanner(System.in);
        System.out.println("Oyunumuza hosgeldiniz");
        System.out.println("Oyunu sonlandirmakl icin Q ya basinzi ");

        //Arrays.asList() ile List olsutrulabilir.
        //Ama listlerdeki eleman sayisini degistiren hicbir method bu list icin kullanilamaz.
        //Dolayisiyla bu soruun cozumunde ihtiyaciniz olan Listi "Arrays.asList()" kullanarak olusturmamalisiniz.
        //List<Integer>numsList= Arrays.asList(5,8,2,9);//Lists gibi demek array elemanları gibi ama java bunlara list rolu yapıyor.
        List<String>numList=new ArrayList<>();
        numList.add("5");
        numList.add("8");
        numList.add("2");
        numList.add("9");
        int counter =0;
        String num="";

        do {
            System.out.println("Lutfen 1 ile 10 arasinda bir tam sayi giriniz");
           num=input.next();


            if(num.equalsIgnoreCase("Q")){
                break;
            }else if
            (numList.contains(num)){
                numList.set(numList.indexOf(num),"Bingo");
                counter++;
            }else {
                numList.add(num);
            }


        }while (counter!=numList.size());

        if(!num.equalsIgnoreCase("Q")){
            System.out.println("KAzandiniz");
        }else {
            System.out.println("Oyundan isteyerek ayrıldınız yine bekleriz");
        }
        System.out.println("Final report" + numList);

    }
}
