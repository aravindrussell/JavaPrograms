package org.example.BasicRestAPIPrograme;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.*;

public class RestAssuredAPITest {

    public static void main (String args[]) throws ParseException {
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification.request(Method.GET,"");
        List<String> bookTitleList = new ArrayList<>();
        String books = response.getBody().asString();
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(books);
        JSONArray jsonArray = (JSONArray) jsonObject.get("books");
        Iterator iterator = jsonArray.iterator();
        Map<String,String> bookDetailsMap = new HashMap<>();
        List<Map<String,String>> fullBookDetails = new LinkedList<>();
        while (iterator.hasNext()){
            Iterator iterator1 = ((Map) iterator.next()).entrySet().iterator();
            while (iterator1.hasNext()){
                Map.Entry bookdetails = (Map.Entry) iterator1.next();
                bookDetailsMap.put(bookdetails.getKey().toString(),bookdetails.getValue().toString());
                fullBookDetails.add(bookDetailsMap);
            }
            bookTitleList.add(bookDetailsMap.get("title"));
        }
        System.out.println(bookTitleList);
        System.out.println(bookTitleList.size());
        System.out.println(fullBookDetails.size());
        System.out.println(fullBookDetails);
    }
}
