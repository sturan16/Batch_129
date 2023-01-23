package calısmalarım.Array;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class Ex13 {
    public static void main(String[] args) {
//        ) Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa
//          konsola "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
        String ad ="mary";
        String soyad= "army";

        String a[] = ad.toLowerCase().split("");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        String s[] = soyad.toLowerCase().split("");
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));

        if(ad.length()!=soyad.length()){
            System.out.println("Anagram degil");
            }else if(ad.isEmpty()||soyad.isEmpty()){
            System.out.println("Anagram degil");
        }else if(Arrays.equals(a,s)){
            System.out.println("Anagramdır");
        }else{
            System.out.println("Anagram degildir");
        }














    }
}
