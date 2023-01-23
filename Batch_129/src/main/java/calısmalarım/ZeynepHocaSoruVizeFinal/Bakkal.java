package calısmalarım.ZeynepHocaSoruVizeFinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bakkal {

    static  List<Integer>gunlukKazanclar=new ArrayList<>();
    static  List<String> methodDay = new ArrayList<>();

    static List<String >ortUstGun =new ArrayList<>();
    static List<String >ortAltGun =new ArrayList<>();

    static  int toplam=0;
    static  int ortkazanc=0;
    static String gun="";



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
     *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *           ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *           ortalama kazançtan aşağıysa o günleri return yap.
     * */
    public static void main(String[] args) {

        List<String> gunler = new ArrayList<>();
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
            System.out.println("Gunluk kazanclari giriniz");
            System.out.println(gunler.get(i));
            int gkazanc=input.nextInt();
            gunlukKazanclar.add(gkazanc);
            i++;

        }

        getOrtalamaKazanc();
        getOrtalamaninUstundeKazancGünleri();
        getOrtalamaninAltindaKazancGünleri();


    }
    public static void getOrtalamaKazanc(){
        for(Integer w:gunlukKazanclar){
            toplam+=w;
        }
        ortkazanc=toplam/gunlukKazanclar.size();
        System.out.println("Toplam kazanc: "+ toplam);
        System.out.println("Ortalama gunluk kazanc: " + ortkazanc);
    }
    public static int getOrtalamaninUstundeKazancGünleri() {
        int yüksekGun = 0;
        int yuksekKazanc = 0;
        for (Integer w : gunlukKazanclar) {
            if (w > ortkazanc) {
                w = yuksekKazanc;

                gun = methodDay.get(yüksekGun);



                ortUstGun.add(gun);

            }
            yüksekGun++;

        }
        System.out.println("Ortalamanin ustunde kazanilan gunler: " + ortUstGun);
        return yüksekGun;
    }

    public static int getOrtalamaninAltindaKazancGünleri(){
        int dusukGun=0;
        int dusukKazanc=0;
        for(Integer w:gunlukKazanclar){
            if(w<ortkazanc){
                w=dusukKazanc;

                gun=methodDay.get(dusukGun);

                ortAltGun.add(gun);

            }
            dusukGun++;
        }
        System.out.println("Ortalamanin altinda kazanilan gunler:: "+ortAltGun);

        return dusukGun;
    }
}






