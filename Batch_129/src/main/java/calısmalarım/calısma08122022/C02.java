package calısmalarım.calısma08122022;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
       /*




        System.out.println("***Lutfen adınızı gırınız***");
        String isminiz = input.next();

        System.out.println("***Lütfen soyadınızı giriniz***");
        String soyadınız = input.next();

        System.out.println("isminiz = " + isminiz);
        System.out.println("soyadınız = " + soyadınız);
        System.out.println("İsim-Soyisim :"+ isminiz+" "+soyadınız+"");
        */
        Scanner input = new Scanner(System.in);
       /* System.out.println("lütfen isminizi giriniz");
        String isim = input.next();

        char ilk =isim.charAt(0);
        System.out.println("ilkharf = " + ilk);

*/
     /*   System.out.println("Lütfen 4 basmaklı sayı girinizz");
        int sayı = input.nextInt();
        System.out.println("sayı = " + sayı);
        int fourNumber = sayı%10;
        int sayı3 = sayı/10;
        int thereNumber = sayı3%10;
        int sayı2= sayı3/10;
        int twoNumber = sayı2%10;
        int sayı1 = sayı2/10;
        int oneNumber = sayı1%10;
        System.out.println(fourNumber+ thereNumber+twoNumber+oneNumber);
        */
        System.out.println("Lütfen 3 basamaklı bir sayı girip ilk ve son basamaklarının toplamını yazdrınız");
        int thirdNumber = input.nextInt();
        System.out.println("thirdNumber = " + thirdNumber);

        int sonBas = thirdNumber %10;
        int ilkBas = thirdNumber/100;
        System.out.println("toplam = "+ (sonBas+ilkBas));

        String str1= "Java";
        String str2 ="Guzel";
        int sayı1= 5;
        int sayı2=4;


        System.out.println(str1+" "+str2+" "+sayı1+sayı2);
        System.out.println(str1+" "+sayı1+" "+str2);
        System.out.println(str1+" "+(sayı1+sayı2)+sayı2);
        System.out.println(str1+" "+(sayı1-sayı2)+(sayı1+sayı2));
        System.out.println(" "+sayı1+sayı2+" "+str2);


    }



}
