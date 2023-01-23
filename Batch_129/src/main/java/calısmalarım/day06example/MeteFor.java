package calısmalarım.day06example;

public class MeteFor {
    public static void main(String[] args) {

        String ornek = "saimturan";
        String tersOrnek= "";

        for (int i = ornek.length()-1; i >=0 ; i--) {
            tersOrnek += ornek.charAt(i);

        }
        System.out.println(tersOrnek);

        }
    }

