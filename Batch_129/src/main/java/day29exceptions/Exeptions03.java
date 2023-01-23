package day29exceptions;

import java.io.FileInputStream;//io==> Input Output
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exeptions03 {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("src\\main\\java\\day29exceptions\\File01.txt");

            int k=0;

            while((k=fis.read())!=-1){
                System.out.print((char) k);

            }

        } catch (FileNotFoundException e) {
            System.out.println("Path is wrong or the file does not exist");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        System.out.println("Hi!");


    }
}
