package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {
    public static void main(String[] args) {
        //Example 1:Verilen bir listteki elemanlari tekrarsiz olarak yazdiriniz
        //        [2,3,2,3,2,5]==>[2,3,5]

        List<Integer>myList=new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(5);
        //Yeni list olusturup  olanları asagıya eklemiyoruz

        List<Integer>newList=new ArrayList<>();

        for(Integer w:myList){
            if(!newList.contains(w)){//newlistte w ye gelen  karakterler yoksa new liste ekle diyoruz .

                newList.add(w);

            }
        }
        System.out.println(newList);

        //Example 2: Musteriden urun ismini aliniz sonra
        // musterinin ismini verdigi urun listede varsa urunun ismini yazdiriniz
        //musterinin ismini verdigi urun listede yoksa "out of stock"yazdiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Urun arama sistemimize hosgeldiniz...");
        System.out.println("Urun aramayi sonlandirmak icin Q'ya basiniz...");



        List<String>products=new ArrayList<>();
        products.add("TV");
        products.add("Radio");
        products.add("iPad");
        products.add("PC");
        products.add("Notebook");
        products.add("Headphone");
        products.add("Mobile Phone");

        do {
            System.out.println("Lutfen aradiginiz urunun  ismini giriniz");

            String p=input.nextLine();
            if(p.equalsIgnoreCase("Q")){
               break;
            }
            else if(products.contains(p)){
                System.out.println(p + " is in stock");
            }else {
                System.out.println(p + " is out of stocks");
            }


        }while (true);

        System.out.println("Sitemizi kullandiginiz icin tesekkur eder tekrar bekleriz....");

    }
}
