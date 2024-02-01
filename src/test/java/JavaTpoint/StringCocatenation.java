package JavaTpoint;

import java.util.StringJoiner;

public class StringCocatenation {

    public static void main(String[] args)
    {
        //using + operator

        String s = "Sachin" + " " + "Tendulkar";
        System.out.println(s);

        //java compiler breaks this line as

        String s1 = (new StringBuilder()).append("Sachin").append(" ").append("Tendulkar").toString();
        System.out.println(s1);

        String s2 = 60+80+70+ "Rahul" + "Sharma" + 50 +50;
        System.out.println(s2); //prints 210Rahul5050 because after a string literal + operator
                                   // will be treated as concat operator

        //using concat method

        String S3 = "New String";
        String S4 = "Old String";

        System.out.println(S3.concat(S4));

        //using append method in String builder

        StringBuilder s5 = new StringBuilder("Hello");
        StringBuilder s6 = new StringBuilder("World");

        StringBuilder s7 = s5.append(" ").append(s6);
        System.out.println(s7);


        //using string joiner class

        StringJoiner a = new StringJoiner(" ");
        a.add("Rahul");
        a.add("Sharma");
        System.out.println(a);



    }
}
