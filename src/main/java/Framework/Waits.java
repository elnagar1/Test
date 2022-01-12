package Framework;

import Framework.Web.PageBaseWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;


public class Waits {
	
//	public Logger log=Logger.getLogger(Waits.class);
	
	static int timeinSec=30;
	
	
	
	public static void setImplicitWait(int time){
		PageBaseWeb.driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	
	public static void waitUntilElementLocated(int time,WebElement element){
		WebDriverWait wait=new WebDriverWait(PageBaseWeb.driver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
    public static void waitUntilElementLocated(int time,WebDriver driver,WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
	
	public static void waitUntilElementToClick(int time,WebElement element){
		WebDriverWait wait=new WebDriverWait(PageBaseWeb.driver,time);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		}
	
	public static synchronized Object execJavascript(String script, Object... args) {
        JavascriptExecutor scriptExe = ((JavascriptExecutor) PageBaseWeb.driver);
        return scriptExe.executeScript(script, args);
    }

    public static synchronized Object tryJavascript(String script, Object... args) {
        try {
            return execJavascript(script, args);
        } catch (Exception ignore) {
            return "";
        }
    }

    public static boolean isPageLoaded() {
        String state = (String) tryJavascript("return document.readyState;");
        return state.matches("complete|loaded|interactive");
    }

    public static boolean isJQueryDone() {
        Object jsResponse = tryJavascript("return jQuery.active;");
        if (jsResponse instanceof Long) {
            return ((Long) jsResponse) == 0;
        } else if (jsResponse instanceof String) {
            String response = (String) jsResponse;
            return (response.startsWith("{\"hCode\"") || response.isEmpty());
        } else {
            return true;
        }
    }

    public static boolean isAngularDone() {
        Object jsResponse = tryJavascript("return window.getAllAngularTestabilities().filter(x=>!x.isStable()).length;");
        if (jsResponse instanceof Long) {
            return ((Long) jsResponse) == 0;
        } else if (jsResponse instanceof String) {
            String response = (String) jsResponse;
            return response.isEmpty();
        } else {
            return true;
        }
    }
    
    public static void waitUntil(BooleanSupplier condition, int seconds) {
        new WebDriverWait(PageBaseWeb.driver, seconds).until((WebDriver driver) -> condition.getAsBoolean());
    }

    public static void waitUntil(BooleanSupplier condition) {
        waitUntil(condition, timeinSec);
    }
    
    


}
