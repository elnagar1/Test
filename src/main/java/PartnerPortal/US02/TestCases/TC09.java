package PartnerPortal.US02.TestCases;

import Framework.Web.TestBaseWeb;
import PartnerPortal.US02.ViewModel.SignUpWebPageView;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC09 extends TestBaseWeb {

    SignUpWebPageView signUpPage;

    @Test(priority = 9)
    public void invalidusername() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpWebPageView(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.invalidUserName("us");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.errorusername.getText().contains("You have less than 3 characters"));
    }
}
