package day27encapsulationabstraction;

public abstract class Courses {
    /*
       1)Bazen method body'sini yazmak gerkmez bu durumlarda body'siz method olustumak gerekir.
         Body'si olmayan mmethod'lara "abstract methodlar" denir.

       2)Abstract methodlar child classlar tarafindan "Override" edilmek zorundadirlar.
         Bu yuzden eger bir fonksiyonun child class'lar tarafindan kullanilmasini mecbur kilmak isterseniz
         o methodu abstract yapmak gerekir.

       3)Bir methodun body'sini silmek o methodun abstract olmasi icin yeterli degildir.
         "Access modifier" ile  "return type" arasina "abstract keyword" koymak gerekir.

       4)Abstract methodlar siradan class'larin(concrete) icine yazilamazlar, Abstract methodlar larin icine yazildigi class'larda
       abstract olmak zorundadir.

       5)Abstract class'larda hem abstract methodlar hemde concrete methodlar kullanilabilir.

       6)Concrete classlar abstract class'larin childi olabilirler (SixthGrades Courses)
       abstract method" larin override edilme zorunlulugu concrete classlar icindir

     */

    public  abstract void math();

    public void art(){
        System.out.println("Painting...");
    }//kullansa da olur kullanmasada


    //final methodlar "override"edlemezler, halbuki abstract methodlar override edilmek icin olusturulur.
    //Bu celiskilidir,bu yuzden Java abstract method'larin final olmasina musade etmez..
    //public final abstract void science();


    //Concrete class lar final oldugunda Child class'a sahip olamazlar.
    //Ama "Abstract class"lar icin child class olmalidir,cunku child Class'lar abstract parent class daki abstract methodlari kullanirlar.
    //Bu yuzden Java Abstract Class'larin final olmasina musade etmez.

    //"Abstract methodlar" private olamazlar, cunku Child Class'lar abstract methodlari kullanirlar,private yapinca kullanima kapali olur.
    //Bu celiskidir.Bu yuzden Java abstract methodlarin "private" olmasina musade etmez.

    //"abstract methodlar" static olmazlar, cunku static methodlar override edilemez, halbuki abstract methodlar override edilmek icin olusturulmustur.

    //Abstract classlardan obje olusturulmaz.



}
