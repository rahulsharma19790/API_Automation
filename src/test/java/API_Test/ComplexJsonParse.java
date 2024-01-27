package API_Test;

import PayLoadFiles.Pyaload1;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse
{

    public static void main (String[] args)
    {

        JsonPath js = new JsonPath(Pyaload1.coursePrice());

        //Test case 1 print number of course return by api

        int count = js.getInt("courses.size()");
        System.out.println("Count of courses is " + count);

        //test case2 print purchase amount

        int totalAmount =js.getInt("dashboard.purchaseAmount");
        System.out.println("Total Amount  is " + totalAmount);

        //test case 3 print first course means on zero index

            String firstCourse = js.get("courses[0].title");
        System.out.println("First course is " + firstCourse);

        System.out.println("Last course is " + js.get("courses[2].title"));

        //test case 4 print all courses and prices for this we have to iterate using for loop

        for(int i =0; i<count; i++)
        {
          String courseTitles = js.get("courses["+i+"].title");   ; // need to have i as a variable, this is the syntax to decalare a varibvle
            // need to store it in a String

            System.out.println(courseTitles);

                 String prices =js.get("courses["+i+"].price").toString();
                System.out.println(prices);
        }

        //Test case 5 print the copies sold for RPA course

           String copies = js.get("courses[2].copies").toString();
           System.out.println("Total copies sold by RPA course is" + copies);



           //test case 6 print number of copies sold by RPA course dynamically , indexing may be changed
             for(int i =0; i<count;i++)
             {
                 String courseTitle1 = js.get("courses["+i+"].title");
                 if(courseTitle1.equalsIgnoreCase("RPA"))
                 {
                     System.out.println("Total copes sold by RPA is " +js.getInt("courses["+i+"].copies"));
                     break;
                 }

             }
    }






}
