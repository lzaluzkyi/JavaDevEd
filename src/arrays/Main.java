package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Integer[] a = new Integer[10];
        fillArray(a);
        printArray(a);
        Arrays.sort(a);
        printArray(a);
        List<Integer> integers = Arrays.asList(a);
        Integer[] copyOf = Arrays.copyOf(a, a.length);
        printArray(copyOf);
        Integer[] copyOfRange = Arrays.copyOfRange(a, 5, 8);
        printArray(a);
        printArray(copyOfRange);
        boolean deepEquals = Arrays.deepEquals(a, copyOf);
        System.out.println(deepEquals);
        System.out.println(a.equals(copyOf));
        System.out.println(a.equals(a));
        int deepHashCode = Arrays.deepHashCode(a);
        System.out.println(deepHashCode);
        String deepToString = Arrays.deepToString(a);
        System.out.println(deepToString);
        Arrays.fill(a , 5);
        printArray(a);
        fillArray(a);
        a[9] = 1;
        a[8] = 1;
        Arrays.sort(a);
        printArray(a);
        int i = Arrays.binarySearch(a, 1);
//      [1][2][4][5][6][7]
        System.out.println(i);
    }

    public static void fillArray(Integer[] integers){
        Random random = new Random();
        for (int i = 0; i < integers.length; i++) {
            integers[i] = random.nextInt(20);
        }
    }

    public static void printArray(Integer[] integers){
        for (int i = 0; i < integers.length; i++) {
            System.out.print("{"+ integers[i] + "} ");
        }
        System.out.println();
    }


}
