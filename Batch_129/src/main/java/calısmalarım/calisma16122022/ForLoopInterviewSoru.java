package calısmalarım.calisma16122022;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class ForLoopInterviewSoru {
    public static void main(String[] args) {
        String a="javahayatnanasıl";
        String ters ="";
        for(int i=a.length()-1;i>=0;i--){
            ters = ters +a.charAt(i);

        }
        System.out.println(ters);


        String b ="32542";
        String b1="";
        for(int i=b.length()-1;i>=0;i--){
            b1 = b1+ b.charAt(i);}
        if(b.equalsIgnoreCase(b1)){
            System.out.println(b +  ": palindrom");
        }else{
            System.out.println( b + ": palindrom degil");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz");
        Integer num1 = input.nextInt();
        Integer num2 = input.nextInt();
        int sum=0;
        for(int i=num1;i<num2+1;i++){
            sum =sum +i;

        }
        System.out.println(sum);


        int sayı = 9;
        sum= 1;
        for(int i=9;i>0;i--){
            sum=sum*i;

        }
        System.out.println(sum);








    }
}
