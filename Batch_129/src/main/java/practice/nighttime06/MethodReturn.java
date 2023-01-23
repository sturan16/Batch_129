package practice.nighttime06;

public class MethodReturn {
    public static void main(String[] args) {
         int alan = dikdortgenAlani(5,10)+5;
        System.out.println("alan = " + alan);
    }

    private static int dikdortgenAlani(int a, int b) {
        
        //burda int yaptıgımız icin dikdörtgenin alanını main icinde ekleme cıkarma 5 ekle 3 cıkar yapabiliyoruz
        
        return  a*b;
    }


}
