package day20passbyvalueoverloading;

public class C06_PassByValue {
    public static void main(String[] args) {
        // 100 tl ye satilan bir urun icin 2 farkli indirim uygulayan bir method olusturunuz

        int fiyat=100;

        indirimYap25(fiyat);
        System.out.println("main icinde methoddan sonra : " +fiyat);//100 tl
        System.out.println("Main icinde methoddan sonra : " +fiyat);//100 tl
        fiyat=indirimyap10(fiyat);
        System.out.println("atama yaptiktan sonra fiyat : " + fiyat);//90 burda methodda buldugmuz fiyatı konteynera koydugumuz icin 90 goruyoruz.


    }

    private static int indirimyap10(int fiyat) {

        fiyat*=0.90;
        System.out.println("method icinde %10 indiriöm : " + fiyat);//90
        return fiyat;
    }

    private static void indirimYap25(int fiyat) {
        fiyat*=0.75;
        System.out.println("%25 indirimli fiyat : " + fiyat);//75
    }
}
