package advanced_practice.practice08;

public class Kutuphane {
    String kitapAdi;
    String yazarAdi;
    int sayfaSayisi;

    String seriNumarasi;

    static int kitapSayisi;//olusturacagimiz her obje bunu arttiracak



    public Kutuphane(String kitapAdi, String yazarAdi, int sayfaSayisi) {
        kitapSayisi++;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.sayfaSayisi = sayfaSayisi;
        seriNumarasi = kitapAdi.substring(0,2)+yazarAdi.substring(0,2)+kitapSayisi;

    }
    public void kitapBilgileri(){
        System.out.println("Kitap Adi: " +kitapAdi+"\nYazar Adi: "+yazarAdi+"\nSaayfaSayisi: "+sayfaSayisi+"\nSeri Numarasi :"+seriNumarasi);
        System.out.println("----------------");

    }

}
