package advanced_practice.practice11.abstraction_alan_hesaplama;

public class Ucgen extends Alan{
    @Override
    public double alanHesapla(int taban, int yukseklik) {
        return taban*yukseklik/2;
    }
}
