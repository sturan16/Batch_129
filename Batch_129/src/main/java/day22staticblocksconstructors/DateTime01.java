package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {
        //Date Class
        Date myDate = new Date();//obje olusturduk


        System.out.println(myDate);//Sat Jan 07 23:26:28 EET 2023

        System.out.println(myDate.getTime());//1673123308781 1 ocak 1970 den suana kadarki mili saniye miktarini gosterir.

        //İcinde bulundugumuz an nasil alinir?(current time)
        System.out.println(LocalDate.now());//2023-01-07 tarihi verir.Local==>yerel date==>tarih

        System.out.println(LocalTime.now());//23:34:29.772237800 burda da calistirdigim andaki saati verdi.

        System.out.println(LocalDateTime.now());//2023-01-07T23:35:59.654490800 ikisini birlikte verdi

        //Dunyanin herhangi bir saat dilimindeki saati nasil aliriz? Baska mekanlarin saati ve tarihini nasil aliriz
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Vienna")));//2023-01-07T21:44:19.019047900
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));//2023-01-08T05:44:43.744334700
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Moscow")));//2023-01-08T05:44:43.744334700

        //Ileriki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));//2030-07-12

        //Geri bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));//2018-10-05

        //Ileriki bir zamana nasil gidilir?
        System.out.println(LocalTime.now().plusHours(3));//02:56:14.749370500

        //Geri bir zamana nasil gidilir?
        System.out.println(LocalTime.now().minusMinutes(45));//23:13:16.780700300

        //Zamanda belli bir bolumu nasil aliriz.//12:20
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());//0:1

        //Tarihte belli bir bolumu nasil aliriz.//
        System.out.println(LocalDate.now().getMonthValue() + "-" + LocalDate.now().getDayOfMonth());//1-8


        //Iki tarih nasil karsilastirilir?
        //02-13-2005  03-01-2007
        boolean result = LocalDate.of(2005,02,13).isBefore(LocalDate.of(2007,03,01));//Ali once mi veliden diye sorar
        System.out.println(result);//true


        //Tarihlerin formatlari nasil degistirilir.
        //M-->Tek rakamla ay nosunu yazar. MM==>Ikı rakamla ay nosunu yazar.
        //MMM-->Ay isminin ilk uc harfini yazar.  -MMMM--> Ay isminin tmamaini yazar.


        //d--> Tek rakamla gun nosunu yazar  dd--> iki rakamla gun nosunu yazar.

        //yy--> Yılın son iki rakamini yazar  yyyy--> Yilin tamamini yazar.
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");//pattern kalip demek

        System.out.println(dtf.format(LocalDate.now()));//08/01/2023


    }

}
