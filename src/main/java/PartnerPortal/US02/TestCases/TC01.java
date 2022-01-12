package PartnerPortal.US02.TestCases;

import Framework.Web.TestBaseWeb;
import PartnerPortal.US01.ViewModel.LoginWebPageView;
import PartnerPortal.US02.ViewModel.SignUpWebPageView;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC01 extends TestBaseWeb {

    SignUpWebPageView signUpPage;


    @Test(priority = 1)
    public void HappySignUp() throws InterruptedException {

        driver.get("https://www.google.com/maps/search/https:%2F%2Fwww.google.com%2Fmaps%2Fplace%2FDr.Alaa%2BEzzat%2BHospital%2F@29.9633139,31.2480701,18z%2Fdata%3D!4m5!3m4!1s0x145847eddcb607f5:0x586683ac7dd31f42!8m2!3d29.9627984!4d31.2496875/@29.9628007,31.2485932,18z/data=!3m1!4b1");
        driver.findElement(By.xpath("//*[@id=\"searchboxinput\"]")).sendKeys(Keys.CONTROL+"a");
        driver.findElement(By.xpath("//*[@id=\"searchboxinput\"]")).sendKeys(Keys.CONTROL + "c");
        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpWebPageView(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
        signUpPage.name_arabic("كنتاكى المعادى");
        signUpPage.hot_line("11011");
        signUpPage.maxestmation("20");
        signUpPage.minimum_Charge("30");
        signUpPage.choose_file();
        signUpPage.choose_file2();
        signUpPage.mapurl();
        signUpPage.registerbtton(driver);


    }



}
