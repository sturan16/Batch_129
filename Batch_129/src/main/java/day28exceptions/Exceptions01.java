package day28exceptions;

public class Exceptions01 {
    /*
    1)Exception demek beklenmedik problem demektir.Seyehatta benzin'in bitmesi, arabanin bozulmasi gibi

    2)GErcek hayatta karsilastigimz beklenmedik pronlemler icin cozum yollarimiz vardir.Mesela benzin bitince yol yardimi arariz.
      Application'larda beklenmedik pronlemler icin cozum yollariuretmeliyiz. bu isleme "Exception HAndling" denir.

    3) Application'lar temel olarak ikiye ayrilirlar.
                i)Compile Time Exception :Siz code yazrken farkedilir ve yazdiginiz kodun alti kirmizi cizgi ile cizilir.
                ii)Run Time Exception : Siz code yazarken farkedilmez ama, code calistirildiginda consolda hata alirsiniz.

    4)Exception'lar disinda "Error" diye adlandirdigimiz "Handle"(cozum) edilemeyen problemler vardir.
      GErcek hayatta soforun olmesi gibi,handle edilemeyecek durumlar "Error"dur.
      Application'larda "Memory" nin dolmasş "Error" dur.
      Ikı tur memory var i)Stack memory dolarsa "StackOverFlow Error" alirsiniz.
                         ii)Heap memory dolarsa "OutOfMemory Error" alirsiniz.

     5)Yazdiginiz kod calismadiginda problemi bulmak icin "Log"(consolun oldugu yerdeki kodlara) lara bakariz.


     6))if else kullanirsak olusabilecek her problemi spesifik olarak if parantezinin icine yazmamiz gerekir.
        Bu da ciddi bir matematik bilgisi gerektirir ve yazacagimiz code u cok uzatir.
        Ama try catch'te Java ilgili Exception ile alakali olusabilecek butun problemleri yakalar.
      7)


     */
    public static void main(String[] args) {
        int a = 12;
        int b = 0;
        divide(a, b);
        divide2(a,b);


    }
    //AritmetikException yazdiginiz code da matematiksel islem kullaniyorsaniz alinabilecek bir Exceptiondir.
    //Nasil handle edilcegini asagida yazdik.

    public static void divide(int a, int b) {

        try {
            System.out.println(a / b);

        }catch(ArithmeticException e){

            System.out.println("Do not divide by zero");

        }
        System.out.println("You are here");
    }
    //"Exception Handling"de if else kullanilmaz.Bakiniz 6.Note
    public static void divide2(int a, int b){
        if(b==0){//Her turlu matematiksel islem icin if blogu olusturunuruz hep
            System.out.println("Do not divide by zero");
        }else {
            System.out.println(a/b);
        }
    }
}
