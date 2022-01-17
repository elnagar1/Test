package Dashboard.USE14599.TestCases;

import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TC001 {
    @Test
    public void LoginApiStatusEn() {
        JSONObject requestParams = new JSONObject();
        requestParams.put("email", "mohamed.abdelhy@shgardi.app");
        requestParams.put("password", "123456");
        requestParams.put("rememberMe", "true");


        given()
                .contentType(ContentType.JSON)
                .header("accept-language", "en-US")
                .body(requestParams.toJSONString())
                .when()
                .post("https://api-dev.shgardi.app/identity/api/2.0/DashboardAccount/User/adminlogin")
                .then()
                .log().body()
                .assertThat().body("status", equalTo("Success"));

    }

    @Test
    public void LoginApiStatusAR() {
        JSONObject requestParams = new JSONObject();
        requestParams.put("email", "mohamed.abdelhy@shgardi.app");
        requestParams.put("password", "123456");
        requestParams.put("rememberMe", "true");


        given()
                .contentType(ContentType.JSON)
                .header("accept-language", "AR")
                .body(requestParams.toJSONString())
                .when()
                .post("https://api-dev.shgardi.app/identity/api/2.0/DashboardAccount/User/adminlogin")
                .then()
                .log().body()
                .assertThat().body("status", equalTo("Success"));

    }



}
