package java_9.tryeithresource;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AfterJava7 {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("resource.file")){
            fileOutputStream.write("do this work".getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
