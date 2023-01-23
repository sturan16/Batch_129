package calısmalarım.calısma08122022;

import java.util.Scanner;

public class C07Onemli {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir cumle yazınız");
        String t1 = input.nextLine();

        boolean t2 = t1.contains("büyük");
        boolean t3 = t1.contains("kücük");
        boolean t4 = t1.contains("büyük,kücük");

        if(t2 == true){
            System.out.println(t1.toUpperCase());
        }
        if(t3 == true){
            System.out.println(t1.toLowerCase());
        }
        if(t4 == false){
            System.out.println("Cumle kucuk yada buyuk kelımesi icermiyor");
        }







    }
}
