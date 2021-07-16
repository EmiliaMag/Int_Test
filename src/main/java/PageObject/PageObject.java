package PageObject;

import Utils.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class PageObject {
    protected WebDriver driver;


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


    //Wait methods
    public void implicitWait() {
        DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void waitUntilElementIsDisplayed(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilTitleIsVisible(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.titleIs(xpath));
    }

    public void waitUntilElementInvisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void waitUntilElementIsClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void fluentWait() {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("foo"));
            }
        });
    }


    //Wait Page/JS/JQuery methods
    public boolean waitUntilPageIsLoaded(WebDriver webDriver, int length) {
        return waitForJs(webDriver, length) && waitForJQuery(webDriver, length);
    }      //this method combines the waitForJs&waitForJQuery methods

    private static boolean waitForJs(WebDriver webDriver, int length) {
        WebDriverWait wait = new WebDriverWait(webDriver, length);
        return wait.until((ExpectedCondition<Boolean>) driver -> ((JavascriptExecutor) driver).executeScript(
                "return document.readyState"
        ).equals("complete"));
    }          //wait for JS

    private static boolean waitForJQuery(WebDriver webDriver, int length) {
        WebDriverWait wait = new WebDriverWait(webDriver, length);
        return wait.until((ExpectedCondition<Boolean>) driver -> (Long) ((JavascriptExecutor) driver).executeScript(
                "return jQuery.active"
        ) == 0);
    }      //wait for JQuery


    //click with JS method
    public void clickWithJS(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void acceptChromePopup() {
        DriverManager.getDriver().switchTo().alert().accept();
    }
}