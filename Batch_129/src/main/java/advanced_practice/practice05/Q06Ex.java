package advanced_practice.practice05;

public class Q06Ex {
    // Bir Array'in simetrik olup olmadığını kontrol eden bir method oluşturunuz.
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1};

        System.out.println(simetrikMi(arr));
    }
    public static boolean simetrikMi(int arr[]){
        boolean simetrikMi=false;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==arr[arr.length-1-i]){
                simetrikMi=true;
            }else {
                simetrikMi=false;
                break;
            }

        }



        return simetrikMi;
    }
}
