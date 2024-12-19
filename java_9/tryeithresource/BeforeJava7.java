package java_9.tryeithresource;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BeforeJava7 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("resource.file");
        try {
            fos.write("nana".getBytes());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}