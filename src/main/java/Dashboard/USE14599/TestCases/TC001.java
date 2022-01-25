package Dashboard.USE14599.TestCases;

import Framework.Entity;
import Framework.Web.Ghghcx;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TC001 {
    String token;
    @Test
    public void LoginApiStatusEn() {
        JSONObject requestParams = new JSONObject();
        requestParams.put("email", "mohamed.abdelhy@shgardi.app");
        requestParams.put("password", "123456");
        requestParams.put("rememberMe", "true");


     Response response =   Ghghcx.response(requestParams.toJSONString(),Entity.baseLink+"DashboardAccount/User/adminlogin");

              JsonPath jsonPath = new JsonPath(response.asString());
      token = jsonPath.getString("response.access_token");



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
