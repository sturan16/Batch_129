package day04asciiwrapperclassoperatorsmemoryusage;

public class AsciiValues {
    //Java da her karakterın sayısal bır degerı vardır.
    //Bu degerler ASCII degerler olarak adlandırılır.
    //Bu degerlerın tamamının bulundugu tabloya ASCII Table denir.


    public static void main(String[] args) {

        //Herhangi bir characterın ASCII degerını bulmak ıcın o karakterı "int" data type ında varıable ın icine koyunuz

        int ch ='A';
        System.out.println(ch);
        int unlem = '!';
        System.out.println(unlem);
        char c1 = 'K';
        char c2 = '?';
        char c3= ' ';
        //Java da char'ları matematıksel ıslemlerde kullanırsanız Java o charların ASCII degerlerını kullanır

        System.out.println("toplam=" +(c1+c2+c3));

    }
}
