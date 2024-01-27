package PayLoadFiles;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DynamicJson {


    @Test
    public void addBook()
    {

        RestAssured.baseURI = "http://216.10.245.166";
       String response = given().log().all().header("Content-type","application/json").body(Pyaload1.newPayload())
                .when().post("Library/Addbook.php").then().log().all().
                   assertThat().statusCode(200).extract().
                    response().asString();

                  JsonPath js = ReusableMethod.rawDataToJson(response);
                  String id = js.get("ID");
                 System.out.println(id);
    }


}
