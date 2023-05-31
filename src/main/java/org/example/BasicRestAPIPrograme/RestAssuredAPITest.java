package org.example.BasicRestAPIPrograme;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.devtools.v110.fetch.model.AuthChallengeResponse;

public class RestAssuredAPITest {

    public static void main (String args[]){

        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";

        RequestSpecification requestSpecification = RestAssured.given();

        Response response = requestSpecification.request(Method.GET,"");

        System.out.println("Responce Code --> " + response.getStatusCode());
        System.out.println("Responce --> " + response.prettyPrint());
    }

}
