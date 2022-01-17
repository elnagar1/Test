package PartnerPortal.US04.TestCases;

import Framework.Web.TestBaseWeb;
import PartnerPortal.US04.ViewModel.SizeWebPageView;
import org.testng.annotations.Test;

public class TCH01 extends TestBaseWeb {

    SizeWebPageView SizePage;


    @Test(priority = 1)
    public void Happysize() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        SizePage = new SizeWebPageView(driver);
        SizePage.user_name("username369@gmail.com");
        SizePage.pass_word("100100");
        SizePage.log_in();
        SizePage.cata_log();
        SizePage.si_ze();
        SizePage.create_size();
        SizePage.english_name("small");
        SizePage.arabic_name("صغير");
        SizePage.sel_ect();
        SizePage.sele_ct1();
        SizePage.act_ive();
        SizePage.sa_ve();
        SizePage.delete();
        SizePage.enter();

    }



}
