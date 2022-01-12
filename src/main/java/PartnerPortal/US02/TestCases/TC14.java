package PartnerPortal.US02.TestCases;

import Framework.Web.TestBaseWeb;
import PartnerPortal.US02.ViewModel.SignUpWebPageView;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC14 extends TestBaseWeb {

    SignUpWebPageView signUpPage;


    @Test(priority = 14)
    public void invalidusername5() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpWebPageView(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.invalidUserName("username_");
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
        Assert.assertTrue(signUpPage.errorusername1.getText().contains("Only Contains Alphanumeric Characters, underscore and dot.\n" +
                "Underscore and dot can't be at the end or start of a username (e.g _username / username_ /.username / username.).\n" +
                "Underscore and dot can't be next to each other (e.g user_.name).\n" +
                "Underscore or dot can't be used multiple times in a row (e.g user__name / user..name).\n" +
                "Number of Characters must be between 3 to 20."));
    }
}
