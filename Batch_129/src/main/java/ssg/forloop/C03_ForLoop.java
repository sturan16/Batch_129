package ssg.forloop;

public class C03_ForLoop {
    //soru 3) 100'e(dahil) kadar olan tek ve cift sayıları iki ayrı dongu ile yazdırın.
    public static void main(String[] args) {
        for (int i = 0; i <=100 ; i++) {
            if(i%2==1){
                System.out.print(i+", ");
            }
            System.out.println(" ");

        }for(int i=0;i<=100;i++){
            if(i%2==0){
                System.out.print(i+",");

    }

        }
    }
}
