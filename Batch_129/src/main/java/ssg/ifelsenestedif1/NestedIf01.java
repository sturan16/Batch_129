package ssg.ifelsenestedif1;

public class NestedIf01 {
    public static void main(String[] args) {
        // bir kisinin kan baginda olup olmadigini control ediniz .
        // yas:18 baslamali
        // kilo : 50 dan ust olmali
        //Yaş ve kilo için iki değişken oluşturma

        int yas =20;
        int kilo=78;

        if(yas>18){
            if(kilo>50){
                System.out.println("Bu kisi kan bagindadir");
            }else {
                System.out.println("Bu kisi lan baginda degildir");
            }

        }

    }
}
