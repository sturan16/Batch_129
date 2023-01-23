package advanced_practice.practice06;

public class Q04_MethodOverloading_Hacim {
    //Küp, kare, prizma ve dikdörtgen prizmanın hacmini hesaplayan bir kod yaziniz.(Method overloading kullanınız)
    public static void main(String[] args) {

        Hacim obje = new Hacim();
        int kupunHacmi = obje.hacimHesapla(5);
        System.out.println("kupun Hacmi = " + kupunHacmi);//125

        int karePrizmaHacim = obje.hacimHesapla(5,4);
        System.out.println("karePrizmaHacim = " + karePrizmaHacim);//100

       int dikdortgenPrizmaHacim = obje.hacimHesapla(2,3,4);
        System.out.println("dikdortgenPrizmaHacim = " + dikdortgenPrizmaHacim);//24


    }
}
