package day11forloop.day11forloop;

public class ForLoop01Ex {
    public static void main(String[] args) {
//Example 1:verilen bir stringde ilk 'a' harfinden onceki tüm characterleri console yazdırınız
       String a ="Tramway";

       for(int i=0;i<a.length();i++){
           char ch= a.charAt(i);
           if(ch=='a'){
               break;
           }
           System.out.print(ch);
       }
        System.out.println();






        //Example 2:verilen bir stringde ilk 's' harfinden onceki tüm characterleri console yazdırınız
        String c= "Hayfmföskfdkfkld";
       for(int i=0;i<c.length();i++){
           char s1=c.charAt(i);
           if(s1=='s'){
               break;
           }
           System.out.print(s1);
       }
        System.out.println();






        //Example 3:verilen bir stringde ilk 'm' harfinden onceki tüm characterleri console yazdırınız
        String d= "turkiyebuyukmilletmeclisi";
        for(int i=0;i<d.length();i++){
            char d1=d.charAt(i);
            if(d1=='m'){
                break;
            }
            System.out.print(d1);
        }
        System.out.println();


        //Example 4:verilen bir stringde ilk 'v' harfinden onceki tüm characterleri console yazdırınız
        String k = "saimhilaliseviyor";
        for(int i=0;i<k.length();i++){
            char k1= k.charAt(i);
            if(k1=='v'){
                break;
            }
            System.out.print(k1);
        }
        System.out.println();




        //Example 5: Verilen bir stringde son  'a'dan sonraki tüm karakterleri ters sırada yazdırınız.
        //           "Germany" ==> ny ya datersten yazdıralım yn
        String s="kaleminikıralım";
        for(int i=s.length()-1;i>=0;i--){
            char s1=s.charAt(i);
            if(s1=='a'){
                break;
            }
            System.out.print(s1);

        }
        System.out.println();
        //Example 6: Verilen bir stringde son  'k'dan sonraki tüm karakterleri ters sırada yazdırınız.
        String o = "khjgasdajkhdshada";

        for(int i=o.length()-1;i>=0;i--){
            char o1= o.charAt(i);

            if(o1=='k'){
                break;
            }
            System.out.print(o1);
        }












    }
}
