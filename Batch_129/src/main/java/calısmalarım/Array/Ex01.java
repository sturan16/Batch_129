package calısmalarım.Array;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {

//        String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
//        Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Vel

       String a[]=new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
       int minLength= a[0].length();

      for(String w:a){
          minLength =Math.min(minLength,w.length());
      }
      for(String w:a){
          if(minLength==w.length()){
              System.out.println(w);
          }
      }

    }
}






