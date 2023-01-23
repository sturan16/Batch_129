package day02datatypesmethodcreation;

public class Variables01 {

    //primitive data types --> char - boolean - byte -  short - int - long - float - double
    //float:  Virgüllü sayılar(Ondalık sayılar--> Decimal Numbers) icin kullanılır.(Fiyatlandırmalarda -12.99)
    //Double: Virgüllü sayılar(Ondalık sayılar--> Decimal Numbers) icin kullanılır. (HÜcre Agirliği 0.000255633)
    // Note 1: primitive data type'larını Java olusturmustur, biz olusturamayız.
    // Note 2: primitive data type'larının isimlerinde sadece kücük harf kullanılır.
    // Note 3: primitive data'lar data typlera gore memory de farklı farklı yer kaplarlar.
    // Note 4: primitive data'lar iclerinde sadece sizin atadıgınız degeri barindirirlar.

    public static void main(String[] args) {

        //Ornek1 : Gömlek ve ayakkabı fiyatları icin 2 tane variable oluşturup toplam fiyatı ekrana yazdırınız.
        //Note: Java "Decimal Numbers'i(Ondalik sayıları) otomatik olarak "double" kabul eder.
        //      Siz data type'ini "float"yazarsanız hata verir.
        //      Float olmasında ısrar ediyorsanız sonuna "F" veya "f" koymalısınız.
        //      Float memoryde 4 byte yer kaplar, double 8 byte kaplar
        float shirtPrice = 12.99F;
        float shoesPrice = 15.89F;
        //System.out.println() ekrana yazdırır ve "pointer" i bir sonraki satıra koyar
        //System.out.println() ekrana yazdırır ve "pointer" i ayni satirda tutar.
        System.out.println(shirtPrice+shoesPrice);

        //System.out.println() yazdirmanın kısa yolu ==> sout yaz ve Enter'a bas

        //Ornek 2: Hücre agirliği ve Amip'in agirliği icin 2 tane variable olusturun ve agırlıkları farkını  ekrana yazınız.

        double weightCell = 0.000255633 ;
        double weightAmip = 0.0000000222222;
        System.out.println(weightCell-weightAmip);

        //Ornek 3 : Ekmek ve peynir fiyatları 2 tane variable olusturup fiyatı ekrana yazınız.

        float  bradePrice = 8.9F ;
        float  cheesePrice = 14.99F;

        System.out.println(bradePrice+cheesePrice);

        double phonePixel = 0.2222255122;
        double pencilPixel = 0.536214452;
        System.out.println(phonePixel-pencilPixel);

        int computerPrice = 18250;
        int monitorPrice = 9000;
        System.out.println(computerPrice+monitorPrice);


    }
}
