package PayLoadFiles;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DynamicJson {


    @Test(dataProvider = "booksData")
    public void addBook(String isbn, String aisle)
    {

        RestAssured.baseURI = "http://216.10.245.166";
       String response = given().log().all().header("Content-type","application/json")
               .body(Pyaload1.newPayload(isbn,aisle))
                .when().post("Library/Addbook.php").then().log().all().
                   assertThat().statusCode(200).extract().
                    response().asString();

                  JsonPath js = ReusableMethod.rawDataToJson(response);
                  String id = js.get("ID");
                 System.out.println(id);
    }

    //use of dataprovider, so first need to create a object of multidimentionarray
    //and return it need to paas this in above method

    @DataProvider(name = "booksData")
    public Object[][] provideData()
    {
        return new Object[][]{{"new1","1234"},{"new2","3456"},{"new3","9876"}};


    }
    @Test
    public void deleteBook()
    {



    }


}
