package PartnerPortal.US02.TestCases;

import Framework.Web.TestBaseWeb;
import PartnerPortal.US02.ViewModel.SignUpWebPageView;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC66 extends TestBaseWeb {


    SignUpWebPageView signUpPage;


    @Test(priority = 66)
    public void snapchat() throws InterruptedException {

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
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone2("550000");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);

        signUpPage.store_code("1");
        signUpPage.commerical_number("123");
        signUpPage.name_english("kfc maadi");
        signUpPage.name_arabic("");
        signUpPage.snapchataccount("kfc@snapchat.com");
        signUpPage.hot_line("11011");
        signUpPage.maxestmation("20");
        signUpPage.minimum_Charge("30");
        signUpPage.choose_file();
        signUpPage.choose_file2();
        signUpPage.mapurl();
        signUpPage.registerbtton(driver);
        Assert.assertTrue(signUpPage.errorsnapchatinvalid.getText().contains("Error in field format"));
    }
}
