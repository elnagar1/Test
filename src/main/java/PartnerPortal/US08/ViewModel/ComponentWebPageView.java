package PartnerPortal.US08.ViewModel;

import Framework.Web.PageBaseWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ComponentWebPageView extends PageBaseWeb {

    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "btn_login kt_login_signin_submit")
    public WebElement login;
    @FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[3]/a/i[1]")
    public WebElement catalog;
    @FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[3]/div/ul/li[4]/a/span")
    public WebElement component;
    @FindBy(xpath = "//*[@id=\"kt_content\"]/kt-catalog/kt-component/div[2]/div/kt-generic-table/div/div[1]/div[2]/button/span")
    public WebElement createcomponent;
    @FindBy(id = "nameEn")
    public WebElement englishname;
    @FindBy(id = "nameAr")
    public WebElement arabicname;
    @FindBy(id = "price")
    public WebElement price;
    @FindBy(id = "btn_save")
    public WebElement save;
    @FindBy(xpath = "/html/body/kt-base/div/div/div/div[2]/div/kt-catalog/kt-component/div[2]/div/kt-generic-table/div/div[2]/table/tbody/tr/td[3]/button[2]/span/mat-icon")
    public WebElement delete;








    public ComponentWebPageView(WebDriver driver)
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

    public void compo_nent()
    {
        component.click();
    }

    public void create_component()
    {
        createcomponent.click();
    }

    public void english_name(String name)
    {
        englishname.sendKeys(name);

    }

    public void arabic_name(String name1)
    {
        arabicname.sendKeys(name1);
    }

    public void pr_ice(String price1)
    {
        price.sendKeys(price1);
    }

    public void sa_ve(){
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


