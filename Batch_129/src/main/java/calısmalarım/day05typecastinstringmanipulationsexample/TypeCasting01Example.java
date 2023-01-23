package calısmalarım.day05typecastinstringmanipulationsexample;

public class TypeCasting01Example {
    public static void main(String[] args) {
        //byte data tipini int data tipine ceviriniz.

        byte age =13;
        int ageInt = age;

        //long data type ini short data type ina cevirelim
        long weight = 52345;
        System.out.println("weight = " + weight);
        short wgtShort = (short) weight;
        System.out.println("wgtShort = " + wgtShort);

        ////double data type ı short data type cevır.
        double cell = 25412.2222;
        System.out.println("cell = " + cell);
        short cellShort = (short) cell;
        System.out.println("cellShort = " + cellShort);

        //short data type byte cevir

        short err = 260;
        System.out.println("err = " + err);
        byte errByte = (byte) err;
        System.out.println("errByte = " + errByte);

        byte ex = 12;
        short exShort = ex;
        int exInt = ex;
        float exFloat = ex;
        double exDouble = ex;

        int aa = 1254;
        short aaShort = (short)aa;
        int bb= 1245;
        byte bbByte = (byte)aa;

        float fff = 1234;
        System.out.println("fff = " + fff);

        double ex1 = 255.36;
        int ex1Int = (int)ex1;
        System.out.println("ex1Int = " + ex1Int);
        int ex2 = 255;
        System.out.println("ex2 = " + ex2);
        byte ex2Byte = (byte)ex2;
        System.out.println("ex2Byte = " + ex2Byte);


    }
}
