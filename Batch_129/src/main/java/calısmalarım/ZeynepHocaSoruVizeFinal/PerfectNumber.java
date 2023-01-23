package calısmalarım.ZeynepHocaSoruVizeFinal;

import java.util.Scanner;

public class PerfectNumber {
    /*
    Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = input.nextInt();
        mukemmelSayi(sayi);
    }
    private static void mukemmelSayi(int sayi) {

        int toplam = 0;
        for(int i=1;i<sayi;i++){
            if(sayi%i==0){
                toplam+=i;
            }
        }if(sayi==toplam){
            System.out.println(sayi+ "Mükemmel sayi");

        }else System.out.println(sayi+ "Mükemmel sayi deği");
    }




}
