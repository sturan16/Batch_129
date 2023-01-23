package advanced_practice.practice09.practiceEx;

public class KrediHesaplamaRunner {
    //Bir bankadan kredi alan müşterileri kredi türlerine göre objeler oluşturarak kaydeden bir kod yazınız.
    //Bankanin standart faizi: %12 dir
    //Emekli: %12 standart faiz
    //İşçi: %15 faiz oranı
    //Memur: %10 memur oranı

    public static void main(String[] args) {

        Isciler i1 = new Isciler();
        System.out.println("Oduyecegi faiz miktari = " + i1.faizHesapla(5000) + " TL ");
        Memurlar m1 = new Memurlar();
        System.out.println("Oduyecegi faiz miktari = " + m1.faizHesapla(15000) + " TL ");

    }
}
