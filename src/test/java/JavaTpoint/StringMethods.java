package JavaTpoint;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args)
    {
        String s = "Rahul ";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());

        System.out.println(s.startsWith("Ra"));

        System.out.println(s.endsWith("l "));
        String[] n = s.split("\\.");
        System.out.println(Arrays.toString(n));

        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));

        //print length
        System.out.println(s.length());

        //replace text and string

        String st = "Java is a programming language.Java is a platform. Java is an Island";
        String replaceStr = st.replace("Java", "Kava");
        System.out.println(replaceStr);





    }
}
