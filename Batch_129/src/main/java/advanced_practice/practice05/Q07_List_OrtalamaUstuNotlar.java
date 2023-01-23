package advanced_practice.practice05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q07_List_OrtalamaUstuNotlar {
    //// Bir öğretmenden girmek istediği kadar notu alınız, ve ortalamayı geçen öğrenci sayısını bulunuz.
    public static void main(String[] args) {
        int sayac=0;
        String cıkıs="";
        double toplam=0;
        double ort=0;
        int ortUstNot=0;
        Scanner input=new Scanner(System.in);
        List<Double>notlar=new ArrayList<>();
        do {
            sayac++;
            System.out.println("Lutfen " +sayac+ ".ogrencinin notunu giriniz");
            notlar.add(input.nextDouble());
            System.out.println("Cıkmak icin H,devam etmek icin herhangi bir karakteri secebilirsiniz");
            cıkıs =input.next();

        }while(!cıkıs.equalsIgnoreCase("H"));
        Collections.sort(notlar);
        System.out.println(notlar);


        for (double w:notlar){
            toplam+=w;
            ort=toplam/notlar.size();
        }
        System.out.println("ortalama: " +ort);

        for(double w:notlar){

            if(w>ort){
                ortUstNot++;

            }
        }
        System.out.println("ortalamanin ustunde olan not sayisi : " +ortUstNot);

    }

}
