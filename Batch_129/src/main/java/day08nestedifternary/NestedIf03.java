package day08nestedifternary;

import java.util.Scanner;

public class NestedIf03 {
    /*
            Password'un ilk harfi buyuk harf ise
            'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin

            Passwordun ilk harfi kucuk harf ise
            'z' olursa gecerli passworde yazdirin degilse gecersiz password yazdirin
 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("password giriniz");
        String pwd = input.nextLine();
        char firstChar = pwd.charAt(0);//pwd.charAt(0) yerine variable olusturup tek seferde kullanıcaz.

        if(firstChar>='A' && firstChar<='Z'){
            if(firstChar=='A'){
                System.out.println("GEcerli password");
            }else{
                System.out.println("GEcersiz password cunku buyuk harf 'A' degıl");
            }
        }else if(firstChar>='a' && firstChar<='z'){
            if(firstChar=='z'){
                System.out.println("Gecerli password...");
            }else {
                System.out.println("Gecersiz password cunku kucuk harf ama 'z' degıl");
            }
        }else{
            System.out.println("ılk character harf olmalı");
        }






    }
}
