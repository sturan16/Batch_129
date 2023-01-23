package calısmalarım.Array;

public class Ex04 {
    public static void main(String[] args) {
//        İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız
        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        for(int i=0;i<arr.length;i++){
            String ilkKar = arr[i].substring(0,1);
            String sonKar = arr[i].substring(arr[i].length()-1);
            if(ilkKar.equals(sonKar)){
                System.out.println(arr[i]);
            }
        }





  }
}
