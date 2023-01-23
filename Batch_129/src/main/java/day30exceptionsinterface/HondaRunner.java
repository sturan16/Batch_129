package day30exceptionsinterface;

public class HondaRunner {
    public static void main(String[] args) {
        Civic myCivic=new Civic();
        myCivic.cool();

        System.out.println(AC.price);
        System.out.println(Engine.price);
        System.out.println(Security.price);//static oldugu icin direkt interface ismiyle cagirdik.
        System.out.println(AC.model);
        //AC.price =7000; final variable a deger atayamazsin.

        Accord myAccord=new Accord();
        myAccord.cool();
    }
}
