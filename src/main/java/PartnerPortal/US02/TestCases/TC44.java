package PartnerPortal.US02.TestCases;

import Framework.Web.TestBaseWeb;
import PartnerPortal.US02.ViewModel.SignUpWebPageView;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC44 extends TestBaseWeb {

    SignUpWebPageView signUpPage;


    @Test(priority = 44)
    public void invalidusername12() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpWebPageView(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode1();
        signUpPage.invalidphone("543298483");
        signUpPage.CreateUserName("username");
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

        signUpPage.nameofmanger2("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone3("502255225");
        signUpPage.user_name3("_username");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Thread.sleep(2000);
        Assert.assertTrue(signUpPage.invalidusername9.getText().contains("Only Contains Alphanumeric Characters, underscore and dot.\n" +
                "Underscore and dot can't be at the end or start of a username (e.g _username / username_ /.username / username.).\n" +
                "Underscore and dot can't be next to each other (e.g user_.name).\n" +
                "Underscore or dot can't be used multiple times in a row (e.g user__name / user..name)."));
    }
}
