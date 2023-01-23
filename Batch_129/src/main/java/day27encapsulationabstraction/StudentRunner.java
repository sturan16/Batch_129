package day27encapsulationabstraction;

public class StudentRunner {
    public static void main(String[] args) {

        Student myStd = new Student();
        //objeyle variable i cagirdigimizda gorunmuyor cunlu private buna da encapsulation denir.

        //Student 1:
        System.out.println(myStd.getStdId());
        System.out.println(myStd.getGpa());
        System.out.println(myStd.isPoor());
        System.out.println();

        //Student 2:
        System.out.println("......2.Ogrenci....");
        myStd.setStdId("TH123");
        myStd.setGpa(3.75);
        myStd.setPoor(false);
        System.out.println(myStd.getStdId());
        System.out.println(myStd.getGpa());
        System.out.println(myStd.isPoor());
        System.out.println();

        System.out.println(".....3.Ogrenci....");

        //Student 3:
        myStd.setStdId("SA263");
        myStd.setGpa(3.80);
        myStd.setPoor(false);
        System.out.println("Ogrenci no :" + myStd.getStdId());
        System.out.println("Mezuniyet derecesi:" + myStd.getGpa());
        System.out.println("Fakir mi:" + myStd.isPoor());
        //Encapsulation faydalarindan biri de tek bir obje olusturup set methodu ile istedigimiz objeye cevirebiliriz

        //Student class da generate yapip getteer yaparsak private acces modifieri
        //get methoduyla olusturuyoruz ve runner class da cagirabiliyoruz.




    }
}
