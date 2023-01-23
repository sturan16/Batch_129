package advanced_practice.practice05;

import java.util.Scanner;

public class Q02Ex {
     /*
       Girilen yıl ve ay numarasına göre ayın kaç gün olduğunu yazdıran bir kod yazınız.
       Girdi yıl: 2000 ay: 2
       Çıktı: 29
      */
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);

do {
    System.out.println("Lutfen yili yiriniz");
    int yil=input.nextInt();
    System.out.println("Lutfen ay numarasini giriniz");
    int ay=input.nextInt();


    switch (ay){
        case 1: case 3: case 5:
        case 7: case 8: case 10:
        case 12:
            System.out.println("....Sectiginiz ay 31 gündür....");
            break;
        case 4: case 6: case 9: case 11:
            System.out.println("....Sectiginiz ay 30 gündür....");
            break;
        case 2:
            if((yil%4==0 && yil%100!=0) || yil%400==0){
                System.out.println("Bu ay 29 gündür");
            }else {
                System.out.println("Bu ay 28 gundur");
            }
            break;
        default:
            System.out.println("Gecerli bir ay numarasi giriniz");


    }
}while (true);




     }


}
