package calısmalarım;

import java.time.LocalDate;

public class Bufe1 {
    String urunAdi;

    double urunFiyat;
    String sonKull;

     Bufe1(String urunAdi, int urunFiyat, int sonKull) {
        this.urunAdi = urunAdi;
        if(urunFiyat>99){
            urunFiyat= (int) (urunFiyat*0.90);
        }
        this.urunFiyat = urunFiyat;
        this.sonKull = LocalDate.now().plusMonths(sonKull).toString();
    }

     Bufe1(String urunAdi, double urunFiyat) {
        this.urunAdi = urunAdi;
        if(urunFiyat>99){
            urunFiyat= (int) (urunFiyat*0.90);
        }

        this.urunFiyat = urunFiyat;
        this.sonKull="Bu urunde son kullanma tarihi yoktur.";
    }




    @Override
    public String toString() {
        return "Bufe1{" +
                "urunAdi='" + urunAdi + '\'' +
                ", urunFiyat=" + urunFiyat +
                ", sonKull=" + sonKull +
                '}';
    }
}

