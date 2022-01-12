package PartnerPortal.US05.ViewModel;

import Framework.Web.PageBaseWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

public class ProductWebPageView extends PageBaseWeb {

    Random randomGenerator;

    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "btn_login kt_login_signin_submit")
    public WebElement login;
    @FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[3]/a/i[1]")
    public WebElement catalog;
    @FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[3]/div/ul/li[5]/a/span")
    public WebElement product;
    @FindBy(xpath = "//*[@id=\"kt_content\"]/kt-catalog/kt-product-list/div[3]/div/kt-generic-table/div/div[1]/div[2]/button/span")
    public WebElement createproduct;
    @FindBy(id = "code")
    public WebElement code;
    @FindBy(id = "nameEN")
    public WebElement englishname;
    @FindBy(id = "nameAr")
    public WebElement arabicname;
    @FindBy(id = "descriptionEn")
    public WebElement englishdescription;
    @FindBy(id = "descriptionAr")
    public WebElement arabicdescription;
    @FindBy(id = "ordering")
    public WebElement ordering;
    @FindBy(xpath = "//*[@id=\"select_size_type\"]/div/div[2]/div")
    public WebElement selectsizetype;
    @FindBy(xpath = "/html/body/div[4]/div[4]/div/div/div/mat-option/span")
    public WebElement sizetype;
    @FindBy(xpath = "//*[@id=\"select_size\"]/div/div[2]")
    public WebElement selectsize;
    @FindBy(xpath = "/html/body/div[4]/div[4]/div/div/div/mat-option/span")
    public WebElement size;
    @FindBy(xpath = "//*[@id=\"select_tags\"]/div/div[2]/div")
    public WebElement selecttag;
    @FindBy(xpath = "//*[@id=\"mat-option-288\"]/span")
    public WebElement tag;
    @FindBy (xpath = "/html/body/div[4]/div[2]/div/mat-dialog-container/kt-create-product/mat-horizontal-stepper/div[2]/div[1]/form/div[7]/div[1]/mat-form-field/div/div[1]/div/mat-select")
    public WebElement selectcategory;
    @FindBy(xpath = "/html/body/div[3]/div[4]/div/div/div/mat-option[1]/span")
    public WebElement category;
    @FindBy(id = "unitPrice")
    public WebElement unitprice;
    @FindBy(id = "product_img")
    public WebElement productimage;
    @FindBy(id = "btn_save")
    public WebElement buttonsave;
    @FindBy(xpath = "/html/body/kt-base/div/div/div/div[2]/div/kt-catalog/kt-product-list/div[3]/div/kt-generic-table/div/div[2]/table/tbody/tr[4]/td[8]/button[2]/span/mat-icon")
    public WebElement delete;














    public ProductWebPageView(WebDriver driver){
        super(driver);
    }

    public void user_name(String username1){
        username.sendKeys(username1);
    }

    public void pass_word(String password1){
        password.sendKeys(password1);
    }

    public void log_in() throws InterruptedException {
        login.click();
        //  Thread.sleep(2000);
    }

    public void cata_log(){
        catalog.click();
    }

    public void pro_duct(){
        product.click();
    }

    public void create_product(){
        createproduct.click();
    }

    public void co_de(String code1){
        randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        code.sendKeys(code1 + randomInt);
    }

    public void english_name(String name){

        randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        englishname.sendKeys(name + randomInt);

    }

    public void arabic_name(String name1){
        randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        arabicname.sendKeys(name1 + randomInt);
    }

    public void english_description(String endescription){
        englishdescription.sendKeys(endescription);
    }

    public void arabic_description(String ardescription){
        arabicdescription.sendKeys(ardescription);
    }

    public void ordering(String ordering1){
        randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        ordering.sendKeys(ordering1 + randomInt);

    }

    public void select_size_type()
    {
        selectsizetype.click();
    }

    public void size_type()
    {
        sizetype.click();
    }

    public void select_size()
    {
        selectsize.click();
    }

    public void si_ze() throws InterruptedException
    {
        Thread.sleep(1000);
        size.click();
    }

    public void select_tag()
    {
        selecttag.click();
    }

    public void t_ag() throws InterruptedException
    {
        Thread.sleep(1000);
        tag.click();
    }

    public void select_category() throws InterruptedException
    {
        Thread.sleep(1000);
        selectcategory.click();
    }

    public void cat_egory() throws InterruptedException
    {
        Thread.sleep(1000);
        category.click();
    }

    public void unitprice(String unitprice1)
    {
        unitprice.sendKeys(unitprice1);
    }

    public void productimage()
    {
       // productimage.sendKeys("C:\\Users\\Mnasat Lab 3\\Desktop\\image for work\\117840576_1944149715727581_8404788777255178443_n.jpg");
        productimage.sendKeys(System.getProperty("user.dir")+"/src/main/java/PartnerPortal/US05/TestData/zingerchicken.jpg");
    }

    public void buttonsave(WebDriver driver)
    {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", buttonsave);
    }

    public void delete() throws InterruptedException {
        Thread.sleep(3000);
        delete.click();
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
