package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {
        /*
       Gecerli  Username="admin" Password="pwd123"
       Kullanicidan username ve passwordu alin
       username ve passwordu dogru ise console "Hesabiniza hosgeldiniz" yazdirin
       username ve passwordu yanlis ise 3 kere "Username  ve passwordunuzu giriniz"mesajı versin.
       username ve passwordu 4 kere yanlis girilirse "hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
         */
        Scanner input =new Scanner(System.in);




        int counter=0;
        do{
            if(counter==4){
                System.out.println("Hesabiniz bloke olmustur!.");
                break;
            }
            System.out.println("USername giriniz...");
            String username=input.next();

            System.out.println("Password'u giriniz...");
            String password =input.next();

            if(username.equals("admin")&&password.equals("pwd123")){
                System.out.println("Hesabiniza hosgeldiniz");
                break;
            }
            counter++;


        }while(true);











    }
}
