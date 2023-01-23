package calısmalarım.calisma16122022;

public class Loops276 {
    public static void main(String[] args) {
        String a ="12345554466678";
        String b="";
        for(int i=0;i<a.length();i++){
            String c = a.substring(i,i+1);
            if(a.indexOf(c)==a.lastIndexOf(c)){
                b= b+c;
            }
        }






    }
}
