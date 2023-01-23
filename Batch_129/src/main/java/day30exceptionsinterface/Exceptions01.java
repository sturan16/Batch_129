package day30exceptionsinterface;

public class Exceptions01 {
    /*
        1)Exception olsa da olmasa da calistirmamiz gereken kodlari "finally block" icine yazariz.
        2)DB ile baglantiyi kesme isini yapan kodlar gibi kodlar her halukarda calistirilmalidir, bu tarz
          kodlari finally block icine koyariz
        3)"Try block" yalniz kullanilamaz.
          "Try block" +1 "catch block" mumkundur.
          "Try block" +1 "catch block" +1 "finally block" mumkundur.
          "Try block" +coklu  "catch block" +1 "finally block" mumkundur.
          "Try block"  +1 "finally block" mumkundur.(catch yok)
        4)Coklu "finally block" kullanilamaz.
     */

    public static void main(String[] args) {

        int a=12;

        int b=4;

        int [] c={3, 6, 9, 12};
        m(c, a, b);

    }
    public static void m(int [] c,int a,int b){
        try {
            int idx=a/b;
            int element= c[idx];

            System.out.println(element);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Cut the connection with the DB");//Db ile baglantiyi kes demek
        }

    }
}
