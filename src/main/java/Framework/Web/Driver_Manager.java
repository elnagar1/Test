package Framework.Web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class Driver_Manager {
    public  static WebDriver driver;
    public String USERNAME = PageBaseWeb.reader.getR_User();
    public String ACCESS_KEY = PageBaseWeb.reader.getR_Password();
    static String browser = PageBaseWeb.reader.getBrowser().toLowerCase();
    private static Driver_Manager driverManager = null ;
    public static WebDriver getDriver() {

        if (driver == null) {
            System.out.println("Selected Browser is: " + browser);

            if (browser.equalsIgnoreCase("chrome")) {

                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                System.out.println("Chrome Browser is Started" + driver.hashCode());

            } else if (browser.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                System.out.println("Chrome Browser is Started" + driver.hashCode());

            } else if (browser.equalsIgnoreCase("ie")) {
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                System.out.println("Chrome Browser is Started" + driver.hashCode());
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
            //  driver.navigate().to("https://dashboard-dev.shgardi.app/auth/login");
            System.out.println("Open: " + driver.getCurrentUrl());
            driver.navigate().to("https://partner-dev.shgardi.app/auth/login");

        }



        return driver;
    }
}
