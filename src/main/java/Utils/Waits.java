package Utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Waits {

    protected static WebDriver driver = DriverManager.getDriver();

    //Wait methods
    public static void implicitWait() {
        DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void waitUntilElementIsDisplayed(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitUntilTitleIsVisible(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.titleIs(xpath));
    }

    public static void waitUntilElementInvisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public static void waitUntilElementIsClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void fluentWait() {
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
    public static boolean waitUntilPageIsLoaded(WebDriver webDriver, int length) {
        return waitForJs(webDriver, length) && waitForJQuery(webDriver, length);
    }      //waitForJs & waitForJQuery methods

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
}
