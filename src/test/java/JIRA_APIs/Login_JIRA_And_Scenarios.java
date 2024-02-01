package JIRA_APIs;

import PayLoadFiles.Pyaload1;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.*;

public class Login_JIRA_And_Scenarios {
    SessionFilter session = new SessionFilter();
    String commentId = "";

    @Test
    public void loginToJira() {
        // when we create a session for example as login then we can create a object opf sessionfilter class
        // and pass this session before whenin example so that session id will be passed to subsequent apis
        //to pass the https validation we can use .relaxedHTTPSValidation after given


        RestAssured.baseURI = "http://localhost:8090/";
        String loginResponse = given().relaxedHTTPSValidation().header("Content-type", "application/json").log().all().body(Pyaload1.loginCreds())
                .filter(session).when().post("/rest/auth/1/session").then().extract().response().asString();

        System.out.println("Logged in succsessfully" + loginResponse);

    }

       @Test

     public void updateComment()
        {
            String UpdateComment = given().pathParams("id", "10001").log().all().header("Content-type", "application/json")
                    .body(Pyaload1.jiraBody()).filter(session).when().post("/rest/api/2/issue/{id}/comment").then().log().all().assertThat().statusCode(201)
                    .extract().response().asString();

            System.out.println(UpdateComment);
            JsonPath js = new JsonPath(UpdateComment);
           // String commentId = js.get("id").toString();
            String commentId = js.get("id").toString();



        }

        @Test(dependsOnMethods = {"loginToJira"})
        public void addAttachment()
        {

             String attachment =  given().header("X-Atlassian-Token", "no-check").filter(session).pathParams("id", "10001")
                      .header("Content-type","multipart/form-data").multiPart("file",new File("Jira.txt")).when().post("/rest/api/2/issue/{id}/attachments")
                      .then().log().all().statusCode(200).extract().response().asString();

             System.out.println("Attachment is " + attachment);

            JsonPath js = new JsonPath(attachment);
            String file = js.get("filename").toString();
            System.out.println("file name is " + file);


        }

        @Test
        public  void getIssueDetails()
        {
           //we can usse query paramter as well, this is how we can limit the response
          String getIssueDetails =   given().filter(session).pathParams("id", "10001").queryParam("fields","comment")
                  .when().get("/rest/api/2/issue/{id}")
                    .then().log().all().assertThat().statusCode(200).extract().response().asString();

          System.out.println(getIssueDetails);
            //now check the comments in the issue, so we have to iterate thorugh all the comments using for loop

          JsonPath js1 = new JsonPath(getIssueDetails);
          int commentCounts = js1.getInt("fields.comment.comments.size()");
          for(int i=0; i<commentCounts;i++)
          {

             //System.out.println(js1.getInt("fields.comment.comments["+i+"].id"));

              String commentsOnIssue = js1.get("fields.comment.comments["+i+"].id").toString();
              if(commentsOnIssue.equalsIgnoreCase(commentId))
              {
                  String message = js1.get("fields.comment.comments["+i+"].body").toString();
                  System.out.println(message);
                  Assert.assertEquals(message, commentId);
              }
          }

        }

}


