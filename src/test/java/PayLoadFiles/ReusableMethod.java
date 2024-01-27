package PayLoadFiles;

import io.restassured.path.json.JsonPath;

public class ReusableMethod {

     public static JsonPath rawDataToJson(String response)
     {
         JsonPath js1 = new JsonPath(response);
         return js1;

     }

}
