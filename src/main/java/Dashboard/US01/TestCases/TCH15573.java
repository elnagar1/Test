package Dashboard.US01.TestCases;

import Dashboard.US14671.ViewModel.ChangePasswordDashboardPageView;
import Framework.Web.TestBaseWeb;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TCH15573 extends TestBaseWeb {



    ChangePasswordDashboardPageView changePasswordDashboardPageView;

    @Test
    public void HappyChangePassword() throws InterruptedException {

        driver.navigate().to("https://dashboard-dev.shgardi.app/auth/login");
        changePasswordDashboardPageView = new ChangePasswordDashboardPageView(driver);
        changePasswordDashboardPageView.email("abdelbadeea@shgardi.app");
        changePasswordDashboardPageView.password("1234560");
        Thread.sleep(3000);
        changePasswordDashboardPageView.loginButton();
        Thread.sleep(3000);
        changePasswordDashboardPageView.profileicon();
        changePasswordDashboardPageView.changepassword();
        Thread.sleep(3000);
        changePasswordDashboardPageView.currentpassword("1234560");
        changePasswordDashboardPageView.newpassword("1234560");
        changePasswordDashboardPageView.confirmpassword("1234560");
        changePasswordDashboardPageView.savebutton(driver);
        Thread.sleep(3000);
        Assert.assertTrue(changePasswordDashboardPageView.ChangePasswordSuccessfully.getText().contains("ChangePasswordSuccessfully"));



    }
}
