package calısmalarım.Mentor;

import java.util.Scanner;

public class Calisma01 {
    public static void main(String[] args) {
        //Kullanıcıdan bir tam sayi aliniz
        //SAyı pozitifse cift sayi veya cift sayi degil
        //Sayı pozitif degilse 3 basamakli veya 3 basamakli değil yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = input.nextInt();
        if(sayi==0) {
            System.out.println("gırdiginiz sayi tam sayi degildir ");}else
        { String sonuc = sayi >=1 ? (sayi % 2 == 0 ? "Cift sayi" : "Cift sayi degil") : (sayi < -99 && sayi > -1000 ? "Uc basamakli" : "Uc basamakl degil");
            System.out.println(sonuc);

        }
        //Bu soruyu anla ne yazdırır.

        for(int i=1; i<=5; i++) {

            for(int j=(5-i); j>1; j--) {

                System.out.print(i+j);

            }

            System.out.println();

        }
        for ( char i = 'f';  i>'a';  i--){

            System.out.print(i + " " );

            i--;

        }


    }
}
