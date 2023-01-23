package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop04Ex {
    public static void main(String[] args) {

//        Kullanicidan baslangic ve bitis degerlerini alin.
//        Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilarilk
//        ekrana yazdiriniz  9-14//10  12  14

        Scanner input = new Scanner(System.in);
        System.out.println("baslangıc");
        int bas= input.nextInt();
        System.out.println("Bitis");
        int bit = input.nextInt();
        if(bas>bit){
            System.out.println("Baslabgıc bitisden buyuk olamaz");
        }else {for(int i=bas;i<=bit;i++){
            if(i%2==0){
                System.out.print(i+ " ");

        }

            }
        }


    }
}
