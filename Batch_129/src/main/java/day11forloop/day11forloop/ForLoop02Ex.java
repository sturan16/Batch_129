package day11forloop.day11forloop;

public class ForLoop02Ex {
    public static void main(String[] args) {
//Example 1: Verilen bir stringde 'a' karakteri haric tüm karakaterleri yazdiriniz.
        //           "Madagaskar"==> Mdgskr
        String s = "Madagaskar";
        String s1 = s.replace("a", "");
        System.out.println(s1);


        //2.yol
        for (int i = 0; i < s.length(); i++) {
            char s2 = s.charAt(i);
            if (s2 != 'a') {
                System.out.print(s2);
            }

        }
        System.out.println();


        //3.Yol

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                continue;
            }
            System.out.print(s.charAt(i));
        }
        System.out.println();


        //Example 3: verilen bir stringde b harfi haric tüm karakterleri yazdırınız

        String b = "babamızınoglubu";
        String b1 = b.replace("b", "");
        System.out.println(b1);
        //2.Yol
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) != 'b') {
                System.out.print(b.charAt(i));

            }
        }
            System.out.println();

            //3.Yol
            for (int k = 0; k < b.length(); k++) {

                if (b.charAt(k) == 'b') {
                    continue;
                }
                System.out.print(b.charAt(k));
            }


        }
    }

