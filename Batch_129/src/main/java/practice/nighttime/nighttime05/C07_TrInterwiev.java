package practice.nighttime.nighttime05;

import java.util.Arrays;
import java.util.Scanner;

public class C07_TrInterwiev {
    public static void main(String[] args) {
//        INTERWIEW QUESTIONS
//        Kullanicidan bir String aliniz.
//        String'de var olan her character'in sayisini ekrana yazdiriniz.
//        Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
//        abaa   ==> a=3  b=1
//

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz");


        String str = input.nextLine();//alican
        String arr[] = str.split("");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int counter = 0;
        for(int i=1;i<arr.length;i++){

            if(arr[i-1].equals(arr[i])){

                counter++;//Ayni olanlar icin bir arttir

            }else{
                System.out.println(arr[i-1]+" karakterinin sayisi "+ (counter+1)+" kez tekrarlanmisitr.");

                counter=0;//baska harfe gectigi icin sifirlanmasi lazim counterın
            }
            if(i==arr.length-1)//defalarca kodu yazdirmamasi icin sona gelindiginde yazdirmasi icin if kullandik.
            System.out.println(arr[i]+" karakterinin sayisi "+(counter+1)+" kez tekrarlanmistir.");

        }



    }
}
