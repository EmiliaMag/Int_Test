import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
    protected WebDriver driver;

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



    public PageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

}
