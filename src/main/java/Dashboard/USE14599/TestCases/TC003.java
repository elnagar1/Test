package Dashboard.USE14599.TestCases;

import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TC003 {


    @Test
    public void LoginWithIncorrectEmailEN() throws Exception {
        JSONObject requestParams = new JSONObject();
        requestParams.put("email", "mohamed.abdelhy@shgard.app");
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
                .assertThat().statusCode(400)
                .assertThat().body("status", Matchers.equalTo("Failure"))
                .assertThat().body("message", Matchers.equalTo("NotRegistredAdmin"))
                .assertThat().body("response", Matchers.equalTo(null));

    }
    @Test
    public void LoginWithIncorrectEmailAR() throws Exception {
        JSONObject requestParams = new JSONObject();
        requestParams.put("email", "mohamed.abdelhy@shgard.app");
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
                .assertThat().statusCode(400)
                .assertThat().body("status", Matchers.equalTo("Failure"))
                .assertThat().body("message", Matchers.equalTo("NotRegistredAdmin"))
                .assertThat().body("response", Matchers.equalTo(null));

    }
}
