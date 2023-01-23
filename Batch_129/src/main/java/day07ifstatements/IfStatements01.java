package day07ifstatements;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {

        //Example1) verilen character buyuk harf ıse ekrana 'buyuk harf yazdıran
        //           kucuk harf ıse ekrana kucuk harf yazdıran kodu yazınız

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir character girirniz");

        char ch = input.next().charAt(0);
        /*
        //****1.Yol
        if(ch>='A' && ch <='Z'){
            System.out.println("Buyuk harf...");
        }

        if(ch>='a' && ch<='z'){
            System.out.println("Kucuk harf....");
        }
        */


        //2.yol
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk harf...");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Kucuk harf...");
        } else {
            System.out.println("Harf degil...");
        }

        //Example2)






















    }
}
