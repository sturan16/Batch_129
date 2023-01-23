package calısmalarım.calisma16122022;

public class Loops {
    public static void main(String[] args) {
        Integer num=223878;
        String s =String.valueOf(num);
        String d="";
        for(Integer i=0;i<s.length();i++){
            String c =s.substring(i,i+1);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                d =d+c;
            }

        }System.out.println(d);


        Integer sayı = 2547418;
        String sayı1=String.valueOf(sayı);
        String bos="";
        for(int i=0;i<sayı1.length();i++){
            String e= sayı1.substring(i,i+1);
        if(sayı1.indexOf(e)==sayı1.lastIndexOf(e)){
                bos = bos +e;
            }


        }
        System.out.println(bos);



        Integer x =254125;
        String y =String.valueOf(x);
        String z="";

        for(int i=0;i<y.length();i++){
            String a = y.substring(i,i+1);
            if(y.indexOf(a)==y.lastIndexOf(a)){
                z=z+a;
            }
        }
        System.out.println(z);



        String m="1235122";
        String n ="";
        for(int i=0;i<m.length();i++){
            String o=m.substring(i,i+1);
            if(m.indexOf(o)==m.lastIndexOf(o)){
                n=n+o;
            }
        }
        System.out.println(n);

        String w="ahmet";
        String t="";
        for(int i=w.length()-1;i>=0;i--){
            t = t+ w.charAt(i);}
            if(w.equals(t)){
                System.out.println("Palindromdur");
            }else {
                System.out.println("degildir");
            }








    }
}
