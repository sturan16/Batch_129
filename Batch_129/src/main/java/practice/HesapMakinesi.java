package practice;

public class HesapMakinesi {



    public void toplama(int... a){
        int toplam=0;

        for(int w:a){
            toplam+=w;
        }
        System.out.println(toplam);
    }

    public void cikarma(int... a){
        int fark=0;
        for(int w:a){
            fark-=w;
        }
        System.out.println(fark);
    }
    public void carpma(int... a){
        int carpma=1;
        for(int w:a){
            carpma*=w;
        }
        System.out.println("carpim : " + carpma);
    }
    public void bolme(int a,int b){

        if(b==0){
            System.out.println("Hıcir sayi sifira bolunemez");
        }else {
            System.out.println("Bolme : " +a/b);
        }

    }



}
