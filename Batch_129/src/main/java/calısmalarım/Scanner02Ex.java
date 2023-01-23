package calısmalarım;

import java.util.Scanner;

public class Scanner02Ex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan ilk ismini soyismini alıp ikisini aynı satırda ekrana yazdırınız
        System.out.println("Lütfen ilk isminizi giriniz");

        String firstName = input.next();
        System.out.println("Lütfen ikinci adınızı giriniz");
        String lastName = input.next();
        System.out.println("adınız ve soyadınız="+firstName+lastName );

    }
}
