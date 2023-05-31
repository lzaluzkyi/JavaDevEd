package string;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String s = new String("TEst");//created new string in string pool
        String s1 = s;
        String s2 = "test";//created new string in string pool

        System.out.println(s == s2);
        System.out.println(s.equals(s1));

        s = s + "test1"; //created new string in string pool
        s = "test2";//created new string in string pool
        s = "test3";//created new string in string pool
        s = "test4";//created new string in string pool
        s = "test4" + s + s1;//created new string in string pool
        System.out.println(s);
        System.out.println(s1);
        System.out.println("============================");

        System.out.println(s1.toLowerCase(Locale.ROOT));
        System.out.println(s1.toUpperCase(Locale.ROOT));
        System.out.println(s1.length());
        System.out.println(s1.getBytes(StandardCharsets.UTF_8));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.charAt(1));
        System.out.println(s.compareTo(s1));
        System.out.println(s1.concat("123"));
        System.out.println(s1.contains("st"));//true
        System.out.println(s1.contains("st1"));//false
        System.out.println(s1.contains("St"));//false
        System.out.println(s1.endsWith("st"));//true
        System.out.println(s1.endsWith("TEst"));//true
        System.out.println(s1.endsWith("es"));//false
        System.out.println(s1.startsWith("te"));//false
        System.out.println(s1.startsWith("TES"));//false
        System.out.println(s1.startsWith("TE"));//true
        System.out.println(s1.indexOf('E'));//1
        System.out.println(s1.indexOf("st"));//2
        System.out.println(s1.indexOf("E" , 3));//-1
        System.out.println(s1.intern());
        System.out.println(s1.isEmpty());
        s = s.replace("te", "123");
        System.out.println(s);
        System.out.println(s.replaceFirst("test" , ""));
        System.out.println(s.replaceAll("test" , ""));
        String[] split = s1.split("E");// tEst tEst -> [0]t[1]st t[3]st
        for (String s3 : split) {
            System.out.println(s3);
        }
        String[] split1 = s1.split("E" , 2);// tEst tEst -> [0]t [1]st tEst
        for (String s3 : split1) {
            System.out.println(s3);
        }
        String substring = s1.substring(0, 2);
        System.out.println(substring);
        char[] chars = s1.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }
        String s3 = s1.toString();
        System.out.println(s3);

        int i = s1.codePointAt(0);
        System.out.println(i);
        System.out.println((int)'T');
        int a = s1.codePointBefore(1);
        System.out.println(a);
    }
}
