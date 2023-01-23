package calısmalarım.calısma15122022;

import com.sun.security.jgss.GSSUtil;

public class Loops {
    public static void main(String[] args) {
        for (int i = 120; i > 10; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + ",");
            }
        }
        int ay = 3;
        int yıl = 2000;
        int gunSayısı = 0;
        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                gunSayısı = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                gunSayısı = 30;
                break;
            case 2:
                if (((yıl % 4 == 0) && !(yıl % 100 == 0)) || (yıl % 400 == 0)) {
                    gunSayısı = 29;
                } else {
                    gunSayısı = 28;
                }
                break;
            default:
                System.out.println("gecersiz ay");
                break;
        }
        System.out.println("Gun sayısı =" + gunSayısı);

        double a = 12.52;
        double b = 13.25;
        String opr ="*";
        switch (opr){
            case "+":
                System.out.println(a +" + " +b+ " = " +(a+b));
                break;
            case "-":
                System.out.println(a +" - " +b+ " = " +(a-b));
                break;
            case "*":
                System.out.println(a +" * " +b+ " = " +(a*b));
                break;
            case "/":
                System.out.println(a +" / " +b+  " = " +(a/b));
                break;
            default:
                System.out.println("gecersiz operator");
        }







    }






}



