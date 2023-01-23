package calısmalarım.calısma12122022;

import java.util.Scanner;

public class JavaWrapper {
    public static void main(String[] args) {
        byte maxByte = Byte.MAX_VALUE;
        System.out.println(maxByte);
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);
        System.out.println("Toplam = " + (maxByte + maxShort));

        byte a = Byte.valueOf("113");
        System.out.println(a);
        short b = Short.valueOf("2351");
        System.out.println(b);

        String d = " mIAMI";

        String yeni = d.trim().toLowerCase();
        String sonHal = yeni.substring(0, 1).toUpperCase() + yeni.substring(1);
        System.out.println(sonHal);

        String e = " mIamı";
        String e1 = e.trim().toLowerCase();
        String e2 = e1.substring(0, 1).toUpperCase() + e1.substring(1);
        System.out.println(e2);

        String name = "kadir nss";
        String ha = "jana ssasa";
        Integer name1 = name.replaceAll(" ", "").length();
        Integer ha2 = name.replaceAll(" ", "").length();
        System.out.println("toplam = " + (name1 + ha2));

/*
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sifre giriniz");
        String pwd = input.next();

        boolean pwd1 = pwd.replaceAll(" ","").length()>8;
       boolean  pwd2 =  pwd.replaceAll(" ","").replaceAll("[A-Za-z0-9]","").length()>0;
        System.out.println("Sıfre gecerli mi = "+ (pwd1 && pwd2 ));*/

        String ayAdı= "Aralık";

        ayAdı= ayAdı.toLowerCase();
        if(ayAdı.equals("aralık")|| ayAdı.equals("ocak") || ayAdı.equals("subat")){
            System.out.println("Kıs");
        }else if (ayAdı.equals("Mart")|| ayAdı.equals("Nisan") || ayAdı.equals("Mayıs")){
            System.out.println("İlkbahar");
        }else if(ayAdı.equals("Haziran")|| ayAdı.equals("Temmuz") || ayAdı.equals("Agustos")){
            System.out.println("Yaz");
        }else if(ayAdı.equals("Eylül")|| ayAdı.equals("Ekim") || ayAdı.equals("Kasim")){
            System.out.println("Sonbahar");
        }else {
            System.out.println("GEcersiz ay adi");
        }
/*
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen sifre giriniz");
        String pwd= input.nextLine();

        if(pwd.replaceAll("\\S","").length()>0){
            System.out.print("Sifrede bosluk karekteri kullanmayınız");
        }else if(pwd.replaceAll(" ","").length()>=8){
            System.out.println("Gecerli sifre");
        }else {
            System.out.println("Gecersiz sifre");
        }

        int ayNum =3;
        if(ayNum==1){
            System.out.println("Ocak");
        }else if(ayNum==2){
            System.out.println("Subat");
        }else if(ayNum==3){
            System.out.println("Mart");
        }else if(ayNum==4){
            System.out.println("Nisan");
        }else if(ayNum==5){
            System.out.println("Mayıs");
        }else if(ayNum==6){
            System.out.println("Haziran");
        }else if(ayNum==7){
            System.out.println("Temmuz");
        }
*/
        int num =124578;

        if (num%10>=5) {
            System.out.println("Son basamagı bir üst ondalıga yuvarla = "+ (num/10+1)*10);
        }else {
            System.out.println("Son basamagı bır alt ondalıga yuvarla = "+ (num/10)*10);
        }

        int x = 5;
        int y = 5;
        int z = 4;
        if(x==y && y==z && x==z){
            System.out.println("Eskenar ucgen");
        }else if(x==y || y==z  ||x==z){
            System.out.println("Ikızkenar ucgen");
        }else {
            System.out.println("CEsitkenar ucgen");
        }

        String eyKıs="Nyc";
        if(eyKıs.length()>2){
            System.out.println("Eyalet kısaltmaları 2 karakterden fazla olamaz");
        }else if(eyKıs.replaceAll("[^a-z]","").length()!=0){
            System.out.println("Eyalet kısaltmaları kucuk harf ıceremez");
        }else if(eyKıs.replaceAll("[^a-zA-Z]","").length()>0){
            System.out.println("Eyalet kısaltmaları farklı karakter ıceremez");
        }

        double m =12.99;
        double n =25.99;
        String operator = "+";
        if(operator.equals("+")){
            System.out.println(m+n);
        }else if (operator.equals("-")){
            System.out.println(m-n);
        }else if (operator.equals("*")){
            System.out.println(m*n);
        }else if (operator.equals(m/n)){
            System.out.println(a/b);
        }else {
            System.out.println("Hatalı giriş yaptınız");
        }

        double bmı =30;
        if(bmı<0){
            System.out.println("Gecersiz bmı degeri");
        }else if(bmı<=18.5){
            System.out.println("Zayıf");
        }else if (bmı>18.4 && bmı<25.0){
            System.out.println("Normal agırlık");
        }else if(bmı>24.99 && bmı<30.0){
            System.out.println("fazla kilolu");
        }else if (bmı>=30){
            System.out.println("Obezite");
        }


        String parola ="a1b2c3s ";
        String gecerliMi=parola.replaceAll("^ ","").length()>7 ? "Gecerli paralo" : " GEcersix parola";
        System.out.println(gecerliMi);

        int yıl =1800;
        String artıkYıl= (yıl%100==0) ? ((yıl%400==0)? ("Artık yıl"):("Artık yıl değil")) : ((yıl%4==0) ? ("Artık yıl") : ("Artık yıl degil"));
        System.out.println(artıkYıl);
        String p ="XXXXXXXX";
        String r = p.length()>8 ? (p.startsWith("i")? "Gecerli": "GEcersiz") : (p.startsWith("K") ? "Gecerli" : "Gecersiz");
        System.out.println(r);


        int sayı = -5;
       int sayı1=  sayı<0 ? sayı*-1 : sayı;
        System.out.println(sayı1);

        int num1 = -123;
        int numa =sayı<0 ? num1*-1 : num1;
        System.out.println(numa);


        int q=12;
        int w=25;
        int kucuk= q<w ? q : w;
        System.out.println(kucuk);

        int nm = 1254;
        String rs = ( nm>99 && nm<1000 ) || (nm>-1000 && nm<-99) ? "Bu sayı üc basamakli" : "3 basamaklı değil";
        System.out.println(rs);
        int i=14;
        String sayı3 = i%2==0 ? "çift sayı" : "Tek sayı";
        System.out.println(sayı3);
        int h =-12;
       String h1 =  h>0 ? "pozitif" : "negatif";
        System.out.println(h1);


        String mountName = "Aralik";
        mountName =mountName.toLowerCase();
        switch (mountName){
            case "aralik":
            case "ocak":
            case "subat":
                System.out.println("Kıs");
                break;
            case"Mart":
            case"Nisan":
            case"Mayıs":
                System.out.println("Ilkbahar");
                break;
            case"Haziran":
            case"Temmuz":
            case"Agustos":
                System.out.println("Yaz");
                break;
            case"Eylul":
            case"Ekım":
            case"Kasım":
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Lütfen gecerli ay ismi giriniz");
        }
        int ay =7;

        switch (ay){
            case 1:
                System.out.println("Ocak");

            case 2:
                System.out.println("Subat");

            case 3:
                System.out.println("Mart");

            case 4:
                System.out.println("Nisan");

            case 5:
                System.out.println("Mayıs");

            case 6:
                System.out.println("Haziran");

            case 7:
                System.out.println("Temmuz");

            case 8:
                System.out.println("Agustos");

            case 9:
                System.out.println("Eylul");

            case 10:
                System.out.println("Ekim");

            case 11:
                System.out.println("Kasim");

            case 12:
                System.out.println("Aralik");
                break;

            default:
                System.out.println("Lutfen gecerli numara giriniz");

        }
      /*  Scanner input =new Scanner(System.in);
        System.out.println("Lutfen cinsiyet giriniz..Erkek,Kadın,Digerleri");
        String cinsiyet = input.next();

        switch (cinsiyet){
            case "Kadin":
                System.out.println("Kadin");
                break;
            case "Erkek":
                System.out.println("Erkek");
                break;
            default:
                System.out.println("Digerleri");
        }*/
        /*Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz");
        double k= input.nextDouble();
        double l= input.nextDouble();
        System.out.println("Lütfen yapılacak islemi yazınız...+,-,*,/");
        char islem = input.next().charAt(0);

        switch (islem){
            case '+':
                System.out.println(k + "+" + l + "=" + (k+l));
                break;
            case '-':
                System.out.println(k + "-" + l + "=" + (k-l));
                break;
            case '*':
                System.out.println(k + "*" + l + "=" + (k*l));
                break;
            case '/':
                System.out.println(k + "/" + l + "=" + (k/l));
                break;
            default:
                System.out.println("Lütfen gecerli islem giriniz");
        }*/

       /* Scanner input = new Scanner(System.in);
        double mil=10;
        double saniye = 12.99;
        double fahr= 4.3;
        System.out.println("Lütfen yapılacak islemi giriniz...mildenkmye,sn==>saat,fahr==>santigrat....");
        String donus= input.nextLine();
        donus = donus.toLowerCase();

        switch (donus){
            case "mildenkmye":
                System.out.println(mil*1.60934);
                break;
            case"snyedensaate":
                System.out.println((saniye/60)/60);
                break;
            case"fahrdensantigrata":
                System.out.println((fahr-32)*5/9);
                break;
            default:
                System.out.println("Lütfen gecerli deger giriniz");
        }*/

        for(int ı=120;ı>10  ;ı--){
            if(ı%4==0 && ı%6==0){
                System.out.println(ı + "");
            }

        }





















    }
}
