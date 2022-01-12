package PartnerPortal.US01.TestCases;

import Framework.Web.TestBaseWeb;
import PartnerPortal.US01.ViewModel.LoginWebPageView;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02 extends TestBaseWeb {

    LoginWebPageView loginPage;

    @Test(priority = 2)
    public void UserNotRegistered() throws InterruptedException {
       // driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        loginPage = new LoginWebPageView(driver);
        loginPage.AddUserName("rest");
        loginPage.AddPassword("100100");
        loginPage.ClickLogin();
        Assert.assertTrue(loginPage.message2.getText().contains("UserNotRgeistred"));


    }
}
