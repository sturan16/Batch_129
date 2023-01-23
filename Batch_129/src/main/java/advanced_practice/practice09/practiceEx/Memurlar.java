package advanced_practice.practice09.practiceEx;

public class Memurlar extends Banka{
    @Override
    public double faizHesapla(double fiyat) {
        if(fiyat>10000){
            return fiyat*0.12;
        }else {
            return fiyat*0.10;
        }
    }
}
