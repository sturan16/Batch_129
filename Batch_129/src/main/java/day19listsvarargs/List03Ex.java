package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List03Ex {
    //SAYI TAHMIN OYUNU
//    Oyuncudan 1-10 arasi bir sayi isteyiniz
//    Elinizdeki listede oyuncunun tahmin ettigi sayi varsa "BINGO" yazdiriniz
//    Yoksa verdigi sayiyi listenize ekleyiniz.
//            Ilk "BINGO" yu tamamlayana " KAZANDINIZ" yazdiriniz
//    [5,8,2,9]  ==> 2 ==> [5,8,BINGO,9]
//            [5,8,2,9]  ==> 3  ==>[5,8,BINGO,9,3]
//            [5,8,BINGO,9,3] ==> [BINGO,BINGO,BINGO,BINGO,BINGO] ==> KAZANDINIZ

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        List<String> numList = new ArrayList<>();
        numList.add("5");
        numList.add("8");
        numList.add("2");
        numList.add("9");
        int counter = 0;
        String sayi = "";

        do {
            System.out.println("Lutfen 1-10 arasinda bir tam sayi giriniz");
            sayi = input.next();

            if (sayi.equalsIgnoreCase("Q")) {
                break;
            } else if (numList.contains(sayi)) {
                numList.set(numList.indexOf(sayi), "Bingo");
                counter++;
            } else {
                numList.add(sayi);
            }

        } while (counter != numList.size());
        if (!sayi.equalsIgnoreCase("Q")) {
            System.out.println("KAzandiniz");
        }else {
            System.out.println("Kendi isteginizle ayrildiniz");
        }
        System.out.println(numList);
    }
}
