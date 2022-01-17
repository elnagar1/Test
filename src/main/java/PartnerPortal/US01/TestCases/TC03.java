package PartnerPortal.US01.TestCases;

import Framework.Web.Driver_Manager;
import Framework.Web.TestBaseWeb;
import PartnerPortal.US01.ViewModel.LoginWebPageView;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03  {

    LoginWebPageView loginPage;
    WebDriver driver = Driver_Manager.getDriver();

    @Test(priority = 3)
    public void Minimumlengthcharacter() throws InterruptedException {
       // driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        loginPage = new LoginWebPageView(driver);
        loginPage.AddUserName("dairyqueen");
        loginPage.AddPassword("100");
        loginPage.ClickLogin();
        Assert.assertTrue(loginPage.message3.getText().contains("Min Length 6"));
    }
}
