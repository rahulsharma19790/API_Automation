package OAuthTest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class OAuthTest1 {

    @Test
    public  void AuthTest()
    {
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        String authResponse=  given().formParam("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
                .formParam("client_secret","erZOWM9g3UtwNRj340YYaK_W")
                .formParam("grant_type","client_credentials")
                .formParam("scope","trust").when().log().all().post("/oauthapi/oauth2/resourceOwner/token")
                .then().assertThat().statusCode(200).extract().response().asString();
        System.out.println(authResponse);
        JsonPath js = new JsonPath(authResponse);
        String accessToken= js.get("access_token").toString();
        System.out.println("Access token is" +accessToken);


        //get coursedetail

       String courseDetails =  given().queryParam("access_token", accessToken).log().all()
                .when().get("/oauthapi/getCourseDetails").then().log().all().assertThat().statusCode(401).extract().response().asString();
               //.then().assertThat().statusCode(200).extract().response().asString();

       System.out.println(courseDetails);
        JsonPath js1 = new JsonPath(courseDetails);
        int status = js1.getInt("statusCode");
        System.out.println(status);





    }

}
