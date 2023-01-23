package practice.nighttime04;

public class C03_Ex {
    public static void main(String[] args) {
        /*
         Adada yalniz bir maymun var
         Her gün 4 muz yemesi gerekiyor
         o adada sadece 165 muz var
         Maymun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz
         */
        int muzSayisi=165;

        int yasadıgıGun = 1;

        boolean yasıyorMu=true;

        do {
            System.out.println("***Maymun her gun 4 muz yer****");
            muzSayisi-=4;
            System.out.println("Kalan muz sayisi"+muzSayisi);
            yasadıgıGun++;

            if(muzSayisi<4){
                yasıyorMu=false;
                System.out.println("bugun"+yasadıgıGun+".gun maymun sizlere omur");
                System.out.println("Maymun"+yasadıgıGun+". öldü");
            }else
                System.out.println("Bugun"+yasadıgıGun+".gün maymun yasıyor");



        }while (yasıyorMu);


    }
}
