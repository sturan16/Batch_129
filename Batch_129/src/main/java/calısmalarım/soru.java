package calısmalarım;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soru {
    //Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        //2.Yol
        StringBuilder sb=new StringBuilder("263");
        sb.append(sayi);
        System.out.println(sb);

        while (sayi>0){

            System.out.print(sayi % 10);
            sayi/=10;
        }


    }
    }











