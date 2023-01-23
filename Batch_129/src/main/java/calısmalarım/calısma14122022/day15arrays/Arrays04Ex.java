package calısmalarım.calısma14122022.day15arrays;

public class Arrays04Ex {
    public static void main(String[] args) {
        // Example 1: Bir Arrayin icinde herhangi bir elemanin olup olmadigini
        // kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz
        int a[]={0,3,5,7,3,5,6,7};
        int num =7;
        int counter = 0;

        for(int w:a){
            if(w==num){
                counter++;
            }
        }
        if(counter>0){
            System.out.println(num+ ",arrayde " +counter+ " defa var.");
        }else {
            System.out.println(num+ ",arrayde yok.");
        }




    }
}
