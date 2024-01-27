package API_Test;

import PayLoadFiles.Pyaload1;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumValidation
{

    @Test

    public void sumOfCourses()
    {
        int sum = 0;
        JsonPath js = new JsonPath(Pyaload1.coursePrice());
        int count = js.getInt("courses.size()");

        for(int i = 0; i<count; i++)
        {
            int price = js.getInt("courses["+i+"].price");
            int copies = js.getInt("courses["+i+"].copies");

            int totalAmount = price * copies;
            System.out.println(totalAmount);
            sum = sum + totalAmount;
        }
        System.out.println(sum);

          int purchaseAmount =   js.getInt("dashboard.purchaseAmount");
        Assert.assertEquals(purchaseAmount , sum);
    }



}
