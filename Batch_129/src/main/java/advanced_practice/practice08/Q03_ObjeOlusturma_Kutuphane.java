package advanced_practice.practice08;

public class Q03_ObjeOlusturma_Kutuphane {
    public static void main(String[] args) {
        Kutuphane obj1 = new Kutuphane("Mağaradakiler", "Cemil Meriç", 285);
        obj1.kitapBilgileri();

        Kutuphane obj2 = new Kutuphane("Kirlangic Cigligi", "Ahmet Umit", 400);
        obj2.sayfaSayisi = 405;
        obj2.kitapBilgileri();
    }
}
