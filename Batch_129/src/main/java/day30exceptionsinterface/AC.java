package day30exceptionsinterface;

public interface AC {

    //İnterface lerin icine "concrete" method konulamaz,cunku cocrete methodlarda body vardir ve
    //body o methodun isi nasil yapacagini belirtir.Isın nasil yapilacagi
    //bircok detay icerir ve bu Child classlarda kafa karisikligina sebep olur.
    //Halbuki sadece yapilmasi gerekn isi soyleyip nasil yapilacagini child a birakirsaniz
    //child class'in kafa karisikligini engellemis olursunuz.

    //Interface'ler concrete method iceremezler dolayisiyla interface'in icindeki hicbir sey istege bagli degildir.
    //HErsey child classlar icin mecburidir.Bu yuzden ınterface'lere "to-do list" de denir.

    //Interface'lerdeki butun methodlar otomatik olarak public'dir.
    //Interface'lerdeki butun methodlar otomatik olarak abstract'dir.
    //Interface'lerdeki butun methodlar otomatik olarak static'degildir.

    // .interface'lerdeki variable'lar otomatik olarak "publicdir","staticdir","finaldir".

    void cool();
    void run();

    int price=2000;
    String model="Mitsubishi";

}
