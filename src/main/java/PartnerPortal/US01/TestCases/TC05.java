package PartnerPortal.US01.TestCases;

import Framework.Web.Driver_Manager;
import Framework.Web.TestBaseWeb;
import PartnerPortal.US01.ViewModel.LoginWebPageView;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC05  {

    LoginWebPageView loginPage;
    WebDriver driver = Driver_Manager.getDriver();

    @Test(priority = 5)
    public void EmailIsRequierd() throws InterruptedException {
        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        loginPage = new LoginWebPageView(driver);
        loginPage.AddUserName("");
        loginPage.AddPassword("100100");
        loginPage.ClickLogin();
        Assert.assertTrue(loginPage.message5.getText().contains("required"));

    }
}
