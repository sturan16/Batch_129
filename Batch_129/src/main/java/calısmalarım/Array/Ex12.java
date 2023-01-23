package calısmalarım.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
//        Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en
//        büyük öğeler arasındaki farkı konsolda yazdırınız.
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen array uzunlugunu giriniz");
        int uzunluk=input.nextInt();

        Integer[]arr=new Integer[uzunluk];
        System.out.println("Lutfen elemanlari giriniz");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=input.nextInt();

        }
        Arrays.sort(arr);

        int fark=arr[arr.length-1]-arr[0];
        System.out.println("Son karakter - ilk karakter = " +fark);
     
        
    }
}
