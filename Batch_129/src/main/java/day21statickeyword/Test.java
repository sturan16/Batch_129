package day21statickeyword;

import java.util.Scanner;

public class Test {
    //ogrenci numarasi atayan bir method olsuturunuz
    //ornek Ali20221001
    String name;
    String yil="2022";
    static int counter=1000;
    String ogrenciId;
    public Test(){
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen isim giriniz");
        name=input.next().toUpperCase();
        setOgrenciId();
    }

    public static void main(String[] args) {
        Test student1=new Test();
        String ogrenci1 = student1.name+student1.ogrenciId;
        System.out.println(ogrenci1);
        Test student2 =new Test();
        String ogrenci2=student2.name+student2.ogrenciId;
        System.out.println(ogrenci2);
    }

    public void setOgrenciId() {
        counter++;
        this.ogrenciId = yil+""+counter;
    }
}
