package Framework.Web;

import Framework.Entity;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Ghghcx {
  static  public Response response( String body, String link) {
        Response response = given()
                .contentType(ContentType.JSON)
                .header("accept-language", "en-US")
                .body(body)
                .when()
                .post(link);
        return response;
    }
}
