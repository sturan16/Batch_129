package day27encapsulationabstraction;

public class Student {
    /*
    Biz bazen bir Class'in icindeki datalari saklamak isteriz. Mesela ogrencinin Student id'yi herkes bilmemeli degil mi?
Arkadaslar kapsul seklinde ilaclar vardir. Bu kapsullere toz ilac koyarlar.
Napmis oluyorlar ilaci o kapsulun icinde saklamis oluyoruz. Bu kapsulu Class gibi dusunun,
icindeki toz ilaci da variable olarak dusunun. Ben bu sekilde bir ilac uretirsem ilaci kapsulun icinde saklamis olurum.
Bu ise kapsulleme ingilizce ENCAPSULATION denir. Benim ilk aldigim offerda aldigim soru buydu.
What is encapsulation could you please tell me? dedi. Ben de dedim ki "Data Hiding" dedim. Sorarlarsa boyle diyin
offer alirsiniz :)) dedi.
    "private" access yaparak encapsulation yapmis oluruz. Ilanin disindayken ilaci goremeyiz. Kapsulun icinden goruruz.
Ayni mantikla Class'in icinde olursak "private" datayi goruruz. Ayni bu kapsulde oldugu gibi.
Simdi size dicekler ki encapsulation nedir. Data Hiding. Data nasil saklanir. Access Modifier private yapariz. diyeceksiniz, dedi.
    */

   private  String stdId="AC123";
   private double gpa=3.99;//gpa mezuniyet ortalamasş
   private boolean poor=true;//fakir

   //Encapsulation yapilmis datayi okuyabilir miyiz?
   //get methodlar(getter) encapsule edilmis(saklanmis) datayi okumamiza yarar.
   //get methodlar(getter) her zaman "public" olur.
   //get methodlar(getter) return type'i variable'in data type'i ile ayni olur.
   //get methodlar(getter) isimleri get+ variable name seklinde olur.
   //get methodlar(getter) isimleri variable  boolean ise is + variable name seklinde olur.
   //get methodlar(getter) herhangi bir parametre kullanmazlar.



   public  double getGpa() {
      return gpa;
   }

   public boolean isPoor() {
      return poor;
   }

   public String getStdId() {
      return stdId;
   }

//Encapsulation yapilmis data'larin degeri degistirilebilir mi?
   //set methodlar (setter) encapsule edilmis datalarin degerlerini degistirmemize yarar.
   //set methodlar (setter) her zaman public olur.
   //set methodlar (setter) return type'i her zaman void olur
   //set methodlar (setter)  isimleri set+ variable name seklinde olur.
   //set methodlar (setter) variable ile ayni data type'inde parametre kullanirlar.

   //getter ve setter'larin ikisine birden "Java Beans" denir.

   //Encapsulation faydalarindan biri de tek bir obje olusturup set methodu ile istedigimiz objeye cevirebiliriz

   public void setGpa(double gpa) {
      this.gpa = gpa;
   }

   public void setPoor(boolean poor) {
      this.poor = poor;
   }

   public void setStdId(String stdId) {
      this.stdId = stdId;
   }
}

