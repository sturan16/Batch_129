package advanced_practice.practice11;

import java.io.*;

public class TextOkumaEx {

    public static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader("C:/Users/hilal/Desktop/HelloWorld.txt");
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String satir= bufferedReader.readLine();
        String yeniDosya="";


       while (satir!=null){

           yeniDosya+=satir+"==>kelime sayisi : " + satir.split(" ").length+ "\n";
           satir=bufferedReader.readLine();

       }
        System.out.println(yeniDosya);
       bufferedReader.close();

        FileWriter fileWriter=new FileWriter("C:/Users/hilal/Desktop/saim2.txt");
        fileWriter.write(yeniDosya);
        fileWriter.close();


    }
}
