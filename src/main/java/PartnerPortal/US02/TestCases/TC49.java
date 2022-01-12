package PartnerPortal.US02.TestCases;

import Framework.Web.TestBaseWeb;
import PartnerPortal.US02.ViewModel.SignUpWebPageView;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC49 extends TestBaseWeb {

    SignUpWebPageView signUpPage;

    @Test(priority = 49)
    public void sameusername() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpWebPageView(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.invalidUserName("username");
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
        signUpPage.user_name3("username");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Thread.sleep(2000);
        Assert.assertTrue(signUpPage.sameusername.getText().contains("Cannot have same loginName for partner and store"));
    }
}
