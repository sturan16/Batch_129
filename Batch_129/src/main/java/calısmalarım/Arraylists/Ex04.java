package calısmalarım.Arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
    //Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.
        //Örnek: (Sarı, Mavi, Kırmızı, Yeşil) ==> Çıktı: Azalan sırada değil
        // (Sarı, Kırmızı, Yeşil, Mavi) ==> Çıktı: Azalan sıradadır
        List<String> e = new ArrayList<>();
        e.add("Yellow");
        e.add("Red");
        e.add("Green");
        e.add("Blue");
        List<String> f = new ArrayList<>();
        f.addAll(e);
        Collections.sort(f);
        System.out.println(e);
        System.out.println(f);
        int size =e.size();
        int flag =0;
        for(int i=0;i<size;i++){
            if(f.get(i).equals(e.get(size-1))){
                flag++;
            }
        }if(flag==size){
            System.out.println("azalan siradadir");
        }else System.out.println("azalan sirada degildir");
    }
}
