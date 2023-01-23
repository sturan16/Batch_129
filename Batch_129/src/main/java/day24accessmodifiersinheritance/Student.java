package day24accessmodifiersinheritance;

public class Student {

    public String name = "Tom Hanks";//name herkes tarafindan bilinebilir o yuzden public yaptim.
    String stdId = "TH2023HU12001";//stdId okul yonetimindeki insanlar tarafindan bilinebilir o yuzden defaulrt yaptim.default yapildi accessmodifieri
    protected int accountNum = 76512345;//account number ben esim ve cocuklarim tarafindan bilinebilir,o yuzden protected yaptim.
    private int balance = 123000;//hesabimdaki para miktari sadece benim tarafimdan bilinmelidir,bu yuzden "private" yaptim.
// myStd.stdId      //default olan variable'lar ayni "Package" adindan ulasilabilir oldugundan bu class da gorulebilir
// myStd.accountNumber // ayni package ile bir grup ve cocuklari tarafindan gorulebilir oldugu icin gorulur
// "balance" Private oldugundan baska class da gorulemez .Student classin icindeki balance variable a bu class dan ulasamayiz.

    /*
           1)Access modifierlar genis'den dara; public>protected>default>private
           2)Class lar protected ve private olmazlar , sadece public ve default olabilirler.
           3)Access Modifier :Variable lara, class lara,  method lara ulasmayi duzenler
           4)Kac tane access modifier var ?

            public > protected > default > private
            i)publicler icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
            ii)protected ayni packagein icinden ya da farkli packagelarda o packagedeki cocuklar ulasabilir.
            iii)default sadece ayni packageden ulasilabilir. Bu yuzden defaultlarin diger adi package private'dir
            iv)"private"  sadece class icinden ulasilir,class disina cikildiginda ulasilamaz
             v)protected ile defaultun farki nedir ?
              Package disina ciktigimizda childlardan protectedlara ulasabiliriz. Defaultlarda ulasamayiz.
     */









}
