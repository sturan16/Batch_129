package practice.nighttime04;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class C01_ForLoopCdenOncekiA {
    /*
   Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
*/
    //alacakaranlik==>2
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen string bir deger giriniz");
        String word = input.next().toLowerCase();
        int sayac =0;
if(word.contains("a") && word.contains("c")) {
    for (int i = 0; i < word.length(); i++) {
        String c = word.substring(i, i + 1);
        if (c.equals("c")) {
            break;
        } else if (c.equals("a")) {
            sayac++;

        }

    }
    System.out.print("Cden önceki a'ların sayısı: " + sayac);
}else {
    System.out.println("a ve c harfini icren bir kelime giriniz");
}









    }

}
