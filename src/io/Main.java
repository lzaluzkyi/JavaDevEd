package io;

import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Reader reader;
        InputStreamReader inputStreamReader;
        OutputStreamWriter outputStreamWriter;
        System.out.println("Try to read text.txt");
        try (Writer writer = new FileWriter("text.txt")) {
            writer.write("String 1\n");
            writer.write("String 2\n");
            writer.write("String 3\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("text.txt");
        reader = new FileReader("text.txt");
        int i = 0;
        while (i != -1) {
            i = reader.read();
            if (i != -1)
                System.out.print((char) i);
        }
        reader = new FileReader("text.txt");
        char[] chars = new char[100];
        reader.read(chars);
        for (int i1 = 0; i1 < chars.length; i1++) {
            char aChar = chars[i1];
            if (aChar != 0) {
                System.out.print(aChar);
            }
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text2.txt"));
        bufferedWriter.write("string 1");
        bufferedWriter.newLine();
        bufferedWriter.write("string 2");
        bufferedWriter.newLine();
        bufferedWriter.write("string 3");
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("text2.txt"));
        while (bufferedReader.ready()){
            System.out.println(bufferedReader.readLine());
        }

        outputStreamWriter = new OutputStreamWriter(new FileOutputStream("text3.txt"));
        outputStreamWriter.write("String 123\n");
        outputStreamWriter.write("String 123\n");
        outputStreamWriter.write("String 123\n");
        outputStreamWriter.flush();

        inputStreamReader = new InputStreamReader(new FileInputStream("text3.txt"));
        while (inputStreamReader.ready()){
            int read = inputStreamReader.read();
            System.out.print((char) read);
        }
        inputStreamReader = new InputStreamReader(new FileInputStream("images.jpg"));
        outputStreamWriter = new OutputStreamWriter(new FileOutputStream("images2.jpg"));
        while (inputStreamReader.ready()){
            outputStreamWriter.write(inputStreamReader.read());
        }
        outputStreamWriter.flush();

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person"));
        objectOutputStream.writeObject(new Person("Name" , 123));
        objectOutputStream.flush();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person"));
        Person o = (Person)objectInputStream.readObject();
        System.out.println(o.toString());
    }

}
