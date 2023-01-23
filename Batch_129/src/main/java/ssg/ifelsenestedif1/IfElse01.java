package ssg.ifelsenestedif1;

public class IfElse01 {
    public static void main(String[] args) {
        //Gündüz dersimiz varsa katılabilirim.

        //Gece sınıfımız varsa ona da  katılabilirim.

        boolean dt =true;
        boolean nt=false;

        if(dt || nt){
            System.out.println("sinifa katilabilirsin");
        }else {
            System.out.println("sinifa katilamiyorum");
        }



    }
}
