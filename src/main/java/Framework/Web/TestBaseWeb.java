package Framework.Web;

import Dashboard.US01.ViewModel.LoginPageView;
import Framework.Helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;


import java.util.concurrent.TimeUnit;

public class TestBaseWeb {
    public static WebDriver driver;
    LoginPageView loginPage;

    public String USERNAME = PageBaseWeb.reader.getR_User();
    public String ACCESS_KEY = PageBaseWeb.reader.getR_Password();
   // String browser = PageBaseWeb.reader.getBrowser().toLowerCase();
    // public static String downloadPath = System.getProperty("user.dir") + "\\Downloads";

    //مؤجل
    /*
	public static FirefoxOptions firefoxOption() {
		FirefoxOptions option = new FirefoxOptions();
		option.addPreference("browser.download.folderList", 2);
		option.addPreference("browser.download.dir", downloadPath);
		option.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
		option.addPreference("browser.download.manager.showWhenStarting", false);
		option.addPreference("pdfjs.disabled", true);
		return option;
	}

	public static ChromeOptions chromeOption() {
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default.content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		options.setExperimentalOption("prefs", chromePrefs);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		return options;
	}
*/
    @BeforeSuite
    @Parameters({"browser"})

    public void startDriver(@Optional("chrome") String browser) {
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
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);



    }

    @AfterClass
    public void stopDriver() {
        //driver.quit();
    }

    // take screenshot when test case fail and add it in the Screenshot folder
    @AfterMethod
    public void screenshotOnFailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println("Failed!");
            System.out.println("Taking Screenshot....");
            Helper.captureScreenshot(driver, result.getName());
        }
    }
}
