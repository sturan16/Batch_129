package calısmalarım.calısma12122022.day09incrementdecrementternaryswitch;

public class IncrementDecrement01 {
    public static void main(String[] args) {
        int a =5;
        System.out.println(a);//5

        //Increment 1:
        a = a + 2;// veya a +=2
        System.out.println(a);//7

        //Example1: Bir tane int variable ıolsuturun ve onu 2sekilde 5 artrın
        int b =10;
        System.out.println(b);//10

        b=b+5;
        System.out.println(b);

        b += 5;
        System.out.println(b);

        //Decrement
        int c =8;
        System.out.println(c);//8

        c = c-3;
        System.out.println(c);//5

        c-=3;
        System.out.println(c);//2

        //Increment 2:
        int d =6;
        System.out.println(d);//6
        d =d*2;
        System.out.println(d);//12
        d *= 2;
        System.out.println(d);//24

        //Decrement 2:
        int e =24;
        System.out.println(e);//24
        e = e/2;
        System.out.println(e);//12
        e /=2;
        System.out.println(e);//6

        //"1" ile increment ve decrement
        int f= 12;
        f =f+1;
        f +=1;
        f++;

        //1 ile decrement
         int h =10;
         h =h-1;
         h -=1;
         h--;

         //"post increment" ve "pre increment" pre:önce demek
                                               //post:sonra demek

        int i =10;

        int k = i++;//post increment cunku incremenet variable (i) isminden sonra yazıldı
        System.out.println(k);//10==> "i"arttırılmadan "k"ya konuldugu icin "k"nın degeri 10 olur
        System.out.println(i);//11==> "i"satır sonunda arttırıldıgı icin  "i"nin 11 olur

        int m = 15;//pre increment cunku incremenet variable (m) isminden önce yazıldı
        int n = ++m;
        System.out.println(m);//16==> "m"satır sonunda arttırıldıgı icin  "m"nin 16 olur
        System.out.println(n);//16==> "m"artirildikten sonra "n"ye konuldugu icin "n"nin degeri 16 olur.

        //"post increment" ve "pre increment"
        int p = 17;

        int r= p--;
        System.out.println(p);//16
        System.out.println(r);//17

        int s = 20;

        int t =--s;
        System.out.println(s);//19
        System.out.println(t);//19

    }
}
