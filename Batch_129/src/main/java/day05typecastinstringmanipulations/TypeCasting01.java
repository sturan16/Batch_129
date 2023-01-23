package day05typecastinstringmanipulations;

public class TypeCasting01 {
    /*
        Numeric primitive data typlarının birbirlerine döbusturulmesıne "Type Casting"denir.

        Numeric(sayısal) data type'lar byte - short - int - long - float - double   ***Boolean ve char bunlara dahil degıldır.***

        Note1: Kucuk data type'lerini buyuk data type larına cevirmeyi java otomatık olarak yapabılır.
               Bu isleme "AutoWidening"(Otomatik genişletme) denir.

        Note2: Buyuk data type'larını kucuk data type'lerine cevirmek riskli bir iştir,Java bu riskli isi otomatik olarak yapmaz.
               Bu islemi kod yazanlar yapar.
               Bu isleme "ExplicitNorrowing"(Acıktan daraltma) denir.

 */

    public static void main(String[] args) {
        //byte data tipini int data tipine ceviriniz.
        byte age = 13;
        int ageInt = age;

        //long data type ini short data type ina cevirelim
        long weight = 234;
        short weightShort = (short)weight;
        //int data type i floata cevir

        int populatıon = 700000;

        System.out.println(populatıon);

        float populatıonFloat= populatıon;
        System.out.println(populatıonFloat);

        int km = 7500;
        short kmShort= (short)km;
        //double data type ı short data type cevır

        double cell= 245.22;  //245.22
        System.out.println(cell);
        short cellShort = (short)cell;//245
        System.out.println(cellShort);

        //***DİKKAT!!***
        //Dönüsüm yaptıgınız sayı(260) dönüsecegınız data type nın sınırları dısında ıse Java kullandıgınız sayı ile "mod" islemi
        ///yapar ve mod ıslemının sonucu sizin yenı degerınız olur.
        //Example 1
        short num = 260;
        System.out.println(num);//260
        byte numByte = (byte)num;
        System.out.println(numByte);//4

        //Example 2
        short n =1023;
        System.out.println(n);//1023
        byte nByte = (byte)n;
        System.out.println(nByte);//-1

        short cheese = 2415 ;
        System.out.println("cheese = " + cheese);
        byte cheeseByte = (byte)cheese;
        System.out.println("cheeseByte = " + cheeseByte);



    }
    }
