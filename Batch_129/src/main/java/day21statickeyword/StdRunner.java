package day21statickeyword;

import java.util.Arrays;
import java.util.List;

public class StdRunner {
    public static void main(String[] args) {

        //stdName static oldugu icin ona ulasmak icin object olusturmadim.
        //Sadece class ismini kullanmak yeterlidir(Student)
        System.out.println(Student.stdName);

        //age non-static oldugundan ona ulasmak icin object olusturmak
        //zorundayiz.(kendi classinin isminde bir object olustururuz)
        Student std1=new Student();
        System.out.println(std1.age);


        //static olani direkt aldik
        System.out.println(Student.getInitials("Sefa Eyer"));

        //static olmayani bulduk burda objeyle cagirdik
        int vowels =std1.coundVowels("Tom Cruise");
        System.out.println(vowels);


        //static olanlari objeyle de cagirabiliriz ancak tavsiye edilmez
       String s=  std1.getInitials("Ali Can");
        System.out.println(s);

        System.out.println(Student.getInitials("Ahmet Agar"));


        //List olsuturmada yeni bir isilti........****
        List<String> names = List.of("Ali","Veli","Can","Kemal");
        System.out.println(names);



    }
}
