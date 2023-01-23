package advanced_practice.practice09.overriding;

public class Q02_Kredi {
    //Bir bankadan kredi alan müşterileri kredi türlerine göre objeler oluşturarak kaydeden bir kod yazınız.
    //Emekli: %12 standart faiz, İşçi: %15 isçi oranı, Memur: %10 memur oranı
    public static void main(String[] args) {
        Emekli emekli1=new Emekli();
        System.out.println("emekli1.faizHesapla(100) = " + emekli1.faizHesapla(100) + "TL");
        Isci isci1=new Isci();
        System.out.println("isci1.faizHesapla(100) = " + isci1.faizHesapla(100) + "Tl");
        Memur memur1=new Memur();
        System.out.println("memur1.faizHesapla(200) = " + memur1.faizHesapla(200) + "TL");
    }

}
