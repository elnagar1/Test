package PartnerPortal.US01.TestCases;

import Framework.Web.TestBaseWeb;
import PartnerPortal.US01.ViewModel.LoginWebPageView;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC04 extends TestBaseWeb {

    LoginWebPageView loginPage;

    @Test(priority = 4)
    public void PasswordIsRequierd() throws InterruptedException {
        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        loginPage = new LoginWebPageView(driver);
        loginPage.AddUserName("dairyqueen");
        loginPage.AddPassword("");
        loginPage.ClickLogin();
        Assert.assertTrue(loginPage.message4.getText().contains("Password requried"));


    }
}
