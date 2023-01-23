package calısmalarım;

import java.util.Scanner;

public class Scanner03Ex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan adresini alınız ve ekrana yazdırınız.
        System.out.println("Lutfen adresinizi gırınız");
        String adress = input.nextLine();
        System.out.println("adress = " + adress);
    }


}
