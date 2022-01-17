package Dashboard.US14598.ViewModel;

import Framework.Web.PageBaseWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginDashboardPageView extends PageBaseWeb {

    @FindBy(id = "email")
    public WebElement email;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "btn_login kt_login_signin_submit")
    public WebElement loginButton;
    @FindBy(xpath = "/html/body/kt-base/div/div/div/div[1]/kt-header/div/kt-topbar/div/kt-user-profile/div/div[1]/div/span[2]")
    public WebElement message1;
    @FindBy(id = "errorMsg")
    public WebElement message2;
    @FindBy(id = "error_password_required")
    public WebElement message3;
    @FindBy(id = "errorMsg")
    public WebElement message4;
    @FindBy(id = "error_email_required")
    public WebElement message5;


    public LoginDashboardPageView(WebDriver driver) {
        super(driver);
    }


   public void email(String name){
      email.sendKeys(name);
   }
   public void  password(String pass){
        password.sendKeys(pass);
   }
   public void loginButton()  {

        loginButton.click();
   }
}