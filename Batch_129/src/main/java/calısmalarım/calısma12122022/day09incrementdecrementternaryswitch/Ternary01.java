package calısmalarım.calısma12122022.day09incrementdecrementternaryswitch;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        //Example1:
        int a = 10;
        int b = 20;
        int r1 = a < 7 ? a++ : ++b;

        System.out.println(r1);//21

        System.out.println(a);//10

        System.out.println(b);//21

        //Example 2:verilen bir sayının mutlak degerini hesaplayan kodu yazınız
        //      *4 ==> -1*-4        4==>4      0==> 0
        int c =-4;
        int r2 = c<0 ? -1*c : c;
        System.out.println(r2);

        //Example 3: Ikı sayının isareti aynı ise(ya pozitif ya negatif) bu sayıları carpan ,isaretlerıfarklı ise "farklı isaretli sayıları carpamıyorum"
        //mesajı veren kodu yazınız

        int m =5;
        int n =-6;
        if((m>0 && n>0) || (m<0 && n<0)){
            System.out.println(m*n);
        }else {
            System.out.println("Farklı sayıları carpamıyorum");
        }







        //Object Javada butun "Non Primitive data typelerinin ortak "parent"(baba)sidir.
        //"Object"in "Parenti"yoktur.
        //Farklı data typeleri icin ortak variable olusturmak istediginizde data type olarak object kullanılır
        //Java'da "Object", insanlık aleminde "HZ.Adem" e benzer.
        Object r3 = (m>0 && n>0) || (m<0 && n<0) ? m*n : "Farklı isaretli sayıları carpamıyorum";
        System.out.println(r3);

        //Example 4: Size verilen sayinin 3 basamaklı olup olamadigini kontrol eden kodu yazınız
        int p =-436;

        int r =Math.abs(p);

        String r4 = r>99 && r<1000 ? p + " uc basamaklıdır": p +"uc basamaklı degıldır";

        System.out.println(r4);






    }


}
