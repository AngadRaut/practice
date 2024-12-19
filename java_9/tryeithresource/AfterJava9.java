package java_9.tryeithresource;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class AfterJava9 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("file.file");
        try(fileOutputStream){
            fileOutputStream.write("after java 9".getBytes());
            System.out.println(fileOutputStream.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
