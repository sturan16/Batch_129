package practice;

public class HesapMakinesiVarargs {
    public static void main(String[] args) {

        HesapMakinesi islem = new HesapMakinesi();

        islem.toplama(3,5,7,5,2,33,-85);
        islem.cikarma(10,10,0,40);
        islem.carpma(15,63,-8);
        islem.bolme(80,-4);

    }
}
