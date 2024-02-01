package JavaTpoint;

import java.util.Arrays;

public class JavaSubString {

    public static void main(String[] args)
    {
        //we have two method in substring

        String s = "Welcome";
        System.out.println(s.substring(4));

        String s1 = "Rahul Sharma";
        System.out.println("Original String is" + s1);
        System.out.println("String starts from index 5" + s1.substring(5));
        System.out.println("String starts from index 5 and ends with 7" + s1.substring(5,7));


        //using split method

        String a = "Hello, My Name is Rahul";
        String[] sent = a.split("\\.");
        System.out.println(Arrays.toString(sent));

        String day = "Monday";
        switch (day){

            case "sunday":
                System.out.println("Today is sunday");
               break;
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
        }

    }




}
