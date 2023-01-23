package day17arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ArrayLists02 {
    public static void main(String[] args) {
        //initials  ==> bas harfler

      //ArrayLisy olusturuken sag tarafa(constructor) Arraylist yazmak zorundasiniz.
      //Ama sol tarafa ister "ArrayList" yazin isterseniz "List" yazin ikiside calisir.
      List<Character> initials = new ArrayList<>();
      initials.add('A');
      initials.add('B');
      initials.add('M');
      initials.add('B');

      //Bir List'de kac eleman odlugunu nasil anlariz?
      int numOfElement = initials.size();
      System.out.println(numOfElement);//4

        //Note: Array'lerden bahsederken "Lenght" kullanin, List'lerden bahsederken "Size" Kullanin.

        //Bir List'ten istenen eleman nasil alinir?
        char u = initials.get(2);
        System.out.println(u);//M


        //Example 1:Verilen bir string listteki tüm elemanlarin toplam karakter sayilarini bulan kodu yaziniz.
        ArrayList<String>cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        //1.Yol
        int sum = 0;
        for(String w: cities){
            sum = sum + w.length();

        }
        System.out.println(sum);

        //2.Yol
         int toplam = 0;

         for(int i=0;i<cities.size();i++){

             toplam=toplam+cities.get(i).length();

         }
        System.out.println(toplam);//26

        //Bir listteki istenen bir elemani nasil degistirebiliriz?replace gibi set kullanilir.
        cities.set(0,"New York");
        System.out.println(cities);

        //Example 2:Maas listi olusuturnuz ve maaslara %20 zam yapiniz
        ArrayList<Double>salary = new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);
        System.out.println(salary);

        //1.Yol
        int idx =0;
                          //19500.25,8500.75,32500.50
        for(Double w:salary){

            salary.set(idx,w*1.20);//index 0 a git burdaki degeri oraya ata 1 e 2 ye 3 e git burdaki degerleri ata

            idx++;

        }
        System.out.println(salary);

        //2.Yol
        for(int i=0;i<salary.size();i++){
            salary.set(i,salary.get(i)*1.20);
        }


        System.out.println(salary);//[23400.3, 10200.9, 39000.6]
    }
}
