package day22staticblocksconstructors;

/*
       Constructor nedir?
       Class'dan obje uretmemize yarayan kod blocklaridir.

       Class olusturdugumuzda Java bize otomatik olarak bir constructor verir.
       Ama bu constroctur gozle gorulmez,gozle gorulmeyen otomatik olarak java tarafindan verilen bu constrocturlara
       "default constructor" denir.

       "default constructor"  "Car( ){ }"bu sekilde olur.

       **Siz kendi constructor'inizi olusturdugunuzda Java default constructor'i siler

       Bir class da farkli parametreler kullanarak istediginiz kadar constructor olusturabilirsiniz.

       Farkli constructor'lar sayesinde bir class da farkli farkli objeler olusturabiliriz.

       Interwiev Sorusu:
       Method ile constructor'in farki var midir? Varsa nedir?
       Cevap: Method ile constructor farkli yapilardir.
              i)Methodlarda return type vardir.ama constructor'larda return type yoktur.
              ii)Methodlarin ismi yaptiklari ise gore developerlar tarafindan belirlenir.
                Constructor'larin ismi ise her zaman class ismi ile ayni olmalidir.



        */
public class Car {

    String make = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

    public Car(String make, String model, int year, boolean hybrid) {
        this.make = make;////this.make bu class daki make i benim yaptigim make yap demek
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }
    public Car(String make, String model){
        this.make = make;
        this.model = model;

        if(year==2023){
            this.year=0;
        }
        if(hybrid==true){
            this.hybrid=false;

        }
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
