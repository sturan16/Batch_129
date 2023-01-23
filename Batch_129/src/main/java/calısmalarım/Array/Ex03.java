package calısmalarım.Array;

public class Ex03 {
    public static void main(String[] args) {
//        String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
//        alınız.
        String[] b = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int sum=0;
        for(String w:b){
            if(w.startsWith("K")||w.startsWith("A")){
                sum =sum+w.length();
            }
        }
        System.out.println(sum);

//        String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.
//        Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26

        String name[] = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int top =0;
        for(String w:name){
            top = top + w.length();

        }
        System.out.println(top);

//        Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz
        String s = "Apex is an object oriented programming language";
        String a[] = s.split(" ");
        int counter = 0;
        for(String w:a){
            if(w.startsWith("a")||w.startsWith("A")){
                counter++;
            }
        }
        System.out.println(counter);

//        Verilen bir String'deki sesli harf sayısını bulunuz.
//        String s = "Apex is an object oriented programming language";
        //1.Yol
       int sesli = s.replaceAll("[^aeiouAEIOU]","").length();
        System.out.println(sesli);
        //2.Yol
        String x = "Apex is an object oriented programming language";
        String arr[] = x.toLowerCase().split("");
        int sayac = 0;
        for(String w:arr){
            switch (w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    sayac++;
            }
        }
        System.out.println("Unlu harflerin sayisi = " +sayac);

        //İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.
        String[] arr1 = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        for (int i = 0; i < arr1.length ; i++) {
            String ilkKar=arr1[i].substring(0,1);
            String sonKar=arr1[i].substring(arr1[i].length()-1);
            if(ilkKar.equals(sonKar)){
                System.out.println(arr1[i]);
            }

        }





    }
}
