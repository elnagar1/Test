package PartnerPortal.US02.TestCases;

import Framework.Web.TestBaseWeb;
import PartnerPortal.US02.ViewModel.SignUpWebPageView;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC19 extends TestBaseWeb {

    SignUpWebPageView signUpPage;

    @Test(priority = 19)
    public void invalidemail1() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpWebPageView(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.createinvalidemail("username@yahoo.c");
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
        Assert.assertTrue(signUpPage.invalidemail.getText().contains("Invalid Email Address"));
    }
}
