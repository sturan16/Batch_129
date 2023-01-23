package calısmalarım.yenicalısma;

public class Ex01 {
    public static void main(String[] args) {

        String t = "anna";
        String t1 = "";

        for (int i = t.length() - 1; i >= 0; i--) {
            t1 = t1 + t.charAt(i);
        }
        if (t.equals(t1)) {
            System.out.println(t + ":Palindromdur");
        } else {
            System.out.println(t + ":palindrom degildir");
        }
//        Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
//        Örnek; 223878
//        s
//      ´
        String s = "245637896";
        String d = "";

        for (int i = 0; i < s.length(); i++) {
            String c = s.substring(i, i + 1);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                d = d + c;
            }
        }
        System.out.println(d);
//A A A A A
//A A A A A
//A A A A A
        //bu sekli ciziniz
        int row = 3;
        int columns = 5;


        for (int i=1;i<=row;i++){
            for(int k=1;k<=columns;k++){
                System.out.print("A ");
            }System.out.println();
        }
        System.out.println();
        //Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //A
        //A A
        //A A A
        //A A A A
        //1. Yol:
        //int rows = 4
        int rows = 4;
        for(int i=1;i<=rows;i++){
            for(int k=1;k<=i;k++){
                System.out.print("A ");
            }
            System.out.println();
        }

//        Aşağıdaki çarpım tablosunu oluşturmak için kod yazınız.
//        3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30

        int num=3;

        for(int i=1;i<11;i++){
            System.out.print(num+ "*"+i+ "=" +(num*i)+" ");
        }
        System.out.println();

//        20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık olacak şekilde aralarında boşluk
//        bırakarak yazdırmak için gereken kodu yazınız.

        for(int i=20;i>2;i--){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }

//        String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
//        Örneğin; 'Ali Can?' ==> l*i*a*n*
        String b="";
        String a="Ali Can?";
        String a1=a.replaceAll("[^a-z]","");
        for (int i=0;i<a1.length();i++){
            String r =a1.substring(i,i+1);

            b=b+r+"*";



        }
        System.out.println(b);

//      Bir String’ i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM

        String m ="Mark";
        String l="";

        for(int i=m.length()-1;i>=0;i--){
            char c= m.charAt(i);
            l= l+c;

        }
        System.out.println(l);

//        Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
//        A A A A A A A A
//        A X X X X X X A
//        A X X X X X X A
//        A X X X X X X A
        int satir=4,sutun=8;
        String s1="";

       for(int i=0;i<=satir;i++){
           if(i==1){

               for(int k=1;k<=sutun;k++){
                   s1=s1+"A ";
               }
               System.out.println(s1);
               }else {
               s1=s1+"A ";
               for(int n=2;n<sutun;n++){
                   s1= s1+"X ";
               }
               s1=s1+"A";
               System.out.println(s1);
           }
       }






























    }


}

