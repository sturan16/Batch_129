package day18Lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {

        //Example 1:Integer bir list olusturunuz
        //Sonra da liste 5 tane eleman ekleyiniz
        //Bu elemanlardan 12'yi siliniz
        List<Integer> ages = new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(12);

        //Note: Siz javada tamsayi yazdiginizda , Java o tamsayinin data type'ini otomatik olarak "primitive int"kabul eder
        //      Bu yüzden remove methodunun icine yazdiginiz tam sayi eleman olarak degil index olarak kabul edilir.
        //      TAm sayiyi eleman olarak göstermenin bir kaç yolu vardir

        //1.Yol
        //Integer nonPrimitive=12;
        //ages.remove(nonPrimitive);

        //2.Yol:REcommended
        ages.remove((Integer) 12);

        //3.Yol
        //ages.remove(Integer.valueOf(12));//2 method kullanildi

        //4.Yol

        //ages.remove(ages.indexOf(12));   //2 method kullanildi
        System.out.println(ages);

        //Example 2:Integer bir list olusturunuz
        //        //Sonra da liste 5 tane eleman ekleyiniz
        //        //Bu elemanlardan tüm 12'leri siliniz
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(12);
        nums.add(8);
        nums.add(12);

        //removeall() kullanmak icin yeni bir list olusturmak lazım ve silmek istedihgimiz elemanlari bu listin icine atariz.
        //Bu soruda 12leri silecegimiz icin 12 ve 25 leri yeni liste ekliyoruz.
        List<Integer> silinrcekler = new ArrayList<>();
        silinrcekler.add(12);
        silinrcekler.add(25);

        //remevoAll() methodu List ile calisir
        //remevoAll() methodu bir veya birden fazla elemaninin tüm görünümlerini sişmek icin kullanilir.
        nums.removeAll(silinrcekler);
        System.out.println(nums);


    }
}
