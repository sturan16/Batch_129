package advanced_practice.practice09.practiceEx;

public class Isciler extends Banka {
    @Override
    public double faizHesapla(double fiyat) {
         if(fiyat>10000){
             return fiyat*0.20;
         }else  {
             return fiyat*0.15;
         }


    }
}
