package practice.nighttime06;

public class Varargs03 {
    public static void main(String[] args) {

        //Kac tane string verilirse verilsin iclerinden en uzun olani veren kodu yaziniz.
        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Okan";
        String str4 = "Adnan";
        String str5 = "Sahsanem";

        enUzun(str1,str2,str3,str4,str5);


    }//main

    private static void enUzun(String... enuzunOlan) {
       String enUzunStr="";
        for(String w:enuzunOlan){
            if(w.length()>enUzunStr.length()){
                enUzunStr=w;
            }

        }
        System.out.println("enUZunStr : " +enUzunStr);
    }
}//class
