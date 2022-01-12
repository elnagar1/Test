package PartnerPortal.US01.ViewModel;

import Framework.Web.PageBaseWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginWebPageView extends PageBaseWeb {

    @FindBy(id = "username")
    public WebElement usernameTx;
    @FindBy (id = "password")
    public WebElement passwordTx;
    @FindBy (id = "btn_login kt_login_signin_submit")
    public WebElement LoginButton;
    @FindBy (xpath = "//*[@id=\"kt_header\"]/kt-topbar/div/kt-user-profile/div/div[1]/div/span[3]")
    public WebElement message;
    @FindBy (xpath = "//*[@id=\"toast-container\"]/div/div[2]")
    public WebElement message1;
    @FindBy (xpath = "//*[@id=\"toast-container\"]/div/div[2]")
    public WebElement message2;
    @FindBy(id = "error_password_min_length")
    public WebElement message3;
    @FindBy (xpath = "//*[@id=\"kt_login\"]/div/div[2]/kt-login/div/div/form/div[2]/mat-form-field/div/div[3]/div")
    public WebElement message4;
    @FindBy(xpath = "/html/body/kt-auth/div/div/div[2]/kt-login/div/div/form/div[1]/mat-form-field/div/div[3]/div/mat-error")
    public WebElement message5;
    @FindBy (xpath = "//*[@id=\"toast-container\"]/div/div[2]")
    public WebElement message6;





    public LoginWebPageView(WebDriver driver) {
        super(driver);
    }

    public void AddUserName(String name)
    {
        usernameTx.sendKeys(name);

    }

    public void AddPassword(String password)
    {
        passwordTx.sendKeys(password);

    }


    public void ClickLogin() throws InterruptedException
    {
        LoginButton.click();
        Thread.sleep(1000);
    }


}
