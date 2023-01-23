package advanced_practice.practice01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q01_Variables_FahreheitTOCelcius {

    public static void main(String[] args) {
        //formul:  c = (f-32)*5/9

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Fahrenheit degeri giriniz");
        double f = input.nextDouble();

        double c = (f-32)*5/9;
        System.out.println("Celcius = " + c);

// ondalik kismi belirli bir formatta yazdirmak icin ;
        //1.Yol: DecimalFormat class ile

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String formatedCElcius = decimalFormat.format(c);
        System.out.println("formatedCElcius = " + formatedCElcius);


        //2. Yol: printf ile
        System.out.printf("%.3f",c); //% => herhangi bir sayi , 3f=> 3 basamakli format




    }
}
