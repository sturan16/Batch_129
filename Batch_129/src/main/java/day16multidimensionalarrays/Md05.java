package day16multidimensionalarrays;

public class Md05 {
    public static void main(String[] args) {

        //Example 1:bir int multidimansional array olusturunuz
        //         Bu arraydeki tum elemanlarin carpimini console yazdıran kodu yazniz

        int a[][]={{2,5},{4,7,11}};

        int carpim = 1;

        for(int [] w:a){
            for(int k :w ){
                carpim=k*carpim;
            }

        }
        System.out.println(carpim);
    }
}
