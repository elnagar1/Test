package PartnerPortal.US10.ViewModel;

import Framework.Web.PageBaseWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

public class AdditionalWebPageView extends PageBaseWeb {

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
    @FindBy(xpath = "/html/body/kt-base/div/div/div/div[2]/div/kt-catalog/kt-product-list/div[3]/div/kt-generic-table/div/div[2]/table/tbody/tr[3]/td[8]/button[1]")
    public WebElement edit;
    @FindBy(id = "cdk-step-label-0-1")
    public WebElement additionalskus;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/mat-dialog-container/kt-create-product/mat-horizontal-stepper/div[2]/div[2]/div/div/kt-generic-table/div/div[1]/div[2]/button/span")
    public WebElement createadditionalsku;
    @FindBy(xpath = "/html/body/div[4]/div[4]/div/mat-dialog-container/kt-create-sku/form/div/div[1]/mat-form-field[1]/div/div[1]/div/input")
    public WebElement code;
    @FindBy(xpath = "/html/body/div[4]/div[4]/div/mat-dialog-container/kt-create-sku/form/div/div[1]/mat-form-field[2]/div/div[1]/div/mat-select/div/div[2]/div")
    public WebElement select;
    @FindBy(xpath = "/html/body/div[4]/div[6]/div/div/div/mat-option[3]/span")
    public WebElement size;
    @FindBy(xpath = "/html/body/div[4]/div[4]/div/mat-dialog-container/kt-create-sku/form/div/div[1]/mat-form-field[3]/div/div[1]/div/input")
    public WebElement price;
    @FindBy(xpath = "/html/body/div[4]/div[4]/div/mat-dialog-container/kt-create-sku/form/div/div[2]/mat-form-field/div/div[1]/div/input")
    public WebElement ordering;
    @FindBy(xpath = "/html/body/div[4]/div[4]/div/mat-dialog-container/kt-create-sku/form/div/div[3]/div/button")
    public WebElement save;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/mat-dialog-container/kt-create-product/mat-horizontal-stepper/div[2]/div[2]/div/div/kt-generic-table/div/div[2]/table/tbody/tr[2]/td[10]/button[2]/span/mat-icon")
    public WebElement delete;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/mat-dialog-container/kt-create-product/mat-horizontal-stepper/div[1]/mat-step-header[3]")
    public WebElement component;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/mat-dialog-container/kt-create-product/mat-horizontal-stepper/div[2]/div[3]/div/div/kt-generic-table/div/div[1]/div[2]/button/span")
    public WebElement createcomponent;
    @FindBy(id = "select_component")
    public WebElement selectcomponent;
    @FindBy(id = "mat-option-58")
    public WebElement choosecomponent;
    @FindBy(id = "check_default isDefault")
    public WebElement defult;
    @FindBy(xpath = "/html/body/div[4]/div[4]/div/mat-dialog-container/kt-create-product-component/form/div/div[2]/div/button")
    public WebElement savebutton;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/mat-dialog-container/kt-create-product/mat-horizontal-stepper/div[2]/div[3]/div/div/kt-generic-table/div/div[2]/table/tbody/tr/td[5]/button[2]/span/mat-icon")
    public WebElement delete1;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/mat-dialog-container/kt-create-product/mat-horizontal-stepper/div[1]/mat-step-header[4]")
    public WebElement option;
    @FindBy(id = "nameEn")
    public WebElement englishname;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/mat-dialog-container/kt-create-product/mat-horizontal-stepper/div[2]/div[4]/div/div[1]/form/div[1]/mat-form-field[2]/div/div[1]/div/input")
    public WebElement arabicname;
    @FindBy(id = "select_skus")
    public WebElement selectsku;
    @FindBy(xpath = "/html/body/div[4]/div[4]/div/div/div/mat-option")
    public WebElement sku;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/mat-dialog-container/kt-create-product/mat-horizontal-stepper/div[2]/div[4]/div/div[1]/form/div[2]/mat-form-field[3]/div/div[1]/div/input")
    public WebElement ordering2;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/mat-dialog-container/kt-create-product/mat-horizontal-stepper/div[2]/div[4]/div/div[1]/form/div[3]/div/button")
    public WebElement save2;
    @FindBy(id = "btn_edit")
    public WebElement edit2;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/mat-dialog-container/kt-create-product/mat-horizontal-stepper/div[2]/div[4]/div/div[3]/mat-accordion/mat-expansion-panel/div/div/form/div/div[1]/mat-form-field/div/div[1]/div/mat-select")
    public WebElement selectsku2;
    @FindBy(xpath = "/html/body/div[4]/div[4]/div/div/div/mat-option[2]/span")
    public WebElement addoption;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/mat-dialog-container/kt-create-product/mat-horizontal-stepper/div[2]/div[4]/div/div[3]/mat-accordion/mat-expansion-panel/div/div/form/div/mat-form-field/div/div[1]/div/input")
    public WebElement price2;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/mat-dialog-container/kt-create-product/mat-horizontal-stepper/div[2]/div[4]/div/div[3]/mat-accordion/mat-expansion-panel/div/div/form/div/div[2]/mat-checkbox/label/div")
    public WebElement checkbox;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/mat-dialog-container/kt-create-product/mat-horizontal-stepper/div[2]/div[4]/div/div[3]/mat-accordion/mat-expansion-panel/div/div/form/div/div[3]/button")
    public WebElement save3;
    @FindBy(id = "btn_delete")
    public WebElement delete2;









    public AdditionalWebPageView(WebDriver driver)
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

    public void pro_duct()
    {
        product.click();
    }

    public void edit()throws InterruptedException
    {
        //  Thread.sleep(1000);
        edit.click();
    }

    public void additionalskus(WebDriver driver)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", additionalskus);
    }

    public void createadditionalsku(WebDriver driver) throws InterruptedException
    {
        // Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", createadditionalsku);
    }

    public void code(String code1) throws InterruptedException
    {
        // Thread.sleep(1000);
        randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        code.sendKeys(code1 + randomInt);

    }

    public void select()
    {
        select.click();
    }

    public void size()
    {
        size.click();
    }

    public void price(String price1)
    {
        price.sendKeys(price1);
    }

    public void ordering(String ordering1)
    {
        randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        ordering.sendKeys(ordering1 + randomInt);
    }

    public void save(WebDriver driver)
    {
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

    public void component(WebDriver driver)
    {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", component);
    }

    public void createcomponent (WebDriver driver)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", createcomponent);
    }

    public void selectcomponent() throws InterruptedException
    {
        Thread.sleep(1000);
        selectcomponent.click();
    }

    public void choosecomponent()
    {
        choosecomponent.click();
    }

    public void defult()
    {
        defult.click();
    }

    public void savebutton(WebDriver driver) throws InterruptedException
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", savebutton);
    }

    public void delete1()
    {
        delete1.click();
    }

    public void enter1() throws InterruptedException
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

    public void option(WebDriver driver)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", option);
    }

    public void englishname(String enname)
    {
        englishname.sendKeys(enname);
    }

    public void arabicname(String arname) throws InterruptedException
    {
        // Thread.sleep(1000);
        arabicname.sendKeys(arname);
    }

    public void selectsku()
    {

        selectsku.click();
    }

    public void sku() throws InterruptedException
    {
        //  Thread.sleep(1000);
        sku.click();
    }

    public void ordering2(String order)
    {
        ordering2.clear();
        ordering2.sendKeys(order);
    }

    public void save2(WebDriver driver)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", save2);
    }

    public void edit2() throws InterruptedException {
        //  Thread.sleep(1000);
        edit2.click();
    }

    public void selectsku2() throws InterruptedException {
        //  Thread.sleep(1000);
        selectsku2.click();
    }

    public void addoption()
    {
        addoption.click();
    }

    public void price2(String pri)
    {
        price2.sendKeys(pri);
    }

    public void checkbox()
    {
        checkbox.click();
    }

    public void save3(WebDriver driver)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", save3);
    }

    public void delete2()
    {
        delete2.click();
    }

    }


