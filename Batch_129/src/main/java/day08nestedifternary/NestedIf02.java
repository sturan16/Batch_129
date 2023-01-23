package day08nestedifternary;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {
        /*
        Example 2:Kullanicidan bir ucgenin kenar uzunlugunu aliniz
        Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
        Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
        Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenın kenarları ıcın 3 tane uzunluk gırınız....");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        boolean ucgenMı = (a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c>a && a>Math.abs(b-c));
        if(a<=0 || b<=0 || c<=0){
            System.out.println("Gecerlı  kenar uzunlugu gırınız");
        }

        if(ucgenMı){
            if(a==b && b==c && a==c){
                System.out.println("Eskenar");
            }else if (a==b || b==c || a==c){
                System.out.println("Ikızkenar");
            }else{
                System.out.println("Cesıtkenar..");
            }

        }else {
            System.out.println("Ucgen degıl....");
        }

















    }
}
