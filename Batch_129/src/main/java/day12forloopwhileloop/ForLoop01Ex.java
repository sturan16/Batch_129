package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop01Ex {
    public static void main(String[] args) {
        /*Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
        X X X X X//5 kere tekrarlı iş var
        X X X X X
        X X X X X
                */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen satir sayisini giriniz");
        int satir = input.nextInt();
        System.out.println("Lütfen sutun sayisini giriniz");
        int sutun =input.nextInt();

        for(int i=1;i<=satir;i++){
            for(int k=1;k<=sutun;k++){
                System.out.print("X ");
            }
            System.out.println();
        }









        }


    }

