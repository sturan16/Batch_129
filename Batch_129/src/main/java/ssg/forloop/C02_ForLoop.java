package ssg.forloop;

public class C02_ForLoop {
    //    Soru 2) 10 ile 30 arasindaki(10 ve 30 dahil) sayilari aralarinda virgul olarak ayni satirda yazdirin
    public static void main(String[] args) {
        int bas = 10;
        int son = 30;

        for (int i = bas; i <= son; i++) {
            if (i<son) {
                System.out.print(i + ",");
            } else
                System.out.println(i);
        }
    }
}
