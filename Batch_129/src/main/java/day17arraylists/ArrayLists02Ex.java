package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02Ex {
    public static void main(String[] args) {

        List<Character> initials = new ArrayList<>();
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

        //Bir List'de kac eleman odlugunu nasil anlariz?

        int elemanSayi = initials.size();
        System.out.println(elemanSayi);

        //Bir List'ten istenen eleman nasil alinir?

       char u =  initials.get(0);
        System.out.println(u);

        //Example 1:Verilen bir string listteki tüm elemanlarin toplam karakter sayilarini bulan kodu yaziniz.
        ArrayList<String>cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        //1.Yol
        int sum = 0;
        for(String w:cities){
            sum = sum + w.length();
        }
        System.out.println(sum);
        //2.Yol
        int toplam =0;
        for(int i=0;i<cities.size();i++){

            toplam = toplam+cities.get(i).length();

        }
        System.out.println(toplam);

        //Bir listteki istenen bir elemani nasil degistirebiliriz?replace gibi set degistirmek kullanilir.
        cities.set(0,"Ankara");
        System.out.println(cities);

        //Example 2:Maas listi olusuturnuz ve maaslara %20 zam yapiniz
        ArrayList<Double>salary = new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);
        System.out.println(salary);
//1.Yol
        int idx=0;
       for(Double w:salary){
           salary.set(idx,w*1.20);
           idx++;
       }
        System.out.println(salary);

//       2.Yol

        for(int i=0;i<salary.size();i++){
            salary.set(i, salary.get(i)*1.20);
        }
        System.out.println(salary);
    }
}
