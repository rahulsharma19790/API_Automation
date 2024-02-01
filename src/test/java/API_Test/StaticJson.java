package API_Test;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import org.testng.reporters.XMLConstants;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.*;

public class StaticJson {

    @Test
    public void TestStaticJson() throws IOException {

        RestAssured.baseURI = "https://rahulshettyacademy.com";
       String response =  given().log().all().queryParam("key","qaclick123").header("Content-type","application/json")
                .body(jsonFilePath(String.valueOf(new File(System.getProperty
                        ("user.dir")+"/Static.json")))).when().post("maps/api/place/add/json").then().log().all().
                assertThat().statusCode(200).extract().response().asString();

       System.out.println("response is " + response);

    }

    public static String jsonFilePath(String path) throws IOException {
       //  String filePath = String.valueOf((new File(System.getProperty
               //  ("user.dir")+"src/test/java/API_Test/StaticJson.java")));
          return new String(Files.readAllBytes
                  (Paths.get(path)));

    }


}
