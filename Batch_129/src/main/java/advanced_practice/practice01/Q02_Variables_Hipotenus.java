package advanced_practice.practice01;

import java.util.Scanner;

public class Q02_Variables_Hipotenus {
    //Hipotenüs hesaplayan bir kod yazınız.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 1.dik kenar uzunlugunu giriniz");
        double dik1=input.nextDouble();
        System.out.println("Lütfen 2.dik kenar uzunlugunu giriniz");
        double dik2=input.nextDouble();
        double c = Math.sqrt(dik1*dik1+dik2*dik2);
        System.out.println("Hıpotenus ="+c);
        System.out.printf("%.2f",c);



    }
}
