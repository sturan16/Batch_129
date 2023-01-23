package practice.nighttime04;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk " " veya 'a' harfi geldiginde bunlari yazmasin
/*
gazi antep
g
z
i
n
t
e
p
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bır cumle giriniz");
        String str = input.nextLine();
        for(int i=0;i<str.length();i++){
            String b= str.substring(i,i+1);
            if(b.equals(" ") || b.equals("a")){
                continue;
            }System.out.println(b);
        }




    }
}
