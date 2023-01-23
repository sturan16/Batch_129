package calısmalarım.ZeynepHocaSoruVizeFinal;

public class AynıİndexleriTopla {
    public static void main(String[] args) {
         /* Aşağıdaki mutli dimensional array'lerin iç array'lerinde
        aynı indexe sahip elamanların toplamını yazdıran bir program yazın.
        arr1[]={{1,2},{3,4,5}{6}}
        arr2[]={{7,8,9},{10,11},{12}}
        */

        int[][] arr1 = new int[][]{{1,2},{10,4,5},{6}};
        int[][] arr2 = new int[][]{{1,3,9},{5,11,5},{12}};
        int sum=0;

        for(int i=0;i<arr1.length;i++){
            for(int k=0;k<arr1[i].length;k++){
                if(arr1[i][k]==arr2[i][k]){
                    sum=arr1[i][k]+arr2[i][k];

                } System.out.println(i + "," + k + " index indeki elemanlarin toplami : " + sum);

            }


        }

    }
}
