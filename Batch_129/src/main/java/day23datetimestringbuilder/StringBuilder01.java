package day23datetimestringbuilder;


public class StringBuilder01 {
    //ogrendiklerimiz
    //Mutable,append,capacity,lenght
    /*
    Java 'da String , "String Class" kullanilarak ya da "StringBuilder Class" kullanilarak olusturulabilir.
    "String Class"  kullanark urettiginiz Stringler "Immutable"(Degistirilemez) dir.
    "StringBuilder Class"  kullanark urettiginiz Stringler "Mutable"(Degistirilebilir) dir.

     */
    public static void main(String[] args) {
        //Immutable
        String s = "Java";
        String t = s + "!";//Java!
        String w = t + "?";//Java!?

        //Stringi degistirdikten sonra ayni stringe assign ederseniz Java yine yeni bir konteyner olusturur .
        //Degismis degeri yeni koyteynerin icine koyar ve eski konteyneri gosteren oku yeni konteynere yonlendirir.
        //Dolayisiyla eski konteyner adressiz kalir ve "garbage collector" adressiz olan konteynerleri siler.
        String a = "Money";
        a = a + "more";//burda  anin adresini yeni konteynere atar.ilk olusturdugu a konteynerini sileer.

        //Mutable Varolan konteynere update yapiyoruz devamli orjinal konteyner her zmana degisiyor.
        //appenf==>eklemek demek.

        //StringBuilder kullanarak String uretmenin 1.Yolu
        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1);//Python
        sb1.append("!").append("?").append(".");
        System.out.println(sb1);//Python!?.


        //StringBuilder kullanarak String uretmenin 2.Yolu
        StringBuilder sb2 = new StringBuilder();//Bunu yazdigimizda java bize her zaman 16 tane bos kutu verir
        System.out.println(sb2.length());//0//lenght dedigimizde bu kutularin kacinda deger olduguna bakar ve karakter sayisini verir.
        System.out.println(sb2.capacity());//16
        //StringBuilder kullandigimizda baslangic kapasitesi 16'dir.
        //Kapasite asildiginda varolan kapasitenin 2 kati artti  iki fazlasi kadar varolan kapasiteye ekleme yapilir,
        //16==> 16*2+2        -  34==> 34*2+2

        sb2.append("Java");
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16


        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34==>16*2+2 fazlasi olarak gelmis

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//34*2+2==>70;varolan kadar 2 katini veriri 2 ekler


        //StringBuilder kullanarak String uretmenin 3.Yolu
        StringBuilder sb3 = new StringBuilder(2);//sadece 2 kutu istiyoruz burda

        sb3.append("Flo");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//6


        //(insert methodu) araya sok demek.
        //insert() methodu verilen sayi karakteri kadar es gecip istenen characteri eklemeye yarar.
        //insert() methodu append() gibi StringBuilder'i direkt degistirir
        sb3.insert(2, "XXXXXX");//ilk iki karakteri gec(index dusunme) sonrasında XXXX koy diyoruz
        System.out.println(sb3.length());//9 olur her zman eski konteyneri öldurur StringBuilder
        System.out.println(sb3);

        //toString() methodu StringBuilderi String'e cevirir.
        //String class da var olan ama StringBuilder class da var olmayan split() method gibi
        // methodlara ihtiyac duydugumuzda toString() methodunu kullanarark String class gecer ve o methodlari kullaniriz.
        sb3.toString().split("l");

        //Stringi tekrar String builder'a cevirebilirsiniz
        StringBuilder sb4 = new StringBuilder(sb3);
        //sb4 yaptigimizda spliti artik görmeyiz


        //reverse() methodu Stringleri ters cevirir.
        sb3.reverse();
        System.out.println(sb3);//oXXXXXXlF terse cevirir.


        sb3.deleteCharAt(1);//index 1 deki karakteri sil demek
        System.out.println(sb3);//oXXXXXlF

        sb3.delete(1, 6);//java index 1 dahil  - 6 haric arasindaki tum karakterleri sil demek
        System.out.println(sb3);//olF

        StringBuilder sb5 = new StringBuilder("Java");
        StringBuilder sb6 = new StringBuilder("Kava");

        //(sb5.compareTo(sb6) methodu sb5 ile sb6 yi alfabetik siralama olarak karsilastirir.
        //sb5 alfabetik siralamada once ise sonuc negative olur sonra ise sonuc pozitif olur.
        // -1 verir. Yani alfabetik sira olarak J harfi, K harfinden 1 oncedir.
        // compareTo() alfabetik olarak karsilastirir. Bu method ascii degerlere gore islem yapar.
        // compare (ENG) == karsilastirma (TR)
        System.out.println(sb5.compareTo(sb6));//-1


        sb6.setCharAt(2, 'm');//istedigimiz indexdeki karakteri istediimiz karakterle degistiririz
        System.out.println(sb6);//Jama


        sb6.replace(1, 3, "xyz");//1 dahil 3 haric indexler arasina istedigimiz stringi ekliyoruz.
        System.out.println(sb6);//Jxyza

        //StringBuilder class'da kullanmamiza izin verilen substring() method gibi bazi string class methodlari vardir
        //bu metodlari StringBuilder ustunde kullaninca StringBuilder'in orjinal degeri degismez
        String s7 = sb6.substring(1,3);
        System.out.println(s7);//xy
        System.out.println(sb6);//Jxyza




    }
}
