package Dashboard.US01.TestCases;

import Dashboard.US01.ViewModel.ExcelReader;

import io.restassured.http.ContentType;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class test {
    @Test(dataProvider = "user")
    public void gh(){


        given()
                .contentType(ContentType.JSON)
                .header("accept-language", "en-US")
                .when()
                .post("https://api.shgardi.app/identity/api/2/DashboardAccount/User/AllUsersDrivers")
                .then()
                .log().all();


    }
    @DataProvider
    public static Object[][] user() throws IOException, ParseException {
        //read from Excel
        ExcelReader reader = new ExcelReader();
        Object[][] user =  reader.getExcelData();


        //read from json
        //  /Object[][] user =  JsonDataReader.readJsonAsDataProvider();

        return user;
    }
}
