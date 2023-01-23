package calısmalarım.calısma14122022.day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05Ex {
    public static void main(String[] args) {
        //Example 1: String array elemanlarini karakter sayisina gore kucukten buyuge siralayiniz
        //         ["Michael, "Ajda Thomas,tom] ==>[tom,ajda.thomas,michael]
        String arr[]={"Michael","Ajda","Thomas","Tom"};

        Arrays.sort(arr, Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(arr));

        //Example 3: String array elemanlarini karakter sayisina gore buyukten kucuge siralayiniz
        //Ayni karakter sayisinda olanlari da alfabetik siraya koyunuz.
        String crr []={"Mıchael","Gabriel","Thomas","Reyhane","Cuneyt","Ali","Cem","Cin","Nur"};
        Arrays.sort(crr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));

        System.out.println(Arrays.toString(crr));



    }
}
