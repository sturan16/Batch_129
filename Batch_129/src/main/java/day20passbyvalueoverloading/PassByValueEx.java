package day20passbyvalueoverloading;

public class PassByValueEx {
    public static void main(String[] args) {
        String name="java";
        System.out.println(ekleme("java", "hayat"));
        int kacAdetVAr = sayi13adet(12,13,52,13,85,51,13);
        System.out.println(kacAdetVAr);

    }
    public static String ekleme(String name, String add){
        name = name+add;
        return name;
    }
    public static int sayi13adet(int... sayi){
        int counter=0;
        for (Integer w:sayi){
            if(w==13){
                counter++;

            }
        }
        return counter;
    }
}
