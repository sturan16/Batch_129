package day02datatypesmethodcreation;

public class Variables02 {

    /*
    Non Primitive Data Types : String bir non-primitive data type'dir.
                               Uretilen her bir class aynı zamanda bir "non-primitive data type"dir.4
                               Bu yüzden "non-primitive data type"lar sınırsız sayıdadır denebilir.
                               Non-primitive data type'ların isimleri buyuk harfle baslar.
                               Non-primitive data type'ların tammamı icin Java aynı büyüklükte yer ayirir.

  Interwiev Sorusu: "primitive" ve "non-primitive" data type'ları arasındaki farklar nelerdir?

1)"Primitive"ler sadece bizim atadığımız degeri icerir.
                    "non-primitive"ler bizim atadıgımız deger ve method icerir.
                    2) "primitive"ler kucuk harfle baslar, "non-primitive"ler büyük harfle baslar.
                    3) "primitive"leri Java üretmistir ve 8 tanedir.
                       "non-primitive"ler Java ve developerlar üretebilir ve sınırsızdırlar.
                    4)  "primitive" ler memory de data type'ına göre yer kaplar,
                        "non-primitive"ler icin Java memoryde hep aynı büyüklükte yer ayırır.
     */

    public static void main(String[] args) {
        // Ornek 1: Sehir ismi icin bir variable olusturun ve deger atayıp onu ekrana yazdırın
        String cityName = "Miami";
        System.out.println( cityName );

        String countryName = "Turkey";
        System.out.println(countryName);

        String pencilBit = "0.114244F";
        System.out.println(pencilBit);

        byte table = 125;
        System.out.println(table);

        short asgariUcret = 2451;
        System.out.println(asgariUcret);

        int turkeyKılomet = 251524236;
        System.out.println(turkeyKılomet);

        byte phone = 124;
        System.out.println("phone=" +phone);



    }







}
