package ssg.forloop;

import java.util.Scanner;

public class C05_ForLoop {
    //Soru 5) Kullanicidan 100'den kucuk bir tamsayi isteyin. I'den baslayarak girilen sayiya kadar 3'un kati olan sayilari yazdirin.
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen 100 den kucuk nir sayi giriniz");
        int sayi = input.nextInt();
        for(int i=1;i<=sayi;i++){
            if(i%3==0){
                System.out.print(i+" ");
            }
        }
    }
}
