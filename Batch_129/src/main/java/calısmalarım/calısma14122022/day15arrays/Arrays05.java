package calısmalarım.calısma14122022.day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {
    public static void main(String[] args) {
        //Example 1: String array elemanlarini karakter sayisina gore kucukten buyuge siralayiniz
        //         ["Michael, "Ajda Thomas,tom] ==>[tom,ajda.thomas,michael]

       String arr[]={"Michael","Ajda","Thomas","Tom"};

        System.out.println(Arrays.toString(arr));

       Arrays.sort(arr, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(arr));

        //Example 2: String array elemanlarini karakter sayisina gore buyukten kucuge siralayiniz
        //        ["Michael, "Ajda Thomas,tom] ==>[Mıchael,Cuneyt,thomas.Ajda,tom]

        String brr[]={"Michael","Ajda","Thomas","Tom","Cuneyt"};

        Arrays.sort(brr,Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(brr));

        //Example 3: String array elemanlarini karakter sayisina gore buyukten kucuge siralayiniz
        //Ayni karakter sayisinda olanlari da alfabetik siraya koyunuz.
        //        ["Michael, "Reyhane","Gabriel","Ajda Thomas,Tom,Ali,Cin,Cem]
        //        ==>[,Gabriel,Mıchael,Reyhane,Cuneyt,Thomas,Ajda,Ali,CEm,Cin,Tom]

        String crr []={"Mıchael","Gabriel","Thomas","Reyhane","Cuneyt","Ali","Cem","Cin","Nur"};
        System.out.println(Arrays.toString(crr));

        Arrays.sort(crr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));







        //naturalorder : alfabetik siraya göre siralar
        // reversed:yapilan islemin her zaman tersini yapar.buyukten kucuge yapildiysa kucukten buyuge cevirir.
        //burdaki arr comparator'u sort kismindan cektik
        //yukardaki kodun son kisminda ise string'e gir lenght'ini al dedik
        //::==> bunun anlami "method referance" yani bir metodu kullan/methoda ulasmak icin kullanilir
        //::==>bununla birlikte farkli methodlarda kullanabiliriz
        //:: ==> kutuphanenin kapisini aciyor
        //karakter sayilarina gore siralayacagimiz icin comparator.int kullandik
        //comparator ==> karsilastir demek
        //fonctional Prpgraming==> java'nin olusturdugu methodlari kullanmak, saglam yol.
        //fonctional programing==lampda
        //reversed==> buyukten kucuge diz
        //thencomparing==> iceri gir iceriyi de duzenle
        //Comparator.naturelorder==> iceride dogal siralama yap; yani alfebetik siralama yap
        // hem buyukler hemde kucukler icin ayri ayri siralama yapti
    }
}
