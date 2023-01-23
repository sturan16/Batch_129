package day16multidimensionalarrays;

public class Md03 {
    public static void main(String[] args) {
        //Example 1:Bir  integer multidimensional array olsuturunuz
        //          tum sayilarin toplamini konsola yazdiriniz
        int a[][]={{2,62,82},{3,13}};
        int sum =0;
        for(int [] w :a){//a daki ilk arrayi alip w icine koydu
            for(int k :w){//w [2,62,82] oldu ve aldıgı ilk elemanı k ya koydu
                sum =sum+k;
            }

        }
        System.out.println(sum);//162




    }
}
