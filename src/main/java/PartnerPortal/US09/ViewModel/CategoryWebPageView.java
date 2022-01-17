package PartnerPortal.US09.ViewModel;

import Framework.Web.PageBaseWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;

public class CategoryWebPageView extends PageBaseWeb {

    @FindBy (id = "username")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "btn_login kt_login_signin_submit")
    public WebElement login;
    @FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[3]/a/i[1]")
    public WebElement catalog;
    @FindBy(xpath = "/html/body/kt-base/div/div/kt-aside-left/div/div/div/ul/li[3]/div/ul/li[1]/a/i")
    public WebElement category;
    @FindBy (xpath = "//*[@id=\"kt_content\"]/kt-catalog/kt-store-category-list/div[3]/div/kt-generic-table/div/div[1]/div[2]/button[2]")
    public WebElement create;
    @FindBy(xpath = "/html/body/div[5]/div[2]/div/mat-dialog-container/kt-create-store-category/mat-horizontal-stepper/div[2]/div[1]/form/div[1]/div/div/div[2]/mat-form-field/div/div[1]")
    public WebElement select;
    @FindBy(id = "mat-option-11")
    public WebElement select1;
    @FindBy (id = "nameEn")
    public WebElement englishname;
    @FindBy(id = "nameAr")
    public WebElement arabicname;
    @FindBy(id = "descriptionEn")
    public WebElement englishdescripiton;
    @FindBy(id = "descriptionAr")
    public WebElement arabicdescription;
    @FindBy(xpath = "//*[@id=\"check_active isActive\"]/label/div")
    public WebElement active;
    @FindBy(xpath = "/html/body/div[5]/div[2]/div/mat-dialog-container/kt-create-store-category/mat-horizontal-stepper/div[2]/div[1]/form/div[1]/div/div/div[9]/image-upload/div/div[1]/label/input")
    public WebElement choosefile;
    @FindBy (id = "btn_save")
    public WebElement save;
    @FindBy(xpath = "/html/body/kt-base/div/div/div/div[2]/div/kt-catalog/kt-store-category-list/div[3]/div/kt-generic-table/div/div[2]/table/tbody/tr/td[7]/button[2]/span/mat-icon")
    public WebElement delete;








    public CategoryWebPageView(WebDriver driver)
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

    public void log_in() throws InterruptedException
    {
        login.click();
        Thread.sleep(1000);
    }

    public void cata_log()
    {
        catalog.click();
    }

    public void cate_gory()
    {
        category.click();

    }

    public void cre_ate()
    {

        create.click();
    }

    public void sel_ect() throws InterruptedException
    {
        Thread.sleep(1000);
        select.click();
    }

    public void sel_ect1()
    {
        select1.click();
    }

    public void english_name(String englishname1)
    {
        englishname.sendKeys(englishname1);
    }

    public void arabic_name(String arabicname1)
    {
        arabicname.sendKeys(arabicname1);
    }

    public void english_description(String enlishdescription1)
    {
        englishdescripiton.sendKeys(enlishdescription1);
    }

    public void arabic_description(String arabicdescription1)
    {
        arabicdescription.sendKeys(arabicdescription1);
    }

    public void act_ive()
    {
        active.click();
    }

    public void choose_file()
    {
       // choosefile.sendKeys("C:\\Users\\Mnasat Lab 3\\Desktop\\image for work\\117840576_1944149715727581_8404788777255178443_n.jpg");
        choosefile.sendKeys(System.getProperty("user.dir") + "/src/main/java/PartnerPortal/US09/TestData/117840576_1944149715727581_8404788777255178443_n.jpg");
    }

    public void sa_ve(WebDriver driver) throws InterruptedException
    {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", save);
    }

    public void delete()
    {
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


