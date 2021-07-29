package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateQuotePageObject extends PageObject {

    @FindBy(xpath = "//a[@class='step-head js-checkout-step active']")
    private WebElement shippingMethodTitleCreateQuote;

    @FindBy(xpath = "//input[@id='Terms1']")
    private WebElement termsCheckbox;

    @FindBy(xpath = "//button[@class='button button--primary btn-place-order-b2c button--block button--ctap js-generate-quote']")
    private WebElement generateQuoteButton;

    @FindBy(xpath = "//a[@class='button button--primary button--block add-to-cart-button btn-bottom-indent']")
    private WebElement viewQuoteButtonPopup;

    @FindBy(xpath = "//div[@class='well well-tertiary well-lg']")
    private WebElement quoteElement;

    public String getShippingMethodCQTitle() {
        return shippingMethodTitleCreateQuote.getText();
    }

    public void checkTermsAndConditionsCheckbox() {
        clickWithJS(termsCheckbox);
    }

    public void clickGenerateQuote(){
        generateQuoteButton.click();
    }

    public void clickViewQuoteButtonPopup() {viewQuoteButtonPopup.click();}

    public CreateQuotePageObject(WebDriver driver) {
        super(driver);
    }

    public Boolean ifQuoteElentIsDisplayed() {
       return quoteElement.isDisplayed();
    }
}
