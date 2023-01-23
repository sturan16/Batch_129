package day31collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    /*
       1)Interface'lerden objrct olusturulamaz cunku ınterface'lerin constructor'i yoktur.

       2)Abstract class'lardan object olusturulamaz,constructorlari vardir ama constructor object olusutrmada kullanilamaz.

       3)Interface'lerin constructorlari olmadigindan collection olustururken interface isimleri new keyword'unden sonra kullanilamaz.

       4)*Class --> class==> extends
         Class--> interface==> implements
         *interface-->interface ==> extends
         interface-->class==> Bu mumkun degildir.

       5)ArrayList’ler eleman silme ve eleman eklemede basarisizdirlar,
         o yuzden eleman silme ve ekleme  islemleri coklukla yapilacaksa ArrayList kullanmak tavsiye edilmez

       6)LinkedList’ler index kullanmadiklarindan eleman silmede ve eklemede re-index yapilmasina gerek yoktur.
         Bu da LinkedList’leri eleman ekleme ve silmede cok basarili hale getirir. Bu yuzden eleman ekleme ve
         silmenin cok yapilmasi gereken durumlarda LinkedList kullanmak tavsiye edilir.

       7) ArrayList'lerde search islemi kolay yapilir cunku indexler adres gibidir.

       8)LinkedList'lerde search islemi zor yapilir, cunku LinkedList'ler index kullanmaz,index kullanmayinca herhangi bir
       elemani bulmak icin en bastan butun elemanlar kontrol edilir.Bu da cok fazla is demektir.



     */
    public static void main(String[] args) {
        //LinkedList nasil olusturulur.
        List<String>cityNames=new LinkedList<>();
        LinkedList<String>names= new LinkedList<>();
        names.add("Steve");
        names.add("Ajda");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");
        System.out.println(names);//[Steve, Ajda, Raj, Megan, Brandon]

        names.addFirst("Cuneyt");
        System.out.println(names);//[Cuneyt, Steve, Ajda, Raj, Megan, Brandon]

        names.addLast("Ajda");//This method(addlast) is equivalent to add().
        System.out.println(names);//[Cuneyt, Steve, Ajda, Raj, Megan, Brandon, Ajda]

        names.add(3,"Suleyman");
        System.out.println(names);//[Cuneyt, Steve, Ajda, Suleyman, Raj, Megan, Brandon, Ajda]

        //Silmek icin

        names.remove("Ajda");//İlk Ajdayi siler ve loop'u kirar.
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Raj, Megan, Brandon, Ajda]

        names.remove(4);
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Raj, Brandon, Ajda]

        names.add("Suleyman");
        names.add("Suleyman");
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Raj, Brandon, Ajda, Suleyman,Suleyman]

        String r1 = names.remove();//sadece ilk elemani siler ve size verir Retrieves(verir) and removes the head (first element) of this list.(Cut+paste)
        System.out.println(r1);//Cuneyt
        System.out.println(names);//[Steve, Suleyman, Raj, Brandon, Ajda, Suleyman]

        names.removeFirstOccurrence("Suleyman");//Sil ilk gorunum suleyman **remove() aynisi**
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Suleyman,Suleyman]

        names.removeLastOccurrence("Suleyman");
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Suleyman]


        // Retrieves, but does not remove, the head (first element) of this list.(Copy+Paste)
        //Returns:the head of this list, or null if this list is empty
        //İlk elemani silmeden size verir.
        String r2= names.peek(); //
        System.out.println(r2);//Steve
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Suleyman]

        //Retrieves(verir) and removes the head (first element) of this list.(cut+paste)
        //Returns: the head of this list, or null if this list is empty

        //remove() bos LinkedList te kullanilirsa hata verir,poll() bos LinkedList te kullanilirsa "null" verir
        names.poll();


        //Pops an element from the stack represented by this list. In other words, removes and returns the first element of this list.(Cut+paste)
        //This method is equivalent to removeFirst().
        //Returns: the element at the front of this list (which is the top of the stack represented by this list)ilk elemani verir.
        names.pop();




    }
}
