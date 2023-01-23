package calısmalarım.calısma10122022;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        /*
            Password'un ilk harfi buyuk harf ise
            'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin

            Passwordun ilk harfi kucuk harf ise
            'z' olursa gecerli passworde yazdirin degilse gecersiz password yazdirin
 */

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen password giriniz");
        String pwd = input.next();
        char firstChar = pwd.charAt(0);

        if (firstChar>='A' && firstChar<='Z'){
            if(firstChar=='A'){
                System.out.println("Gecerli password");
            }else {
                System.out.println("GEcersiz password");
            }
        }else if (firstChar>='a' && firstChar<='z'){
            if(firstChar=='z'){
                System.out.println("Gecerli password");
            }else {
                System.out.println("GEcersiz password");
            }
        }else {
            System.out.println("Tanımlı degıl");
        }









    }
}
