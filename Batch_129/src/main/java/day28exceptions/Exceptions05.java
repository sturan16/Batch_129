package day28exceptions;

public class Exceptions05 {
    public static void main(String[] args) {
        int a =4;
        int b = 8;
        String s = "My Java";
        getCharFromString(s,a,b);
    }

    //Try kisminda birden fazla Exception olusturma ihitimali olan kod varsa coklu catch kullanabilirsiniz.
    //Coklu catch kullandiginizda exception classlar arasinda parent child iliskisi yoksa , catchlerin sirasi onemli degildir.
    //Ama koddaki siralamaya uymak tavsiye edilir.
    //Coklu catch kullandiginizda exception classlar arasinda parent child iliskisi varsa,catchlerin sirasi onemlidir.
    //Child olan class ustte olmalidir.


    //Exception Class'lar arasinda "parent - child" iliskisi varsa, ya child class'i uste yazarak child ve parent class'lar
    //icin ozellestirilmis code'lar yazarsiniz.(Hirsiz icin 155, hasta icin 112 gibi)
    //Veya child'i hic kullanmaz sadece parent ile exception'lari handle etmeye calisirsiniz.(Hirsiz icin 911, hasta icin 911 gibi)
    public static void getCharFromString(String s, int a, int b) {
        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        }catch (ArithmeticException e){
            System.out.println("Do not divide by zero");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullandiniz");
        }

    }
}
