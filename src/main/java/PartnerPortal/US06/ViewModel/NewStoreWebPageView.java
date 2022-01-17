package PartnerPortal.US06.ViewModel;

import Framework.Web.PageBaseWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

public class NewStoreWebPageView extends PageBaseWeb {

    Random randomGenerator;

    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "btn_login kt_login_signin_submit")
    public WebElement loginbutton;
    @FindBy(xpath = "/html/body/kt-base/div/div/kt-aside-left/div/div/div/ul/li[2]/a/i[1]")
    public WebElement storeManagment;
    @FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li/a/i")
    public WebElement stores;
    @FindBy(xpath = "//*[@id=\"kt_content\"]/kt-store-main/kt-store-list/div[2]/div/kt-generic-table/div/div[1]/div[2]/button[2]")
    public WebElement edit;
    @FindBy(name = "username")
    public WebElement username3;
    @FindBy(name = "userStoreName")
    public WebElement userstorename;
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(xpath = "//*[@id=\"select_code\"]/div/div[2]")
    public WebElement select;
    @FindBy(xpath = "//*[@id=\"mat-option-5\"]/span")
    public WebElement code;
    @FindBy(name = "phoneNumber")
    public WebElement phonenumber;
    @FindBy(name = "newpassword")
    public WebElement newpassword;
    @FindBy(id = "confirmPassword")
    public WebElement confirmpassword;
    @FindBy(id = "btn_proceed")
    public WebElement procced;
    @FindBy(id = "storeCode")
    public WebElement storecode;
    @FindBy(id = "commercialRegistration")
    public WebElement commercialRegistration;
    @FindBy(id = "nameEn")
    public WebElement nameenglish;
    @FindBy(id = "nameAr")
    public WebElement namearabic;
    @FindBy(id = "descriptionEn")
    public WebElement descriptionEnglish;
    @FindBy(id = "descriptionAr")
    public WebElement descriptionArabic;
    @FindBy(xpath = "//*[@id=\"MapUrl\"]")
    public WebElement mapurl;
    @FindBy(xpath = "//*[@id=\"hotline\"]")
    public WebElement hotline;
    @FindBy(id = "check_active isActivated")
    public WebElement active;
    @FindBy(name = "storeLogo")
    public WebElement storelogo;
    @FindBy(name = "commericalRegisterationPhoto")
    public WebElement commericalRegisterationPhoto;
    @FindBy(name = "storeCoverImage")
    public WebElement storecover;
    @FindBy(id = "btn_proceed")
    public WebElement procced1;
    @FindBy(id = "btn_save")
    public WebElement save1;
    @FindBy(xpath = "/html/body/kt-base/div/div/div/div[2]/div/kt-store-main/kt-store-list/div[2]/div/kt-generic-table/div/div[2]/table/tbody/tr[1]/td[7]/button[2]/span/mat-icon")
    public WebElement delete;


    public NewStoreWebPageView(WebDriver driver) {
        super(driver);
    }

    public void user_name(String username1) {
        username.sendKeys(username1);
    }

    public void pass_word(String password1) {
        password.sendKeys(password1);
    }

    public void login_button() {
        loginbutton.click();
    }

    public void Store_Managment() {
        storeManagment.click();

    }

    public void sto_res() {
        stores.click();
    }

    public void ed_it() {
        edit.click();
    }

    public void user_name2(String username2) {
        randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        username3.sendKeys(username2 + randomInt);
    }

    public void user_store_name(String userstorename1) {
        int randomInt = randomGenerator.nextInt(1000);
        userstorename.sendKeys(userstorename1 + randomInt);
    }

    public void em_ail(String email1, String gmail) {
        int randomInt = randomGenerator.nextInt(1000);
        email.sendKeys(email1 + randomInt + gmail);
    }

    public void sel_ect() {
        select.click();
    }

    public void co_de() {
        code.click();
    }

    public void phone_number(String phonenumber1) {
        int randomInt = randomGenerator.nextInt(1000);
        phonenumber.sendKeys(phonenumber1 + randomInt);

    }

    public void new_password(String newpassword1) {
        newpassword.sendKeys(newpassword1);
    }

    public void confirm_password(String confirmpassword1) {
        confirmpassword.sendKeys(confirmpassword1);
    }

    public void pro_cced(WebDriver driver) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", procced);
    }

    public void store_code(String code) {
        int randomInt = randomGenerator.nextInt(1000);
        storecode.sendKeys(code + randomInt);
    }

    public void commercial_Registration(String commercialRegistration1) {
        commercialRegistration.sendKeys(commercialRegistration1);
    }

    public void name_english(String nameenglish1) {
        nameenglish.sendKeys(nameenglish1);
    }

    public void name_arabic(String namearabic1) {
        namearabic.sendKeys(namearabic1);
    }

    public void description_Enlish(String descriptionEn1) {
        descriptionEnglish.sendKeys(descriptionEn1);
    }

    public void description_Arabic(String descriptionAr1) {
        descriptionArabic.sendKeys(descriptionAr1);
    }

    public void map_url() {
        mapurl.sendKeys(Keys.chord(Keys.CONTROL, "v"));
    }

    public void hot_line(String hotline1) {
        hotline.sendKeys(hotline1);
    }

    public void act_ive() {
        active.click();
    }

    public void store_logo() {
        //storelogo.sendKeys("C:\\Users\\Mnasat Lab 3\\Desktop\\image for work\\kfc-png-logo-4094-Transparent-Images.png");
        storelogo.sendKeys(System.getProperty("user.dir") + "/src/main/java/PartnerPortal/US06/TestData/logo.jpg");
    }

    public void commerical_Registeration_Photo() throws InterruptedException {
        // commericalRegisterationPhoto.sendKeys("C:\\Users\\Mnasat Lab 3\\Desktop\\image for work\\CR-OceanPowerTrading-1438.jpg");
        commericalRegisterationPhoto.sendKeys(System.getProperty("user.dir") + "/src/main/java/PartnerPortal/US06/TestData/CR-OceanPowerTrading-1438.jpg");
    }
        public void store_cover()
        {
           // storecover.sendKeys("C:\\Users\\Mnasat Lab 3\\Desktop\\image for work\\cover.png");
            storecover.sendKeys(System.getProperty("user.dir") + "/src/main/java/PartnerPortal/US06/TestData/kfc-png-logo-4094-Transparent-Images.png");

        }

        public void pro_cced1 (WebDriver driver)
        {

            JavascriptExecutor js1 = (JavascriptExecutor) driver;
            js1.executeScript("arguments[0].click()", procced1);
        }

        public void sa_ve1 (WebDriver driver)
        {
            JavascriptExecutor js2 = (JavascriptExecutor) driver;
            js2.executeScript("arguments[0].click()", save1);
        }

        public void delete () throws InterruptedException {
            Thread.sleep(3000);
            delete.click();
        }

        public void enter ()
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


