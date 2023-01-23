package calısmalarım.calısma11122022;

public class C01 {
    public static void main(String[] args) {
        double gömlekFiyat = 12.99;
        double ayakkabıFiyat =79.12;
        double sapkaFiyat = 25.62;

        double toplam = gömlekFiyat+ayakkabıFiyat+sapkaFiyat;
        System.out.println(toplam);

        float a =12;
        long b=13L;
        int c =25;
        System.out.println("bunların carpımı ="+a*b*c);

        int anaPAra=1000,oran=6,yılDEgeri=3;
        int basitFaizDegeri = anaPAra*oran*yılDEgeri/100;
        System.out.println("basitFaizDegeri ="+basitFaizDegeri);

        boolean f =true;
        boolean e =false;
        System.out.println(f+" "+e);

        float kitap =12.99F,defter=19.99F,laptop=34.12F;
        float result =2*kitap + 4*defter + 3*laptop;
        System.out.println(result);

        int x =12;
        System.out.println(x);
        int y=13;
        System.out.println(y);

        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x);
        System.out.println(y);

        short m = 12;
        int yeniM =m;

        long n = 13;
        int yeniN = (int) n;

        double yas = 25.3;
        float yeniYAs = (float) yas;

        double yag = 12.33;
        short yeniYag = (short) 12.33;
        System.out.println(yeniYag);

        byte h = 124;
        double yeniH =h;
        System.out.println(yeniH);

        byte min = Byte.MIN_VALUE;
        short max = Short.MAX_VALUE;
        System.out.println("Toplam =" + (min+max));

       byte sayı1 =Byte.valueOf("113");
       short sayı2 = Short.valueOf("2351");
        System.out.println(sayı2-sayı1);

        String sehirIsmım = " mIAMI";
        String konsol = sehirIsmım.trim().toLowerCase();
        String yeniKonsol= konsol.replace("m","M");
        System.out.println(yeniKonsol);

        String isim1 = "Saim Turan";
        String isim2 = "Hilal Turan";
        String isim3 = "Hilal Sarı";
        int isim1Kar = isim1.length();
        int isim2Kar = isim2.length();
        int isim3Kar = isim3.length();

        int toplamı= isim2Kar+isim1Kar+isim3Kar;
        System.out.println(toplamı);

        String s = " Miami 33012!!!!  ";

        Integer sKarakter = s.trim().replaceAll("[^a-zA-z0-9]","").length();

        String d = "2a3B4?-!5";

        int dRakamOlmayan = d.replaceAll("[^0-9]","").length();
        System.out.println(dRakamOlmayan);












    }





}
