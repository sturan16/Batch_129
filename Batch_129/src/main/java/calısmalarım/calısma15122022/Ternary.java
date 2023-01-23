package calısmalarım.calısma15122022;

public class Ternary {
    public static void main(String[] args) {
        int y = 1800;
        String gecerliMi = (y % 100 == 0) ? ((y % 400 == 0) ? ("Artık yıl") : ("Artık Yıl Degıl")) : ((y % 4 == 0) ? ("Artık yıl") : ("Artık yıl degıl"));
        System.out.println(gecerliMi);

        String p = "KXXXXX";
        String dogruMu = p.length() > 8 ? (p.startsWith("i") ? "gecerli" : "gecersiz") : (p.startsWith("K") ? "gecerli" : "gecersiz");
        System.out.println(dogruMu);


        int x = 13;
        int z = 12;

        int ressult = x < z ? x : z;
        System.out.println(ressult);

        int sayı1 = -125;
        sayı1 = Math.abs(sayı1);

        String result1 = sayı1 > 99 & sayı1 < 1000 ? "sayı 3 basamaklıdır" : "sayı 3 basamaklı degıldır";
        System.out.println(result1);

        int a = 14;

        String tekCift = a % 2 == 0 ? "cift" : "tek";
        System.out.println(tekCift);

        int s = -12;
        String pozNeg = s < 0 ? "negatif" : "pozitif";
        System.out.println(pozNeg);

        String ad = "Saim Turan";
        for (int i = ad.length() - 1; i >= 0; i--) {
            System.out.print(ad.charAt(i));
        }

        String rr = "hayat cok guzel";
        for (int i = rr.length() - 1; i >= 0; i--) {
            System.out.print(rr.charAt(i));
        }
        int sayı2 = 35;

        for (int i = 1; i <= sayı2; i++) {
            if (sayı2 < 101) {
                if (i % 15 == 0) {
                    System.out.println("Java Guzeldir");
                    continue;
                }
                if (i % 3 == 0) {
                    System.out.println("Java");
                    continue;
                }
                if (i % 5 == 0) {
                    System.out.println("Guzeldir");
                    continue;
                }
                System.out.println(i);
            } else {
                System.out.println("100 den kucuk deger gırınız");
            }


        }
        String l = "Kamahsada";
        for (int i=l.length()-1 ; i>=0; i--){
            System.out.print(l.charAt(i));
        }




    }
}

