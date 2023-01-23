package calısmalarım.ZeynepHocaSoruVizeFinal;

import java.util.Scanner;

public class IsimCharacter {
    public static void main(String[] args) {
        /*
    Kullanicidan bir isim ve karakter girmesini isteyin, sonra karakterin kac kez tekrarlandigini kontrol edin.
            char ch= 'e' ;
            String name ="Sevecen"
            => Tekrar Sayisi = 3
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String name =input.nextLine();
        System.out.println("Lutfen karakter giriniz");
        char karakter = input.next().charAt(0);

        int sayac=0;

        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==karakter){
                sayac++;
            }
        }
        System.out.println(karakter+ " burada " +sayac+ " kere kullanilmistir.");

    }
}
