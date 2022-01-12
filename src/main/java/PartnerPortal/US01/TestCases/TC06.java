package PartnerPortal.US01.TestCases;

import Framework.Web.TestBaseWeb;
import PartnerPortal.US01.ViewModel.LoginWebPageView;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC06 extends TestBaseWeb {

    LoginWebPageView loginPage;

    @Test(priority = 6)
    public void EmailNotActive() throws InterruptedException {
        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        loginPage = new LoginWebPageView(driver);
        loginPage.AddUserName("pizzadominos@gmail.com");
        loginPage.AddPassword("100100");
        loginPage.ClickLogin();
        Assert.assertTrue(loginPage.message6.getText().contains("CannotLoginWithInActiveUser"));

    }

}
