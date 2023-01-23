package day11forloop.day11forloop;

public class ForLoop02 {
    public static void main(String[] args) {
        //Example 1: Verilen bir stringde 'a' karakteri haric tüm karakaterleri yazdiriniz.
        //           "Madagaskar"==> Mdgskr
        String s="Madagaskar";

        //1.Yol
        String t =s.replace("a","");
        System.out.print(t);

        //2.Yol
        for(int i=0;i<s.length() ;i++ ){
            char ch=s.charAt(i);

            if(ch!='a'){
                System.out.print(ch);
            }
            System.out.print("");
        }
        //3.yol
        for(int i=0 ;i<s.length();i++){

            if(s.charAt(i)=='a'){
                continue;//continue keywordu bazi sartlar icin loopun adimlarini atlamamizi saglar
                //burdaki esitlik saglandıgında cyazdırma adımına gecmez atlar

            }System.out.print(s.charAt(i));
        }








    }
}
