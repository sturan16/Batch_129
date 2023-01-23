package day16multidimensionalarrays;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        //Multidimensional Array nasil olusturulur?
        int a[][] = new int[3][2];


        //MultiDimensional Array'ler nasil yazdirilir?
        System.out.println(Arrays.toString(a));//[[I@2f4d3709, [I@4e50df2e, [I@1d81eb93]bu bize sadece adreslerini verir.
        System.out.println(Arrays.deepToString(a));//Bu bize outputu verdi[[0, 0], [0, 0], [0, 0]]

        //MultiDimensional Array'lere eleman nasil eklenir.
        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        a[2][1]=0;
        System.out.println(Arrays.deepToString(a));//[[5, 12], [81, 45], [123, 0]]


        //Note:Arraylere non-primitive data konulamaz.
        //     Arraylere primitive data veya referance konulur.
        //     Ama siz bir arrayi yazdirmak istediginizde JAva adres'ler yardimi ile non primitive dataya ulasir
        //     ve o non-primitive datayi sanki arrayin icindeymis gibi gösterir.
        String b[] = {"Tom","Hanks","Tom Hanks"};//bunlarin adresini gösterir aslinda


        //MultiDimensional Array'lerdeki belli elemanlara nasil ulasilir.
        System.out.println(Arrays.toString(a[2]));//[123, 0]
        System.out.println(a[1][0]);//81 sadece 81'i yazdirmak icin
        System.out.println(Arrays.toString(a[0]));//[5,12]
        System.out.println(a[2][1]);//0


    }
}
