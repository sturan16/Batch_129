package ssg.forloop;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {
        //Soru 6) Kullanicidan 100'den kucuk bir tamsayi isteyin.
        // I'den baslayarak girilen sayiya kadar 3'un ve 5"in kati olan sayilari yazdirin.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 100 den kucuk bir tam sayi giriniz");
        int sayi = input.nextInt();
        for(int i=1;i<=sayi;i++){
            if((i%3==0) && (i%5==0)){
                System.out.println(i+" ");

            }
        }
    }
}
