package calısmalarım.yenicalısma;

public class Ex02 {
    public static void main(String[] args) {

//        Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.
       String a ="kjasöaaöaödndmsjsöçds";


//       for(int i=0;i<a.length();i++){
//           String b=a.substring(i,i+1);
//           if(b.equals("m")){
//               break;           }
//
//           System.out.print(b);
//
//       }

       String c ="jksadköasdms";
       for(int i=c.length()-1;i>=0;i--){
           String d=c.substring(i,i+1);

           if(d.equals("a")){
               break;

           }System.out.print(d);

       }




        }


    }

