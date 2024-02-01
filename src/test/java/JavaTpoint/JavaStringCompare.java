package JavaTpoint;

public class JavaStringCompare {

    public static void main(String[] args)
    {

        String s1 = "Rahul";
        String s2 = "RAHUL";
        String s3 = new String("RAHUL");
        String s4 = "Gaurav";

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));

        //using equalsIgnoreCase

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s2.equalsIgnoreCase(s3));
    }

}
