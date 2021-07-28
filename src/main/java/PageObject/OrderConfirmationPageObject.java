package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPageObject extends PageObject {

    @FindBy(xpath = "//h1[@class='c-sectionHeader hasBorderBottom']")
    private WebElement orderConfirmationPageTitle;

    //methods
    public OrderConfirmationPageObject(WebDriver driver) {
        super(driver);
    }

    public String getOrderConfirmationPageTitle() {
        return orderConfirmationPageTitle.getText();
    }
}
