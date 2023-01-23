package day21statickeyword;

public class AgeRunner {
    public static void main(String[] args) {
        //static olmayan bir variable method olusturarak cagirdik
        Age method=new Age();
        System.out.println(method.yas);

        //static olan unlu harfler methodunu cagirdik
        System.out.println(Age.unluHarfler("galateeksasdmas"));//6

        //static olmayan yaslar methodunu cagiricaz
        System.out.println("13 sayisi kac tane var : " +  method.yaslar(13, 20, 60, 45, 80, 90, 13, 13, 54));
    }
}
