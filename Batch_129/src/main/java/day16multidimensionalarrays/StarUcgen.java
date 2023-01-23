package day16multidimensionalarrays;

public class StarUcgen {
    public static void main(String[] args) {
        /*
        Asagidaki sekli cizn kodu yaziniz
       *              //boyle sotularda kareye tamamla bosluk sayisi asagıdan baslayarak artiyor
      * *
     *   *
    *     *
   * * * * *

         */
        int row=5;
        for(int i=1;i<=row;i++){
            for(int k=i;k<row;k++){
                System.out.print(" ");
            }
            for(int m=1;m<=2*i-1;m++ ){
                if (m==row || m==1 || m==2*i-1) {
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
