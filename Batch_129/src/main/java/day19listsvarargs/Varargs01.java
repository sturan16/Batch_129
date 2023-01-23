package day19listsvarargs;

public class Varargs01 {
    /*
    Varargs'lar method olustururken "parametre" sayisinda bize esneklik saglar
    Method'un parantezleri icine yazilanlara "parametre" denir
    Method'u cagirirken kullanilan sayilara da "argument" denir.

    Note 1: bir methodda birden fazla varargs parametre kullanilamaz cunku ikincisi "Unreachable Code"olur.
    Note 2: Varargs,Varargs disindaki parametrelerle kullanilabilir ama "Varargs" her zaman son parametre olmalidir.
     */

    public static void main(String[] args) {
        addTwoNumbers(3,5);

        addThreeNumbers(3,5,4);

        add(4,5,6,7,8,9,12);
    }


    public static void add(int...a){

        int sum=0;

        for(int w:a){

            sum=sum+w;
        }
        System.out.println(sum);
    }
    //Ikı sayiyi toplayan method olusturunuz
    public static void addTwoNumbers(int a,int b){
        System.out.println(a+b);
    }
    //Uc sayiyi toplayan method olusturunuz
    public static  void addThreeNumbers(int a,int b,int c){
        System.out.println(a+b+c);
    }

    //Istediginiz sayida sayiyi toplamak icin bir method olusturnuz
}
