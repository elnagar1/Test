package PartnerPortal.US01.TestCases;

import Framework.Web.TestBaseWeb;
import PartnerPortal.US01.ViewModel.LoginWebPageView;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01 extends TestBaseWeb {

    LoginWebPageView loginPage;


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
