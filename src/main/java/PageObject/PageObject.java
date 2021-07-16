package PageObject;

import Utils.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class PageObject {
    protected static WebDriver driver;


    //Webdriver
    public PageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //close browser method
    public void closeBrowser() {
        DriverManager.getDriver().manage().deleteAllCookies();
        DriverManager.getDriver().close();
    }


    //scroll methods
    public void scrollDown() {
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,450)", "");
    }

    public void scrollUp() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-250)");
    }

    public void scrollRight() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("document.querySelector('table th:last-child').scrollIntoView();");
    }


    //click with JS method
    public void clickWithJS(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void acceptChromePopup() {
        DriverManager.getDriver().switchTo().alert().accept();
    }

}