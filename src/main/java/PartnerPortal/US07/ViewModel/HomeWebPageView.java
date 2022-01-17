package PartnerPortal.US07.ViewModel;

import Framework.Web.PageBaseWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;

public class HomeWebPageView extends PageBaseWeb {

    @FindBy (id = "username")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "btn_login kt_login_signin_submit")
    public WebElement login;
    @FindBy (xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[2]/a/i[1]")
    public WebElement StoreManagment;
    @FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li/a/span")
    public WebElement stores;
    @FindBy(xpath = "//*[@id=\"cdk-drop-list-0\"]/tbody/tr/td[7]/button[1]")
    public WebElement edit;
    @FindBy(id = "newpassword")
    public WebElement newpassword;
    @FindBy(id = "confirmPassword")
    public WebElement confirmpassword;
    @FindBy(id = "btn_proceed")
    public WebElement proceed;
    //@FindBy(xpath = "/html/body/div[5]/div[2]/div/mat-dialog-container/kt-create-store/form/div/mat-horizontal-stepper/div[1]/mat-step-header[2]/div[1]")
    // public WebElement storedata;
    @FindBy(id = "descriptionEn")
    public WebElement descriptionenglish;
    @FindBy(id = "descriptionAr")
    public WebElement descriptionarabic;
    @FindBy(xpath = "//*[@id=\"MapUrl\"]")
    public WebElement mapurl;
    @FindBy(name = "storeCoverImage")
    public WebElement coverimage;
    @FindBy(id = "check_active isActivated")
    public WebElement checkmark;
    @FindBy(id = "btn_proceed")
    public WebElement procced1;
    //@FindBy(xpath = "/html/body/div[5]/div[2]/div/mat-dialog-container/kt-create-store/form/div/mat-horizontal-stepper/div[1]/mat-step-header[3]/div[1]")
    // public WebElement AvailableHours;
    @FindBy(xpath = "//*[@id=\"mat-checkbox-4\"]/label")
    public WebElement time;
    @FindBy(id = "mat-input-19")
    public WebElement openinghour;
    @FindBy(id = "mat-input-20")
    public WebElement closehour;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/mat-dialog-container/kt-create-store/form/div/mat-horizontal-stepper/div[2]/div[3]/div[2]/ul/li[1]/div/div/div")
    public WebElement delete;
    @FindBy(id = "btn_save")
    public WebElement savebutton;



    public HomeWebPageView(WebDriver driver)
    {
        super(driver);
    }

    public void user_name(String username1)
    {
        username.sendKeys(username1);
    }

    public void pass_word(String password1)
    {
        password.sendKeys(password1);
    }

    public void sign_up()
    {
        login.click();

    }

    public void Store_Managment()
    {

        StoreManagment.click();

    }

    public void sto_res()
    {
        stores.click();
    }

    public void ed_it()
    {
        edit.click();
    }

    public void new_password(String newpassword1)
    {
        newpassword.sendKeys(newpassword1);

    }

    public void confirm_password(String confirmpassword1)
    {
        confirmpassword.sendKeys(confirmpassword1);

    }

    public void store_data(WebDriver driver)
    {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", proceed);
    }
    // public void store_data(WebDriver driver){

    //    JavascriptExecutor js = (JavascriptExecutor) driver;
    //  js.executeScript("arguments[0].click()", storedata);
    //  }
    public void Description_english(String descriptionenglish1)
    {
        descriptionenglish.clear();
        descriptionenglish.sendKeys(descriptionenglish1);

    }

    public void Description_arabic(String descriptionarabic1)
    {
        descriptionarabic.clear();
        descriptionarabic.sendKeys(descriptionarabic1);

    }

    public void map_url(){
        mapurl.sendKeys(Keys.chord(Keys.CONTROL, "v"));
    }
    public void cover_image (){
       // coverimage.sendKeys("C:\\Users\\Mnasat Lab 3\\Desktop\\image for work\\download (1).jpg");
        coverimage.sendKeys(System.getProperty("user.dir") + "/src/main/java/PartnerPortal/US06/TestData/kfc-png-logo-4094-Transparent-Images.png");
    }

    public void check_mark()
    {
        checkmark.click();
    }

    public void Available_Hours(WebDriver driver)
    {

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].click()", procced1);
    }
    // public void Available_Hours(WebDriver driver){

    //  JavascriptExecutor js1 = (JavascriptExecutor) driver;
    //   js1.executeScript("arguments[0].click()", AvailableHours);
    //  }
    public void ti_me() throws InterruptedException
    {
        Thread.sleep(1000);
        time.click();


    }

    public void opening_hour(String hour1) throws InterruptedException
    {


        //Thread.sleep(4000);
        openinghour.sendKeys(hour1);

    }

    public void close_hour(String hour2) throws InterruptedException
    {
        //Thread.sleep(4000);
        closehour.sendKeys(hour2);

    }

    public void delete() throws InterruptedException {
        // Thread.sleep(3000);
        delete.click();
    }

    public void save_button(WebDriver driver)
    {

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click()", savebutton);
    }

    public void enter()
    {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(200);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }


