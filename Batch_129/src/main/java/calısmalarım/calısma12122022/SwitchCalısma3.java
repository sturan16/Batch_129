package calısmalarım.calısma12122022;

import java.util.Scanner;

public class SwitchCalısma3 {
    public static void main(String[] args) {
        //kullanicidan gunn ismi alip haftaici veya haftasonu yazdiralim
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen gün ismi giriniz");
        String nameDay=input.next();

        switch (nameDay.toLowerCase()){
            case "sunday":
                System.out.println("Haftasonu");
                break;
            case "monday":
                System.out.println("haftaici");
                break;
            case "thuesday":
                System.out.println("haftaici");
                break;
            case "wednesday":
                System.out.println("haftaici");
                break;
            case "thursday":
                System.out.println("haftaici");
                break;
            case "friday":
                System.out.println("haftaici");
                break;
            case "saturday":
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("gecerli gün ismi giriniz");




        }





    }

}
