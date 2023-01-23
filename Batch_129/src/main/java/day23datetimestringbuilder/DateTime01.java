package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {
        //Example 1:Time'i  formatlayiniz.
        LocalTime myTime=LocalTime.now();
        System.out.println(myTime);//21:38:32.123374100
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh-mm:ss a");

        //hh==>12 lik saat sistemini kullanir --HH==>24luk saat sistemini kullanir.
        //hh kullandigimizda AM veya PM demelisiniz,bunu demek icin "a" yazmamiz ueterlidir.Yani "hh:mm a"


        System.out.println(dtf.format(myTime));//09-41 ÖS(PM)




    }
}
