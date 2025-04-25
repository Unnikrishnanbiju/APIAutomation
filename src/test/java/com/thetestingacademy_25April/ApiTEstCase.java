package com.thetestingacademy_25April;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.qameta.allure.testng.AllureTestNg;


@Listeners({ AllureTestNg.class })
public class ApiTEstCase {

    @Test(groups = {"positive"})
    public void getRequest_Positive(){
    RestAssured

            .given().baseUri("https://restful-booker.herokuapp.com/ping")
    .when().get()
    .then().log().all().statusCode(201);

}
    @Test(groups = {"negative"})
    public void getRequest_Negative(){

        RestAssured

                .given().baseUri("https://restful-booker.herokuapp.com/ping")
                .when().get()
                .then().log().all().statusCode(200);


    }


}
