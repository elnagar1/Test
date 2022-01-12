package PartnerPortal.US03.TestCases;

import Framework.Web.TestBaseWeb;
import PartnerPortal.US01.ViewModel.LoginWebPageView;
import PartnerPortal.US03.ViewModel.SizeTypeWebPageView;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01 extends TestBaseWeb {

    SizeTypeWebPageView sizeTypePage;


    @Test(priority = 1)
    public void Happysizetype() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        sizeTypePage = new SizeTypeWebPageView(driver);
        sizeTypePage.user_name("username369@gmail.com");
        sizeTypePage.pass_word("100100");
        sizeTypePage.log_in();
        sizeTypePage.cata_log();
        sizeTypePage.size_type();
        sizeTypePage.cre_ate();
        sizeTypePage.english_name("pizza sizes");
        sizeTypePage.arabic_name("احجام البيتزا");
        sizeTypePage.act_ive();
        sizeTypePage.sa_ve();
        sizeTypePage.delete();
        sizeTypePage.enter();
    }



}
