package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        FileInputStream ne;
        try {
            ne  = new FileInputStream("ne");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NullPointerException e) {
            throw new IllegalArgumentException(e);
        }finally {

        }

        try {
            throw new NullPointerException();
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        } finally {
            System.out.println("Start");
            if (true) {
                throw new IllegalArgumentException();
            }
            System.out.println("Test");
        }

    }
}
