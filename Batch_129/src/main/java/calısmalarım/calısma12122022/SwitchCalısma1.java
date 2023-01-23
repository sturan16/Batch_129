package calısmalarım.calısma12122022;

import java.util.Scanner;

public class SwitchCalısma1 {
    public static void main(String[] args) {
        //SDET
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen SDET kısaltmasındaki harflerden birini giriniz");
        String kısa =input.next();

        switch(kısa.toLowerCase()){
            case "s":
                System.out.println("Software");
                break;
            case "d":
                System.out.println("Developer");
                break;
            case "e":
                System.out.println("Engineer");
                break;
            case "t":
                System.out.println("In Testing");
            default:
                System.out.println("Belirtilen harflerden birini giriniz");


        }







    }
}
