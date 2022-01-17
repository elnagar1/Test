package Dashboard.US14598.TestCases;

import Dashboard.US14598.ViewModel.LoginDashboardPageView;
import Framework.Web.Driver_Manager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC15254 {



    WebDriver driver = Driver_Manager.getDriver();
    Dashboard.US14598.ViewModel.LoginDashboardPageView LoginDashboardPageView;

    @Test(priority = 1)
    public void EmptyUserName() throws InterruptedException {

        driver.navigate().to("https://dashboard-dev.shgardi.app/auth/login");
        LoginDashboardPageView = new LoginDashboardPageView(driver);
        LoginDashboardPageView.email("");
        LoginDashboardPageView.password("1234560");
        LoginDashboardPageView.loginButton();
        Thread.sleep(3000);
        Assert.assertTrue(LoginDashboardPageView.message5.getText().contains("Required field"));


    }
}
