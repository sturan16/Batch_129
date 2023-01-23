package calısmalarım.Arraylists;

import java.util.ArrayList;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {
        //Listede 15 veya 13 varsa, bu elemanları kaldırınız.
        //Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54
List<Integer>a =new ArrayList<>();
a.add(10);
a.add(13);
a.add(51);
a.add(21);
a.add(15);
a.add(8);
if(!a.contains(15)|| !a.contains(13)){
    System.out.println("15 ve 13 icermiyor");
}else {
    for(int i=0;i<a.size();i++){
        if(a.get(i)==15){
            int idx15 = a.indexOf(15);
            a.remove(idx15);
            i--;
        }
        if(a.get(i)==13){
            int idx13 = a.indexOf(13);
            a.remove(idx13);
            i--;
        }
        if(a.get(i)==21){
            int idx21 = a.indexOf(21);
            a.remove(idx21);
            i--;
        }
    }
    System.out.println(a);
}



    }
}
