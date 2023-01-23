package day30exceptionsinterface;

/*
  1)Bir interface i bir Classin parenti yapmak icin "implements" keywordunu kullaniriz
  2)Java parentlar class oldugunda "multiple parenta" musade etmez ama biz bazen "multiple parent" a ihtiyac duyariz.
    Bu ihtiyaci gidermek icin Java "interface" ismini verdigi yeni bir yapi olusturdu.
    Bu yapi sayesidne bir "class" icin coklu "interface" parent olusturabiliriz.
  3)Coklu ınterface parentlarin herbirinin icene ayni isiml methodlar koyabiliriz.
    MEsela Ac'nin ,Engine'in ve security'nin herbirinin iclerine run() methodu koymak gibi.
    Child class herhangi birini override ettginde hepsini override etmis gibi olur sonra da
    body'i child class da yazarak uygulamasini yapmis olur.

 */

public class Civic implements AC,Engine,Security {
    @Override
    public void cool() {
        System.out.println("Civic cools pertectly");
    }

    @Override
    public void run() {
        System.out.println("Ac run perfectly");
    }
}
