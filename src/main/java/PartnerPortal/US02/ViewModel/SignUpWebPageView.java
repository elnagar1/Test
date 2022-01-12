package PartnerPortal.US02.ViewModel;

import Framework.Web.PageBaseWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class SignUpWebPageView extends PageBaseWeb {



    Random randomGenerator;


    @FindBy(id = "link_sign_up")
    public WebElement signup;
    @FindBy(id = "select_code1")
    public WebElement select;
    @FindBy(id = "mat-option-0")
    public WebElement code;
    @FindBy(id = "mat-option-1")
    public WebElement code1;
    @FindBy(id = "phoneNumber")
    public WebElement phone;
    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "PartnerFristName")
    public WebElement firstname;
    @FindBy(id = "PartnerLastName")
    public WebElement lastname;
    @FindBy(id = "CompanyNameEn")
    public WebElement companynameenglish;
    @FindBy(id = "CompanyNameAr")
    public WebElement companynamearabic;
    @FindBy(xpath = "//*[@id=\"select_industry industry\"]/div/div[2]")
    public WebElement select2;
    @FindBy(id = "mat-option-5")
    public WebElement select3;
    @FindBy(id = "select_storeCategoryType storeCategoryType")
    public WebElement select4;
    @FindBy(id = "mat-option-7")
    public WebElement select5;
    @FindBy(id = "mat-option-12")
    public WebElement select6;
    @FindBy(id = "mat-option-8")
    public WebElement select7;
    @FindBy(id = "mat-option-9")
    public WebElement select8;
    @FindBy(id = "mat-option-10")
    public WebElement select9;
    @FindBy(id = "storeLogo")
    public WebElement choosefile;
    @FindBy(id = "btn_next_step1")
    public WebElement nextstep1;
    @FindBy(id = "name")
    public WebElement manegername;
    @FindBy(id = "select_code2")
    public WebElement code22;
    @FindBy(id = "mat-option-2")
    public WebElement code23;
    @FindBy(xpath = "/html/body/kt-auth/div/div/div[2]/kt-register/div/div/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div/input")
    public WebElement phone2;
    @FindBy(name = "storeUserName")
    public WebElement username2;
    @FindBy(xpath = "/html/body/kt-auth/div/div/div[2]/kt-register/div/div/mat-horizontal-stepper/div[2]/div[2]/form/div[4]/input")
    public WebElement storemanageremail;
    @FindBy(xpath = "/html/body/kt-auth/div/div/div[2]/kt-register/div/div/mat-horizontal-stepper/div[2]/div[2]/form/div[5]/div/input")
    public WebElement password2;
    @FindBy(id = "confirmPassword")
    public WebElement confirm_password;
    @FindBy(id = "btn_next_step2")
    public WebElement nextstep2;
    @FindBy(id = "store_code")
    public WebElement storecode;
    @FindBy(id = "commerical_number")
    public WebElement commericalnumber;
    @FindBy(id = "nameEn")
    public WebElement nameenglish;
    @FindBy(id = "nameAr")
    public WebElement namearabic;
    @FindBy(id = "hotline")
    public WebElement hotline;
    @FindBy(id = "maxEstimationDeliveryTime")
    public WebElement max;
    @FindBy(id = "minimumCharge")
    public WebElement minimumCharge;
    @FindBy(id = "storeDetailsLogo")
    public WebElement choosefile2;
    @FindBy(xpath = "//*[@id=\"commericalPhoto\"]")
    public WebElement CommericalPhoto;
    @FindBy(id = "MapUrl")
    public WebElement map;
    @FindBy(id = "btn_register")
    public WebElement register;
    @FindBy(id = "error_phoneNumber_required")
    public WebElement phonenumberrequird;
    @FindBy(id = "error_phoneNumber_invalid")
    public WebElement invalidphonenumber;
    @FindBy(xpath = "//*[@id=\"toast-container\"]/div/div[2]")
    public WebElement numberisalreadyregistred;
    @FindBy(id = "error_username_min_length")
    public WebElement errorusername;
    @FindBy(id = "error_username_validate")
    public WebElement errorusername1;
    @FindBy(id = "error_username_max_length")
    public WebElement errorusername2;
    @FindBy(id = "error_username_required")
    public WebElement usernamerequird;
    @FindBy(id = "error_email_required")
    public WebElement emailrequird;
    @FindBy(id = "error_email_min_length")
    public WebElement lessthan3characters;
    @FindBy(id = "error_email_pattern")
    public WebElement invalidemail;
    @FindBy(id = "error_email_max_length")
    public WebElement morethan100characters;
    @FindBy(xpath = "//*[@id=\"toast-container\"]/div/div[2]")
    public WebElement emailalreadyregistred;
    @FindBy(id = "error_password_required")
    public WebElement passwordrequird;
    @FindBy(id = "error_PartnerFristName_required")
    public WebElement fristnamerequird;
    @FindBy(id = "error_PartnerLastName_required")
    public WebElement lastnamerequird;
    @FindBy(id = "error_CompanyNameEn_required")
    public WebElement companynameenglishrequird;
    @FindBy(id = "error_CompanyNameAr_required")
    public WebElement companynamearabicrequird;
    @FindBy(id = "error_storeCategoryType_required")
    public WebElement storeCategoryTyperequired;
    @FindBy(id = "error_storeCategoryType_MAX")
    public WebElement MaxAllowedStoreCategoryTypes3;
    @FindBy(xpath = "//*[@id=\"toast-container\"]/div/div[2]")
    public WebElement userallreadyused;
    @FindBy(id = "error_storeLogo_required")
    public WebElement companylogorequird;
    @FindBy(id = "error_name_required")
    public WebElement nameofmanager;
    @FindBy(id = "error_name_min_length")
    public WebElement shortnameofmanager;
    @FindBy(id = "error_phoneNumber_required")
    public WebElement phone2requird;
    @FindBy(id = "error_phoneNumber_invalid")
    public WebElement invalidphonenumber2;
    @FindBy(xpath = "//*[@id=\"toast-container\"]/div/div[2]")
    public WebElement samenumber;
    @FindBy(xpath = "//*[@id=\"toast-container\"]/div/div[2]")
    public WebElement phonallreadyresgistered;
    @FindBy(id = "error_username_required")
    public WebElement username3;
    @FindBy(id = "error_username_min_length")
    public WebElement invalidusername8;
    @FindBy(id = "error_username_validate")
    public WebElement invalidusername9;
    @FindBy(xpath = "//*[@id=\"toast-container\"]/div/div[2]")
    public WebElement sameusername;
    @FindBy(xpath = "//*[@id=\"toast-container\"]/div/div[2]")
    public WebElement usernamealreadyused;
    @FindBy(id = "error_email_required")
    public WebElement manageremail;
    @FindBy(id = "error_email_min_length")
    public WebElement shortemail;
    @FindBy(id = "error_email_invalid")
    public WebElement invalidmanageremail1;
    @FindBy(id = "error_email_max_length")
    public WebElement invalidmanageremail2;
    @FindBy(id = "error_email_invalid")
    public WebElement invalidmanageremail22;
    @FindBy(xpath = "//*[@id=\"toast-container\"]/div/div[2]")
    public WebElement manageremailregistred;
    @FindBy(xpath = "//*[@id=\"toast-container\"]/div/div[2]")
    public WebElement manageremailwithpartnerdata;
    @FindBy(id = "error_password_required")
    public WebElement passwordrequired1;
    @FindBy(id = "error_confirm_password_required")
    public WebElement confirmpasswordrequired;
    @FindBy(id = "error_confirm_password_not_match")
    public WebElement passwordandconfirmpasswordnotmatch;
    @FindBy(id = "error_nameEn_required")
    public WebElement nameenglishrequired;
    @FindBy(id = "error_nameAr_required")
    public WebElement namearabicrequired;
    @FindBy(id = "twitter")
    public WebElement errortwitter;
    @FindBy(id = "error_twitter_invalid")
    public WebElement errortwitterinvalid;
    @FindBy(id = "instgram")
    public WebElement errorinstagram;
    @FindBy(id = "error_instgram_invalid")
    public WebElement errorinstagraminvalid;
    @FindBy(id = "youtube")
    public WebElement erroryoutube;
    @FindBy(id = "error_youtube_invalid")
    public WebElement erroryoutubeinvalid;
    @FindBy(id = "facebook")
    public WebElement errorfacebook;
    @FindBy(id = "error_facebook_invalid")
    public WebElement errorfacebookinvalid;
    @FindBy(id = "snapchat")
    public WebElement errorsnapchat;
    @FindBy(id = "error_snapchat_invalid")
    public WebElement errorsnapchatinvalid;
    @FindBy(id = "error_maxEstimationDeliveryTime_min_length")
    public WebElement errordeliverytime;
    @FindBy(xpath = "//*[@id=\"toast-container\"]/div")
    public WebElement selectmapurl;


    public SignUpWebPageView(WebDriver driver) {
        super(driver);
    }

    public void ClickSignUp() throws InterruptedException {
        // Thread.sleep(1000);
        signup.click();
    }

    public void ClickOnSelect() {
        select.click();
    }

    public void ClickOnCode() {
        code.click();

    }

    public void ClickOnCode1() {
        code1.click();

    }

    public void CreatePhoneNumber(String phonenumber) {

        randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        phone.sendKeys(phonenumber + randomInt);
    }

    public void invalidphone(String phonenumber) {
        phone.sendKeys(phonenumber);
    }

    public void CreateUserName(String Username) {
        randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        username.sendKeys(Username + randomInt);
    }

    public void invalidUserName(String Username) {
        username.sendKeys(Username);
    }

    public void CreateEmail(String username, String gmail) {

        int randomInt = randomGenerator.nextInt(1000);
        email.sendKeys(username + randomInt + gmail);
    }

    public void createinvalidemail(String email1) {
        email.sendKeys(email1);
    }

    public void CreatePassword(String Pass) {

        password.sendKeys(Pass);
    }

    public void CreateFirstName(String name1) {
        firstname.sendKeys(name1);
    }

    public void CreateLastName(String name2) {

        lastname.sendKeys(name2);
    }

    public void companynameenglish(String englishname) {
        companynameenglish.sendKeys(englishname);
    }

    public void companynamearabic(String arabicname) {
        companynamearabic.sendKeys(arabicname);
    }

    public void ClickOnSelect2() {
        select2.click();

    }

    public void ClickOnSelect3() throws InterruptedException {
        select3.click();
        Thread.sleep(1000);

    }

    public void ClickOnSelect4() {
        select4.click();

    }

    public void ClickOnSelect5() {
        select5.click();

    }

    public void ClickOnSelect6() {
        select6.click();
    }

    public void ClickOnSelect7() {
        select7.click();
    }

    public void ClickOnSelect8() {
        select8.click();
    }

    public void ClickOnSelect9() {
        select9.click();
    }

    public void choosefile() {

        //choosefile.sendKeys("C:\\Users\\Mnasat Lab 3\\Desktop\\image for work\\kfc-png-logo-4094-Transparent-Images.png");
        choosefile.sendKeys(System.getProperty("user.dir")+"/src/main/java/PartnerPortal/US02/TestData/logo.jpg");
    }

    public void nextbutton1(WebDriver driver) throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", nextstep1);
    }

    public void nameofmanger(String name) {
        int randomInt = randomGenerator.nextInt(1000);
        manegername.sendKeys(name + randomInt);
    }

    public void nameofmanger2(String name) {
        manegername.sendKeys(name);
    }

    public void code_22() {

        code22.click();
    }

    public void code_23() {
        code23.click();
    }


    public void phone2(String Phonenumber2) {
        int randomInt = randomGenerator.nextInt(1000);
        phone2.sendKeys(Phonenumber2 + randomInt);
    }

    public void phone3(String Phonenumber3) {

        phone2.sendKeys(Phonenumber3);
    }

    public void user_name2(String username) {
        int randomInt = randomGenerator.nextInt(1000);
        username2.sendKeys(username + randomInt);
    }

    public void user_name3(String username) {

        username2.sendKeys(username);
    }

    public void store_manager_email(String storeemail, String email2) {

        int randomInt = randomGenerator.nextInt(1000);
        storemanageremail.sendKeys(storeemail + randomInt + email2);
    }

    public void store_manager_email1(String storeemail) {


        storemanageremail.sendKeys(storeemail);
    }


    public void CreatePassword2(String Pass2) {

        password2.sendKeys(Pass2);
    }


    public void confirmpassword(String pass3) {
        confirm_password.sendKeys(pass3);
    }

    public void nextbutton2(WebDriver driver) {

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].click()", nextstep2);
    }

    public void store_code(String number) {
        storecode.sendKeys(number);
    }

    public void commerical_number(String number1) {
        commericalnumber.sendKeys(number1);
    }

    public void twitteraccount(String twitteremail) {
        errortwitter.sendKeys(twitteremail);
    }

    public void instagramaccount(String instagramemail) {

        errorinstagram.sendKeys(instagramemail);
    }

    public void youtubeaccount(String youtubeemail) {

        erroryoutube.sendKeys(youtubeemail);
    }

    public void facebookaccount(String facebookemail) {

        errorfacebook.sendKeys(facebookemail);
    }

    public void snapchataccount(String snapchatemail) {

        errorsnapchat.sendKeys(snapchatemail);
    }

    public void name_english(String name) {
        nameenglish.sendKeys(name);
    }

    public void name_arabic(String name) {
        namearabic.sendKeys(name);
    }

    public void hot_line(String number) {
        hotline.sendKeys(number);
    }

    public void maxestmation(String number) {
        max.sendKeys(number);
    }

    public void minimum_Charge(String number) {
        minimumCharge.sendKeys(number);
    }

    public void choose_file() {

        //choosefile2.sendKeys("C:\\Users\\Mnasat Lab 3\\Desktop\\image for work\\kfc-png-logo-4094-Transparent-Images.png");
        choosefile2.sendKeys(System.getProperty("user.dir")+"/src/main/java/PartnerPortal/US02/TestData/logo.jpg");
    }

    public void choose_file2() {

        //CommericalPhoto.sendKeys("C:\\Users\\Mnasat Lab 3\\Desktop\\image for work\\CR-OceanPowerTrading-1438.jpg");
        CommericalPhoto.sendKeys(System.getProperty("user.dir")+"/src/main/java/PartnerPortal/US02/TestData/CR-OceanPowerTrading-1438.jpg");
    }

    public void mapurl() throws InterruptedException {

        map.sendKeys(Keys.chord(Keys.CONTROL, "v"));
    }

    public void mapmap() {
        map.sendKeys("hello");
    }

    public void registerbtton(WebDriver driver) {

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click()", register);
    }
}
