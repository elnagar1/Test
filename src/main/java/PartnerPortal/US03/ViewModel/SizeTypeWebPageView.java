package PartnerPortal.US03.ViewModel;

import Framework.Web.PageBaseWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SizeTypeWebPageView extends PageBaseWeb {

    @FindBy (id = "username")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "btn_login kt_login_signin_submit")
    public WebElement login;
    @FindBy (xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[3]/a/i[1]")
    public WebElement catalog;
    @FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[3]/div/ul/li[2]/a/span")
    public WebElement sizetype;
    @FindBy(xpath = "//*[@id=\"kt_content\"]/kt-catalog/kt-sizetype/div[2]/div/kt-generic-table/div/div[1]/div[2]/button/span")
    public WebElement create;
    @FindBy(id = "nameEn")
    public WebElement englishname;
    @FindBy(id = "nameAr")
    public WebElement arabicname;
    @FindBy(xpath = "//*[@id=\"check_active isActive\"]/label/div")
    public WebElement active;
    @FindBy(id = "btn_save")
    public WebElement save;
    @FindBy(xpath = "//*[@id=\"cdk-drop-list-0\"]/tbody/tr/td[2]/button[2]/span/mat-icon")
    public WebElement delete;









    public SizeTypeWebPageView(WebDriver driver)
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
        //   Thread.sleep(1000);

    }

    public void cata_log()
    {
        catalog.click();
    }

    public void size_type()
    {
        sizetype.click();
    }

    public void cre_ate()
    {
        create.click();
    }

    public void english_name(String name)
    {
        englishname.sendKeys(name);
    }

    public void arabic_name(String name1)
    {
        arabicname.sendKeys(name1);
    }

    public void act_ive()
    {
        active.click();
    }

    public void sa_ve()
    {
        save.click();
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
