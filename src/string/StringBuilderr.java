package string;

public class StringBuilderr {


    public static void main(String[] args) {
        String test = "";
        StringBuilder sb = new StringBuilder();
        test = test + " test";
        sb.append("test");
        sb.append("test").append("test").append("test");
        sb.reverse();
        String s = sb.toString();
        System.out.println(s);

    }

}
