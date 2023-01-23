package calısmalarım.ZeynepHocaSoruVizeFinal;

import java.util.Scanner;

public class Gmail {
    public static void main(String[] args) {
        /* TASK :
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir email adresi giriniz");
        String email = input.nextLine();

        if(!email.contains("@")){
            System.out.println("Lutfen gecerli bir email adresi giriniz");
        }else if (email.endsWith("@gmail.com")){
            System.out.println("Email onaylandi");
        }else if (email.contains("@")&& !email.contains("gmail.com")){
            System.out.println("lutfen gmail hesabinizi giriniz");
        }else
            System.out.println("Gecersiz mail");

    }
}
