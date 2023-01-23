package advanced_practice.practice07;

import java.time.LocalDate;

public class Market {
    String urunAdi;
    double urunFiyati;
    String sonKullanmaTarihi;

    Market(String isim,double fiyat,int aySonra){
        urunAdi=isim;
        if(fiyat>99){
            fiyat=fiyat*0.9;
        }
        urunFiyati=fiyat;
        sonKullanmaTarihi = LocalDate.now().plusMonths(aySonra).toString();
    }
    Market(String isim,double fiyat){
        urunAdi=isim;
        if(fiyat>99){
            fiyat=fiyat*0.9;
        }
        urunFiyati=fiyat;
        sonKullanmaTarihi="Bu ürünün son kullanma tarihi yoktur";
    }
    Market(){

    }

    @Override
    public String toString() {
        return "Market{" +
                "urunAdi='" + urunAdi + '\'' +
                ", urunFiyati=" + urunFiyati +
                ", sonKullanmaTarihi='" + sonKullanmaTarihi + '\'' +
                '}';
    }

}
