package advanced_practice.practice05;

import com.sun.security.jgss.GSSUtil;

public class Q03Ex {
    /*
        Şekli Yazdırınız:
          1 2 3 4 5 6
           2 3 4 5 6
            3 4 5 6
             4 5 6
              5 6
               6
     */
    public static void main(String[] args) {
        for (int i = 1; i <=6 ; i++) {

            for (int bos = 1; bos <i ; bos++) {
                System.out.print(" ");

            }

            for (int j = i; j <=6 ; j++) {
                System.out.print(j+" ");

            } System.out.println();

        }




        }
    }





