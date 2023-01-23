package day25inheritance;

public class Vehicle {
    /*
    1)Child Classdan bir object olusturdugunuzda constructorlar en ustteki
    parent classdan baslatilarak alta dogru calistirilir.
    super(); ne ise yarar ?
    Note: "super ();" parent'teki constractor'i calistirmaya yarar.
    2)Child Class'da ki constructor'dan Parent Class'da ki constructor'a gidebilmek icin "super()" kullanilir.
    3)Parent Class'da birden fazla constructor varsa istenilen constructor,super() ifadesinin icine yazilan
    parametreler yardimi ile secilebilir.
    4)Ayni class icindeki constructor'lari secmek icin "this()" kullanilir.
      Ayni Class'da birden fazla constructor varsa istenilen constructor,"this()" ifadesinin icine yazilan
      parametreler yardimi ile secilebilir.
      5)"super()" ifadesini yazmak istege baglidir, yazmasaniz da Java sanki "super()" varmis gibi davranir.
   Ama kodunuzu daha okunur kilmak icin yazmaniz tavsiye edilir.
    6)"super()" ve "this()" ifadeleri constructor icerisinde her zaman ilk satirda olmalidir.
    7)Bir constructor icinde "super()" ve "this()" ifadeleri sadece bir kere kullanilabilir.Bakiniz 6.kural
    8)Inheritance da variable'lari  ve methodlari cagirmak icin "this" veya "super" kullanilir.parantezsiz
     "this" ayni class icindeki variable'lari  ve methodlari cagirmak icin kullanilir.
     "super" parent class icindeki variable'lari  ve methodlari cagirmak icin kullanilir.
     9)  Method cagirirken constructora bakilir.
     Methodu'i ararken belirtilen constructordan aramaya baslayip bulanana kadar super'a dogru gideriz.
     10) Variable cagirirken data type'a bakilir.
     Variable'i ararken data typedaki classtan aramaya baslayip bulanana kadar super'a dogru gideriz.
     11 )Inheritance da object kullanarak variable cagirirsaniz objenin data typeini temsil eden classdan variable i aramaya baslayiniz,
     O class da yoksa parentlera bakiniz
     12) Inheritance da object kullanarak method cagirirsaniz objectin constructor'ini temsil eden class dan methodu aramaya baslayiniz,
     O class da yoksa parentlera bakiniz


     OOP Principals:
     i)Inheritance
     ii)Polymorphism: MEthod Overloading + Method Overriding
     iii)Encopsulation
     iv)Abstraction


     */
    public int price = 12000;
    public void engine(){
        System.out.println("Vehicle engine");
    }

    public Vehicle(){

        System.out.println("Vehicle 1");
    }
    public Vehicle(int price){

        System.out.println("Vehicle 2:" +price);
    }
}

