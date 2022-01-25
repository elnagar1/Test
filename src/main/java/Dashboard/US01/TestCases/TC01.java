package Dashboard.US01.TestCases;


import Dashboard.US01.ViewModel.ExcelReader;
import Dashboard.US01.ViewModel.UserModel;
import Framework.Waits;
import Framework.Web.TestBaseWeb;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import java.io.IOException;


public class TC01 extends TestBaseWeb {


    @Test(dataProvider = "user")
    public void testUntitledTestCase(String firstName, String lastName ,String email ,String password) throws IOException {

        driver.navigate().to("https://dashboard-dev.shgardi.app/auth/login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("btn_login kt_login_signin_submit")).click();

     //   WebElement element = driver.findElement(By.id("kt_aside_menu"));
   //     Waits.waitUntilElementLocated(5, driver, element);
   //     Actions action = new Actions(driver);
     //   action.moveToElement(element).build().perform();
      //  element.click();
       // driver.findElement(By.linkText("Stakeholders")).click();

      //  WebElement courier = driver.findElement(By.linkText("Couriers"));
     //   Actions aa = new Actions(driver);
       // aa.doubleClick(courier).perform();


    }

    @DataProvider
    public static Object[][] user() throws IOException {
        ExcelReader reader = new ExcelReader();
        Object[][] user =  reader.getExcelData();
        return user;
    }

}
