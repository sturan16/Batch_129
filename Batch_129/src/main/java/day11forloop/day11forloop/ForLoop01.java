package day11forloop.day11forloop;

public class ForLoop01 {
    public static void main(String[] args) {

//Example 1:verilen bir stringde ilk 'a' harfinden onceki tüm characterleri console yazdırınız
        String a = "Tramvay";

        for (int i = 0; i < a.length(); i++) {
            char ch =a.charAt(i);
            if (ch == 'a') {
                break;
            }
            System.out.print(ch);

        }

        //Example 2: Verilen bir stringde son  'a'dan sonraki tüm karakterleri ters sırada yazdırınız.
        //           "Germany" ==> ny ya datersten yazdıralım yn

        String t ="Germany";
        for(int i=t.length()-1 ; i>=0 ; i--){
            char ct =t.charAt(i);
            if(ct=='a'){
                break;
            }
            System.out.print(ct);
        }


    }
}
