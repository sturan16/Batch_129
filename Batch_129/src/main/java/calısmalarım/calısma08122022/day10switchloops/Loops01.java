package calısmalarım.calısma08122022.day10switchloops;

public class Loops01 {
    public static void main(String[] args) {
        /*
        Code Standart
        i)Tekrar(Repetition) olmamalidir.
        ii)Dynamic olmalidir.
        iii)Tamir(fix) ve update(gelistirme) kolay yapılabilmelidir.


         */

        //Example 1: Ekrana 5 kere "Hi" yazdırınız.
        //1.Yol
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2.Yol
        //Ayni adimlar tekrar tekrar yapiması gerekirse looplar kullanılır.
        //4 tane loop vardır i)for-loop ii) while-loop iii)do-while-loop iv)for each loop

        //i)for-loop
        //   Baslangıc degeri    Loopun calısma sartı   Increment/DEcrement
        for(int i=1            ;           i<6         ;     i++                ){

            System.out.println("Hi!");

        }
        //Example 2: 11 den 44e kadar tüm tam sayıları ekrana yazdıran kodu yazınız

        for(int i =11;  i<45     ; i++   ){
            System.out.println(i);
        }

        //Example 3: 40 dan 23 e kadar tüm çift tam sayıları ekrana yazdıran kodu yazdırınız
        for (int i =40; i>22 ; i--){
            if(i%2==0){
                System.out.println(i);
            }

        }
        //Example 4:18 dan 56 ya kadar tüm tek tam sayıları ekrana yazdıran kodu yazdırınız
        for (int i=18;i<57 ; i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }

        }









    }
}
