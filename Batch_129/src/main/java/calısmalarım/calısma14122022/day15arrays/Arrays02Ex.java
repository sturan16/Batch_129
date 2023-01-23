package calısmalarım.calısma14122022.day15arrays;

import javax.swing.plaf.IconUIResource;

public class Arrays02Ex {
    public static void main(String[] args) {
        //Bir stringdeki sesli harflerin sayisini bulan kodu yaziniz
        //          a e i o u A E I O U

        String s="Java brings you money";

        //1.Yol: replaceAll methodu ile
        
        int sesli = s.replaceAll("[^aeiouAEIOU]","").length();
        System.out.println("sesli sayisi = " + sesli);

        //2.Yol For each array
        String harfler[] = s.split("");
        int counter =0;
        for(String w:harfler){
            switch (w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }
        }
        System.out.println(counter);








    }
}
