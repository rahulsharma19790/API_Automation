package API_Test;

import PayLoadFiles.Pyaload1;
import PayLoadFiles.ReusableMethod;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class FirstApiTest {


    public static void main(String[] args)
    {

        RestAssured.baseURI = "https://rahulshettyacademy.com";
       String response =  given().log().all().queryParam("key","qaclick123").header("content-type","application/json")
                .body(Pyaload1.payload()).when().post("maps/api/place/add/json")
                        .then().log().all().assertThat().statusCode(200)
                .body("scope",equalTo("APP"))
                .header("server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
                     //  .body("scope", equalTo("APP")).header("server","Apache/2.4.18 (Ubuntu)");

        System.out.println(response);

        JsonPath js = new JsonPath(response);
        String path1 =js.getString("place_id");

        System.out.println("The Place Id is " + path1);

        //using of put API
         String newAddress = "summer walk, USA";
        given().log().all().queryParam("key","qaclick123").header("content-type","application/json")
                .body("{\n" +
                        "    \"place_id\":\""+path1+"\",\n" +
                        "    \"address\": \""+newAddress+" \",\n" +
                        "     \"key\":\"qaclick123\"\n" +
                        "\n" +
                        "}").when().put("maps/api/place/update/json").then().assertThat()
                .log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));



         //using of get api
        String newResponse = given().log().all().queryParam("key","qaclick123").queryParam("place_id", path1)
                .when().get("maps/api/place/get/json")
                .then().assertThat().log().all().statusCode(200).extract().response().asString();

           //JsonPath js1 = new JsonPath(newResponse);
            JsonPath js1 =  ReusableMethod.rawDataToJson(newResponse);
           String updatedAddress = js1.getString("address");
           System.out.println("The updated address is " + updatedAddress);
        Assert.assertEquals(newAddress,updatedAddress);



    }


}
