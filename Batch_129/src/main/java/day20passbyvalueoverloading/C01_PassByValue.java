package day20passbyvalueoverloading;

public class C01_PassByValue {

    public static void main(String[] args) {
        /*
        Pass By Value:Methoda Value nun bir kopyasini gonder demeketir.
        
        Bu nedenle Pass By Value da orjinal parametre degismez.
        
        Java Pass By Value kullanir.
        
        1)Java variable'in orjinal degerini korumak ister.
        2)Java variable'in icerisibdeki degeri kopyalar vemethodun icine kopya degeri gonderirir.
        Deger uzerinde yapilan degisiklikler orjinal parametreyi etkilemez.
        
        
        PAss By Referance' da ise referans kopyalanir ve methodda kullanilir.
        Yapilan degisiklik orjinal parametreyi etkiler.
        Bu tarz programlar degeri korumak istiyorsa isi developera birakmistir.
        Kendisi degeri degistirir.
        

         */

        int gomlek = 100;
        System.out.println("gomlek = " + gomlek);

        //ogrenciIndrimi(gomlek);

        System.out.println("ogrenci fiyati :" + ogrenciIndrimi(gomlek));//90
        System.out.println(yasliIndirimi(gomlek));//85
        System.out.println("gazilere yapilan indirimli fiyat :" +gaziIndirimi(gomlek));
        System.out.println(gomlek);//ana fiyat hic degismiyor ancak bu buldugumuz degeri bir konteynere koyar ve onu da gomlege esitlerse ana deger degisir


    }//main

    private static int ogrenciIndrimi(int gomlek) {

        int ogrenciGomlegi = gomlek - 10;
        System.out.println("ogrenciGomlegi = " + ogrenciGomlegi);
        return ogrenciGomlegi;
    }//ogrenciIndirimimethod

    private static int yasliIndirimi(int gomlek) {
        int yasliindirim = gomlek - 15;
        System.out.println("yasli indirim :" + yasliindirim);
        return yasliindirim;
    }

    private static int gaziIndirimi(int gomlek) {
        int gaziIndirimFyt = gomlek - 25;
        return gaziIndirimFyt;

    }
}


