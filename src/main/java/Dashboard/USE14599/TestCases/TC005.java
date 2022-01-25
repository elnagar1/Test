package Dashboard.USE14599.TestCases;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class  TC005 {


    String token;

    public void LoginApiStatusEn() {
        JSONObject requestParams = new JSONObject();
        requestParams.put("phoneNumber", "01012661525");
        requestParams.put("userType", " 1");
        requestParams.put("deviceType", "Android");
        requestParams.put("fcmToken", "string");
        requestParams.put("userVerificationId", "string");
        requestParams.put("fromShgardiWeb", true);


        Response response = given()
                .contentType(ContentType.JSON)
                .body(requestParams.toJSONString())
                .when()
                .post("https://api-dev.shgardi.app/identity/api/2/Account/login");

        JsonPath jsonPath = new JsonPath(response.asString());
        token = jsonPath.getString("response.accessToken");
        System.out.println(token);


    }

    @Test
    public void LoginApiStatu() {
        LoginApiStatusEn();
        JSONObject requestParams = new JSONObject();
        requestParams.put("phoneNumber", "01012661525");
        requestParams.put("password", "a12345678");
        requestParams.put("userType", "1");
        requestParams.put("deviceType", "Android");
        requestParams.put("fcmToken", token);





        given()
                .contentType(ContentType.JSON)
                .body(requestParams.toJSONString())
                .when()
                .post("https://api-dev.shgardi.app/identity/api/2/Account/LoginWithPassword")
                .then().log().body();


    }
}
