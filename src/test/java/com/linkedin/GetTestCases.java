package com.linkedin;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import junit.framework.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.basic;
import static com.jayway.restassured.RestAssured.given;

public class GetTestCases {

    @BeforeClass
    public void beforeClass(){
        RestAssured.baseURI ="https://agerasymchuk.testrail.net/";
        RestAssured.authentication = basic("alex.gerasymchuk@i.ua", "CEsvtSnUGptiwRCFY9hJ");
        RestAssured.requestContentType(ContentType.JSON);
    }
    @DataProvider (name = "getCases")
    public Object [][] createdata(){
        return new Object[][] {
                new Object[] {1},
                new Object[] {2},
                new Object[] {3},
                new Object[] {4},
                new Object[] {5}
        };

    }
    @Test (dataProvider = "getCases")
    public void getTestCases (int testCaseId){

        Response response = given().header("Authorization","Basic YWxleC5nZXJhc3ltY2h1a0BpLnVhOkNFc3Z0U25VR3B0aXdSQ0ZZOWhK")
                .when().get("/index.php?/api/v2/get_case/{t}", testCaseId);
        System.out.print(response.asString());

        switch (testCaseId) {
            case 1:
                Assert.assertEquals(200, response.getStatusCode());
                break;
            case 2:
                Assert.assertEquals(200, response.getStatusCode());
                break;
            case 3:
                Assert.assertEquals(200, response.getStatusCode());
                break;
            case 4:
                Assert.assertEquals(200, response.getStatusCode());
                break;
            case 5:
                Assert.assertEquals(200, response.getStatusCode());
                break;
        }
    }
}
