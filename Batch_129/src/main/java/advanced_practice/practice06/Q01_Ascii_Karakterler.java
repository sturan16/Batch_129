package advanced_practice.practice06;

import java.util.Scanner;

public class Q01_Ascii_Karakterler {
    //Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen karakter giriniz");
        char krk1=input.next().charAt(0);

        char krk2=input.next().charAt(0);

      int ilk = Math.min(krk1,krk2);
      int ikinci = Math.max(krk1,krk2);

        System.out.println((char) ilk);


        for (int i = ilk+1; i <ikinci ; i++) {

            System.out.print((char) i+" ");

        }

        }
    }



