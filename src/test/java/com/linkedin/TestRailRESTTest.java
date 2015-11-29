package com.linkedin;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import junit.framework.Assert;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.*;

public class TestRailRESTTest {

    @BeforeClass
    public void beforeClass(){
        RestAssured.baseURI ="https://agerasymchuk.testrail.net/";
        RestAssured.authentication = basic("alex.gerasymchuk@i.ua", "CEsvtSnUGptiwRCFY9hJ");
        RestAssured.requestContentType(ContentType.JSON);

    }

    @Test
    public void getTestCaseTest() {
        int testCaseId = 1;
        Response response = given().header("Authorization","Basic YWxleC5nZXJhc3ltY2h1a0BpLnVhOkNFc3Z0U25VR3B0aXdSQ0ZZOWhK")
                .when().get("/index.php?/api/v2/get_case/{t}", testCaseId);
        System.out.print(response.asString());
        String testCaseTitle = "regtest case";
        Assert.assertEquals(200, response.getStatusCode());
    }

    @Test
    public void postTestCaseTest() throws JSONException {
        int testCaseId = 1;
        int testCaseStatus = 1;
        JSONObject obj = new JSONObject();
        obj.put("status_id", testCaseStatus);

        Response response;
        response = given().header("Authorization","Basic YWxleC5nZXJhc3ltY2h1a0BpLnVhOkNFc3Z0U25VR3B0aXdSQ0ZZOWhK")
                .body("{ \"status_id\": 1 }").when().post("/index.php?/api/v2/add_result/{t}", testCaseId);

        System.out.print(response.asString());
        Assert.assertTrue(response.asString().contains("\"status_id\":"+testCaseStatus));
        Assert.assertEquals(200, response.getStatusCode());
    }

}
