package org.thetestingacademy.base;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.client.methods.RequestBuilder;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.thetestingacademy.endpoints.APIConstants;

public class BaseTest {

    RequestSpecification requestSpecification;
    Response response;

    @BeforeTest
    public void setup()
    {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(APIConstants.BASE_URL)
                .setContentType(ContentType.JSON)
                .build();

    }

    @AfterTest
    public void teardown()
    {}

    public String getToken()
    {
        return null;
    }
}
