package calısmalarım.calısma12122022;

public class C05 {
    public static void main(String[] args) {
        //Example 1: 21 den 180 e kadar hem 4 hem de 6 ile bölünebilen tam sayıları ekrana yazdıran kodu yazınız
        for(  int i=21  ;i<181      ; i++   ){
            if(i%4==0 && i%6==0){
                System.out.println(i);
            }
        }
        //Example 2:Szie verilen kucuk harfel yazılmıs Stringin indexi tek sayı olan karakterleri buyuk harf yapınız
        //         hurriyet==> AnKaRa
        String a = "hurriyet";
        for( int i=0  ; i<a.length()   ;i++  ){
            String ch = a.substring(i,i+1);
                if(i%2!=0){
                    System.out.println(ch.toUpperCase());
                }

            }

        //Example 2:Szie verilen buyuk harfel yazılmıs Stringin indexi cift sayı olan karakterleri kucuk harf yapınız
        //
        String b ="YAZARLAR";
        for ( int i=0  ;i<b.length()    ;  i++  ){
            String idx =b.substring(i,i+1);
            if(i%2==0){
                System.out.println(idx.toLowerCase());
            }
        }

        //Example 2:Szie verilen  Stringin indexi cift sayı olan karakterleri kucuk harf yapınız
        String e = "HuzuREvi";
        for (int i=0     ;i<e.length()     ;  i++  ){
            String idx1 = e.substring(i,i+1);
            if(i%2==0){
                System.out.println(idx1.toLowerCase());
            }





        }




        }








    }

