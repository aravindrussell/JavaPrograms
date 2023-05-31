package org.example.BasicRestAPIPrograme;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class AutomatePostRequest {

    @Test
    public void authToken() {
        String payLoad = "{\n" +
                "   \"username\" : \"admin\",\n" +
                "   \"password\" : \"password123\"\n" +
                "}";

        Response response = given()
                .baseUri("https://restful-booker.herokuapp.com")
                .contentType("application/json")
                .body(payLoad).

                when().post("/auth").

                then().log().all().extract().response();

        String getToken =  response.jsonPath().getString("token");
        System.out.println(getToken);
    }

    @Test
    public void getBookingIDs(){
        int bookingid =
                given().baseUri("https://restful-booker.herokuapp.com").
                    contentType("application/json").
                when().
                    get("/booking").
                then().
                    extract().response().path("bookingid[0]");

        System.out.println("Booking ID is : " + bookingid);
    }

}
