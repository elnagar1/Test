package PartnerPortal.US02.TestCases;

import Framework.Web.TestBaseWeb;
import PartnerPortal.US02.ViewModel.SignUpWebPageView;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC37 extends TestBaseWeb {

    SignUpWebPageView signUpPage;


    @Test(priority = 37)
    public void invalid2PhoneNumber3() throws InterruptedException {

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
        signUpPage.phone3("543298483");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Thread.sleep(2000);
        Assert.assertTrue(signUpPage.samenumber.getText().contains("Cannot have same phone number for partner and store"));
    }
}
