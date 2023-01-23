package day21statickeyword;

import javax.swing.plaf.IconUIResource;

public class Age {
   public int yas=13;

   public static int unluHarfler(String cumle){
       int counter=0;
       for (int i = 0; i <cumle.length(); i++) {
           char ch=cumle.toLowerCase().charAt(i);
           switch (ch){
               case 'a':
               case 'e':
               case 'i':
               case 'o':
               case 'u':
                   counter++;
                   break;

           }

       }
       return counter;

       }
       //verilen yaslardan 13 olanlari bul

       public int yaslar(int...  age){
       int a=13;
       int counter=0;
       for (int w:age){
           if(w==a){
               counter++;

           }


       }

       return counter;
       }
}
