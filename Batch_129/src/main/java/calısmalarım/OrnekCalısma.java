package calısmalarım;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class OrnekCalısma {
    public static void main(String[] args) {
        String name ="Saim Turan";
        String name1 ="Saim Turan";

        System.out.println(name.equals(name1));


        String leng = "Java harika geciyor.";
        int sayı = leng.length();
        System.out.println(sayı);


        String ind = "Java harika geciyor.";
        int idx1 = ind.indexOf('i');
        System.out.println(idx1);

        int idx2 = ind.indexOf('c');
        System.out.println(idx2);
        System.out.println("indexler toplamı ="+ (idx2+idx1));



        //Example


        Scanner input = new Scanner(System.in);


        System.out.println("Lütfen bir kelime ve bir cümle  giriniz");
        String kelime1 = input.nextLine();
        String cümle1 =input.nextLine();
        System.out.println(kelime1);
        System.out.println(cümle1);

        boolean varMıYokMu = cümle1.contains(kelime1);
        System.out.println("Girilen kelime cümlede 1 kere kullanılmıs=" +varMıYokMu);






    }
}
