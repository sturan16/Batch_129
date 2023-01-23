package advanced_practice.practice02;

public class Q04_RandomMethod_RastgeleHarf {
    public static void main(String[] args) {
        /*
    Rastgele bir harf veren bir method oluşturun ve ardından methodu kullanarak aşağıdakileri yazdırınız.
    ‘A’ ve ‘a’ için “İlk Karakter” yazdırınız.
    ‘B’ ve ‘b’ için “İkinci Karakter” yazdırınız.
    ‘C’ ve ‘c’ için “Üçüncü Karakter” yazdırınız.
    ‘D’ ve ‘d’ için “Dördüncü Karakter” yazdırınız.
    Diğerleri için “Diğer Karakterleri” yazdırınız.
    */

        rastgeleHarf();


    }
    public static String rastgeleHarf(){
        String alfabe="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int maxIndex=alfabe.length();
        int rastgeleIndex = (int) (Math.random()*maxIndex);

        return alfabe.substring(rastgeleIndex,rastgeleIndex+1);
    }


}
