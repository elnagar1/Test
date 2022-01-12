package PartnerPortal.US02.TestCases;

import Framework.Web.TestBaseWeb;
import PartnerPortal.US02.ViewModel.SignUpWebPageView;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC29 extends TestBaseWeb {

    SignUpWebPageView signUpPage;

    @Test(priority = 29)
    public void MaxAllowedStoreCategoryTypes() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpWebPageView(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
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
        signUpPage.ClickOnSelect7();
        signUpPage.ClickOnSelect8();
        signUpPage.ClickOnSelect9();
        //  signUpPage.choosefile();
        //   signUpPage.nextbutton1(driver);
        Thread.sleep(3000);
        Assert.assertTrue(signUpPage.MaxAllowedStoreCategoryTypes3.getText().contains("Max Store Category Type Is 3"));
    }
}
