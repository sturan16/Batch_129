package day29exceptions;

public class Exceptions01 {
    public static void main(String[] args) {

        Object obj=70;//object data tipi hepsi icin kullanilabilir.
        String str="";
        //Objecti stringe ceviriyorum.
        try {
             str=(String) obj;//Birbirine donusturulmeyecek data typlerini donusturmekte israr ederseniz Java ClassCastException atar.
        }catch (ClassCastException e){
            System.out.println("Her data type'i her data typeine cevrilmez");
        }

        System.out.println(str);


    }
}
