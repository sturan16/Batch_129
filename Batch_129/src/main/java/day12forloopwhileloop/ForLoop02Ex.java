package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop02Ex {
    /*
                Example 1: Asagidaki sekli cizen kodu yaziniz
                            1
                            1 2
                            1 2 3  //icerdeki loopun bitişini dısardaki loop belirliyor
                            1 2 3 4
                            1 2 3 4 5
         */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen satir sayisini giriniz");
        int satir = input.nextInt();

        for(int i=1;i<=satir;i++){
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();








    }






    }
}
