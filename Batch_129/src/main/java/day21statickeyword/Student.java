package day21statickeyword;

public class Student {
    /*
    1)static variable veya static method'lar(class member) tum object'ler icin ortak elemandir.
    2)Static class member'lar uzerinde yapilan tum degisiklikler tum objeleri etkiler.
    3)Static class member'lar Class'a, non-static class member'lar objelere monte edilir.
     Mesela; bir class'dan 100 tane object olusturdugunuzda non-static olanlar 100 kere olusturulur,
     ama static olanlar object sayisindan bagimsiz olarak 1 kere olusturulur.
    4)Static class member'lara ulasmak icin object olusturmaya gerek duyulmaz,
    ama non static class memberlara ulasmak icin obje olusturmak sarttir.
    5)Static variable'larin diger adi "Class Variable"dir.
    Non-static Variable'larin diger adi "Instance Variable(gorunum)" veya "Object Variable" dir.


     */

    public static String stdName = "Tom Hanks";//static variable

    public int age = 13;//non static variable

    //getInitials== ilk harfler
    //Ogrenci isminin ilk harflerini veren methodu olusturunuz.
    public static String getInitials(String name) {
        String first = name.substring(0, 1);

        String second = name.split(" ")[1].substring(0, 1);
        // kestikten sonra birinci index'teki
        //soyadi aldi, [1]==> bunu 1. index'teki soyadi alabilmek icin yazdi
        // ve onun 0'inci degerini alabilmek icin substring(0, 1) yazdi "C" yi almak icin yazdi
        // "first" ==> "A" , "second"==> "C" oluyor

        return first + second;
    }

    //coundVowels==sesli harfleri say
    //Ogrenci ismindeki sesli harfleri sayan bir method olusturalım.non stataic yapalım(a,e,i,o,u)
    public int coundVowels(String name) {
        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.toLowerCase().charAt(i);

            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;
            }
        }

        return counter;
    }


}
