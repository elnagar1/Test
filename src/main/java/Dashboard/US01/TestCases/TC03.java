package Dashboard.US01.TestCases;

import Dashboard.US01.ViewModel.LoginPageView;
import Framework.Web.TestBaseWeb;
import org.junit.Test;
import org.testng.Assert;

public class TC03 extends TestBaseWeb{
    LoginPageView loginPage;
     @Test
    public void loginValidPhoneAndPassword() {


        loginPage = new LoginPageView(driver);
        String A1 = loginPage.userLogin(USERNAME, ACCESS_KEY);
        Assert.assertTrue(A1.contains("home"));
        System.out.println("Open: " + A1);
    }
}
