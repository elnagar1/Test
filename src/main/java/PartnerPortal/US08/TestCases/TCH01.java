package PartnerPortal.US08.TestCases;

import Framework.Web.Driver_Manager;
import PartnerPortal.US06.ViewModel.NewStoreWebPageView;
import PartnerPortal.US07.ViewModel.HomeWebPageView;
import PartnerPortal.US08.ViewModel.ComponentWebPageView;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TCH01 {


    NewStoreWebPageView NewStorePage;
    WebDriver driver = Driver_Manager.getDriver();
    private HomeWebPageView homePage;

    ComponentWebPageView ComponentPage;


    @Test(priority = 1)
    public void HappyComponent() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        ComponentPage = new ComponentWebPageView(driver);
        ComponentPage.user_name("username369@gmail.com");
        ComponentPage.pass_word("100100");
        ComponentPage.log_in();
        ComponentPage.cata_log();
        ComponentPage.compo_nent();
        ComponentPage.create_component();
        ComponentPage.english_name("onion");
        ComponentPage.arabic_name("بصل");
        ComponentPage.pr_ice("3");
        ComponentPage.sa_ve();
        ComponentPage.delete();
        ComponentPage.enter();
    }



}
