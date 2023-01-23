package calısmalarım.calısma14122022;

import java.util.Scanner;

public class MentorCalısma {
   /* 1)Bir şirket, hizmet yılı 5 yıldan fazla olan çalışana %5 oranında ikramiye vermeye karar verdi.
    Kullanıcıdan maaşını ve hizmet yılını isteyin ve net ikramiye tutarını yazdırın.*/


    public static void main(String[] args) {
       /*Scanner input =new Scanner(System.in);
       System.out.println("Lütfen maasinizi giriniz");
       double maas = input.nextDouble();
       System.out.println("Lütfen hizmet yilinizi giriniz");
       byte hizmet=input.nextByte();

       if(hizmet>5){
           System.out.println("İkramiye tutarı = "+(maas*5/100));
       }else{
           System.out.println("Hizmet yılınız dolmamıstır");
       */

        //2)Bir okulun not sistemi için aşağıdaki kuralları vardır:
        //a. 25'in altında - F
        //b. 25 ila 45 - E
        //c. 45 - 50 - D
        //d. 50 ila 60 - C
        //e. 60 ila 80 - B
        //f. 80'in üzerinde - A
        //Kullanıcıdan işaretleri girmesini ve karşılık gelen dereceyi yazdırmasını isteyin.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        int  not = input.nextShort();
        int not1 = Math.abs(not);


        if (not1 > 0 && not1 < 25) {
            System.out.println('F');
        } else if (not1 < 26 && not1 < 46) {
            System.out.println('E');
        } else if (not1 > 45 && not1 < 51) {
            System.out.println('D');
        } else if (not1 > 50 && not1 < 61) {
            System.out.println('C');
        } else if (not1 > 60 && not1 < 81) {
            System.out.println('B');
        } else if (not1 > 80 && not1 < 101) {
            System.out.println('A');

        } else {
            System.out.println("Gecerli bir not giriniz");
        }
    }
}

