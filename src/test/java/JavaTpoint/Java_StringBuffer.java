package JavaTpoint;

public class Java_StringBuffer {
   //string buffer class is used to created mutable (Modifiable) string objects
   //string buffer is same as string class but only it creates mutable objects
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("My name is Rahul");
        //append method
        sb.append(" java");
        System.out.println(sb);

        //insert method
        sb.insert(1,"java");
        System.out.println(sb);



    }


}
