package PartnerPortal.US01.TestCases;

import Framework.Web.TestBaseWeb;
import PartnerPortal.US01.ViewModel.LoginWebPageView;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TCH07 extends TestBaseWeb {

    LoginWebPageView loginPage;

    @Test(priority = 7)
    public void HappyLogin() throws InterruptedException {
        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        loginPage = new LoginWebPageView(driver);
        loginPage.AddUserName("dairyqueen");
        loginPage.AddPassword("100100");
        loginPage.ClickLogin();
        Assert.assertTrue(loginPage.message.getText().contains("dairy queen"));

    }

}
