package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop03Ex {
    public static void main(String[] args) {
//       //Example 1: Asagidaki sekli cizdiren kodu yaziniz
//                * * * *
//                * * *
//                * *
//                *


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen satir sayisini giriniz");
        int satir = input.nextInt();

        for(int i=1;i<=satir;i++){
            for(int k=satir;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }










    }
}
