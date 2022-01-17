package PartnerPortal.US07.TestCases;

import Framework.Web.Driver_Manager;
import Framework.Web.TestBaseWeb;
import PartnerPortal.US01.ViewModel.LoginWebPageView;
import PartnerPortal.US03.ViewModel.SizeTypeWebPageView;
import PartnerPortal.US04.ViewModel.SizeWebPageView;
import PartnerPortal.US05.ViewModel.ProductWebPageView;
import PartnerPortal.US06.ViewModel.NewStoreWebPageView;
import PartnerPortal.US07.ViewModel.HomeWebPageView;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC01  {


    NewStoreWebPageView NewStorePage;
    WebDriver driver = Driver_Manager.getDriver();
    private HomeWebPageView homePage;

    @Test(priority = 1)
    public void HappyNewStore() throws InterruptedException {

            driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
            homePage = new HomeWebPageView(driver);
            homePage.user_name("username369@gmail.com");
            homePage.pass_word("100100");
            homePage.sign_up();
            homePage.Store_Managment();
            homePage.sto_res();
            homePage.ed_it();
            homePage.new_password("100100");
            homePage.confirm_password("100100");
            homePage.store_data(driver);
            homePage.Description_english("Fast Food");
            homePage.Description_arabic("طعام سريع");
            // homePage.map_url();
            homePage.cover_image();
            homePage.check_mark();
            homePage.Available_Hours(driver);
            homePage.ti_me();
            homePage.opening_hour("0800am");
            homePage.close_hour("1159pm");
            homePage.delete();
            homePage.save_button(driver);
            homePage.enter();


        }



}
