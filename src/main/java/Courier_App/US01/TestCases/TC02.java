package Courier_App.US01.TestCases;

import Courier_App.US01.ViewModel.LoginPageView;
import Framework.Web.PageBaseWeb;
import Framework.Web.TestBaseWeb;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC02 extends TestBaseWeb {
    LoginPageView loginPage;
    String password;
    String number;

    @Test(priority = 1)
    public void loginValidPhoneAndPassword() {
        password = PageBaseWeb.reader.getValidPassword();
        number = PageBaseWeb.reader.getValidMobile();
        loginPage = new LoginPageView(driver);
        String A1 = loginPage.userLogin(number, password);
        Assert.assertTrue(A1.contains("MainActivity"));
        System.out.println(A1);

    }


    public void loginValidPhoneAndInValidPassword() {

        password = PageBaseWeb.reader.getInValidPassword();
        number = PageBaseWeb.reader.getValidMobile();
        loginPage = new LoginPageView(driver);
        String A1 = loginPage.userLogin(number, password);
        Assert.assertTrue(!(A1.contains("MainActivity")));
        System.out.println(A1);

    }


    public void loginValidUnregisteredPhone() {

    }


    public void loginInValidPhone() {

    }


    public void restPassword() {

    }


}
