package day24accessmodifiersinheritance.Animal;

public class Animal1 {
    /*
    Inheritance'in faydalari
    1)code standardında tekrar iyi değildir.
    2)code değişime açık olmalıdır.hatayı düzeltmek kolay olmalı
    3)gelişime update'e açık olmalıdır
    4)code atomic yapıda olmalı.
    Note 1: Parent class(super class) (ortak ozellikleri icerir)-child class(sub class)(classa ozel ozellikleri icerir meaw gibi)
    Note 2: Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız.
    Note 3:"public" methodlar child classlar tarafindan kullanilabilir.
          "public" methodlar child classlar tarafindan kullanilabilir. demek "inherit edilebilir" demeketir.
    Note 4: "protected" methodlar inherit edilebilir.
           Cunku "protected" olan method ve variable lar child lar taraafindan kullanilir.
    Note 5:"Default" methodlar  obje ile ayni package de olduklari surece inherit edilebilirler.
            Ama default method ile objenin uretildigi class  farkli packagelerde ise inherit edilemezler.
    Note 6: "private" methodlar inherit edilemezler.
    Note 7: Java birden fazla parenti(multiple inheritance Java tarafindan desteklenmez) onaylamaz.
    Note 8: Child-->Parent-->Grand Parent-->Grand Grand Parent--> seklinde ilerleyen inheritance'lara Multi Level Inheritance denir
    Note 9: Java da "Object Class" tum java classlarinin ortak parent'idir.
    Note 10: Java da object class haric tum classlarin parenti vardir.
    Note 11: Java da "parent" dan "child"a olan iliskilere "HAS-A Relationship" denir.
             Java da "child" dan "parent"a olan iliskilere "IS-A Relationship" denir.
    Note 12: Java da her class'in bir tane default constructor'i vardir.
             Bu default constructor class'in icinde gorunmez cunku default constructor "object class" icindedir.
             Bizim class'imiz default constructor'a ihtiyac duydugunda parent olan "Object Class" a gider ve oradaki constructor'i kullanir.





     */

    protected void eat(){
        System.out.println("Animals eat..");
    }
    public void drink(){
        System.out.println("Animals drink..");
    }
}
