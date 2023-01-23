package calısmalarım.ZeynepHocaSoruVizeFinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bakkal2 {
    static  List<Integer>gunlukKazanclar=new ArrayList<>();

    static int toplam=0;
    static  int ortkazanc=0;
    static  List<String>gunler =new ArrayList<>();
    static  List<String>ortUstGun=new ArrayList<>();

    static  List<String>ortAltGun=new ArrayList<>();

    static  List<String> methodDay = new ArrayList<>();

    static  List<String> ortOlanGunler = new ArrayList<>();





    static  String gun ="";



    public static void main(String[] args) {
        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan aşağıysa o günleri return yap.
         * */


        gunler.add("Pazartesi");
        gunler.add("Sali");
        gunler.add("Carsamba");
        gunler.add("Persembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");
        methodDay=gunler;



        int i=0;
        while (i<7){
            Scanner input =new Scanner(System.in);
            System.out.println(methodDay.get(i));
            System.out.println("gınluk kazanclari giriniz");
            int gkazanc=input.nextInt();
            gunlukKazanclar.add(gkazanc);
            i++;
        }
        System.out.println(gunlukKazanclar);


        getOrtalamaKazanc();
        getOrtalamaninAltindaKazancGünleri();
        getOrtalamaninUstundeKazancGünleri();
        getOrtalamaGunler();

    }

    public static void getOrtalamaKazanc(){
        for(Integer w:gunlukKazanclar){
            toplam+=w;

            ortkazanc=toplam/gunlukKazanclar.size();

        }
        System.out.println("ORtalama kazanc:" + ortkazanc );
        System.out.println("Toplam kazanc:" + toplam);

    }

    public static int getOrtalamaninUstundeKazancGünleri(){
        int yuksekGun=0;
        int yuksekKazanc=0;

        for(Integer w:gunlukKazanclar){
            if(w>ortkazanc){

                w=yuksekKazanc;

                gun=methodDay.get(yuksekGun);

                ortUstGun.add(gun);


            }
            yuksekGun++;
        }
        System.out.println("Ortalamanın ustunde kazanilan gunler: "+ ortUstGun);
        return yuksekGun;
    }
    public static int getOrtalamaninAltindaKazancGünleri(){
        int altGun=0;
        int ortAltındaKAzanc=0;

        for(Integer w:gunlukKazanclar){

            if(w<ortkazanc){
                w=ortAltındaKAzanc;

                gun=methodDay.get(altGun);

                ortAltGun.add(gun);


            }altGun++;
        }
        System.out.println("Ortalamanın altında kazanilan gunler: "+ ortAltGun);
        return altGun;
    }

    public static int getOrtalamaGunler(){
        int ortKazanc=0;
        int ortGun=0;

        for(Integer w:gunlukKazanclar){
            if(w==ortkazanc){
                w=ortKazanc;

                gun=methodDay.get(ortGun);

                ortOlanGunler.add(gun);
            }
            ortGun++;
        }
        System.out.println("Ortalama ie aynı olan gunler: " +ortOlanGunler);
        return ortGun;




    }


}
