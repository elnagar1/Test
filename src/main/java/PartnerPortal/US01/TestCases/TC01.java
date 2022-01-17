package PartnerPortal.US01.TestCases;

import Framework.Web.Driver_Manager;
import Framework.Web.TestBaseWeb;
import PartnerPortal.US01.ViewModel.LoginWebPageView;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.DriverManager;

public class TC01  {

    LoginWebPageView loginPage;
    WebDriver driver = Driver_Manager.getDriver();

    @Test(priority = 1)
    public void WrongPassword() throws InterruptedException {
      //  driver.navigate().to("https://partner-dev.shgardi.app/auth/login");

        loginPage = new LoginWebPageView(driver);
        loginPage.AddUserName("dairyqueen");
        loginPage.AddPassword("202020");
        loginPage.ClickLogin();
        Assert.assertTrue(loginPage.message1.getText().contains("Wrong Password"));


    }



}
