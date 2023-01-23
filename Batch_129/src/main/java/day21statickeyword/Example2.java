package day21statickeyword;

import java.util.Scanner;

public class Example2 {
    //HAstaneye giden birinin tc nosunu girditen sonra sira numarasini tc basta bolum sonra en sonda sirasi olacak sekilde method yaziniz
    String tc;
    String bolum = "Dahiliye";
    static int counter = 100;
    String cikanSira;

    public Example2() {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen tcnizi giriniz");
        tc = input.next().substring(0, 3);
        setCikanSira();
    }

    public static void main(String[] args) {
        Example2 hasta1 = new Example2();
        String hasta1sira = hasta1.tc + hasta1.cikanSira;
        System.out.println(hasta1sira);
        Example2 hasta2 = new Example2();
        String hasta2sira = hasta2.tc + hasta2.cikanSira;
        System.out.println(hasta2sira);
    }

    public void setCikanSira() {
        counter++;
        this.cikanSira = bolum + "" + counter;
    }
}
