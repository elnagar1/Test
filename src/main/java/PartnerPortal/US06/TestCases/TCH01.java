package PartnerPortal.US06.TestCases;

import Framework.Web.Driver_Manager;
import PartnerPortal.US06.ViewModel.NewStoreWebPageView;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TCH01 {


    NewStoreWebPageView NewStorePage;
    WebDriver driver = Driver_Manager.getDriver();
    @Test(priority = 1)
    public void HappyNewStore() throws InterruptedException {


        Driver_Manager.getDriver().get("https://www.google.com/maps/search/https:%2F%2Fwww.google.com%2Fmaps%2Fplace%2FDr.Alaa%2BEzzat%2BHospital%2F@29.9633139,31.2480701,18z%2Fdata%3D!4m5!3m4!1s0x145847eddcb607f5:0x586683ac7dd31f42!8m2!3d29.9627984!4d31.2496875/@29.9628007,31.2485932,18z/data=!3m1!4b1");
        Driver_Manager.getDriver().findElement(By.xpath("//*[@id=\"searchboxinput\"]")).sendKeys(Keys.CONTROL+"a");
        Driver_Manager.getDriver().findElement(By.xpath("//*[@id=\"searchboxinput\"]")).sendKeys(Keys.CONTROL + "c");
        Driver_Manager.getDriver().navigate().to("https://partner-dev.shgardi.app/auth/login");
        NewStorePage = new NewStoreWebPageView(driver);
        NewStorePage.user_name("username369@gmail.com");
        NewStorePage.pass_word("100100");
        NewStorePage.login_button();
        Driver_Manager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        NewStorePage.Store_Managment();
        NewStorePage.sto_res();
        NewStorePage.ed_it();
        NewStorePage.user_name2("ali");
        NewStorePage.user_store_name("ali");
        NewStorePage.em_ail("ali" , "@gmail.com");
        NewStorePage.sel_ect();
        NewStorePage.co_de();
        NewStorePage.phone_number("1225428");
        NewStorePage.new_password("100100");
        NewStorePage.confirm_password("100100");
        NewStorePage.pro_cced(Driver_Manager.getDriver());
        NewStorePage.store_code("2");
        NewStorePage.commercial_Registration("123");
        NewStorePage.name_english("kfc tahrer");
        NewStorePage.name_arabic("كنتاكى التحرير");
        NewStorePage.description_Enlish("Fast Food");
        NewStorePage.description_Arabic("طعام سريع");
        NewStorePage.map_url();
        NewStorePage.hot_line("11011");
        NewStorePage.act_ive();
        NewStorePage.store_logo();
        NewStorePage.commerical_Registeration_Photo();
        NewStorePage.store_cover();
        NewStorePage.pro_cced1(Driver_Manager.getDriver());
        NewStorePage.sa_ve1(Driver_Manager.getDriver());
        NewStorePage.delete();
        NewStorePage.enter();
        NewStorePage.enter();





    }



}
