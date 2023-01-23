package calısmalarım.calısma12122022;

import java.util.Scanner;

public class SwitchCalısma {
    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen gün numarasını giriniz");
        int dayNum= input.nextInt();

        switch (dayNum){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Lütfen gecerli gun numarası giriniz");
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ay ismini yazınız");
        String nameMonth = input.next();

        switch (nameMonth.toLowerCase()){
            case "january":
                System.out.println(1);
                break;
            case "february":
                System.out.println(2);
                break;
            case "march":
                System.out.println(3);
                break;
            case "april":
                System.out.println(4);
                break;
            default:
                System.out.println("GEcerli ay ismi giriniz");















        }






    }

}
