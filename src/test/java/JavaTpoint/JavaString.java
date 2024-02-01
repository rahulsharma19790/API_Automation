package JavaTpoint;

public class JavaString {

    public static void main(String[] args)
    {

        String s = "Rahul";
        s.concat("Sharma"); //it prints only Rahul, because string is an immutable type class//means its
        //value can noit be changed and if we write it as s = s.concat() then it can append the string

        String k = s.concat(" Sharma");
        System.out.println(k); //it will print Rahul Sharma because we
                             // have assigned a variable, and if we write
                             // s = s.cocat("Sharma), it will write the same

    }




}
