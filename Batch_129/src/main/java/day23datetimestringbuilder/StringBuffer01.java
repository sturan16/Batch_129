package day23datetimestringbuilder;

public class StringBuffer01 {
    /*
    String olusturmak icin String Class, StringBuilder ve StringBuffer kullanilabilir.
    1)StringBuffer JAva'nin String uretmek olusturdugu icin olusturdugu ilk class'dir.Java 5 de uretilmistir.
    2)StringBuffer "synchronized"dir.StringBuilder"synchronized" degildir.
    3)StringBuffer "thread-safe"dir.StringBuilder"thread-safe" degildir.
    4)StringBuffer ve StringBuilder ikiside mutable dir.

    Note 1:Immutable String lazim oldugunda String Class kullaniriz
    Note 2:Mutable String lazim oldugunda StringBuilder veya StringBuffer kullaniriz.
    Note 3:StringBuffer "Multithread" ve "Synchronization" lazim oldugunda tercih edilir.
           StringBuilder "Multithread" ve "Synchronization" gerekmezse tercih edilir.

     */

    public static void main(String[] args) {

        StringBuffer sbf=new StringBuffer("Java");
        System.out.println(sbf);//Java

        System.out.println(sbf.capacity());//20

    }
}
