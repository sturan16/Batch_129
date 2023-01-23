package day28exceptions;

public class Exceptions04 {
    public static void main(String[] args) {
        String[] arr = {"A", "G", "M", "L"};
        getElementFromArray(arr,1);
        getElementFromArray(arr,5);
        System.out.println("Hiii");
    }

//Arraylerde olmayan bir index kullanildiginda Java ArrayIndexOutOfBoundsException atar.
    public static void getElementFromArray(String[] s, int idx) {
        try {
            String element = s[idx];
            System.out.println(element);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Arrayin index sayisindan fazla index numarasi hata verir... " + e.getMessage());
            System.out.println(e.getCause());
        }

    }
}
