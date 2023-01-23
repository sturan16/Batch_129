package calısmalarım.Array;

public class Ex02 {
    public static void main(String[] args) {
//        Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı
//bulunuz.
//Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -
        Integer sayi[] = new Integer[]{-12, 18, -5, 23, -2};
        int minSayi =sayi[0];
        int maxSayi =sayi[0];

        for(Integer w:sayi){

           minSayi = Math.min(minSayi,w);
           if(minSayi==w){
               System.out.println(minSayi);
           }


        }
        for(Integer w:sayi){
            maxSayi =Math.max(maxSayi,w);
            if(maxSayi==w){

            }
        }System.out.println(maxSayi);

    }
}
