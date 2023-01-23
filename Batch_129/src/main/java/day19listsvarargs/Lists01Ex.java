package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01Ex {
    // //Example 1:Verilen bir listteki elemanlari tekrarsiz olarak yazdiriniz
    //        //        [2,3,2,3,2,5]==>[2,3,5]
    public static void main(String[] args) {
        List<Integer> myList=new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(5);

        List<Integer>yeniList=new ArrayList<>();
        for(Integer w:myList){
            if(!yeniList.contains(w)){
                yeniList.add(w);
            }
        }
        System.out.println(yeniList);


        //Example 2: Musteriden urun ismini aliniz sonra
        // musterinin ismini verdigi urun listede varsa urunun ismini yazdiriniz
        //musterinin ismini verdigi urun listede yoksa "out of stock"yazdiriniz.

        Scanner input =new Scanner(System.in);


        List<String>products=new ArrayList<>();
        products.add("TV");
        products.add("Radio");
        products.add("iPad");
        products.add("PC");
        products.add("Notebook");
        products.add("Headphone");
        products.add("Mobile Phone");
///1.Yolll
//        for(String w:products){
//            if(w.contains(urun)){
//                System.out.println(urun+  ":stoklarımızda var ");
//            }else if(!w.contains(urun)){
//                System.out.println(urun+ ": uzgunum urun stoklarizda yoktur.");
//            }else {
//                System.out.println("Yanlıs secim yaptiniz");
//            }
//        }

        //2.Yol
        do {
            System.out.println("lutfen urun ismi giriniz");
            String urun =input.nextLine().trim();

            if(urun.equalsIgnoreCase("Q")){
                break;
            }else if(products.contains(urun)){
                System.out.println(urun+" : stoklarimizda mevcuttur.");
            }else{
                System.out.println(urun+ ": stoklarimizda mevcut degildir.");
                break;
            }


        }while(true);




    }
}
