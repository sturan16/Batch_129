package calısmalarım.calısma15122022;

public class StringManipulations {
    public static void main(String[] args) {
String ad =" Tom nsan  ";

boolean son = ad.trim().replaceAll("[\\S]","").length()>0;
        System.out.println(son);

        String isim="   nalsma ";
        System.out.println(isim = isim.trim());
        boolean sonuc = isim.equals(isim);
        System.out.println(!sonuc);


        String a ="ali.";
        char ilkKar = a.charAt(0);
        char sonKar =a.charAt(a.length()-1);

        boolean ilkKarBuyukMu = ilkKar>='A' && ilkKar<='Z';
        boolean sonKarNoktaMı= sonKar=='.';

        boolean result = ilkKarBuyukMu && sonKarNoktaMı ;
        System.out.println(result);


        String sifre ="!1abm es";
        boolean bosHarSekizKar = sifre.replaceAll(" ","").length()>7;
        boolean enAzBirSembolVarMı= sifre.replaceAll("[A-Za-z0-9]","").replaceAll("\\s","").length()>0;
        boolean result1= bosHarSekizKar && enAzBirSembolVarMı;
        System.out.println(result1);

        String s ="Java";
        boolean sonuc1= s.contains("av");
        System.out.println(sonuc1);

        String isim1 ="Saim Turan";
        String basHarf =isim1.substring(0,1);
        String soyIsımIlkHarf = isim1.split(" ")[1].substring(0,1);
        System.out.println(basHarf +soyIsımIlkHarf);

        String ad1 = "Hilal Turan";
        String ilkHarf = ad1.substring(0,1);
        String soyadİlkHrf = ad1.split(" ")[1].substring(0,1);
        System.out.println(ilkHarf + soyadİlkHrf);

        String f = "Vay be! Ali 13 yaşında ama universite ogrencisi.";
        int toplamKark=f.length();

        int harfVeRkmHArici= f.replaceAll("\\p{Punct}","").length();
        System.out.println("sonuc = "+ (toplamKark-harfVeRkmHArici));


        String password = "a1b2c3d4";

        if(password.replaceAll("[\\S]","").length()>0){
                System.out.println("Sifrede bosluk kullanma");

        }else if(password.replaceAll("[\\s]","").length()>7){
                System.out.println("GEcerli sifre");
        }else {
                System.out.println("GEcersiz sifre");
        }

        int ayNo=3;

        if(ayNo==1){
                System.out.println("Ocak");
        }else if(ayNo==2){
                System.out.println("Subat");
        }else if(ayNo==3) {
                System.out.println("Mart");
        }

        int i=124;
        if(i%10>=5){
                System.out.println("son basmagı bir üste yuvarla= "+ (i/10+1)*10);
        }else {
                System.out.println("bir alta yuvarla = "+ (i/10)*10);
        }

          /*  int x = 5;
            int y = 6;
            int z = 7;
        if(x==y && y==z && x==z){
                System.out.println("Eskenar ucgen");
        }else if(x==y || y==z || x==z ){
                System.out.println("Ikizkenar ucgen");
        }else {
                System.out.println("Cesitkenar");
        }*/

        String r="a1b2c3ss";

        String gecerliMi=r.replaceAll("[\\s]","").length()>7 ? "GEcerli":"GEcersiz";
            System.out.println(gecerliMi);

            int x = 5;
            int y = 6;
            int z = 7;

            String dogruMu= x==y && y==z && x==z ? "Eskenar ucgen":(x==y || y==z || x==z)? "Ikızkenar":"CEseitkenar";
            System.out.println(dogruMu);









    }
}
