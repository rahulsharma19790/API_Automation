package OAuthTest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class B4SAuthTest {

   @Test
    public void B4SAuth()
   {
       RestAssured.baseURI = "https://stagingapi.buddy4study.com:8444";
      String B4sResponse =  given().header("Authorization","Basic YjRzOkIkUyEj").formParam("username","33@yopmail.com").formParam("password","123456")
               .formParam("grant_type","password").formParam("validateRules","true")
               .formParam("countryCode","+91").when().log().all().post("/api/v1.0/uaa/oauth/token")
               .then().log().all().assertThat().statusCode(200).extract().response().asString();

      System.out.println("logged in successfully" + B4sResponse);
       JsonPath js = new JsonPath(B4sResponse);
       String accessToken = js.getString("access_token");
       int userId = js.getInt("userId");
       System.out.println("Userid is" + userId);

       //get the personal details
        String getPersonalInfo = given().header("Authorization", "Bearer" + " " + accessToken)
                .log().all().when().get("/api/v1.0/ums/user/"+userId+"/personalInfo").then().assertThat().statusCode(200)
                .extract().response().asString();

        System.out.println(getPersonalInfo);


   }

}
